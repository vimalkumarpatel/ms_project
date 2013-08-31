package dk.brics.soot.callgraphs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
import soot.SootMethod;
import soot.Transform;
import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Targets;

class Logger{
	private static BufferedWriter bw = null;
	static{
		try{
			bw = new BufferedWriter(new FileWriter(new File("new.txt")));
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static void log(String msg){
		try{
			System.out.println(msg);
			bw.write(msg);
	        bw.newLine();
	        bw.flush();
		}catch(Exception ex){
			ex.printStackTrace();
		}		
	}
	public static void close() {
		try{
			bw.flush();
			bw.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
public class CallGraphExample
{	
	
	public static Stack<SootMethod> stack = new Stack<SootMethod>();
//	public static String strSourceClass = "net.vimalpatel.test.A";
//	public static String strSourceMethod = "main";
//	
//	public static String strTargetClass = "net.vimalpatel.test.B";
//	public static String strTargetMethod = "methodB";
	
	public static ArrayList<String> strPackageList = new ArrayList<String>();

	public static String strSourceClass = "testers.Main";
	public static String strSourceMethod = "main";
	
	public static String strTargetClass = "net.vimalpatel.test.B";
	public static String strTargetMethod = "methodB";

	public static String strSourceMethodSignature = "<testers.Main: void main(java.lang.String[])>";
	public static String strTargetMethodSignature = "<net.vimalpatel.test.B: void methodB()>";

	
	public static void main(String[] args) {
		CallGraphExample cge = new CallGraphExample();
		strPackageList.add("net.vimalpatel");
		strPackageList.add("com.webc");
		
		   List<String> argsList = new ArrayList<String>(Arrays.asList(args));
		   Scene.v().getApplicationClasses();
			if (argsList.isEmpty()) 
				argsList.addAll(Arrays.asList(new String[] {
						"-keep-line-number",
						"-w",
						"-W",
						"-f",
						"jimple",
//						"-app",
						"-main-class", 
						"testers.Main",// main-class
						"testers.Main",// argument classes
						strSourceClass,
						strSourceClass,
						strTargetClass//
				}));

		PackManager.v().getPack("wjtp").
			add(new Transform("wjtp.myTrans",new CallStackFinderTransformer(stack)));
		
		args = argsList.toArray(new String[0]);
		soot.Main.main(args);

		Logger.close();
	}
}
