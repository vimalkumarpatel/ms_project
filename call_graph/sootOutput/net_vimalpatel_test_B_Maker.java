import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class net_vimalpatel_test_B_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("net.vimalpatel.test.B");    
    c.setApplicationClass();    
    Scene.v().addClass(c);    
    createMethod0(c);    
    createMethod1(c);    
    createMethod2(c);    
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("methodB",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("net.vimalpatel.test.B")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintStream")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("net.vimalpatel.test.B");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("unreachableMethod",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("net.vimalpatel.test.B")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintStream")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("net.vimalpatel.test.B");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("net.vimalpatel.test.B")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("net.vimalpatel.test.B");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

}
