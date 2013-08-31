import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class com_webc_utils_QueueManager_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("com.webc.utils.QueueManager");    
    c.setApplicationClass();    
    Scene.v().addClass(c);    
    createMethod0(c);    
    createMethod1(c);    
    createMethod2(c);    
    createMethod3(c);    
    createMethod4(c);    
    createMethod5(c);    
    createMethod6(c);    
    createMethod7(c);    
    createMethod8(c);    
    createMethod9(c);    
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("readnext",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.util.Queue")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.net.URL")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.QueueManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.util.Queue");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"getQueue",parameterTypes,returnType,false);      
      Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Queue"),"remove",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"temp$2");    
    RefType type1 = RefType.v("java.net.URL");    
    Local op0 = localByName(b,"temp$1");    
    Value rhs2 = Jimple.v().newCastExpr(type1,op0);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local retVal0 = localByName(b,"temp$2");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("getQueue",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.util.Queue")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.QueueManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.util.Queue");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"queue",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("setQueue",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("queue", RefType.v("java.util.Queue")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.QueueManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"queue");    
    RefType paramType0 = RefType.v("java.util.Queue");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.util.Queue");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"queue",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"queue");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod3(SootClass c) {  
    SootMethod m = new SootMethod("hasnext",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.util.Queue")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("boolean")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.QueueManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.util.Queue");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"queue",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Collection"),"isEmpty",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local left0 = localByName(b,"temp$1");    
    Value right0 = IntConstant.v(0);    
    Value condition0 = Jimple.v().newEqExpr(left0,right0);    
    Unit target0=jumpTarget1;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs3 = localByName(b,"temp$2");    
    Value rhs2 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local retVal0 = localByName(b,"temp$2");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs4 = localByName(b,"temp$3");    
    Value rhs3 = IntConstant.v(1);    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local retVal1 = localByName(b,"temp$3");    
    units.add(Jimple.v().newReturnStmt(retVal1));    
  }  

  public void createMethod4(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("dbm", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.util.LinkedList")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.QueueManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"dbm");    
    RefType paramType0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs2 = localByName(b,"temp$0");    
    RefType type1 = RefType.v("java.util.LinkedList");    
    Value rhs0 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.LinkedList"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      RefType type = RefType.v("java.util.Queue");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"queue",type,false);      Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs1 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs1));    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"dbman",type,false);      Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs2 = localByName(b,"dbm");    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod5(SootClass c) {  
    SootMethod m = new SootMethod("AddUrl",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("StrUrl", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("tempURL", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.util.Queue")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.util.Queue")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$13", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$14", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$15", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$16", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$17", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$18", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("ex", RefType.v("java.net.MalformedURLException")));    
    locals.add(Jimple.v().newLocal("temp$19", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$20", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$21", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$22", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$23", RefType.v("java.util.logging.Logger")));    
    locals.add(Jimple.v().newLocal("temp$24", RefType.v("java.util.logging.Level")));    
    locals.add(Jimple.v().newLocal("temp$25", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$26", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$27", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    NopStmt jumpTarget2= Jimple.v().newNopStmt();    
    NopStmt jumpTarget3= Jimple.v().newNopStmt();    
    NopStmt jumpTarget4= Jimple.v().newNopStmt();    
    NopStmt jumpTarget5= Jimple.v().newNopStmt();    
    NopStmt jumpTarget6= Jimple.v().newNopStmt();    
    NopStmt jumpTarget7= Jimple.v().newNopStmt();    
    NopStmt jumpTarget8= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.QueueManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"StrUrl");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"tempURL");    
    Value rhs0 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs3 = localByName(b,"temp$0");    
    RefType type1 = RefType.v("java.net.URL");    
    Value rhs1 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs1));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs4 = localByName(b,"tempURL");    
    Local rhs2 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs2));    
    Local lhs5 = localByName(b,"temp$1");    
    {    
      RefType type = RefType.v("java.util.Queue");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"queue",type,false);      Value rhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs3));    
    Local lhs6 = localByName(b,"temp$2");    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Collection"),"contains",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs4));    
    Local left0 = localByName(b,"temp$2");    
    Value right0 = IntConstant.v(0);    
    Value condition0 = Jimple.v().newEqExpr(left0,right0);    
    Unit target0=jumpTarget1;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs7 = localByName(b,"temp$3");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs5 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs5));    
    Local lhs8 = localByName(b,"temp$4");    
    RefType type2 = RefType.v("java.lang.StringBuffer");    
    Value rhs6 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs6));    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    Local lhs9 = localByName(b,"temp$5");    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs7));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Unit target2=jumpTarget4;    
    units.add(Jimple.v().newGotoStmt(target2));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs10 = localByName(b,"temp$6");    
    {    
      RefType type = RefType.v("java.util.Queue");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"queue",type,false);      Value rhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs8));    
    Local lhs11 = localByName(b,"temp$7");    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Queue"),"add",parameterTypes,returnType,false);      
      Value rhs9 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs9));    
    Local lhs12 = localByName(b,"temp$8");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs10 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs10));    
    Local lhs13 = localByName(b,"temp$9");    
    RefType type3 = RefType.v("java.lang.StringBuffer");    
    Value rhs11 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs11));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs14 = localByName(b,"temp$10");    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs12));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    Value left1 = NullConstant.v();    
    Local right1 = localByName(b,"tempURL");    
    Value condition1 = Jimple.v().newNeExpr(left1,right1);    
    Unit target3=jumpTarget2;    
    units.add(Jimple.v().newIfStmt(condition1,target3));    
    Unit target4=jumpTarget3;    
    units.add(Jimple.v().newGotoStmt(target4));    
    units.add(jumpTarget2);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs15 = localByName(b,"temp$11");    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"dbman",type,false);      Value rhs13 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs13));    
    Local lhs16 = localByName(b,"temp$12");    
    RefType type4 = RefType.v("java.lang.StringBuffer");    
    Value rhs14 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs14));    
    {    
      Local base = localByName(b,"temp$12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    {    
      Local base = localByName(b,"temp$12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    {    
      Local base = localByName(b,"temp$12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    {    
      Local base = localByName(b,"temp$12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie13));    
    Local lhs17 = localByName(b,"temp$13");    
    {    
      Local base = localByName(b,"temp$12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs15));    
    {    
      Local base = localByName(b,"temp$11");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"executeInsertQuery",parameterTypes,returnType,false);      
      Value ie14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie14));    
    units.add(jumpTarget3);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs18 = localByName(b,"temp$14");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs16 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs16));    
    Local lhs19 = localByName(b,"temp$15");    
    RefType type5 = RefType.v("java.lang.StringBuffer");    
    Value rhs17 = Jimple.v().newNewExpr(type5);    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs17));    
    {    
      Local base = localByName(b,"temp$15");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie15 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie15));    
    {    
      Local base = localByName(b,"temp$15");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie16));    
    Local lhs20 = localByName(b,"temp$16");    
    {    
      Local base = localByName(b,"tempURL");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"toString",parameterTypes,returnType,false);      
      Value rhs18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs18));    
    {    
      Local base = localByName(b,"temp$15");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie17));    
    Local lhs21 = localByName(b,"temp$17");    
    {    
      Local base = localByName(b,"temp$15");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs19));    
    {    
      Local base = localByName(b,"temp$14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie18));    
    Local lhs22 = localByName(b,"temp$18");    
    Value rhs20 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs20));    
    Local lhs23 = localByName(b,"tempURL");    
    Local rhs21 = localByName(b,"temp$18");    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs21));    
    units.add(jumpTarget4);    
    units.add(Jimple.v().newNopStmt());    
    Unit target5=jumpTarget7;    
    units.add(Jimple.v().newGotoStmt(target5));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs24 = localByName(b,"ex");    
    Value idRef2 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs24,idRef2));    
    Local lhs25 = localByName(b,"temp$20");    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"class$com$webc$utils$QueueManager",type,true);      Value rhs22 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs22));    
    Local left2 = localByName(b,"temp$20");    
    Value right2 = NullConstant.v();    
    Value condition2 = Jimple.v().newNeExpr(left2,right2);    
    Unit target6=jumpTarget5;    
    units.add(Jimple.v().newIfStmt(condition2,target6));    
    Local lhs26 = localByName(b,"temp$21");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"class$",parameterTypes,returnType,true);      
      Value rhs23 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs23));    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"class$com$webc$utils$QueueManager",type,true);      Value lhs27 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs24 = localByName(b,"temp$21");    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs24));    
    Local lhs28 = localByName(b,"temp$19");    
    Local rhs25 = localByName(b,"temp$21");    
    units.add(Jimple.v().newAssignStmt(lhs28,rhs25));    
    Unit target7=jumpTarget6;    
    units.add(Jimple.v().newGotoStmt(target7));    
    units.add(jumpTarget5);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs29 = localByName(b,"temp$19");    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"class$com$webc$utils$QueueManager",type,true);      Value rhs26 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs29,rhs26));    
    units.add(jumpTarget6);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs30 = localByName(b,"temp$22");    
    {    
      Local base = localByName(b,"temp$19");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);      
      Value rhs27 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs30,rhs27));    
    Local lhs31 = localByName(b,"temp$23");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.util.logging.Logger");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.logging.Logger"),"getLogger",parameterTypes,returnType,true);      
      Value rhs28 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs31,rhs28));    
    Local lhs32 = localByName(b,"temp$24");    
    {    
      RefType type = RefType.v("java.util.logging.Level");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.util.logging.Level"),"SEVERE",type,true);      Value rhs29 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs32,rhs29));    
    {    
      Local base = localByName(b,"temp$23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.util.logging.Level");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("java.lang.Throwable");      
      parameterTypes.add(type2);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.logging.Logger"),"log",parameterTypes,returnType,false);      
      Value ie19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie19));    
    Local lhs33 = localByName(b,"temp$25");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs30 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs33,rhs30));    
    Local lhs34 = localByName(b,"temp$26");    
    RefType type6 = RefType.v("java.lang.StringBuffer");    
    Value rhs31 = Jimple.v().newNewExpr(type6);    
    units.add(Jimple.v().newAssignStmt(lhs34,rhs31));    
    {    
      Local base = localByName(b,"temp$26");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie20 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie20));    
    {    
      Local base = localByName(b,"temp$26");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie21));    
    {    
      Local base = localByName(b,"temp$26");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie22));    
    Local lhs35 = localByName(b,"temp$27");    
    {    
      Local base = localByName(b,"temp$26");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs32 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs35,rhs32));    
    {    
      Local base = localByName(b,"temp$25");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie23));    
    units.add(Jimple.v().newNopStmt());    
    Unit target8=jumpTarget7;    
    units.add(Jimple.v().newGotoStmt(target8));    
    units.add(jumpTarget7);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod6(SootClass c) {  
    SootMethod m = new SootMethod("getNextUrl",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.util.Queue")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.util.Queue")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.util.Queue")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("java.net.URL")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.QueueManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.util.Queue");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"queue",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Collection"),"isEmpty",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local left0 = localByName(b,"temp$1");    
    Value right0 = IntConstant.v(0);    
    Value condition0 = Jimple.v().newEqExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs3 = localByName(b,"temp$2");    
    {    
      RefType type = RefType.v("java.util.Queue");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"queue",type,false);      Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"temp$3");    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Queue"),"remove",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local lhs5 = localByName(b,"temp$4");    
    RefType type1 = RefType.v("java.net.URL");    
    Local op0 = localByName(b,"temp$3");    
    Value rhs4 = Jimple.v().newCastExpr(type1,op0);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    Local retVal0 = localByName(b,"temp$4");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs6 = localByName(b,"temp$5");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs5 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    {    
      Local base = localByName(b,"temp$5");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs7 = localByName(b,"temp$6");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs6 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    Local lhs8 = localByName(b,"temp$7");    
    RefType type2 = RefType.v("java.lang.StringBuffer");    
    Value rhs7 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs9 = localByName(b,"temp$8");    
    {    
      RefType type = RefType.v("java.util.Queue");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"queue",type,false);      Value rhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs8));    
    Local lhs10 = localByName(b,"temp$9");    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Queue"),"peek",parameterTypes,returnType,false);      
      Value rhs9 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs9));    
    Local lhs11 = localByName(b,"temp$10");    
    RefType type3 = RefType.v("java.net.URL");    
    Local op1 = localByName(b,"temp$9");    
    Value rhs10 = Jimple.v().newCastExpr(type3,op1);    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs10));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    Local lhs12 = localByName(b,"temp$11");    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs11));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs13 = localByName(b,"temp$12");    
    Value rhs12 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs12));    
    Local retVal1 = localByName(b,"temp$12");    
    units.add(Jimple.v().newReturnStmt(retVal1));    
  }  

  public void createMethod7(SootClass c) {  
    SootMethod m = new SootMethod("getDbman",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.QueueManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"dbman",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod8(SootClass c) {  
    SootMethod m = new SootMethod("setDbman",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("dbman", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.QueueManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"dbman");    
    RefType paramType0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"dbman",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"dbman");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod9(SootClass c) {  
    SootMethod m = new SootMethod("class$",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("name", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.ClassNotFoundException")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.NoClassDefFoundError")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"name");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef0 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"forName",parameterTypes,returnType,true);      
      Value rhs0 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    units.add(Jimple.v().newNopStmt());    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs2 = localByName(b,"e");    
    Value idRef1 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef1));    
    Local lhs3 = localByName(b,"temp$1");    
    RefType type0 = RefType.v("java.lang.NoClassDefFoundError");    
    Value rhs1 = Jimple.v().newNewExpr(type0);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs1));    
    Local lhs4 = localByName(b,"temp$2");    
    {    
      Local base = localByName(b,"e");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"getMessage",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs2));    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.NoClassDefFoundError"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local op0 = localByName(b,"temp$1");    
    units.add(Jimple.v().newThrowStmt(op0));    
  }  

}
