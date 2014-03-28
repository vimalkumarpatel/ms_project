package net.vimalpatel.maindriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import net.vimalpatel.transformers.CallStackFinderTransformer;
import net.vimalpatel.transformers.Instrumenter;
import net.vimalpatel.utils.Logger;
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


public class MainDriver_CallStackFinderTransformer
{	
	
	static Stack<SootMethod> stack = new Stack<SootMethod>();
	static String strSourceClass = "net.vimalpatel.test.A";
	static String strSourceMethod = "main";
	static String strSourceMethodSignature = "<net.vimalpatel.test.A: void main(java.lang.String[])>";
	static String strTargetClass = "net.vimalpatel.test.B";
	static String strTargetMethod = "methodB";
	static String strTargetMethodSignature = "<net.vimalpatel.test.B: boolean method_B1()>";
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
							"class",
							//"jimple",
							//"shimple",
						//-via-shimple
							"-via-shimple",
						//classpath
//							"-cp",
//							".;c:\\Program Files (x86)\\Java\\jdk1.7.0_10\\jre\\lib\\jce.jar",
						//include classes with name starting with this package name
							"-i",
							"net.vimalpatel.test",
						//Run in application mode, processing all classes referenced by argument classes.
							//"-app",
						//(entry point) in whole-program analysis
							"-main-class", 
							"net.vimalpatel.test.A",// main-class
							"net.vimalpatel.test.B",// argument classes
							strSourceClass,
							strTargetClass//,
//							strTargetClass//
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
