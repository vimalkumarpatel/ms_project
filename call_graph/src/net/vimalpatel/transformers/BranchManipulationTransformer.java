package net.vimalpatel.transformers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.vimalpatel.maindriver.MainDriver_BranchManipulationTransformer;
import soot.Body;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.ConditionExpr;
import soot.jimple.IfStmt;
import soot.jimple.InvokeExpr;
import soot.jimple.Stmt;
import soot.jimple.internal.JEqExpr;
import soot.jimple.internal.JIfStmt;
import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.toolkits.graph.Block;
import soot.toolkits.graph.BriefBlockGraph;

/**
 * 
 * @author vimalkumarpatel
 * 
 * this class is a demo transformer.
 * used for demo of code branch instrumentation,
 * to force a method to execute a call to another method
 * written somewhere in its branches.
 *
 */
public class BranchManipulationTransformer  extends SceneTransformer{

	SootMethod currentSootMethod = null;
	SootMethod nextSootMethod = null;
	String currentSootMethodSignature = null;
	String nextSootMethodSignaure = null;
	
	public BranchManipulationTransformer(String currentSootMethodSignature, String nextSootMethodSignature){
		this.currentSootMethodSignature = currentSootMethodSignature;
		this.nextSootMethodSignaure = nextSootMethodSignature;
	}
	
	@Override
	protected void internalTransform(String arg0, Map arg1) {
		System.out.println("runnung a new transformer :)");
		CHATransformer.v().transform();
		currentSootMethod = Scene.v().getMethod(this.currentSootMethodSignature);
		nextSootMethod = Scene.v().getMethod(this.nextSootMethodSignaure);
		
		Body methodBody = currentSootMethod.getActiveBody();
		System.out.println("===========================================");
		BriefBlockGraph bbg = new BriefBlockGraph(methodBody);
		List<Block> blocks = bbg.getBlocks();
		for(Block b: blocks){
			System.out.println("BLOCK="+b);
		}
		System.out.println("===========================================");
		
		//Do The VooDoo !!
		recurseBlocks(bbg,blocks.get(0),0,null,currentSootMethod,nextSootMethod);

		System.out.println("===========================================");
		blocks = bbg.getBlocks();
		for(Block b: blocks){
			System.out.println("BLOCK="+b);
		}
		System.out.println("===========================================");
	}

	private Map recurseBlocks(BriefBlockGraph bbg, Block currBlock,int level,Stmt predTailStmtTgt, SootMethod currSootMethod, SootMethod nxtSootMethod) {
		Map retMap = new HashMap();
		retMap.put("CALL2NXTMETHOD", false);
		String info = "LEVEL#"+level+","+currBlock.toShortString()+"-";

		Stmt currTailStmtTgt = null;
	
		Unit currHeadUnit = currBlock.getHead();
//		if(currHeadUnit.equals(predTailStmtTgt)){
//			retMap.put("PREDTAILSTMTTGT2CURRHEADUNIT",true);
//		}
		
		// in case block has multiple successors then get the goto/target unit for tail unit.
		List<Block> succBlocks = bbg.getSuccsOf(currBlock);
		if(succBlocks.size()>1){
			//get last block, which is surely IF and get its GOTO
			Unit tailUnit = currBlock.getTail();
			System.out.println(info+"Tail Unit="+tailUnit);
			Stmt s = (Stmt)tailUnit;
			if(s instanceof IfStmt){
				IfStmt ifStmt = (IfStmt)s;
				currTailStmtTgt = ifStmt.getTarget();
				System.out.println(info+"Target="+currTailStmtTgt);
			}
		}
		
		System.out.print(info+"SUCC found=");
		for(Block b:succBlocks) System.out.print(b.toShortString()+", ");
		System.out.println("");
		
		//calculate CALL2NXTMETHOD, and skip recursing if CALL2NXTMETHOD=true.
		boolean CALL2NXTMETHOD = false;
		Iterator<Unit> itrUnits = currBlock.iterator();
		while(itrUnits.hasNext()){
			Unit u = itrUnits.next();
			if(u instanceof Stmt && ((Stmt)u).containsInvokeExpr()){
				Stmt s = (Stmt) u;
				InvokeExpr invokeExpr = s.getInvokeExpr();
				SootMethod invokedMethod = invokeExpr.getMethod();
				System.out.println(info+"nxtSootMethod.getSignature()="+nxtSootMethod.getSignature()+", invokedMethod.getSignature()="+invokedMethod.getSignature());
				if(nxtSootMethod.getSignature() == invokedMethod.getSignature()){
					CALL2NXTMETHOD = true;
					retMap.put("CALL2NXTMETHOD", CALL2NXTMETHOD);
					System.out.println(info+"CALL2NXTMETHOD = "+CALL2NXTMETHOD);
				}
			}
		}
		
		if(CALL2NXTMETHOD){
			//set values in the retMap map and do wrapup stuff and return.
			return retMap;
		}
		if(succBlocks.size()==0){
			retMap.put("CALL2NXTMETHOD", false);
			return retMap;
		}
		
		List<Block> succs = new ArrayList<Block>();//store those successor blocks that call nxtMethod. 
		List<Map> retValues = new ArrayList<Map>();//store all returned maps from all the succ of this block
	
		for(Block b: succBlocks){
			System.out.println(info+"RECURSING:"+b.toShortString());
			Map ret = recurseBlocks(bbg, b,level+1,currTailStmtTgt,currSootMethod,nxtSootMethod);
			if(ret.get("CALL2NXTMETHOD").equals(true)){
				//this succ calls the next method, set the successor of current block to this succ block.
				System.out.println(info+"found block calling nextMethod:"+b.toShortString());
				succs.add(b);
				break;
			}
		}
		
		if(succs.size()>0){
			System.out.print(info+"Changing successors to =");
			for(Block b:succs) System.out.print(b.toShortString()+", ");
			System.out.println("");
			
			//get the first successor block
			//get the head unit of the block and replace the curr block's tail stmt target to the new unit			
			Block succ = succs.get(0);
			Unit succHeadUnit = succ.getHead();
			Unit currTailUnit = currBlock.getTail();
			
			System.out.println(info+"CURR_TAIL_UNIT_TYPE="+currTailUnit.getClass().toString()+" , TAIL_UNIT="+currTailUnit);
			if(currTailUnit instanceof JIfStmt){
				System.out.println(info+"Setting new Target for TAIL_UNIT to :"+succHeadUnit);
				JIfStmt s = (JIfStmt) currTailUnit;
				//set a new target for the IF branching
				s.setTarget(succHeadUnit);
//				currBlock.setSuccs(succs);
				//create an expression that is TRUE and 
				//set it as IF stmt's condition expr
				Value condition = s.getCondition();
				ConditionExpr oldExpr = (ConditionExpr) condition;
				JEqExpr newExpr = new JEqExpr(oldExpr.getOp1(), oldExpr.getOp1());
				System.out.println(info+"IF STMT condition substitution: Old="+oldExpr+" , New="+newExpr);
				s.setCondition(newExpr);
				///////////////
				CALL2NXTMETHOD=true;
				retMap.put("CALL2NXTMETHOD", CALL2NXTMETHOD);
			}
		}
		
		return retMap;
	}

}
