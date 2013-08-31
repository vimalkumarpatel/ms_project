import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class org_apache_tomcat_dbcp_dbcp_datasources_SharedPoolDataSource_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
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
    createMethod10(c);    
    createMethod11(c);    
    createMethod12(c);    
    createMethod13(c);    
    createMethod14(c);    
    createMethod15(c);    
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.LRUMap")));    
    locals.add(Jimple.v().newLocal("$l0", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("$i1", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs1 = localByName(b,"$r1");    
    RefType type1 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.LRUMap");    
    Value rhs0 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    {    
      Local base = localByName(b,"$r1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.LRUMap"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      RefType type = RefType.v("java.util.Map");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"userKeys",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs1 = localByName(b,"$r1");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxActive",type,false);      Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs2 = IntConstant.v(8);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxIdle",type,false);      Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs3 = IntConstant.v(8);    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local lhs5 = localByName(b,"$l0");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = LongType.v();      
      parameterTypes.add(type0);      
      Type type1 = LongType.v();      
      parameterTypes.add(type1);      
      Type returnType = LongType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Math"),"min",parameterTypes,returnType,true);      
      Value rhs4 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    Local lhs6 = localByName(b,"$i1");    
    Type type2 = IntType.v();    
    Local op0 = localByName(b,"$l0");    
    Value rhs5 = Jimple.v().newCastExpr(type2,op0);    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxWait",type,false);      Value lhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs6 = localByName(b,"$i1");    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value lhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs7 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("close",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$r2", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$r3", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local left0 = localByName(b,"$r1");    
    Value right0 = NullConstant.v();    
    Value condition0 = Jimple.v().newEqExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Local lhs2 = localByName(b,"$r2");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs1 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    {    
      Local base = localByName(b,"$r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.KeyedObjectPool"),"close",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs3 = localByName(b,"$r3");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"instanceKey",type,false);      Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"removeInstance",parameterTypes,returnType,true);      
      Value ie1 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("getMaxActive",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxActive",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod3(SootClass c) {  
    SootMethod m = new SootMethod("setMaxActive",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"i0");    
    Type paramType0 = IntType.v();    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxActive",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod4(SootClass c) {  
    SootMethod m = new SootMethod("getMaxIdle",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxIdle",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod5(SootClass c) {  
    SootMethod m = new SootMethod("setMaxIdle",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"i0");    
    Type paramType0 = IntType.v();    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxIdle",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod6(SootClass c) {  
    SootMethod m = new SootMethod("getMaxWait",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxWait",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod7(SootClass c) {  
    SootMethod m = new SootMethod("setMaxWait",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"i0");    
    Type paramType0 = IntType.v();    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxWait",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod8(SootClass c) {  
    SootMethod m = new SootMethod("getNumActive",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r2", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local left0 = localByName(b,"$r1");    
    Value right0 = NullConstant.v();    
    Value condition0 = Jimple.v().newNeExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Local lhs2 = localByName(b,"$i0");    
    Value rhs1 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Unit target1=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target1));    
    Local lhs3 = localByName(b,"$r2");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"$i0");    
    {    
      Local base = localByName(b,"$r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.KeyedObjectPool"),"getNumActive",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod9(SootClass c) {  
    SootMethod m = new SootMethod("getNumIdle",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r2", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local left0 = localByName(b,"$r1");    
    Value right0 = NullConstant.v();    
    Value condition0 = Jimple.v().newNeExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Local lhs2 = localByName(b,"$i0");    
    Value rhs1 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Unit target1=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target1));    
    Local lhs3 = localByName(b,"$r2");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"$i0");    
    {    
      Local base = localByName(b,"$r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.KeyedObjectPool"),"getNumIdle",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod10(SootClass c) {  
    SootMethod m = new SootMethod("getPooledConnectionAndInfo",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r3", RefType.v("javax.naming.NamingException")));    
    locals.add(Jimple.v().newLocal("r4", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("$r5", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$r6", RefType.v("javax.naming.NamingException")));    
    locals.add(Jimple.v().newLocal("$r7", RefType.v("org.apache.tomcat.dbcp.dbcp.SQLNestedException")));    
    locals.add(Jimple.v().newLocal("n0", RefType.v("null_type")));    
    locals.add(Jimple.v().newLocal("$r8", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$r9", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));    
    locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("r11", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo")));    
    locals.add(Jimple.v().newLocal("$r12", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("$r13", RefType.v("org.apache.tomcat.dbcp.dbcp.SQLNestedException")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    NopStmt jumpTarget2= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"r2");    
    RefType paramType1 = RefType.v("java.lang.String");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"$r5");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs0));    
    Local left0 = localByName(b,"$r5");    
    Value right0 = NullConstant.v();    
    Value condition0 = Jimple.v().newNeExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"registerPool",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Unit target1=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target1));    
    Local lhs4 = localByName(b,"$r6");    
    Value idRef3 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs4,idRef3));    
    Local lhs5 = localByName(b,"r3");    
    Local rhs1 = localByName(b,"$r6");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs1));    
    Local lhs6 = localByName(b,"$r7");    
    RefType type1 = RefType.v("org.apache.tomcat.dbcp.dbcp.SQLNestedException");    
    Value rhs2 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs2));    
    {    
      Local base = localByName(b,"$r7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.Throwable");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.SQLNestedException"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local op0 = localByName(b,"$r7");    
    units.add(Jimple.v().newThrowStmt(op0));    
    Local lhs7 = localByName(b,"n0");    
    Value rhs3 = NullConstant.v();    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs3));    
    Local lhs8 = localByName(b,"$r8");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs4));    
    Local lhs9 = localByName(b,"$r9");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"getUserPassKey",parameterTypes,returnType,false);      
      Value rhs5 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs5));    
    Local lhs10 = localByName(b,"$r10");    
    {    
      Local base = localByName(b,"$r8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.KeyedObjectPool"),"borrowObject",parameterTypes,returnType,false);      
      Value rhs6 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs6));    
    Local lhs11 = localByName(b,"r11");    
    RefType type2 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");    
    Local op1 = localByName(b,"$r10");    
    Value rhs7 = Jimple.v().newCastExpr(type2,op1);    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs7));    
    Unit target2=jumpTarget2;    
    units.add(Jimple.v().newGotoStmt(target2));    
    Local lhs12 = localByName(b,"$r12");    
    Value idRef4 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs12,idRef4));    
    Local lhs13 = localByName(b,"r4");    
    Local rhs8 = localByName(b,"$r12");    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs8));    
    Local lhs14 = localByName(b,"$r13");    
    RefType type3 = RefType.v("org.apache.tomcat.dbcp.dbcp.SQLNestedException");    
    Value rhs9 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs9));    
    {    
      Local base = localByName(b,"$r13");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.Throwable");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.SQLNestedException"),"<init>",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local op2 = localByName(b,"$r13");    
    units.add(Jimple.v().newThrowStmt(op2));    
    Local retVal0 = localByName(b,"r11");    
    units.add(jumpTarget2);    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod11(SootClass c) {  
    SootMethod m = new SootMethod("getReference",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("javax.naming.Reference")));    
    locals.add(Jimple.v().newLocal("$r2", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("r3", RefType.v("javax.naming.Reference")));    
    locals.add(Jimple.v().newLocal("$r4", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r7", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$r8", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    RefType type1 = RefType.v("javax.naming.Reference");    
    Value rhs0 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"$r4");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"getClass",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"$r5");    
    {    
      Local base = localByName(b,"$r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"$r2");    
    Value rhs3 = ClassConstant.v("org/apache/tomcat/dbcp/dbcp/datasources/SharedPoolDataSourceFactory");    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local lhs5 = localByName(b,"$r6");    
    {    
      Local base = localByName(b,"$r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    {    
      Local base = localByName(b,"$r1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("java.lang.String");      
      parameterTypes.add(type2);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs6 = localByName(b,"r3");    
    Local rhs5 = localByName(b,"$r1");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    Local lhs7 = localByName(b,"$r7");    
    RefType type2 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs6 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    Local lhs8 = localByName(b,"$r8");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"instanceKey",type,false);      Value rhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    {    
      Local base = localByName(b,"$r7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      Local base = localByName(b,"r3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local retVal0 = localByName(b,"r3");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod12(SootClass c) {  
    SootMethod m = new SootMethod("getUserPassKey",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r3", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));    
    locals.add(Jimple.v().newLocal("$r4", RefType.v("java.util.Map")));    
    locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r6", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));    
    locals.add(Jimple.v().newLocal("$r7", RefType.v("java.util.Map")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"r2");    
    RefType paramType1 = RefType.v("java.lang.String");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"$r4");    
    {    
      RefType type = RefType.v("java.util.Map");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"userKeys",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs0));    
    Local lhs4 = localByName(b,"$r5");    
    {    
      Local base = localByName(b,"$r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"get",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs1));    
    Local lhs5 = localByName(b,"r3");    
    RefType type1 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");    
    Local op0 = localByName(b,"$r5");    
    Value rhs2 = Jimple.v().newCastExpr(type1,op0);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs2));    
    Local left0 = localByName(b,"r3");    
    Value right0 = NullConstant.v();    
    Value condition0 = Jimple.v().newNeExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Local lhs6 = localByName(b,"$r6");    
    RefType type2 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");    
    Value rhs3 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs3));    
    {    
      Local base = localByName(b,"$r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs7 = localByName(b,"r3");    
    Local rhs4 = localByName(b,"$r6");    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs4));    
    Local lhs8 = localByName(b,"$r7");    
    {    
      RefType type = RefType.v("java.util.Map");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"userKeys",type,false);      Value rhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs5));    
    {    
      Local base = localByName(b,"$r7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.Object");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"put",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local retVal0 = localByName(b,"r3");    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod13(SootClass c) {  
    SootMethod m = new SootMethod("registerPool",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r3", RefType.v("javax.sql.ConnectionPoolDataSource")));    
    locals.add(Jimple.v().newLocal("r4", RefType.v("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$r5", RefType.v("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$i1", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$i2", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$l3", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("$i4", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$i5", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$b6", RefType.v("byte")));    
    locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$z1", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$i7", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$l8", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("$i9", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$i10", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$l11", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("$z2", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$r6", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.KeyedCPDSConnectionFactory")));    
    locals.add(Jimple.v().newLocal("$r7", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$r8", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$z3", RefType.v("boolean")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"r2");    
    RefType paramType1 = RefType.v("java.lang.String");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"r3");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("javax.sql.ConnectionPoolDataSource");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"testCPDS",parameterTypes,returnType,false);      
      Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs0));    
    Local lhs4 = localByName(b,"$r5");    
    RefType type1 = RefType.v("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool");    
    Value rhs1 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs1));    
    {    
      Local base = localByName(b,"$r5");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("org.apache.tomcat.dbcp.pool.KeyedPoolableObjectFactory");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs5 = localByName(b,"r4");    
    Local rhs2 = localByName(b,"$r5");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs2));    
    Local lhs6 = localByName(b,"$i0");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"getMaxActive",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs3));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setMaxActive",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs7 = localByName(b,"$i1");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"getMaxIdle",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs4));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setMaxIdle",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs8 = localByName(b,"$i2");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"getMaxWait",parameterTypes,returnType,false);      
      Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs5));    
    Local lhs9 = localByName(b,"$l3");    
    Type type2 = LongType.v();    
    Local op0 = localByName(b,"$i2");    
    Value rhs6 = Jimple.v().newCastExpr(type2,op0);    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs6));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = LongType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setMaxWait",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    Local lhs10 = localByName(b,"$i4");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxActive",type,false);      Value rhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs7));    
    Local lhs11 = localByName(b,"$i5");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"maxWait",type,false);      Value rhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs8));    
    Local lhs12 = localByName(b,"$b6");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      Type returnType = ByteType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"whenExhaustedAction",parameterTypes,returnType,false);      
      Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs9));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = ByteType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setWhenExhaustedAction",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs13 = localByName(b,"$z0");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getTestOnBorrow",parameterTypes,returnType,false);      
      Value rhs10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs10));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = BooleanType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setTestOnBorrow",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    Local lhs14 = localByName(b,"$z1");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getTestOnReturn",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs11));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = BooleanType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setTestOnReturn",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    Local lhs15 = localByName(b,"$i7");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getTimeBetweenEvictionRunsMillis",parameterTypes,returnType,false);      
      Value rhs12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs12));    
    Local lhs16 = localByName(b,"$l8");    
    Type type3 = LongType.v();    
    Local op1 = localByName(b,"$i7");    
    Value rhs13 = Jimple.v().newCastExpr(type3,op1);    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs13));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = LongType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setTimeBetweenEvictionRunsMillis",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    Local lhs17 = localByName(b,"$i9");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getNumTestsPerEvictionRun",parameterTypes,returnType,false);      
      Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs14));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setNumTestsPerEvictionRun",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs18 = localByName(b,"$i10");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getMinEvictableIdleTimeMillis",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs15));    
    Local lhs19 = localByName(b,"$l11");    
    Type type4 = LongType.v();    
    Local op2 = localByName(b,"$i10");    
    Value rhs16 = Jimple.v().newCastExpr(type4,op2);    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs16));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = LongType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setMinEvictableIdleTimeMillis",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    Local lhs20 = localByName(b,"$z2");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getTestWhileIdle",parameterTypes,returnType,false);      
      Value rhs17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs17));    
    {    
      Local base = localByName(b,"r4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = BooleanType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"setTestWhileIdle",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value lhs21 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs18 = localByName(b,"r4");    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs18));    
    Local lhs22 = localByName(b,"$r6");    
    RefType type5 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.KeyedCPDSConnectionFactory");    
    Value rhs19 = Jimple.v().newNewExpr(type5);    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs19));    
    Local lhs23 = localByName(b,"$r7");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs20 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs20));    
    Local lhs24 = localByName(b,"$r8");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getValidationQuery",parameterTypes,returnType,false);      
      Value rhs21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs24,rhs21));    
    Local lhs25 = localByName(b,"$z3");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"isRollbackAfterValidation",parameterTypes,returnType,false);      
      Value rhs22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs22));    
    {    
      Local base = localByName(b,"$r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.sql.ConnectionPoolDataSource");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("java.lang.String");      
      parameterTypes.add(type2);      
      Type type3 = BooleanType.v();      
      parameterTypes.add(type3);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.KeyedCPDSConnectionFactory"),"<init>",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod14(SootClass c) {  
    SootMethod m = new SootMethod("setupDefaults",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.sql.Connection")));    
    locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$z1", RefType.v("boolean")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.sql.Connection");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"r2");    
    RefType paramType1 = RefType.v("java.lang.String");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"$z0");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"isDefaultAutoCommit",parameterTypes,returnType,false);      
      Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs0));    
    {    
      Local base = localByName(b,"r1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = BooleanType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"setAutoCommit",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs4 = localByName(b,"i0");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getDefaultTransactionIsolation",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs1));    
    Local left0 = localByName(b,"i0");    
    Value right0 = IntConstant.v(-1);    
    Value condition0 = Jimple.v().newEqExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    {    
      Local base = localByName(b,"r1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"setTransactionIsolation",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs5 = localByName(b,"$z1");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"isDefaultReadOnly",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs2));    
    {    
      Local base = localByName(b,"r1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = BooleanType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"setReadOnly",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod15(SootClass c) {  
    SootMethod m = new SootMethod("readObject",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.io.ObjectInputStream")));    
    locals.add(Jimple.v().newLocal("r2", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("$r3", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory")));    
    locals.add(Jimple.v().newLocal("$r4", RefType.v("javax.naming.Reference")));    
    locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r6", RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$r7", RefType.v("javax.naming.NamingException")));    
    locals.add(Jimple.v().newLocal("r8", RefType.v("javax.naming.NamingException")));    
    locals.add(Jimple.v().newLocal("$r9", RefType.v("java.io.IOException")));    
    locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.StringBuilder")));    
    locals.add(Jimple.v().newLocal("$r11", RefType.v("java.lang.StringBuilder")));    
    locals.add(Jimple.v().newLocal("$r12", RefType.v("java.lang.StringBuilder")));    
    locals.add(Jimple.v().newLocal("$r13", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.io.ObjectInputStream");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"r1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.ObjectInputStream"),"defaultReadObject",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs2 = localByName(b,"$r3");    
    RefType type1 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory");    
    Value rhs0 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    {    
      Local base = localByName(b,"$r3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs3 = localByName(b,"$r4");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("javax.naming.Reference");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"getReference",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs1));    
    Local lhs4 = localByName(b,"$r5");    
    {    
      Local base = localByName(b,"$r3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("javax.naming.Name");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("javax.naming.Context");      
      parameterTypes.add(type2);      
      RefType type3 = RefType.v("java.util.Hashtable");      
      parameterTypes.add(type3);      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"getObjectInstance",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs2));    
    Local lhs5 = localByName(b,"r2");    
    RefType type2 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Local op0 = localByName(b,"$r5");    
    Value rhs3 = Jimple.v().newCastExpr(type2,op0);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs3));    
    Local lhs6 = localByName(b,"$r6");    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value rhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs4));    
    {    
      RefType type = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"pool",type,false);      Value lhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs5 = localByName(b,"$r6");    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs5));    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target0));    
    Local lhs8 = localByName(b,"$r7");    
    Value idRef2 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs8,idRef2));    
    Local lhs9 = localByName(b,"r8");    
    Local rhs6 = localByName(b,"$r7");    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs6));    
    Local lhs10 = localByName(b,"$r9");    
    RefType type3 = RefType.v("java.io.IOException");    
    Value rhs7 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs7));    
    Local lhs11 = localByName(b,"$r10");    
    RefType type4 = RefType.v("java.lang.StringBuilder");    
    Value rhs8 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs8));    
    {    
      Local base = localByName(b,"$r10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"<init>",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs12 = localByName(b,"$r11");    
    {    
      Local base = localByName(b,"$r10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuilder");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);      
      Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs9));    
    Local lhs13 = localByName(b,"$r12");    
    {    
      Local base = localByName(b,"$r11");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuilder");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);      
      Value rhs10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs10));    
    Local lhs14 = localByName(b,"$r13");    
    {    
      Local base = localByName(b,"$r12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"toString",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs11));    
    {    
      Local base = localByName(b,"$r9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.IOException"),"<init>",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    Local op1 = localByName(b,"$r9");    
    units.add(Jimple.v().newThrowStmt(op1));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

}
