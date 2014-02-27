package dk.brics.soot.callgraphs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import soot.PackManager;
import soot.Scene;
import soot.SootMethod;
import soot.Transform;

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
	
	public static ArrayList<String> packageList = new ArrayList<String>();

	public static String strSourceClass = "testers.Main";
	public static String strSourceMethod = "main";
	
	public static String strTargetClass = "net.vimalpatel.test.B";
	public static String strTargetMethod = "methodB";

	public static String strSourceMethodSignature = "<testers.Main: void main(java.lang.String[])>";
	public static String strTargetMethodSignature = "<net.vimalpatel.test.B: void methodB()>";

	
	public static void main(String[] args) {
		CallGraphExample cge = new CallGraphExample();
		packageList.add("net.vimalpatel");
		packageList.add("com.webc");
		
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
			add(new Transform("wjtp.myTrans",new CallStackFinderTransformer(stack,packageList,strSourceMethod,strSourceMethodSignature,strTargetMethod,strTargetMethodSignature)));
		
		args = argsList.toArray(new String[0]);
		soot.Main.main(args);

		Logger.close();
	}
}
