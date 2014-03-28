package net.vimalpatel.transformers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import net.vimalpatel.utils.Logger;
import soot.Body;
import soot.MethodOrMethodContext;
import soot.PatchingChain;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.Unit;
import soot.UnitBox;
import soot.Value;
import soot.jimple.ConditionExpr;
import soot.jimple.GotoStmt;
import soot.jimple.IfStmt;
import soot.jimple.InvokeExpr;
import soot.jimple.InvokeStmt;
import soot.jimple.ReturnStmt;
import soot.jimple.Stmt;
import soot.jimple.internal.JEqExpr;
import soot.jimple.internal.JGotoStmt;
import soot.jimple.internal.JIfStmt;
import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Targets;
import soot.tagkit.LineNumberTag;
import soot.toolkits.graph.Block;
import soot.toolkits.graph.BriefBlockGraph;
import soot.toolkits.graph.BriefUnitGraph;
import soot.util.Chain;

/**
 * 
 * @author vimalkumarpatel
 * 
 * this class is main transformer that will be used for
 * static source code analysis and instrumentation.
 *
 */
public class CallStackFinderTransformer  extends SceneTransformer{

	private Stack<SootMethod> stack = null;
	CallGraph cg = null;
	private List<SootClass> runnableClasses = null;

	public ArrayList<String> packageList = new ArrayList<String>();

	public String strSourceClass = "";
	public String strSourceMethod = "";

	public String strTargetClass = "";
	public String strTargetMethod = "";

	public String strSourceMethodSignature = "";
	public String strTargetMethodSignature = "";		

	public CallStackFinderTransformer(Stack<SootMethod> stack, ArrayList<String> packageList,String strSourceMethod,String strSourceMethodSignature,String strTargetMethod,String strTargetMethodSignature){
		super();
		this.stack = stack;
		this.packageList = packageList;
		this.strSourceMethod = strSourceMethod;
		this.strTargetMethod = strTargetMethod;
		this.strSourceMethodSignature = strSourceMethodSignature;
		this.strTargetMethodSignature = strTargetMethodSignature;			
		this.runnableClasses = getAllRunnableApplicationClasses();
	}

	private List<SootClass> getAllRunnableApplicationClasses() {
		List<SootClass> list = new ArrayList<SootClass>();
		Chain<SootClass> appClasses = Scene.v().getApplicationClasses();
		for(SootClass sc : appClasses){
			if(sc.implementsInterface("java.lang.Runnable")){
				Logger.log("ADDING CLASS TO RUNNABLE LIST:"+sc.getName());
				list.add(sc);
			}
		}
		return list;
	}

	private int Recurse(SootMethod currentSootMethod){
		Logger.log("Recurse(" + currentSootMethod +");");

		int ret = 0;
		/**
		 * if the method is not on the stack only then push this method on the stack, or else we may go into a cycle!
		 */
		if(!stack.contains(currentSootMethod)){
			stack.push(currentSootMethod);
			Logger.log("STACK SIZE:"+Integer.toString(stack.size())+", CURRENT STACK:"+stack.toString());
		}else{
			return ret;
		}

		/**
		 * check if we are dealing with a Thread's start method. i.e we need to push start() method 
		 * and translate it to run() method while finding trace-route.
		 */
		// sorry man, too complicated to dwell into, not supporting as of now !
		if("start".equals(currentSootMethod.getName())){
			//TODO-if start method then find the Thread reference on which it was called then get the runnable and then get run() method!

		}



		if(isTargetMethodFound(currentSootMethod)){
			ret = 1;
		} else {
			Iterator<MethodOrMethodContext> targets = new Targets(
					cg.edgesOutOf(currentSootMethod));

			List<SootMethod> filterOutEdges = new ArrayList<SootMethod>();
			while (targets.hasNext()) {
				SootMethod tgt = (SootMethod) targets.next();
				if(isCalledMethodInAllowedPackageList(tgt.getDeclaringClass().getPackageName())){
					filterOutEdges.add(tgt);
					Logger.log("\t\tOUT EDGE="+tgt.getName());
				}
			}
			
			for(SootMethod calledMethod:filterOutEdges){
				int returnVal = Recurse(calledMethod);
				if (returnVal == 1) {
					ret = 1;
					break;
				}
			}
		}
		if(ret == 0) {
			SootMethod popped = stack.pop();
			Logger.log("#POPPED#:"+popped);
		}
		return ret;
	}

	private boolean isTargetMethodFound(SootMethod currentSootMethod) {

		if(currentSootMethod.getSignature().equals(strTargetMethodSignature)){
			Logger.log("\tcurrentMethodSignature == TargetMethodSignature");
			return true;
		}		
		return false;
	}

