package net.vimalpatel.maindriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import net.vimalpatel.utils.Logger;
import dk.brics.soot.callgraphs.CallStackFinderTransformer;
import soot.MethodOrMethodContext;
import soot.PackManager;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.Transform;
import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.ReachableMethods;
import soot.jimple.toolkits.callgraph.Targets;


public class MainDriver_CallGraph
{	
	
	static Stack<SootMethod> stack = new Stack<SootMethod>();
	static String strSourceClass = "net.vimalpatel.test.A";
	static String strSourceMethod = "main";
	static String strSourceMethodSignature = "<net.vimalpatel.test.A: void main(java.lang.String[])>";
	static String strTargetClass = "net.vimalpatel.test.B";
	static String strTargetMethod = "methodB";
	static String strTargetMethodSignature = "<net.vimalpatel.test.B: void methodB()>";
	static ArrayList<String> packageList = null;
	static{
		packageList = new ArrayList<String>();
		packageList.add("net.vimalpatel.test");
		packageList.add("com.webc");
	}
	
	
	public static void main(String[] args) {		

		   List<String> argsList = new ArrayList<String>(Arrays.asList(args));
		   Scene.v().getApplicationClasses();
			if (argsList.isEmpty()) 
				argsList.addAll(Arrays.asList(new String[] {
						"-keep-line-number",
						//whole application mode
							"-w",
						//Whole program optimize using soot
							//"-whole-optimize",
						//output format
							"-f",
							//"class",
							"jimple",
						//Run in application mode, processing all classes referenced by argument classes.
							//"-app",
						//(entry point) in whole-program analysis
							"-main-class", 
							"net.vimalpatel.test.A",// main-class
							"net.vimalpatel.test.A",// argument classes
							strSourceClass,
							strSourceClass,
							strTargetClass//
				}));

			//Stack<SootMethod> stack, ArrayList<String> packageList,String strSourceMethod,String strSourceMethodSignature,String strTargetMethod,String strTargetMethodSignature
		   PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTrans", new CallStackFinderTransformer(stack,packageList,
				   strSourceMethod,strSourceMethodSignature,
				   strTargetMethod,strTargetMethodSignature)));

	           args = argsList.toArray(new String[0]);
	   		for(int i=0;i<args.length;i++){
				Logger.log("args["+i+"]="+args[i]);
			}	           
	           soot.Main.main(args);		

	}
}





/**
 * 
 * @author vimalkumarpatel
 * 
 * this class is not used right now, also i have kind of deprecated code for this class.
 *
 */
class myTransformer_2 extends SceneTransformer{

	private Stack<SootMethod> stack = null;
	CallGraph cg = null;
	
	public myTransformer_2(Stack<SootMethod> stack){
		super();
		this.stack = stack;
	}
	
	private int Recurse(String strClassName, String strMethodName){
		Logger.log("Recurse(" + strClassName + " , " + strMethodName +");");
		SootClass srcSootClass = Scene.v().getSootClass(strClassName);
		SootMethod srcSootMethod = srcSootClass.getMethodByName(strMethodName);
		Logger.log("CurrentMethodSignature:"+srcSootMethod);
		stack.push(srcSootMethod);
		

		int ret = 0;
		if(srcSootMethod.getDeclaringClass().toString() == MainDriver_CallGraph.strTargetClass
				&&
			srcSootMethod.getName().startsWith(MainDriver_CallGraph.strTargetMethod)){
			ret = 1;
			return ret;
		}
		
		
		Iterator<MethodOrMethodContext> targets = new Targets(
				cg.edgesOutOf(srcSootMethod));		
		while (targets.hasNext()) {
			SootMethod tgt = (SootMethod) targets.next();
			if(tgt.getDeclaringClass().getName().startsWith("net.vimalpatel")){
				int returnVal = Recurse(tgt.getDeclaringClass().getName(),tgt.getName());
				if (returnVal == 1){
					ret = 1;
					break;
				}
			}
		}

		if(ret == 0) { stack.pop(); }
		return ret;
	}
	
