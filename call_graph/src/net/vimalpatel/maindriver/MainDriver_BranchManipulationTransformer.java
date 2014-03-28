package net.vimalpatel.maindriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.vimalpatel.transformers.BranchManipulationTransformer;
import soot.PackManager;
import soot.Scene;
import soot.Transform;


public class MainDriver_BranchManipulationTransformer
{	
	
	public static String strSourceClass = "net.vimalpatel.test.A";
	public static String strSourceMethod = "main";
	public static String strSourceMethodSignature = "<net.vimalpatel.test.A: void main(java.lang.String[])>";
	public static String strTargetClass = "net.vimalpatel.test.A";
	public static String strTargetMethod = "method_A1";
	public static String strTargetMethodSignature = "<net.vimalpatel.test.A: void method_A1()>";
	public static ArrayList<String> packageList = null;
	static{
		packageList = new ArrayList<String>();
		packageList.add("net.vimalpatel.test");
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
//							"jimple",
							//"shimple",
							"-via-shimple",
						//include classes with name starting with this package name
							"-i",
							"net.vimalpatel.test",
						//(entry point) in whole-program analysis
							"-main-class",
							"net.vimalpatel.test.B",
							strSourceClass
				}));

			//Stack<SootMethod> stack, ArrayList<String> packageList,String strSourceMeth1od,String strSourceMethodSignature,String strTargetMethod,String strTargetMethodSignature
		   PackManager.v().getPack("wjtp").add(new Transform("wjtp.BranchManipulationTransformer", 
				   new BranchManipulationTransformer(strSourceMethodSignature, strTargetMethodSignature)
		   ));
		   

	           args = argsList.toArray(new String[0]);
           
	           soot.Main.main(args);		

	}
}



