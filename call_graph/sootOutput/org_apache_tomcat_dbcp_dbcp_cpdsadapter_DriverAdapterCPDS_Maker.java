import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class org_apache_tomcat_dbcp_dbcp_cpdsadapter_DriverAdapterCPDS_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
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
    createMethod16(c);    
    createMethod17(c);    
    createMethod18(c);    
    createMethod19(c);    
    createMethod20(c);    
    createMethod21(c);    
    createMethod22(c);    
    createMethod23(c);    
    createMethod24(c);    
    createMethod25(c);    
    createMethod26(c);    
    createMethod27(c);    
    createMethod28(c);    
    createMethod29(c);    
    createMethod30(c);    
    createMethod31(c);    
    createMethod32(c);    
    createMethod33(c);    
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"logWriter",type,false);      Value lhs1 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs0 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"maxActive",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs1 = IntConstant.v(10);    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"maxIdle",type,false);      Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs2 = IntConstant.v(10);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_timeBetweenEvictionRunsMillis",type,false);      Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs3 = IntConstant.v(-1);    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_numTestsPerEvictionRun",type,false);      Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs4 = IntConstant.v(-1);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_minEvictableIdleTimeMillis",type,false);      Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs5 = IntConstant.v(-1);    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_maxPreparedStatements",type,false);      Value lhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs6 = IntConstant.v(-1);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getConnectionCalled",type,false);      Value lhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs7 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("getPooledConnection",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r3", RefType.v("javax.sql.PooledConnection")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getUser",parameterTypes,returnType,false);      
      Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"$r2");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getPassword",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"$r3");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("javax.sql.PooledConnection");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getPooledConnection",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local retVal0 = localByName(b,"$r3");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("getPooledConnection",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r3", RefType.v("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("r4", RefType.v("java.lang.ClassCircularityError")));    
    locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r5", RefType.v("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$i1", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$i2", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$i3", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$l4", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("$i5", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$i6", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$l7", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("$r6", RefType.v("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool")));    
    locals.add(Jimple.v().newLocal("$i8", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$i9", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$i10", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r7", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PooledConnectionImpl")));    
    locals.add(Jimple.v().newLocal("$r8", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r9", RefType.v("java.sql.Connection")));    
    locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.ClassCircularityError")));    
    locals.add(Jimple.v().newLocal("$r11", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PooledConnectionImpl")));    
    locals.add(Jimple.v().newLocal("$r12", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r13", RefType.v("java.sql.Connection")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    NopStmt jumpTarget2= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
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
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getConnectionCalled",type,false);      Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs0 = IntConstant.v(1);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs0));    
    Local lhs4 = localByName(b,"r3");    
    Value rhs1 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs1));    
    Local lhs5 = localByName(b,"$z0");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"isPoolPreparedStatements",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs2));    
    Local left0 = localByName(b,"$z0");    
    Value right0 = IntConstant.v(0);    
    Value condition0 = Jimple.v().newEqExpr(left0,right0);    
    Unit target0=jumpTarget1;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Local lhs6 = localByName(b,"$i0");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMaxPreparedStatements",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs3));    
    Local left1 = localByName(b,"$i0");    
    Value right1 = IntConstant.v(0);    
    Value condition1 = Jimple.v().newGtExpr(left1,right1);    
    Unit target1=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition1,target1));    
    Local lhs7 = localByName(b,"$r5");    
    RefType type1 = RefType.v("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool");    
    Value rhs4 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs4));    
    Local lhs8 = localByName(b,"$i1");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMaxActive",parameterTypes,returnType,false);      
      Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs5));    
    Local lhs9 = localByName(b,"$i2");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMaxIdle",parameterTypes,returnType,false);      
      Value rhs6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs6));    
    Local lhs10 = localByName(b,"$i3");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getTimeBetweenEvictionRunsMillis",parameterTypes,returnType,false);      
      Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs7));    
    Local lhs11 = localByName(b,"$l4");    
    Type type2 = LongType.v();    
    Local op0 = localByName(b,"$i3");    
    Value rhs8 = Jimple.v().newCastExpr(type2,op0);    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs8));    
    Local lhs12 = localByName(b,"$i5");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getNumTestsPerEvictionRun",parameterTypes,returnType,false);      
      Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs9));    
    Local lhs13 = localByName(b,"$i6");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMinEvictableIdleTimeMillis",parameterTypes,returnType,false);      
      Value rhs10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs10));    
    Local lhs14 = localByName(b,"$l7");    
    Type type3 = LongType.v();    
    Local op1 = localByName(b,"$i6");    
    Value rhs11 = Jimple.v().newCastExpr(type3,op1);    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs11));    
    {    
      Local base = localByName(b,"$r5");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("org.apache.tomcat.dbcp.pool.KeyedPoolableObjectFactory");      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      Type type2 = ByteType.v();      
      parameterTypes.add(type2);      
      Type type3 = LongType.v();      
      parameterTypes.add(type3);      
      Type type4 = IntType.v();      
      parameterTypes.add(type4);      
      Type type5 = BooleanType.v();      
      parameterTypes.add(type5);      
      Type type6 = BooleanType.v();      
      parameterTypes.add(type6);      
      Type type7 = LongType.v();      
      parameterTypes.add(type7);      
      Type type8 = IntType.v();      
      parameterTypes.add(type8);      
      Type type9 = LongType.v();      
      parameterTypes.add(type9);      
      Type type10 = BooleanType.v();      
      parameterTypes.add(type10);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs15 = localByName(b,"r3");    
    Local rhs12 = localByName(b,"$r5");    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs12));    
    Unit target2=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target2));    
    Local lhs16 = localByName(b,"$r6");    
    RefType type4 = RefType.v("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool");    
    Value rhs13 = Jimple.v().newNewExpr(type4);    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs13));    
    Local lhs17 = localByName(b,"$i8");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMaxActive",parameterTypes,returnType,false);      
      Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs14));    
    Local lhs18 = localByName(b,"$i9");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMaxIdle",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs15));    
    Local lhs19 = localByName(b,"$i10");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMaxPreparedStatements",parameterTypes,returnType,false);      
      Value rhs16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs16));    
    {    
      Local base = localByName(b,"$r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("org.apache.tomcat.dbcp.pool.KeyedPoolableObjectFactory");      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      Type type2 = ByteType.v();      
      parameterTypes.add(type2);      
      Type type3 = LongType.v();      
      parameterTypes.add(type3);      
      Type type4 = IntType.v();      
      parameterTypes.add(type4);      
      Type type5 = IntType.v();      
      parameterTypes.add(type5);      
      Type type6 = BooleanType.v();      
      parameterTypes.add(type6);      
      Type type7 = BooleanType.v();      
      parameterTypes.add(type7);      
      Type type8 = LongType.v();      
      parameterTypes.add(type8);      
      Type type9 = IntType.v();      
      parameterTypes.add(type9);      
      Type type10 = LongType.v();      
      parameterTypes.add(type10);      
      Type type11 = BooleanType.v();      
      parameterTypes.add(type11);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.pool.impl.GenericKeyedObjectPool"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs20 = localByName(b,"r3");    
    Local rhs17 = localByName(b,"$r6");    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs17));    
    Local lhs21 = localByName(b,"$r7");    
    RefType type5 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PooledConnectionImpl");    
    Value rhs18 = Jimple.v().newNewExpr(type5);    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs18));    
    Local lhs22 = localByName(b,"$r8");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getUrl",parameterTypes,returnType,false);      
      Value rhs19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs19));    
    Local lhs23 = localByName(b,"$r9");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("java.lang.String");      
      parameterTypes.add(type2);      
      RefType returnType = RefType.v("java.sql.Connection");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.DriverManager"),"getConnection",parameterTypes,returnType,true);      
      Value rhs20 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs20));    
    {    
      Local base = localByName(b,"$r7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.sql.Connection");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PooledConnectionImpl"),"<init>",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local retVal0 = localByName(b,"$r7");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
    Local lhs24 = localByName(b,"$r10");    
    Value idRef3 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs24,idRef3));    
    Local lhs25 = localByName(b,"r4");    
    Local rhs21 = localByName(b,"$r10");    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs21));    
    Local lhs26 = localByName(b,"$r11");    
    RefType type6 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PooledConnectionImpl");    
    Value rhs22 = Jimple.v().newNewExpr(type6);    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs22));    
    Local lhs27 = localByName(b,"$r12");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getUrl",parameterTypes,returnType,false);      
      Value rhs23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs23));    
    Local lhs28 = localByName(b,"$r13");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("java.lang.String");      
      parameterTypes.add(type2);      
      RefType returnType = RefType.v("java.sql.Connection");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.DriverManager"),"getConnection",parameterTypes,returnType,true);      
      Value rhs24 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs28,rhs24));    
    {    
      Local base = localByName(b,"$r11");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.sql.Connection");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("org.apache.tomcat.dbcp.pool.KeyedObjectPool");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.PooledConnectionImpl"),"<init>",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    Local retVal1 = localByName(b,"$r11");    
    units.add(Jimple.v().newReturnStmt(retVal1));    
  }  

  public void createMethod3(SootClass c) {  
    SootMethod m = new SootMethod("getReference",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r2", RefType.v("javax.naming.Reference")));    
    locals.add(Jimple.v().newLocal("$r3", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("$r4", RefType.v("javax.naming.Reference")));    
    locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r7", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$r8", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r9", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r11", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r12", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r13", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$r14", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r15", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$r16", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r17", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$r18", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r19", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$r20", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r21", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$i1", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r22", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r23", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$i2", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r24", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r25", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$i3", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r26", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r27", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$i4", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r28", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r29", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$i5", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r30", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r31", RefType.v("javax.naming.StringRefAddr")));    
    locals.add(Jimple.v().newLocal("$i6", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$r32", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r3");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"getClass",parameterTypes,returnType,false);      
      Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"r1");    
    {    
      Local base = localByName(b,"$r3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"$r4");    
    RefType type1 = RefType.v("javax.naming.Reference");    
    Value rhs2 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"$r5");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"getClass",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local lhs5 = localByName(b,"$r6");    
    {    
      Local base = localByName(b,"$r5");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    {    
      Local base = localByName(b,"$r4");      
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
    Local lhs6 = localByName(b,"r2");    
    Local rhs5 = localByName(b,"$r4");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    Local lhs7 = localByName(b,"$r7");    
    RefType type2 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs6 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    Local lhs8 = localByName(b,"$r8");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getDescription",parameterTypes,returnType,false);      
      Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
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
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs9 = localByName(b,"$r9");    
    RefType type3 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs8 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs8));    
    Local lhs10 = localByName(b,"$r10");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getDriver",parameterTypes,returnType,false);      
      Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs9));    
    {    
      Local base = localByName(b,"$r9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs11 = localByName(b,"$r11");    
    RefType type4 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs10 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs10));    
    Local lhs12 = localByName(b,"$i0");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getLoginTimeout",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs11));    
    Local lhs13 = localByName(b,"$r12");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"valueOf",parameterTypes,returnType,true);      
      Value rhs12 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs12));    
    {    
      Local base = localByName(b,"$r11");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    Local lhs14 = localByName(b,"$r13");    
    RefType type5 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs13 = Jimple.v().newNewExpr(type5);    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs13));    
    Local lhs15 = localByName(b,"$r14");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getPassword",parameterTypes,returnType,false);      
      Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs14));    
    {    
      Local base = localByName(b,"$r13");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs16 = localByName(b,"$r15");    
    RefType type6 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs15 = Jimple.v().newNewExpr(type6);    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs15));    
    Local lhs17 = localByName(b,"$r16");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getUser",parameterTypes,returnType,false);      
      Value rhs16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs16));    
    {    
      Local base = localByName(b,"$r15");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    Local lhs18 = localByName(b,"$r17");    
    RefType type7 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs17 = Jimple.v().newNewExpr(type7);    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs17));    
    Local lhs19 = localByName(b,"$r18");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getUrl",parameterTypes,returnType,false);      
      Value rhs18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs18));    
    {    
      Local base = localByName(b,"$r17");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    Local lhs20 = localByName(b,"$r19");    
    RefType type8 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs19 = Jimple.v().newNewExpr(type8);    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs19));    
    Local lhs21 = localByName(b,"$z0");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"isPoolPreparedStatements",parameterTypes,returnType,false);      
      Value rhs20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs20));    
    Local lhs22 = localByName(b,"$r20");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = BooleanType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"valueOf",parameterTypes,returnType,true);      
      Value rhs21 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs21));    
    {    
      Local base = localByName(b,"$r19");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie13 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie13));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie14));    
    Local lhs23 = localByName(b,"$r21");    
    RefType type9 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs22 = Jimple.v().newNewExpr(type9);    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs22));    
    Local lhs24 = localByName(b,"$i1");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMaxActive",parameterTypes,returnType,false);      
      Value rhs23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs24,rhs23));    
    Local lhs25 = localByName(b,"$r22");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"valueOf",parameterTypes,returnType,true);      
      Value rhs24 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs24));    
    {    
      Local base = localByName(b,"$r21");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie15 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie15));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie16));    
    Local lhs26 = localByName(b,"$r23");    
    RefType type10 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs25 = Jimple.v().newNewExpr(type10);    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs25));    
    Local lhs27 = localByName(b,"$i2");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMaxIdle",parameterTypes,returnType,false);      
      Value rhs26 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs26));    
    Local lhs28 = localByName(b,"$r24");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"valueOf",parameterTypes,returnType,true);      
      Value rhs27 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs28,rhs27));    
    {    
      Local base = localByName(b,"$r23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie17 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie17));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie18));    
    Local lhs29 = localByName(b,"$r25");    
    RefType type11 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs28 = Jimple.v().newNewExpr(type11);    
    units.add(Jimple.v().newAssignStmt(lhs29,rhs28));    
    Local lhs30 = localByName(b,"$i3");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getTimeBetweenEvictionRunsMillis",parameterTypes,returnType,false);      
      Value rhs29 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs30,rhs29));    
    Local lhs31 = localByName(b,"$r26");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"valueOf",parameterTypes,returnType,true);      
      Value rhs30 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs31,rhs30));    
    {    
      Local base = localByName(b,"$r25");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie19 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie19));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie20));    
    Local lhs32 = localByName(b,"$r27");    
    RefType type12 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs31 = Jimple.v().newNewExpr(type12);    
    units.add(Jimple.v().newAssignStmt(lhs32,rhs31));    
    Local lhs33 = localByName(b,"$i4");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getNumTestsPerEvictionRun",parameterTypes,returnType,false);      
      Value rhs32 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs33,rhs32));    
    Local lhs34 = localByName(b,"$r28");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"valueOf",parameterTypes,returnType,true);      
      Value rhs33 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs34,rhs33));    
    {    
      Local base = localByName(b,"$r27");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie21 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie21));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie22));    
    Local lhs35 = localByName(b,"$r29");    
    RefType type13 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs34 = Jimple.v().newNewExpr(type13);    
    units.add(Jimple.v().newAssignStmt(lhs35,rhs34));    
    Local lhs36 = localByName(b,"$i5");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMinEvictableIdleTimeMillis",parameterTypes,returnType,false);      
      Value rhs35 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs36,rhs35));    
    Local lhs37 = localByName(b,"$r30");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"valueOf",parameterTypes,returnType,true);      
      Value rhs36 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs37,rhs36));    
    {    
      Local base = localByName(b,"$r29");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie23 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie23));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie24 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie24));    
    Local lhs38 = localByName(b,"$r31");    
    RefType type14 = RefType.v("javax.naming.StringRefAddr");    
    Value rhs37 = Jimple.v().newNewExpr(type14);    
    units.add(Jimple.v().newAssignStmt(lhs38,rhs37));    
    Local lhs39 = localByName(b,"$i6");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getMaxPreparedStatements",parameterTypes,returnType,false);      
      Value rhs38 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs39,rhs38));    
    Local lhs40 = localByName(b,"$r32");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"valueOf",parameterTypes,returnType,true);      
      Value rhs39 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs40,rhs39));    
    {    
      Local base = localByName(b,"$r31");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.StringRefAddr"),"<init>",parameterTypes,returnType,false);      
      Value ie25 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie25));    
    {    
      Local base = localByName(b,"r2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.naming.RefAddr");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);      
      Value ie26 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie26));    
    Local retVal0 = localByName(b,"r2");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod4(SootClass c) {  
    SootMethod m = new SootMethod("getObjectInstance",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("r2", RefType.v("javax.naming.Name")));    
    locals.add(Jimple.v().newLocal("r3", RefType.v("javax.naming.Context")));    
    locals.add(Jimple.v().newLocal("r4", RefType.v("java.util.Hashtable")));    
    locals.add(Jimple.v().newLocal("r5", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r6", RefType.v("javax.naming.Reference")));    
    locals.add(Jimple.v().newLocal("r7", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$r8", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$r9", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$z1", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$r11", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r12", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r13", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r14", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r15", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r16", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r17", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r18", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r19", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r20", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r21", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r22", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r23", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r24", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r25", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r26", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r27", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r28", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r29", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("r30", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r31", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r32", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r33", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$z2", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("r34", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r35", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r36", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r37", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("r38", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r39", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r40", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r41", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$i1", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("r42", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r43", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r44", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r45", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$i2", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("r46", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r47", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r48", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r49", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$i3", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("r50", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r51", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r52", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r53", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$i4", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("r54", RefType.v("javax.naming.RefAddr")));    
    locals.add(Jimple.v().newLocal("$r55", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r56", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("$r57", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("$i5", RefType.v("int")));    
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
    NopStmt jumpTarget9= Jimple.v().newNopStmt();    
    NopStmt jumpTarget10= Jimple.v().newNopStmt();    
    NopStmt jumpTarget11= Jimple.v().newNopStmt();    
    NopStmt jumpTarget12= Jimple.v().newNopStmt();    
    NopStmt jumpTarget13= Jimple.v().newNopStmt();    
    NopStmt jumpTarget14= Jimple.v().newNopStmt();    
    NopStmt jumpTarget15= Jimple.v().newNopStmt();    
    NopStmt jumpTarget16= Jimple.v().newNopStmt();    
    NopStmt jumpTarget17= Jimple.v().newNopStmt();    
    NopStmt jumpTarget18= Jimple.v().newNopStmt();    
    NopStmt jumpTarget19= Jimple.v().newNopStmt();    
    NopStmt jumpTarget20= Jimple.v().newNopStmt();    
    NopStmt jumpTarget21= Jimple.v().newNopStmt();    
    NopStmt jumpTarget22= Jimple.v().newNopStmt();    
    NopStmt jumpTarget23= Jimple.v().newNopStmt();    
    NopStmt jumpTarget24= Jimple.v().newNopStmt();    
    NopStmt jumpTarget25= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.lang.Object");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"r2");    
    RefType paramType1 = RefType.v("javax.naming.Name");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"r3");    
    RefType paramType2 = RefType.v("javax.naming.Context");    
    int number2=2;    
    Value idRef3 = Jimple.v().newParameterRef(paramType2, number2);    
    units.add(Jimple.v().newIdentityStmt(lhs3,idRef3));    
    Local lhs4 = localByName(b,"r4");    
    RefType paramType3 = RefType.v("java.util.Hashtable");    
    int number3=3;    
    Value idRef4 = Jimple.v().newParameterRef(paramType3, number3);    
    units.add(Jimple.v().newIdentityStmt(lhs4,idRef4));    
    Local lhs5 = localByName(b,"r5");    
    Value rhs0 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs0));    
    Local lhs6 = localByName(b,"$z0");    
    Type type1 = BooleanType.v();    
    Local op0 = localByName(b,"r1");    
    Value rhs1 = Jimple.v().newInstanceOfExpr(type1,op0);    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs1));    
    Local left0 = localByName(b,"$z0");    
    Value right0 = IntConstant.v(0);    
    Value condition0 = Jimple.v().newEqExpr(left0,right0);    
    Unit target0=jumpTarget24;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Local lhs7 = localByName(b,"r6");    
    RefType type2 = RefType.v("javax.naming.Reference");    
    Local op1 = localByName(b,"r1");    
    Value rhs2 = Jimple.v().newCastExpr(type2,op1);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs2));    
    Local lhs8 = localByName(b,"$r8");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"getClassName",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs3));    
    Local lhs9 = localByName(b,"$r9");    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"getClass",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs4));    
    Local lhs10 = localByName(b,"$r10");    
    {    
      Local base = localByName(b,"$r9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);      
      Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs5));    
    Local lhs11 = localByName(b,"$z1");    
    {    
      Local base = localByName(b,"$r8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"equals",parameterTypes,returnType,false);      
      Value rhs6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs6));    
    Local left1 = localByName(b,"$z1");    
    Value right1 = IntConstant.v(0);    
    Value condition1 = Jimple.v().newEqExpr(left1,right1);    
    Unit target1=jumpTarget24;    
    units.add(Jimple.v().newIfStmt(condition1,target1));    
    Local lhs12 = localByName(b,"r7");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs7));    
    Local left2 = localByName(b,"r7");    
    Value right2 = NullConstant.v();    
    Value condition2 = Jimple.v().newEqExpr(left2,right2);    
    Unit target2=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition2,target2));    
    Local lhs13 = localByName(b,"$r11");    
    {    
      Local base = localByName(b,"r7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs8));    
    Local left3 = localByName(b,"$r11");    
    Value right3 = NullConstant.v();    
    Value condition3 = Jimple.v().newEqExpr(left3,right3);    
    Unit target3=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition3,target3));    
    Local lhs14 = localByName(b,"$r12");    
    {    
      Local base = localByName(b,"r7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs9));    
    Local lhs15 = localByName(b,"$r13");    
    {    
      Local base = localByName(b,"$r12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs10));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setDescription",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs16 = localByName(b,"r14");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs11));    
    Local left4 = localByName(b,"r14");    
    Value right4 = NullConstant.v();    
    Value condition4 = Jimple.v().newEqExpr(left4,right4);    
    Unit target4=jumpTarget2;    
    units.add(Jimple.v().newIfStmt(condition4,target4));    
    Local lhs17 = localByName(b,"$r15");    
    {    
      Local base = localByName(b,"r14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs12));    
    Local left5 = localByName(b,"$r15");    
    Value right5 = NullConstant.v();    
    Value condition5 = Jimple.v().newEqExpr(left5,right5);    
    Unit target5=jumpTarget2;    
    units.add(Jimple.v().newIfStmt(condition5,target5));    
    Local lhs18 = localByName(b,"$r16");    
    {    
      Local base = localByName(b,"r14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs13));    
    Local lhs19 = localByName(b,"$r17");    
    {    
      Local base = localByName(b,"$r16");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs14));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setDriver",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs20 = localByName(b,"r18");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget2);    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs15));    
    Local left6 = localByName(b,"r18");    
    Value right6 = NullConstant.v();    
    Value condition6 = Jimple.v().newEqExpr(left6,right6);    
    Unit target6=jumpTarget4;    
    units.add(Jimple.v().newIfStmt(condition6,target6));    
    Local lhs21 = localByName(b,"$r19");    
    {    
      Local base = localByName(b,"r18");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs16));    
    Local left7 = localByName(b,"$r19");    
    Value right7 = NullConstant.v();    
    Value condition7 = Jimple.v().newEqExpr(left7,right7);    
    Unit target7=jumpTarget4;    
    units.add(Jimple.v().newIfStmt(condition7,target7));    
    Local lhs22 = localByName(b,"$r20");    
    {    
      Local base = localByName(b,"r18");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs17));    
    Local lhs23 = localByName(b,"$r21");    
    {    
      Local base = localByName(b,"$r20");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs18));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setUrl",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs24 = localByName(b,"r22");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget4);    
    units.add(Jimple.v().newAssignStmt(lhs24,rhs19));    
    Local left8 = localByName(b,"r22");    
    Value right8 = NullConstant.v();    
    Value condition8 = Jimple.v().newEqExpr(left8,right8);    
    Unit target8=jumpTarget6;    
    units.add(Jimple.v().newIfStmt(condition8,target8));    
    Local lhs25 = localByName(b,"$r23");    
    {    
      Local base = localByName(b,"r22");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs20));    
    Local left9 = localByName(b,"$r23");    
    Value right9 = NullConstant.v();    
    Value condition9 = Jimple.v().newEqExpr(left9,right9);    
    Unit target9=jumpTarget6;    
    units.add(Jimple.v().newIfStmt(condition9,target9));    
    Local lhs26 = localByName(b,"$r24");    
    {    
      Local base = localByName(b,"r22");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs21));    
    Local lhs27 = localByName(b,"$r25");    
    {    
      Local base = localByName(b,"$r24");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs22));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setUser",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    Local lhs28 = localByName(b,"r26");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget6);    
    units.add(Jimple.v().newAssignStmt(lhs28,rhs23));    
    Local left10 = localByName(b,"r26");    
    Value right10 = NullConstant.v();    
    Value condition10 = Jimple.v().newEqExpr(left10,right10);    
    Unit target10=jumpTarget8;    
    units.add(Jimple.v().newIfStmt(condition10,target10));    
    Local lhs29 = localByName(b,"$r27");    
    {    
      Local base = localByName(b,"r26");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs24 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs29,rhs24));    
    Local left11 = localByName(b,"$r27");    
    Value right11 = NullConstant.v();    
    Value condition11 = Jimple.v().newEqExpr(left11,right11);    
    Unit target11=jumpTarget8;    
    units.add(Jimple.v().newIfStmt(condition11,target11));    
    Local lhs30 = localByName(b,"$r28");    
    {    
      Local base = localByName(b,"r26");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs25 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs30,rhs25));    
    Local lhs31 = localByName(b,"$r29");    
    {    
      Local base = localByName(b,"$r28");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs26 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs31,rhs26));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setPassword",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs32 = localByName(b,"r30");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs27 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget8);    
    units.add(Jimple.v().newAssignStmt(lhs32,rhs27));    
    Local left12 = localByName(b,"r30");    
    Value right12 = NullConstant.v();    
    Value condition12 = Jimple.v().newEqExpr(left12,right12);    
    Unit target12=jumpTarget10;    
    units.add(Jimple.v().newIfStmt(condition12,target12));    
    Local lhs33 = localByName(b,"$r31");    
    {    
      Local base = localByName(b,"r30");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs28 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs33,rhs28));    
    Local left13 = localByName(b,"$r31");    
    Value right13 = NullConstant.v();    
    Value condition13 = Jimple.v().newEqExpr(left13,right13);    
    Unit target13=jumpTarget10;    
    units.add(Jimple.v().newIfStmt(condition13,target13));    
    Local lhs34 = localByName(b,"$r32");    
    {    
      Local base = localByName(b,"r30");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs29 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs34,rhs29));    
    Local lhs35 = localByName(b,"$r33");    
    {    
      Local base = localByName(b,"$r32");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs30 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs35,rhs30));    
    Local lhs36 = localByName(b,"$z2");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"getBoolean",parameterTypes,returnType,true);      
      Value rhs31 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs36,rhs31));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = BooleanType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setPoolPreparedStatements",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    Local lhs37 = localByName(b,"r34");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs32 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget10);    
    units.add(Jimple.v().newAssignStmt(lhs37,rhs32));    
    Local left14 = localByName(b,"r34");    
    Value right14 = NullConstant.v();    
    Value condition14 = Jimple.v().newEqExpr(left14,right14);    
    Unit target14=jumpTarget12;    
    units.add(Jimple.v().newIfStmt(condition14,target14));    
    Local lhs38 = localByName(b,"$r35");    
    {    
      Local base = localByName(b,"r34");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs33 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs38,rhs33));    
    Local left15 = localByName(b,"$r35");    
    Value right15 = NullConstant.v();    
    Value condition15 = Jimple.v().newEqExpr(left15,right15);    
    Unit target15=jumpTarget12;    
    units.add(Jimple.v().newIfStmt(condition15,target15));    
    Local lhs39 = localByName(b,"$r36");    
    {    
      Local base = localByName(b,"r34");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs34 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs39,rhs34));    
    Local lhs40 = localByName(b,"$r37");    
    {    
      Local base = localByName(b,"$r36");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs35 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs40,rhs35));    
    Local lhs41 = localByName(b,"$i0");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);      
      Value rhs36 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs41,rhs36));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setMaxActive",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    Local lhs42 = localByName(b,"r38");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs37 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget12);    
    units.add(Jimple.v().newAssignStmt(lhs42,rhs37));    
    Local left16 = localByName(b,"r38");    
    Value right16 = NullConstant.v();    
    Value condition16 = Jimple.v().newEqExpr(left16,right16);    
    Unit target16=jumpTarget14;    
    units.add(Jimple.v().newIfStmt(condition16,target16));    
    Local lhs43 = localByName(b,"$r39");    
    {    
      Local base = localByName(b,"r38");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs38 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs43,rhs38));    
    Local left17 = localByName(b,"$r39");    
    Value right17 = NullConstant.v();    
    Value condition17 = Jimple.v().newEqExpr(left17,right17);    
    Unit target17=jumpTarget14;    
    units.add(Jimple.v().newIfStmt(condition17,target17));    
    Local lhs44 = localByName(b,"$r40");    
    {    
      Local base = localByName(b,"r38");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs39 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs44,rhs39));    
    Local lhs45 = localByName(b,"$r41");    
    {    
      Local base = localByName(b,"$r40");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs40 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs45,rhs40));    
    Local lhs46 = localByName(b,"$i1");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);      
      Value rhs41 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs46,rhs41));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setMaxIdle",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    Local lhs47 = localByName(b,"r42");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs42 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget14);    
    units.add(Jimple.v().newAssignStmt(lhs47,rhs42));    
    Local left18 = localByName(b,"r42");    
    Value right18 = NullConstant.v();    
    Value condition18 = Jimple.v().newEqExpr(left18,right18);    
    Unit target18=jumpTarget16;    
    units.add(Jimple.v().newIfStmt(condition18,target18));    
    Local lhs48 = localByName(b,"$r43");    
    {    
      Local base = localByName(b,"r42");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs43 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs48,rhs43));    
    Local left19 = localByName(b,"$r43");    
    Value right19 = NullConstant.v();    
    Value condition19 = Jimple.v().newEqExpr(left19,right19);    
    Unit target19=jumpTarget16;    
    units.add(Jimple.v().newIfStmt(condition19,target19));    
    Local lhs49 = localByName(b,"$r44");    
    {    
      Local base = localByName(b,"r42");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs44 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs49,rhs44));    
    Local lhs50 = localByName(b,"$r45");    
    {    
      Local base = localByName(b,"$r44");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs45 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs50,rhs45));    
    Local lhs51 = localByName(b,"$i2");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);      
      Value rhs46 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs51,rhs46));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setTimeBetweenEvictionRunsMillis",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs52 = localByName(b,"r46");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs47 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget16);    
    units.add(Jimple.v().newAssignStmt(lhs52,rhs47));    
    Local left20 = localByName(b,"r46");    
    Value right20 = NullConstant.v();    
    Value condition20 = Jimple.v().newEqExpr(left20,right20);    
    Unit target20=jumpTarget18;    
    units.add(Jimple.v().newIfStmt(condition20,target20));    
    Local lhs53 = localByName(b,"$r47");    
    {    
      Local base = localByName(b,"r46");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs48 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs53,rhs48));    
    Local left21 = localByName(b,"$r47");    
    Value right21 = NullConstant.v();    
    Value condition21 = Jimple.v().newEqExpr(left21,right21);    
    Unit target21=jumpTarget18;    
    units.add(Jimple.v().newIfStmt(condition21,target21));    
    Local lhs54 = localByName(b,"$r48");    
    {    
      Local base = localByName(b,"r46");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs49 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs54,rhs49));    
    Local lhs55 = localByName(b,"$r49");    
    {    
      Local base = localByName(b,"$r48");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs50 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs55,rhs50));    
    Local lhs56 = localByName(b,"$i3");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);      
      Value rhs51 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs56,rhs51));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setNumTestsPerEvictionRun",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    Local lhs57 = localByName(b,"r50");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs52 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget18);    
    units.add(Jimple.v().newAssignStmt(lhs57,rhs52));    
    Local left22 = localByName(b,"r50");    
    Value right22 = NullConstant.v();    
    Value condition22 = Jimple.v().newEqExpr(left22,right22);    
    Unit target22=jumpTarget20;    
    units.add(Jimple.v().newIfStmt(condition22,target22));    
    Local lhs58 = localByName(b,"$r51");    
    {    
      Local base = localByName(b,"r50");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs53 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs58,rhs53));    
    Local left23 = localByName(b,"$r51");    
    Value right23 = NullConstant.v();    
    Value condition23 = Jimple.v().newEqExpr(left23,right23);    
    Unit target23=jumpTarget20;    
    units.add(Jimple.v().newIfStmt(condition23,target23));    
    Local lhs59 = localByName(b,"$r52");    
    {    
      Local base = localByName(b,"r50");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs54 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs59,rhs54));    
    Local lhs60 = localByName(b,"$r53");    
    {    
      Local base = localByName(b,"$r52");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs55 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs60,rhs55));    
    Local lhs61 = localByName(b,"$i4");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);      
      Value rhs56 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs61,rhs56));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setMinEvictableIdleTimeMillis",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    Local lhs62 = localByName(b,"r54");    
    {    
      Local base = localByName(b,"r6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("javax.naming.RefAddr");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);      
      Value rhs57 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(jumpTarget20);    
    units.add(Jimple.v().newAssignStmt(lhs62,rhs57));    
    Local left24 = localByName(b,"r54");    
    Value right24 = NullConstant.v();    
    Value condition24 = Jimple.v().newEqExpr(left24,right24);    
    Unit target24=jumpTarget22;    
    units.add(Jimple.v().newIfStmt(condition24,target24));    
    Local lhs63 = localByName(b,"$r55");    
    {    
      Local base = localByName(b,"r54");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs58 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs63,rhs58));    
    Local left25 = localByName(b,"$r55");    
    Value right25 = NullConstant.v();    
    Value condition25 = Jimple.v().newEqExpr(left25,right25);    
    Unit target25=jumpTarget22;    
    units.add(Jimple.v().newIfStmt(condition25,target25));    
    Local lhs64 = localByName(b,"$r56");    
    {    
      Local base = localByName(b,"r54");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);      
      Value rhs59 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs64,rhs59));    
    Local lhs65 = localByName(b,"$r57");    
    {    
      Local base = localByName(b,"$r56");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs60 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs65,rhs60));    
    Local lhs66 = localByName(b,"$i5");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);      
      Value rhs61 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs66,rhs61));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setMaxPreparedStatements",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    Local lhs67 = localByName(b,"r5");    
    Local rhs62 = localByName(b,"r0");    
    units.add(jumpTarget22);    
    units.add(Jimple.v().newAssignStmt(lhs67,rhs62));    
    Local retVal0 = localByName(b,"r5");    
    units.add(jumpTarget24);    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod5(SootClass c) {  
    SootMethod m = new SootMethod("assertInitializationAllowed",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.IllegalStateException")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$z0");    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"getConnectionCalled",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local left0 = localByName(b,"$z0");    
    Value right0 = IntConstant.v(0);    
    Value condition0 = Jimple.v().newEqExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Local lhs2 = localByName(b,"$r1");    
    RefType type1 = RefType.v("java.lang.IllegalStateException");    
    Value rhs1 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    {    
      Local base = localByName(b,"$r1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.IllegalStateException"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local op0 = localByName(b,"$r1");    
    units.add(Jimple.v().newThrowStmt(op0));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod6(SootClass c) {  
    SootMethod m = new SootMethod("getDescription",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"description",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$r1");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod7(SootClass c) {  
    SootMethod m = new SootMethod("setDescription",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"description",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"r1");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod8(SootClass c) {  
    SootMethod m = new SootMethod("getPassword",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"password",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$r1");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod9(SootClass c) {  
    SootMethod m = new SootMethod("setPassword",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"password",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"r1");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod10(SootClass c) {  
    SootMethod m = new SootMethod("getUrl",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"url",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$r1");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod11(SootClass c) {  
    SootMethod m = new SootMethod("setUrl",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"url",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"r1");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod12(SootClass c) {  
    SootMethod m = new SootMethod("getUser",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"user",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$r1");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod13(SootClass c) {  
    SootMethod m = new SootMethod("setUser",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"user",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"r1");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod14(SootClass c) {  
    SootMethod m = new SootMethod("getDriver",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"driver",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$r1");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod15(SootClass c) {  
    SootMethod m = new SootMethod("setDriver",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"driver",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"r1");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"forName",parameterTypes,returnType,true);      
      Value ie1 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod16(SootClass c) {  
    SootMethod m = new SootMethod("getLoginTimeout",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"loginTimeout",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod17(SootClass c) {  
    SootMethod m = new SootMethod("getLogWriter",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("java.io.PrintWriter")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$r1");    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"logWriter",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$r1");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod18(SootClass c) {  
    SootMethod m = new SootMethod("setLoginTimeout",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"i0");    
    Type paramType0 = IntType.v();    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"loginTimeout",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod19(SootClass c) {  
    SootMethod m = new SootMethod("setLogWriter",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("r1", RefType.v("java.io.PrintWriter")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"r1");    
    RefType paramType0 = RefType.v("java.io.PrintWriter");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"logWriter",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"r1");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod20(SootClass c) {  
    SootMethod m = new SootMethod("isPoolPreparedStatements",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$z0");    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"poolPreparedStatements",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$z0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod21(SootClass c) {  
    SootMethod m = new SootMethod("setPoolPreparedStatements",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("z0", RefType.v("boolean")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"z0");    
    Type paramType0 = BooleanType.v();    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Local base = localByName(b,"r0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"poolPreparedStatements",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"z0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod22(SootClass c) {  
    SootMethod m = new SootMethod("getMaxActive",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"maxActive",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod23(SootClass c) {  
    SootMethod m = new SootMethod("setMaxActive",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
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
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"maxActive",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod24(SootClass c) {  
    SootMethod m = new SootMethod("getMaxIdle",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"maxIdle",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod25(SootClass c) {  
    SootMethod m = new SootMethod("setMaxIdle",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
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
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"maxIdle",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod26(SootClass c) {  
    SootMethod m = new SootMethod("getTimeBetweenEvictionRunsMillis",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_timeBetweenEvictionRunsMillis",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod27(SootClass c) {  
    SootMethod m = new SootMethod("setTimeBetweenEvictionRunsMillis",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
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
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_timeBetweenEvictionRunsMillis",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod28(SootClass c) {  
    SootMethod m = new SootMethod("getNumTestsPerEvictionRun",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_numTestsPerEvictionRun",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod29(SootClass c) {  
    SootMethod m = new SootMethod("setNumTestsPerEvictionRun",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
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
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_numTestsPerEvictionRun",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod30(SootClass c) {  
    SootMethod m = new SootMethod("getMinEvictableIdleTimeMillis",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_minEvictableIdleTimeMillis",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod31(SootClass c) {  
    SootMethod m = new SootMethod("setMinEvictableIdleTimeMillis",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
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
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"assertInitializationAllowed",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_minEvictableIdleTimeMillis",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod32(SootClass c) {  
    SootMethod m = new SootMethod("getMaxPreparedStatements",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$i0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_maxPreparedStatements",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"$i0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod33(SootClass c) {  
    SootMethod m = new SootMethod("setMaxPreparedStatements",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("i0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"i0");    
    Type paramType0 = IntType.v();    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"_maxPreparedStatements",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"i0");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

}
