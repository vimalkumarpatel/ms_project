import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class net_vimalpatel_test_A_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("net.vimalpatel.test.A");    
    c.setApplicationClass();    
    Scene.v().addClass(c);    
    createMethod0(c);    
    createMethod1(c);    
    createMethod2(c);    
    createMethod3(c);    
    createMethod4(c);    
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("main",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("args", RefType.v("java.lang.String[]")));    
    locals.add(Jimple.v().newLocal("a", RefType.v("net.vimalpatel.test.A")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("net.vimalpatel.test.A")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"args");    
    RefType baseType = RefType.v("java.lang.String");    
    int numDimensions=1;    
    Type paramType0 = ArrayType.v(baseType, numDimensions);    
    int number0=0;    
    Value idRef0 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    RefType type0 = RefType.v("net.vimalpatel.test.A");    
    Value rhs0 = Jimple.v().newNewExpr(type0);    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("net.vimalpatel.test.A"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs2 = localByName(b,"a");    
    Local rhs1 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    {    
      Local base = localByName(b,"a");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("net.vimalpatel.test.A"),"methodA",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      Local base = localByName(b,"a");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("net.vimalpatel.test.A"),"methodA2",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("methodA",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("net.vimalpatel.test.A")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintStream")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("net.vimalpatel.test.A");    
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
    SootMethod m = new SootMethod("methodA2",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("net.vimalpatel.test.A")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("net.vimalpatel.test.A");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("net.vimalpatel.test.A"),"methodC",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod3(SootClass c) {  
    SootMethod m = new SootMethod("methodC",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("net.vimalpatel.test.A")));    
    locals.add(Jimple.v().newLocal("b", RefType.v("net.vimalpatel.test.B")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("net.vimalpatel.test.B")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("net.vimalpatel.test.A");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    RefType type1 = RefType.v("net.vimalpatel.test.B");    
    Value rhs0 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("net.vimalpatel.test.B"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs2 = localByName(b,"b");    
    Local rhs1 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    {    
      Local base = localByName(b,"b");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("net.vimalpatel.test.B"),"methodB",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod4(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("net.vimalpatel.test.A")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("net.vimalpatel.test.A");    
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
