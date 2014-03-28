package net.vimalpatel.maindriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.vimalpatel.transformers.Instrumenter;
import soot.Pack;
import soot.PackManager;
import soot.Scene;
import soot.Transform;

public class MainDriver_Instrumenter {
	public static void main(String[] args) {

		List<String> argsList = new ArrayList<String>(Arrays.asList(args));
		if (argsList.isEmpty()) 
			argsList.addAll(Arrays.asList(new String[] {
//					"-keep-line-number",
////					"jb",
////					"-use-original-names",
//					"-w",
					"-f",
						//"jimple",
						"class",
////					"-app",
//					"-main-class", 
					"net.vimalpatel.test.instrument.TestInvoke"//,// main-class


			}));

		
		/* add a phase to transformer pack by call Pack.add */
		Pack jtp = PackManager.v().getPack("jtp");
		jtp.add(new Transform("jtp.instrumenter",
				new Instrumenter()));

		/* Give control to Soot to process all options,
		 * InvokeStaticInstrumenter.internalTransform will get called.
		 */
		args = argsList.toArray(new String[0]);
		for(int i=0;i<args.length;i++){
			System.out.println("args["+i+"]="+args[i]);
		}
		soot.Main.main(args);
	}

}