	@Override
	protected void internalTransform(String phaseName, Map options) {
		Logger.log("phaseName="+phaseName+", options="+options);
		CHATransformer.v().transform();
		cg = Scene.v().getCallGraph();
		SootClass srcSootClass = Scene.v().getSootClass(MainDriver_CallGraph.strSourceClass);
		SootMethod srcSootMethod = srcSootClass.getMethodByName(MainDriver_CallGraph.strSourceMethod);
		
		SootClass tgtSootClass = Scene.v().getSootClass(MainDriver_CallGraph.strTargetClass);
		SootMethod tgtSootMethod = tgtSootClass.getMethodByName(MainDriver_CallGraph.strTargetMethod);

		SootMethod unreachableSootMethod = tgtSootClass.getMethodByName("unreachableMethod");		
		
		ReachableMethods rm = Scene.v().getReachableMethods();
		System.out.print("CHECKING if tgtSootMethod:" + tgtSootMethod.getSignature()+" is reachable using Scene.v().getReachableMethods(); == ");
		if (rm.contains(tgtSootMethod)) {
			Logger.log("TRUE");
		} else {
			Logger.log("FALSE");
		}
		
		System.out.print("CHECKING if unreachableSootMethod:" + unreachableSootMethod.getSignature()+" is reachable using Scene.v().getReachableMethods(); == ");
		if (rm.contains(unreachableSootMethod)) {
			Logger.log("TRUE");
		} else {
			Logger.log("FALSE");
		}

//		Iterator<MethodOrMethodContext> it = rm.listener();
//		while (it.hasNext()) {
//			SootMethod method = (SootMethod) it.next();
//			// method is reachable
//			Logger.log("method:"+method+" is reachable.");
//		}
		
//		stack.push(tgt);
		
//		int ret = Recurse(CallGraphExample_2.strSourceClass,CallGraphExample_2.strSourceMethod);
		
//		Iterator<MethodOrMethodContext> targets = new Targets(
//				cg.edgesOutOf(srcSootMethod));		
//		while (targets.hasNext()) {
//			SootMethod tgt = (SootMethod) targets.next();
//			Logger.log(srcSootMethod+" CALLS "+tgt);
//		}

//			if (tgt.getDeclaringClass().getName()
//					.equals("com.webc.downloader.HtmlDownloader")
//					&& tgt.getName().contains("<init>")) {
//				Logger.log("....#########  TRUE  ##########....");
//
//				SootClass htmlDownloader = Scene.v().getSootClass(
//						"com.webc.downloader.HtmlDownloader");
//				List<SootMethod> methods = htmlDownloader.getMethods();
//				Iterator<SootMethod> it = methods.iterator();
//				while (it.hasNext()) {
//					SootMethod sm = it.next();
//					Logger.log("\t" + sm.getName());
//					if (sm.getName().contains("<init>")) {
//						Logger.log("\t\tCONSTRUCTOR FOUND :: "
//								+ sm.getBytecodeParms());
//
//					}
//					if (sm.getName().contains("run")) {
//						Logger.log("\t\tRUN METHOD FOUND :: "
//								+ sm.getBytecodeParms());
//						Body b = sm.getActiveBody();
//						UnitPrinter up = new NormalUnitPrinter(b);
//						List<UnitBox> listBoxes = b.getUnitBoxes(true);
//						for (UnitBox ubox : listBoxes) {
//							Unit u = ubox.getUnit();
//							List listValueBoxes = u.getUseAndDefBoxes();
//							for (Object valueBox : listValueBoxes) {
//								Logger.log("value box: "
//										+ valueBox.toString());
//								if (valueBox instanceof ValueBox) {
//									ValueBox vb = (ValueBox) valueBox;
//									Logger.log("VALUE == "
//											+ vb.getValue());
//
//								}
//							}
//						}
//					}
//				}
//			}
		}
	}
	

