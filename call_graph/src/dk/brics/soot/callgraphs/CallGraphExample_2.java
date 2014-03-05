package dk.brics.soot.callgraphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

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


public class CallGraphExample_2
{	
	
	static Stack<SootMethod> stack = new Stack<SootMethod>();
	static String strSourceClass = "net.vimalpatel.test.A";
	static String strSourceMethod = "main";
	static String strSourceMethodSignature = "<net.vimalpatel.test.A: void main(java.lang.String[])>";
	static String strTargetClass = "net.vimalpatel.test.B";
	static String strTargetMethod = "methodB";
	static String strTargetMethodSignature = "<net.vimalpatel.test.B: void methodB()>";
	static ArrayList<String> packageList = new ArrayList<String>();
	
	public static void main(String[] args) {		

		   List<String> argsList = new ArrayList<String>(Arrays.asList(args));
		   Scene.v().getApplicationClasses();
			if (argsList.isEmpty()) 
				argsList.addAll(Arrays.asList(new String[] {
//						"jb",
//						"-use-original-names",
						"-w",
//						"-W",
						"-f",//output format
							//"class",
							"jimple",
//						"-app",
						"-main-class", 
						"net.vimalpatel.test.A",// main-class
						"net.vimalpatel.test.A",// argument classes
						strSourceClass,
						strSourceClass,
						strTargetClass//
				}));

			
			packageList.add("net.vimalpatel.test");
			packageList.add("com.webc");

			//Stack<SootMethod> stack, ArrayList<String> packageList,String strSourceMethod,String strSourceMethodSignature,String strTargetMethod,String strTargetMethodSignature
		   PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTrans", new CallStackFinderTransformer(stack,packageList,
				   strSourceMethod,strSourceMethodSignature,
				   strTargetMethod,strTargetMethodSignature)));

	           args = argsList.toArray(new String[0]);
	   		for(int i=0;i<args.length;i++){
				System.out.println("args["+i+"]="+args[i]);
			}	           
	           soot.Main.main(args);		

	}
}






class myTransformer_2 extends SceneTransformer{

	private Stack<SootMethod> stack = null;
	CallGraph cg = null;
	
	public myTransformer_2(Stack<SootMethod> stack){
		super();
		this.stack = stack;
	}
	
	private int Recurse(String strClassName, String strMethodName){
		System.out.println("Recurse(" + strClassName + " , " + strMethodName +");");
		SootClass srcSootClass = Scene.v().getSootClass(strClassName);
		SootMethod srcSootMethod = srcSootClass.getMethodByName(strMethodName);
		System.out.println("CurrentMethodSignature:"+srcSootMethod);
		stack.push(srcSootMethod);
		

		int ret = 0;
		if(srcSootMethod.getDeclaringClass().toString() == CallGraphExample_2.strTargetClass
				&&
			srcSootMethod.getName().startsWith(CallGraphExample_2.strTargetMethod)){
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
		System.out.println("phaseName="+phaseName+", options="+options);
		CHATransformer.v().transform();
		cg = Scene.v().getCallGraph();
		SootClass srcSootClass = Scene.v().getSootClass(CallGraphExample_2.strSourceClass);
		SootMethod srcSootMethod = srcSootClass.getMethodByName(CallGraphExample_2.strSourceMethod);
		
		SootClass tgtSootClass = Scene.v().getSootClass(CallGraphExample_2.strTargetClass);
		SootMethod tgtSootMethod = tgtSootClass.getMethodByName(CallGraphExample_2.strTargetMethod);

		SootMethod unreachableSootMethod = tgtSootClass.getMethodByName("unreachableMethod");		
		
		ReachableMethods rm = Scene.v().getReachableMethods();
		System.out.print("CHECKING if tgtSootMethod:" + tgtSootMethod.getSignature()+" is reachable using Scene.v().getReachableMethods(); == ");
		if (rm.contains(tgtSootMethod)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		
		System.out.print("CHECKING if unreachableSootMethod:" + unreachableSootMethod.getSignature()+" is reachable using Scene.v().getReachableMethods(); == ");
		if (rm.contains(unreachableSootMethod)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

//		Iterator<MethodOrMethodContext> it = rm.listener();
//		while (it.hasNext()) {
//			SootMethod method = (SootMethod) it.next();
//			// method is reachable
//			System.out.println("method:"+method+" is reachable.");
//		}
		
//		stack.push(tgt);
		
//		int ret = Recurse(CallGraphExample_2.strSourceClass,CallGraphExample_2.strSourceMethod);
		
//		Iterator<MethodOrMethodContext> targets = new Targets(
//				cg.edgesOutOf(srcSootMethod));		
//		while (targets.hasNext()) {
//			SootMethod tgt = (SootMethod) targets.next();
//			System.out.println(srcSootMethod+" CALLS "+tgt);
//		}

//			if (tgt.getDeclaringClass().getName()
//					.equals("com.webc.downloader.HtmlDownloader")
//					&& tgt.getName().contains("<init>")) {
//				System.out.println("....#########  TRUE  ##########....");
//
//				SootClass htmlDownloader = Scene.v().getSootClass(
//						"com.webc.downloader.HtmlDownloader");
//				List<SootMethod> methods = htmlDownloader.getMethods();
//				Iterator<SootMethod> it = methods.iterator();
//				while (it.hasNext()) {
//					SootMethod sm = it.next();
//					System.out.println("\t" + sm.getName());
//					if (sm.getName().contains("<init>")) {
//						System.out.println("\t\tCONSTRUCTOR FOUND :: "
//								+ sm.getBytecodeParms());
//
//					}
//					if (sm.getName().contains("run")) {
//						System.out.println("\t\tRUN METHOD FOUND :: "
//								+ sm.getBytecodeParms());
//						Body b = sm.getActiveBody();
//						UnitPrinter up = new NormalUnitPrinter(b);
//						List<UnitBox> listBoxes = b.getUnitBoxes(true);
//						for (UnitBox ubox : listBoxes) {
//							Unit u = ubox.getUnit();
//							List listValueBoxes = u.getUseAndDefBoxes();
//							for (Object valueBox : listValueBoxes) {
//								System.out.println("value box: "
//										+ valueBox.toString());
//								if (valueBox instanceof ValueBox) {
//									ValueBox vb = (ValueBox) valueBox;
//									System.out.println("VALUE == "
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
	