	private boolean isCalledMethodInAllowedPackageList(String className) {
		for(String pkgName : packageList){
			if(className.startsWith(pkgName)){
				Logger.log("\t\tisCalledMethodInAllowedPackageList('"+className+"') = TRUE");
				return true;
			}
		}

//		Logger.log("\t\tisCalledMethodInAllowedPackageList('"+className+"') = FALSE");
		return false;
	}

	@Override
	protected void internalTransform(String phaseName, Map options) {
		Logger.log("phaseName="+phaseName+", options="+options);
		CHATransformer.v().transform();
		cg = Scene.v().getCallGraph();
		Logger.log("searching for target method in packageList="+packageList);
		SootMethod currentSootMethod = Scene.v().getMethod(strSourceMethodSignature);
		int ret = Recurse(currentSootMethod);
		Logger.log("the return value from the call graph is:"+ret);

		Logger.log("#########   now the stack has all the methods   ##########");

		/**
		 * traceRoute will hold all the soot methods as key and list of units 
		 * that comprise of the sub part of the over all route from source to target method.
		 */
		Map<SootMethod, List<Unit>> traceRoute = new HashMap<SootMethod, List<Unit>>();

		for(int i=0;i<stack.size();i++){
			SootMethod method = stack.get(i);
			if(i==stack.size()-1) {
				PatchingChain<Unit> units = method.getActiveBody().getUnits();
				List<Unit> list = new ArrayList<Unit>();
				for(Unit u:units) list.add(u);
				traceRoute.put(method, list);
				break;
			}

			Body currMethodBody = method.getActiveBody();

			SootMethod nextMethodOnStack = (i+1>stack.size())?null:stack.get(i+1);
			//				nextMethodOnStack = stack.get(i+1);

			Logger.log("STARTING WITH METHOD:"+method.getSignature());
			Logger.log("BODY TYPE:"+currMethodBody.getClass().getName());

			BriefUnitGraph unitGraph = new BriefUnitGraph(currMethodBody);
			List<Unit> currHeads = unitGraph.getHeads();//entry points into current method.
			List<Unit> currTails = unitGraph.getTails();//exit points from current method.
			List<Unit> matchingInvokeTailUnits = new ArrayList<Unit>();

			//1. select a tail by matching tail InvokeStmt with next methods signature.
			for(Unit u: currHeads){
				Logger.log("\tHEAD UNIT:"+u.getClass().getName());
			}
			for(Unit u : currTails){
				Logger.log("\tTAIL UNIT:"+u.getClass().getName());
			}

			/**
			 * NOTE: using Tail units gave only return statements as exit points, 
			 * i thought that it would also include calls to other methods 
			 * as an exit point from current method, but it was not the case,
			 *  
			 * so will have to look all the units of the methods body sequentially and 
			 * find the unit containing the call to next method and 
			 * also include all the units till then into the TRACE path.
			 */

			PatchingChain<Unit> units = currMethodBody.getUnits();
			Iterator<Unit> itrUnits = units.iterator();
			List<Unit> pathUnits = new ArrayList<Unit>();

			while(itrUnits.hasNext()){
				Unit u = itrUnits.next();
				Logger.log("\tUNIT TYPE:"+u.getClass().getName()+", UNIT:="+u);
				pathUnits.add(u);

				/**
				 * using Edge e = cg.findEdge(u,nextMethod); doesn't seem to work here.
				 * it can be a nice code if it works,
				 * but gives me nullpointer exception some where in the Soot's code !
				 */
				/*Edge e = cg.findEdge(u, nextMethod);
					if(null != e){
						Logger.log("EDGE from unit:"+u+" to method"+nextMethod);
					}*/
				/**
				 * check if the Unit is an InvokeStmt.
				 * 	if so, then the invoke expression can be used to check 
				 * 		if this is the unit that causes calling of next method on the stack.
				 * 
				 * 	keep on adding units till here to the sub-route and then break if its a Invoke to nextMethod on stack.
				 */

				if(u instanceof Stmt){
					Stmt s = (Stmt)u;
					if(s.containsInvokeExpr()){
						System.out.println("Unit containsInvokeExpr() == "+s.containsInvokeExpr());
						InvokeExpr invokeExpr = s.getInvokeExpr();
						SootMethod calledMethod = invokeExpr.getMethod();
						Logger.log("\t\tStmt Calls Method:"+calledMethod.getName()+"==" + calledMethod.getSignature());
						if(calledMethod.getSignature().equals(nextMethodOnStack.getSignature())){
							Logger.log("\t\tCALLED METHOD SIGNATURE MATCHES NEXT METHOD SIGNATURE.");
							matchingInvokeTailUnits.add(s);
							break;
						}
					}
				}
//				if(u instanceof InvokeStmt){
//					InvokeStmt invokeStmt = (InvokeStmt) u;
//					InvokeExpr iExpr = invokeStmt.getInvokeExpr();
//					SootMethod calledMethod = iExpr.getMethod();
//					Logger.log("\t\tInvokeStmt Calls Method:"+calledMethod.getName()+"==" + calledMethod.getSignature());
//					if(calledMethod.getSignature().equals(nextMethodOnStack.getSignature())){
//						Logger.log("\t\tCALLED METHOD SIGNATURE MATCHES NEXT METHOD SIGNATURE.");
//						matchingInvokeTailUnits.add(invokeStmt);
//						break;
//					}
//				}
			}

			/**
			 * Add the units i.e "pathUnits" found in this method that form 
			 * a sub route of the over all 
			 * route i.e "traceRoute" between the source and target method.
			 */
			if(pathUnits.size()>0){
				Logger.log("PATH UNITS:"+pathUnits.toString());
				traceRoute.put(method, pathUnits);
			}
		}
		Logger.log("##############################  TRACEROUTE  ##################################");
		for(Entry<SootMethod, List<Unit>> traceRouteMapEntry : traceRoute.entrySet()){
			Logger.log("TRACE ROUTE ENTRY:"+traceRouteMapEntry.getKey().getName()+" :: "+traceRouteMapEntry.getValue().toString());
		}
		Logger.log("################################################################");			

		/**
		 * lets iterate through the entire route to find out the 
		 * branching conditions and add a tag to those units.
		 * or do some processing of the units !
		 */

		for(int stackCounter=0;stackCounter<stack.size()-1;stackCounter++){
			SootMethod currentMethodOnStack = stack.get(stackCounter);
			SootMethod nextMethodOnStack = (stackCounter+1>stack.size())?null:stack.get(stackCounter+1);
			////////////////////////////////////////////////////////////////////////////
			/**
			 * using the all new brief block graph manipulation technique developed with cutting edge technology
			 * to instrument and execute the desired branch in all the methods that are involved in process pleasing the god !    
			 */
			
			Body methodBody = currentSootMethod.getActiveBody();
			System.out.println("===========================================");
			BriefBlockGraph bbg = new BriefBlockGraph(methodBody);
			List<Block> blocks = bbg.getBlocks();
			for(Block b: blocks){
				System.out.println("BLOCK="+b);
			}
			System.out.println("===========================================");
			
			//Do The VooDoo !!
			Logger.log("DOING TO VOODOO: currentMethodOnStack="+currentMethodOnStack+" , nextMethodOnStack="+nextMethodOnStack);
			recurseBlocks(bbg,blocks.get(0),0,null,currentMethodOnStack,nextMethodOnStack);

			System.out.println("===========================================");
			blocks = bbg.getBlocks();
			for(Block b: blocks){
				System.out.println("BLOCK="+b);
			}
			System.out.println("===========================================");
			
			/////////////////////////////////////////////////////////////////////////////
//			/**
//			 * create a local dummy boolean for this method and insertrument in method anyways,
//			 * we will use it as and when required to control our branching !
//			 */
////			InstrumentMethodInsertLocalDummyBoolean(currentMethodOnStack,nextMethodOnStack);
//			System.out.println("######################### BRANCHING UNITS ##############################");
//			//we get all unit boxes that may be branching targets !
//			List<UnitBox> branchingUnitBox = currentMethodOnStack.getActiveBody().getUnitBoxes(true);
//			Iterator<UnitBox> itrUnitBox = branchingUnitBox.iterator();
//			while(itrUnitBox.hasNext()){
//				UnitBox ub = itrUnitBox.next();
//				Unit u = ub.getUnit();
//				Logger.log("unitbox="+ub+" ; unit"+u);
//			}
//			System.out.println("#######################################################");
////			instrumentBranchesInCurrentMethodCallingNextMethod(currentMethodOnStack, stack.get(stackCounter+1));
		}
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

	
	
	
	
	private void instrumentBranchesInCurrentMethodCallingNextMethod(SootMethod currentMethodOnStack, SootMethod NextMethod){
		Logger.log("INSIDE :: instrumentBranchesInCurrentMethodCallingNextMethod()");
		Iterator<Unit> snpshtItrCurrentMethodBodyUnits = currentMethodOnStack.getActiveBody().getUnits().snapshotIterator();//traceRoute.get(currentMethodOnStack);
		while(snpshtItrCurrentMethodBodyUnits.hasNext()){
			Unit unit = snpshtItrCurrentMethodBodyUnits.next();
			int lineNumber = -1;
			LineNumberTag tag = (LineNumberTag)unit.getTag("LineNumberTag");
			if (tag != null) lineNumber = tag.getLineNumber();
			Logger.log("UNIT:"+unit.toString()+", LINE NO:"+lineNumber);

			/**
			 * now we want to avoid any kind of branching in our final UNIT sequence,
			 * or else we may not reach our target method !
			 * 
			 *  so we will replace the conditions inside IF statements with a variable,
			 *  and tag the UNIT
			 */
			if(unit.branches()){
				//could be a GOTO -or- IF statement
				boolean isThisUnitCallingNextMethod = false;
				if(unit.fallsThrough()){

					//it's IF statement
					Logger.log("\tFOUND a IF-STMT");
					/**
					 * now lets work to get the condition of this IF stmt and convert it into a variable !
					 */
					if(unit instanceof IfStmt){
						IfStmt ifStmt = (IfStmt) unit;
						Value condi = ifStmt.getCondition();
						//								Value newValue = new JEqExpr();
						Logger.log("THE IF-STMT Condition getConditionBox="+ifStmt.getConditionBox()+", getCondition="+ifStmt.getCondition()+", condi.getUseBoxes()="+condi.getUseBoxes()+", condi.getType()="+condi.getType());

						/**
						 * check weather the IF-THEN block has a call to next method
						 * or the ELSE part.
						 * 
						 * 	IF the call is in ELSE part then 
						 * 		replace the IF condition's value with FALSE
						 * 	ELSE
						 * 		replace IF conditions's value with TRUE
						 * 
						 * IF neither calls the next method then it doesent matter, move on!!
						 *  
						 */

						List<UnitBox> unitBoxesInsideIfStmt = ifStmt.getUnitBoxes();
						Logger.log("\tunitBoxesInsideIfStmt inside IF-STMT = "+unitBoxesInsideIfStmt.size());
						for(UnitBox ub : unitBoxesInsideIfStmt){
							Logger.log("\tUnitBox:"+ub.getUnit()+", IS BRANCH-TARGET ?:"+ub.isBranchTarget());
							/**
							 * since this is a Branch Target, we will create a UnitGraph 
							 * from the method of this unit and get the CFG for this block
							 * and check if any of the unit in this graph invokes the next method on stack !
							 */
							if(ub.isBranchTarget()){
								Unit branchingUnit = ub.getUnit();
								BriefUnitGraph briefUnitGraph = new BriefUnitGraph(currentMethodOnStack.getActiveBody());
								List<Unit> successors = new ArrayList<Unit>();
								successors.addAll(briefUnitGraph.getSuccsOf(branchingUnit));
								for(int i=0;i<successors.size();i++) {
									Unit u = successors.get(i);
									Logger.log("\t\tIF-STMT::UnitBox::UnitBranch::BranchingUnit::SuccUnit="+u);//TODO: check if this is invoke stmt to next method on stack, if so then we need JVM to execute this UNITBOX of the IF-ELSE block. 
									successors.addAll(briefUnitGraph.getSuccsOf(u));
									if(u instanceof InvokeStmt){
										InvokeStmt istmt = (InvokeStmt)u;
										String signatureNextMothodOnStack = NextMethod.getSignature();
										if(istmt.getInvokeExpr().getMethod().getSignature().equals(signatureNextMothodOnStack)){
											// OKAYYYY this IF-THEN block does calls the next method on stack.
											// we must any how force the execution to pass through this block.
											Logger.log("THIS UNIT CALLS THE NEXT METHOD ON STACK!!!");
											isThisUnitCallingNextMethod = true;
											break;
										}
									}
								}
							}
						}
					}
				}else{
					//it's a GOTO statement
					Logger.log("\tFOUND GOTO-STMT, unit="+unit);
					if(unit instanceof JGotoStmt){
						JGotoStmt gotoStmt = (JGotoStmt) unit;
						List gotoUnitBoxes = gotoStmt.getUnitBoxes();
						Iterator<UnitBox> itrGotoUnitBoxes = gotoUnitBoxes.iterator();
						while(itrGotoUnitBoxes.hasNext()){
							UnitBox ub = itrGotoUnitBoxes.next();
							Logger.log("\t\tGOTO-STMT::UnitBox="+ub.toString());

							if(ub.isBranchTarget()){
								Unit branchingUnit = ub.getUnit();
								BriefUnitGraph briefUnitGraph = new BriefUnitGraph(currentMethodOnStack.getActiveBody());

								List<Unit> successors = new ArrayList<Unit>();
								successors.addAll(briefUnitGraph.getSuccsOf(branchingUnit));
								for(int i=0;i<successors.size();i++){
									Logger.log("\t\t\tGOTO-STMT ----> "+successors.get(i));
								}
								for(Iterator<Unit> itrUnits = successors.iterator();itrUnits.hasNext();) {
									Unit u = itrUnits.next();
									Logger.log("\t\t\tGOTO-STMT->UnitBox->unit="+u);
									if(u instanceof InvokeStmt){
										InvokeStmt istmt = (InvokeStmt)u;
										String signatureNextMothodOnStack = NextMethod.getSignature();
										if(istmt.getInvokeExpr().getMethod().getSignature().equals(signatureNextMothodOnStack)){
											isThisUnitCallingNextMethod = true;
											Logger.log("THIS UNIT CALLS THE NEXT METHOD ON STACK!!!");
										}
									}
								}
							}
						}
					}
				}

				/** 
				 * now check if our IF block had a call to next method on stack,
				 * if so, then just replace this IF condition with true or else replace with false !!
				 */
				if(isThisUnitCallingNextMethod){
					//TODO: replace the condition of the IF-ELSE to be true so this block will get executed.

					/**
					 * if this unit is IF CONDITION then turn it TRUE,
					 * if this unit is GOTO then the IF of this goto needs to be turned to FALSE
					 */




				} else {
					//TODO: this means that there was no invoke found in the IF part of IF-ELSE block.
					/**
					 * if this unit is IF CONDITION then turn this condition to FALSE, 
					 * so that the GOTO may be executed and MAY-BE it contains the call to next method on stack !
					 */
				}


			} else {
				// this unit will not lead to branching
			}
		}		
	}

	private void InstrumentMethodInsertLocalDummyBoolean(
			SootMethod currentMethodOnStack, SootMethod nextMethodOnStack) {
		Logger.log("INSIDE :: InstrumentMethodInsertLocalDummyBoolean();");
		Body currentMethodBody = currentMethodOnStack.getActiveBody();
//		Chain<Unit> units = currentMethodBody.getUnits();
		List<UnitBox> unitBoxes = currentMethodBody.getUnitBoxes(true);
		BriefUnitGraph unitGraph = new BriefUnitGraph(currentMethodBody);
		
		for(UnitBox ub : unitBoxes){
			Unit u = ub.getUnit();
			Logger.log("BRANCHING UnitBox="+ub.toString()+" , Unit="+u.toString());
			List<Unit> predUnits = unitGraph.getPredsOf(u);
			for(Unit predUnit : predUnits){
				Logger.log("\tPRED UNIT:"+predUnit);
				if(!(predUnit instanceof IfStmt)) continue;
				
				List<Unit> succOfPredUnit = unitGraph.getSuccsOf(predUnit);
				IfStmt ifstmt = (IfStmt) predUnit;

				/**
				 * we will recursively search for call to next method on stack and instrument the IF conditions!
				 */
				for(Unit succUnit : succOfPredUnit){
					Logger.log("\tSUCCESOR UNIT:"+succUnit);
					/*
					 * check if the predecessor unit is 
					 * IF condition and the successor unit contains a call to next method
					 * then instrument this to TRUE or else to FALSE
					 */
					List<Unit> succesors = new ArrayList<Unit>();
					succesors.add(succUnit);
					//get list of all following successors till return/goto/if
					boolean endOfSuccesors = false;
					endOfSuccesors = succUnit.branches() 
							|| (succUnit instanceof ReturnStmt)
							|| (succUnit instanceof GotoStmt)
							|| (succUnit instanceof IfStmt);
					while(!endOfSuccesors){
						List<Unit> succ = unitGraph.getSuccsOf(succUnit);
						if(succ.size()==0){
							break;
						}
						succUnit = succ.get(0);
						succesors.addAll(succ);						
						endOfSuccesors = succUnit.branches() 
								|| (succUnit instanceof ReturnStmt)
								|| (succUnit instanceof GotoStmt)
								|| (succUnit instanceof IfStmt);
					}
					
					System.out.println("\tALL SUCCESORS:"+succesors);
					
					
					//now if this list of units ends in an IF conditions then we need to recurse for searching a call to next method on stack.
					
					
					
				}
			}
			
		}
	}
}
