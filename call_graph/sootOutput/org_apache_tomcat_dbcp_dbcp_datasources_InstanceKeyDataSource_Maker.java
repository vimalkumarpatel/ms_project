import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class org_apache_tomcat_dbcp_dbcp_datasources_InstanceKeyDataSource_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");    
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
    createMethod34(c);    
    createMethod35(c);    
    createMethod36(c);    
    createMethod37(c);    
    createMethod38(c);    
    createMethod39(c);    
    createMethod40(c);    
    createMethod41(c);    
    createMethod42(c);    
    createMethod43(c);    
    createMethod44(c);    
    createMethod45(c);    
    createMethod46(c);    
    createMethod47(c);    
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));    
    locals.add(Jimple.v().newLocal("$l0", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("$i1", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$l2", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("$i3", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("$l4", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("$i5", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");    
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
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getConnectionCalled",type,false);      Value lhs1 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs0 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    {    
      RefType type = RefType.v("javax.sql.ConnectionPoolDataSource");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"cpds",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs1 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"dataSourceName",type,false);      Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs2 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultAutoCommit",type,false);      Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs3 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultTransactionIsolation",type,false);      Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs4 = IntConstant.v(-1);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"maxActive",type,false);      Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs5 = IntConstant.v(8);    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"maxIdle",type,false);      Value lhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs6 = IntConstant.v(8);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    Local lhs8 = localByName(b,"$l0");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = LongType.v();      
      parameterTypes.add(type0);      
      Type type1 = LongType.v();      
      parameterTypes.add(type1);      
      Type returnType = LongType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Math"),"min",parameterTypes,returnType,true);      
      Value rhs7 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    Local lhs9 = localByName(b,"$i1");    
    Type type1 = IntType.v();    
    Local op0 = localByName(b,"$l0");    
    Value rhs8 = Jimple.v().newCastExpr(type1,op0);    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs8));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"maxWait",type,false);      Value lhs10 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs9 = localByName(b,"$i1");    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs9));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultReadOnly",type,false);      Value lhs11 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs10 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs10));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"description",type,false);      Value lhs12 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs11 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs11));    
    {    
      RefType type = RefType.v("java.util.Properties");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"jndiEnvironment",type,false);      Value lhs13 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs12 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs12));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"loginTimeout",type,false);      Value lhs14 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs13 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs13));    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"logWriter",type,false);      Value lhs15 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs14 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs14));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_testOnBorrow",type,false);      Value lhs16 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs15 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs15));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_testOnReturn",type,false);      Value lhs17 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs16 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs16));    
    Local lhs18 = localByName(b,"$l2");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = LongType.v();      
      parameterTypes.add(type0);      
      Type type1 = LongType.v();      
      parameterTypes.add(type1);      
      Type returnType = LongType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Math"),"min",parameterTypes,returnType,true);      
      Value rhs17 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs17));    
    Local lhs19 = localByName(b,"$i3");    
    Type type2 = IntType.v();    
    Local op1 = localByName(b,"$l2");    
    Value rhs18 = Jimple.v().newCastExpr(type2,op1);    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs18));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_timeBetweenEvictionRunsMillis",type,false);      Value lhs20 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs19 = localByName(b,"$i3");    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs19));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_numTestsPerEvictionRun",type,false);      Value lhs21 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs20 = IntConstant.v(3);    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs20));    
    Local lhs22 = localByName(b,"$l4");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = LongType.v();      
      parameterTypes.add(type0);      
      Type type1 = LongType.v();      
      parameterTypes.add(type1);      
      Type returnType = LongType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Math"),"min",parameterTypes,returnType,true);      
      Value rhs21 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs21));    
    Local lhs23 = localByName(b,"$i5");    
    Type type3 = IntType.v();    
    Local op2 = localByName(b,"$l4");    
    Value rhs22 = Jimple.v().newCastExpr(type3,op2);    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs22));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_minEvictableIdleTimeMillis",type,false);      Value lhs24 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs23 = localByName(b,"$i5");    
    units.add(Jimple.v().newAssignStmt(lhs24,rhs23));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_testWhileIdle",type,false);      Value lhs25 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs24 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs24));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"validationQuery",type,false);      Value lhs26 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs25 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs25));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"rollbackAfterValidation",type,false);      Value lhs27 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs26 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs26));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"testPositionSet",type,false);      Value lhs28 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs27 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs28,rhs27));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"instanceKey",type,false);      Value lhs29 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs28 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs29,rhs28));    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultAutoCommit",type,false);      Value lhs30 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Value rhs29 = IntConstant.v(1);    
    units.add(Jimple.v().newAssignStmt(lhs30,rhs29));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("assertInitializationAllowed",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));    
    locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.IllegalStateException")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"r0");    
    RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"$z0");    
    {    
      Type type = BooleanType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getConnectionCalled",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
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

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("close",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
      public void createMethod2(SootClass c) {      
        SootMethod m = new SootMethod("getConnectionPoolDataSource",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$r1", RefType.v("javax.sql.ConnectionPoolDataSource")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$r1");        
        {        
          RefType type = RefType.v("javax.sql.ConnectionPoolDataSource");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"cpds",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$r1");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod3(SootClass c) {      
        SootMethod m = new SootMethod("setConnectionPoolDataSource",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("r1", RefType.v("javax.sql.ConnectionPoolDataSource")));        
        locals.add(Jimple.v().newLocal("$r2", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("$r3", RefType.v("java.lang.IllegalStateException")));        
        locals.add(Jimple.v().newLocal("$r4", RefType.v("javax.sql.ConnectionPoolDataSource")));        
        locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.IllegalStateException")));        
        locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.String")));        
        Chain<Unit> units = b.getUnits();        
        NopStmt jumpTarget0= Jimple.v().newNopStmt();        
        NopStmt jumpTarget1= Jimple.v().newNopStmt();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"r1");        
        RefType paramType0 = RefType.v("javax.sql.ConnectionPoolDataSource");        
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
        Local lhs2 = localByName(b,"$r2");        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"dataSourceName",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        Local left0 = localByName(b,"$r2");        
        Value right0 = NullConstant.v();        
        Value condition0 = Jimple.v().newEqExpr(left0,right0);        
        Unit target0=jumpTarget0;        
        units.add(Jimple.v().newIfStmt(condition0,target0));        
        Local lhs3 = localByName(b,"$r3");        
        RefType type1 = RefType.v("java.lang.IllegalStateException");        
        Value rhs1 = Jimple.v().newNewExpr(type1);        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs1));        
        {        
          Local base = localByName(b,"$r3");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.IllegalStateException"),"<init>",parameterTypes,returnType,false);          
          Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie1));        
        Local op0 = localByName(b,"$r3");        
        units.add(Jimple.v().newThrowStmt(op0));        
        Local lhs4 = localByName(b,"$r4");        
        {        
          RefType type = RefType.v("javax.sql.ConnectionPoolDataSource");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"cpds",type,false);          Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(jumpTarget0);        
        units.add(Jimple.v().newAssignStmt(lhs4,rhs2));        
        Local left1 = localByName(b,"$r4");        
        Value right1 = NullConstant.v();        
        Value condition1 = Jimple.v().newEqExpr(left1,right1);        
        Unit target1=jumpTarget1;        
        units.add(Jimple.v().newIfStmt(condition1,target1));        
        Local lhs5 = localByName(b,"$r5");        
        RefType type2 = RefType.v("java.lang.IllegalStateException");        
        Value rhs3 = Jimple.v().newNewExpr(type2);        
        units.add(Jimple.v().newAssignStmt(lhs5,rhs3));        
        {        
          Local base = localByName(b,"$r5");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.IllegalStateException"),"<init>",parameterTypes,returnType,false);          
          Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie2));        
        Local op1 = localByName(b,"$r5");        
        units.add(Jimple.v().newThrowStmt(op1));        
        {        
          RefType type = RefType.v("javax.sql.ConnectionPoolDataSource");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"cpds",type,false);          Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs4 = localByName(b,"r1");        
        units.add(jumpTarget1);        
        units.add(Jimple.v().newAssignStmt(lhs6,rhs4));        
        Local lhs7 = localByName(b,"$r6");        
        {        
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");          
          parameterTypes.add(type0);          
          RefType returnType = RefType.v("java.lang.String");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"registerNewInstance",parameterTypes,returnType,true);          
          Value rhs5 = Jimple.v().newStaticInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs7,rhs5));        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"instanceKey",type,false);          Value lhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs6 = localByName(b,"$r6");        
        units.add(Jimple.v().newAssignStmt(lhs8,rhs6));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod4(SootClass c) {      
        SootMethod m = new SootMethod("getDataSourceName",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$r1");        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"dataSourceName",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$r1");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod5(SootClass c) {      
        SootMethod m = new SootMethod("setDataSourceName",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("$r2", RefType.v("javax.sql.ConnectionPoolDataSource")));        
        locals.add(Jimple.v().newLocal("$r3", RefType.v("java.lang.IllegalStateException")));        
        locals.add(Jimple.v().newLocal("$r4", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.IllegalStateException")));        
        locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.String")));        
        Chain<Unit> units = b.getUnits();        
        NopStmt jumpTarget0= Jimple.v().newNopStmt();        
        NopStmt jumpTarget1= Jimple.v().newNopStmt();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        Local lhs2 = localByName(b,"$r2");        
        {        
          RefType type = RefType.v("javax.sql.ConnectionPoolDataSource");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"cpds",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        Local left0 = localByName(b,"$r2");        
        Value right0 = NullConstant.v();        
        Value condition0 = Jimple.v().newEqExpr(left0,right0);        
        Unit target0=jumpTarget0;        
        units.add(Jimple.v().newIfStmt(condition0,target0));        
        Local lhs3 = localByName(b,"$r3");        
        RefType type1 = RefType.v("java.lang.IllegalStateException");        
        Value rhs1 = Jimple.v().newNewExpr(type1);        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs1));        
        {        
          Local base = localByName(b,"$r3");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.IllegalStateException"),"<init>",parameterTypes,returnType,false);          
          Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie1));        
        Local op0 = localByName(b,"$r3");        
        units.add(Jimple.v().newThrowStmt(op0));        
        Local lhs4 = localByName(b,"$r4");        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"dataSourceName",type,false);          Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(jumpTarget0);        
        units.add(Jimple.v().newAssignStmt(lhs4,rhs2));        
        Local left1 = localByName(b,"$r4");        
        Value right1 = NullConstant.v();        
        Value condition1 = Jimple.v().newEqExpr(left1,right1);        
        Unit target1=jumpTarget1;        
        units.add(Jimple.v().newIfStmt(condition1,target1));        
        Local lhs5 = localByName(b,"$r5");        
        RefType type2 = RefType.v("java.lang.IllegalStateException");        
        Value rhs3 = Jimple.v().newNewExpr(type2);        
        units.add(Jimple.v().newAssignStmt(lhs5,rhs3));        
        {        
          Local base = localByName(b,"$r5");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.IllegalStateException"),"<init>",parameterTypes,returnType,false);          
          Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie2));        
        Local op1 = localByName(b,"$r5");        
        units.add(Jimple.v().newThrowStmt(op1));        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"dataSourceName",type,false);          Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs4 = localByName(b,"r1");        
        units.add(jumpTarget1);        
        units.add(Jimple.v().newAssignStmt(lhs6,rhs4));        
        Local lhs7 = localByName(b,"$r6");        
        {        
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");          
          parameterTypes.add(type0);          
          RefType returnType = RefType.v("java.lang.String");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"registerNewInstance",parameterTypes,returnType,true);          
          Value rhs5 = Jimple.v().newStaticInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs7,rhs5));        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"instanceKey",type,false);          Value lhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs6 = localByName(b,"$r6");        
        units.add(Jimple.v().newAssignStmt(lhs8,rhs6));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod6(SootClass c) {      
        SootMethod m = new SootMethod("isDefaultAutoCommit",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$z0");        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultAutoCommit",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$z0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod7(SootClass c) {      
        SootMethod m = new SootMethod("setDefaultAutoCommit",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultAutoCommit",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"z0");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod8(SootClass c) {      
        SootMethod m = new SootMethod("isDefaultReadOnly",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$z0");        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultReadOnly",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$z0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod9(SootClass c) {      
        SootMethod m = new SootMethod("setDefaultReadOnly",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultReadOnly",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"z0");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod10(SootClass c) {      
        SootMethod m = new SootMethod("getDefaultTransactionIsolation",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$i0");        
        {        
          Type type = IntType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultTransactionIsolation",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$i0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod11(SootClass c) {      
        SootMethod m = new SootMethod("setDefaultTransactionIsolation",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("i0", RefType.v("int")));        
        locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.IllegalArgumentException")));        
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
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          Local key0 = localByName(b,"i0");          
          int lowIndex=0;          
          int highIndex=8;          
          List<Unit> targets = new LinkedList<Unit>();          
          targets.add(jumpTarget0)          
          targets.add(jumpTarget0)          
          targets.add(jumpTarget0)          
          targets.add(jumpTarget5)          
          targets.add(jumpTarget0)          
          targets.add(jumpTarget5)          
          targets.add(jumpTarget5)          
          targets.add(jumpTarget5)          
          targets.add(jumpTarget0)          
          Unit defaultTarget = jumpTarget5;          
          units.add(Jimple.v().newTableSwitchStmt(key0,lowIndex,highIndex,targets,defaultTarget));          
        }        
        Unit target0=jumpTarget10;        
        units.add(jumpTarget0);        
        units.add(Jimple.v().newGotoStmt(target0));        
        Local lhs2 = localByName(b,"$r1");        
        RefType type1 = RefType.v("java.lang.IllegalArgumentException");        
        Value rhs0 = Jimple.v().newNewExpr(type1);        
        units.add(jumpTarget5);        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        {        
          Local base = localByName(b,"$r1");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.IllegalArgumentException"),"<init>",parameterTypes,returnType,false);          
          Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie1));        
        Local op0 = localByName(b,"$r1");        
        units.add(Jimple.v().newThrowStmt(op0));        
        {        
          Type type = IntType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"defaultTransactionIsolation",type,false);          Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs1 = localByName(b,"i0");        
        units.add(jumpTarget10);        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs1));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod12(SootClass c) {      
        SootMethod m = new SootMethod("getDescription",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$r1");        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"description",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$r1");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod13(SootClass c) {      
        SootMethod m = new SootMethod("setDescription",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"r1");        
        RefType paramType0 = RefType.v("java.lang.String");        
        int number0=0;        
        Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);        
        units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"description",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"r1");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod14(SootClass c) {      
        SootMethod m = new SootMethod("getJndiEnvironment",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("$r3", RefType.v("java.util.Properties")));        
        locals.add(Jimple.v().newLocal("$r4", RefType.v("java.util.Properties")));        
        Chain<Unit> units = b.getUnits();        
        NopStmt jumpTarget0= Jimple.v().newNopStmt();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"r1");        
        RefType paramType0 = RefType.v("java.lang.String");        
        int number0=0;        
        Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);        
        units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));        
        Local lhs2 = localByName(b,"r2");        
        Value rhs0 = NullConstant.v();        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        Local lhs3 = localByName(b,"$r3");        
        {        
          RefType type = RefType.v("java.util.Properties");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"jndiEnvironment",type,false);          Value rhs1 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs1));        
        Local left0 = localByName(b,"$r3");        
        Value right0 = NullConstant.v();        
        Value condition0 = Jimple.v().newEqExpr(left0,right0);        
        Unit target0=jumpTarget0;        
        units.add(Jimple.v().newIfStmt(condition0,target0));        
        Local lhs4 = localByName(b,"$r4");        
        {        
          RefType type = RefType.v("java.util.Properties");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"jndiEnvironment",type,false);          Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs4,rhs2));        
        Local lhs5 = localByName(b,"r2");        
        {        
          Local base = localByName(b,"$r4");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          RefType returnType = RefType.v("java.lang.String");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"getProperty",parameterTypes,returnType,false);          
          Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs5,rhs3));        
        Local retVal0 = localByName(b,"r2");        
        units.add(jumpTarget0);        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod15(SootClass c) {      
        SootMethod m = new SootMethod("setJndiEnvironment",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("$r3", RefType.v("java.util.Properties")));        
        locals.add(Jimple.v().newLocal("$r4", RefType.v("java.util.Properties")));        
        locals.add(Jimple.v().newLocal("$r5", RefType.v("java.util.Properties")));        
        Chain<Unit> units = b.getUnits();        
        NopStmt jumpTarget0= Jimple.v().newNopStmt();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          RefType type = RefType.v("java.util.Properties");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"jndiEnvironment",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs0));        
        Local left0 = localByName(b,"$r4");        
        Value right0 = NullConstant.v();        
        Value condition0 = Jimple.v().newNeExpr(left0,right0);        
        Unit target0=jumpTarget0;        
        units.add(Jimple.v().newIfStmt(condition0,target0));        
        Local lhs4 = localByName(b,"$r3");        
        RefType type1 = RefType.v("java.util.Properties");        
        Value rhs1 = Jimple.v().newNewExpr(type1);        
        units.add(Jimple.v().newAssignStmt(lhs4,rhs1));        
        {        
          Local base = localByName(b,"$r3");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"<init>",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        {        
          RefType type = RefType.v("java.util.Properties");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"jndiEnvironment",type,false);          Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs2 = localByName(b,"$r3");        
        units.add(Jimple.v().newAssignStmt(lhs5,rhs2));        
        Local lhs6 = localByName(b,"$r5");        
        {        
          RefType type = RefType.v("java.util.Properties");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"jndiEnvironment",type,false);          Value rhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(jumpTarget0);        
        units.add(Jimple.v().newAssignStmt(lhs6,rhs3));        
        {        
          Local base = localByName(b,"$r5");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          RefType type1 = RefType.v("java.lang.String");          
          parameterTypes.add(type1);          
          RefType returnType = RefType.v("java.lang.Object");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"setProperty",parameterTypes,returnType,false);          
          Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie1));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod16(SootClass c) {      
        SootMethod m = new SootMethod("getLoginTimeout",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$i0");        
        {        
          Type type = IntType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"loginTimeout",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$i0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod17(SootClass c) {      
        SootMethod m = new SootMethod("setLoginTimeout",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("i0", RefType.v("int")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"i0");        
        Type paramType0 = IntType.v();        
        int number0=0;        
        Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);        
        units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));        
        {        
          Type type = IntType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"loginTimeout",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"i0");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod18(SootClass c) {      
        SootMethod m = new SootMethod("getLogWriter",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$r1", RefType.v("java.io.PrintWriter")));        
        locals.add(Jimple.v().newLocal("$r2", RefType.v("java.io.PrintStream")));        
        locals.add(Jimple.v().newLocal("$r3", RefType.v("java.io.PrintWriter")));        
        locals.add(Jimple.v().newLocal("$r4", RefType.v("java.io.PrintWriter")));        
        Chain<Unit> units = b.getUnits();        
        NopStmt jumpTarget0= Jimple.v().newNopStmt();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$r3");        
        {        
          RefType type = RefType.v("java.io.PrintWriter");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"logWriter",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local left0 = localByName(b,"$r3");        
        Value right0 = NullConstant.v();        
        Value condition0 = Jimple.v().newNeExpr(left0,right0);        
        Unit target0=jumpTarget0;        
        units.add(Jimple.v().newIfStmt(condition0,target0));        
        Local lhs2 = localByName(b,"$r1");        
        RefType type1 = RefType.v("java.io.PrintWriter");        
        Value rhs1 = Jimple.v().newNewExpr(type1);        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs1));        
        Local lhs3 = localByName(b,"$r2");        
        {        
          RefType type = RefType.v("java.io.PrintStream");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);          Value rhs2 = Jimple.v().newStaticFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs2));        
        {        
          Local base = localByName(b,"$r1");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.io.OutputStream");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintWriter"),"<init>",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        {        
          RefType type = RefType.v("java.io.PrintWriter");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"logWriter",type,false);          Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs3 = localByName(b,"$r1");        
        units.add(Jimple.v().newAssignStmt(lhs4,rhs3));        
        Local lhs5 = localByName(b,"$r4");        
        {        
          RefType type = RefType.v("java.io.PrintWriter");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"logWriter",type,false);          Value rhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(jumpTarget0);        
        units.add(Jimple.v().newAssignStmt(lhs5,rhs4));        
        Local retVal0 = localByName(b,"$r4");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod19(SootClass c) {      
        SootMethod m = new SootMethod("setLogWriter",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("r1", RefType.v("java.io.PrintWriter")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"r1");        
        RefType paramType0 = RefType.v("java.io.PrintWriter");        
        int number0=0;        
        Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);        
        units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));        
        {        
          RefType type = RefType.v("java.io.PrintWriter");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"logWriter",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"r1");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod20(SootClass c) {      
        SootMethod m = new SootMethod("isTestOnBorrow",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$z0");        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          Type returnType = BooleanType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getTestOnBorrow",parameterTypes,returnType,false);          
          Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$z0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod21(SootClass c) {      
        SootMethod m = new SootMethod("getTestOnBorrow",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$z0");        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_testOnBorrow",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$z0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod22(SootClass c) {      
        SootMethod m = new SootMethod("setTestOnBorrow",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_testOnBorrow",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"z0");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"testPositionSet",type,false);          Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Value rhs1 = IntConstant.v(1);        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs1));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod23(SootClass c) {      
        SootMethod m = new SootMethod("isTestOnReturn",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$z0");        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          Type returnType = BooleanType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getTestOnReturn",parameterTypes,returnType,false);          
          Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$z0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod24(SootClass c) {      
        SootMethod m = new SootMethod("getTestOnReturn",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$z0");        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_testOnReturn",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$z0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod25(SootClass c) {      
        SootMethod m = new SootMethod("setTestOnReturn",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_testOnReturn",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"z0");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"testPositionSet",type,false);          Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Value rhs1 = IntConstant.v(1);        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs1));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod26(SootClass c) {      
        SootMethod m = new SootMethod("getTimeBetweenEvictionRunsMillis",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$i0");        
        {        
          Type type = IntType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_timeBetweenEvictionRunsMillis",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
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
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("i0", RefType.v("int")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_timeBetweenEvictionRunsMillis",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
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
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$i0");        
        {        
          Type type = IntType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_numTestsPerEvictionRun",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
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
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("i0", RefType.v("int")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_numTestsPerEvictionRun",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
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
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$i0");        
        {        
          Type type = IntType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_minEvictableIdleTimeMillis",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
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
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("i0", RefType.v("int")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_minEvictableIdleTimeMillis",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"i0");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod32(SootClass c) {      
        SootMethod m = new SootMethod("isTestWhileIdle",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$z0");        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          Type returnType = BooleanType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getTestWhileIdle",parameterTypes,returnType,false);          
          Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$z0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod33(SootClass c) {      
        SootMethod m = new SootMethod("getTestWhileIdle",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$z0");        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_testWhileIdle",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$z0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod34(SootClass c) {      
        SootMethod m = new SootMethod("setTestWhileIdle",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"_testWhileIdle",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"z0");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"testPositionSet",type,false);          Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Value rhs1 = IntConstant.v(1);        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs1));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod35(SootClass c) {      
        SootMethod m = new SootMethod("getValidationQuery",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$r1");        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"validationQuery",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$r1");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod36(SootClass c) {      
        SootMethod m = new SootMethod("setValidationQuery",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        NopStmt jumpTarget0= Jimple.v().newNopStmt();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        {        
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"validationQuery",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"r1");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        Local lhs3 = localByName(b,"$z0");        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"testPositionSet",type,false);          Value rhs1 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs1));        
        Local left0 = localByName(b,"$z0");        
        Value right0 = IntConstant.v(0);        
        Value condition0 = Jimple.v().newNeExpr(left0,right0);        
        Unit target0=jumpTarget0;        
        units.add(Jimple.v().newIfStmt(condition0,target0));        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          Type type0 = BooleanType.v();          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setTestOnBorrow",parameterTypes,returnType,false);          
          Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie1));        
        units.add(jumpTarget0);        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod37(SootClass c) {      
        SootMethod m = new SootMethod("isRollbackAfterValidation",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$z0");        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"rollbackAfterValidation",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$z0");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod38(SootClass c) {      
        SootMethod m = new SootMethod("setRollbackAfterValidation",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("z0", RefType.v("boolean")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"assertInitializationAllowed",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"rollbackAfterValidation",type,false);          Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Local rhs0 = localByName(b,"z0");        
        units.add(Jimple.v().newAssignStmt(lhs2,rhs0));        
        units.add(Jimple.v().newReturnVoidStmt());        
      }      
        
      public void createMethod39(SootClass c) {      
        SootMethod m = new SootMethod("getConnection",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("$r1", RefType.v("java.sql.Connection")));        
        Chain<Unit> units = b.getUnits();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
        Value idRef0 = Jimple.v().newThisRef(type0);        
        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));        
        Local lhs1 = localByName(b,"$r1");        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          RefType type1 = RefType.v("java.lang.String");          
          parameterTypes.add(type1);          
          RefType returnType = RefType.v("java.sql.Connection");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getConnection",parameterTypes,returnType,false);          
          Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));        
        Local retVal0 = localByName(b,"$r1");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod40(SootClass c) {      
        SootMethod m = new SootMethod("getConnection",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
        Chain<Local> locals = b.getLocals();        
        locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));        
        locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("r3", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo")));        
        locals.add(Jimple.v().newLocal("r4", RefType.v("java.util.NoSuchElementException")));        
        locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("$r6", RefType.v("java.sql.SQLException")));        
        locals.add(Jimple.v().newLocal("$r7", RefType.v("java.util.NoSuchElementException")));        
        locals.add(Jimple.v().newLocal("$r8", RefType.v("org.apache.tomcat.dbcp.dbcp.SQLNestedException")));        
        locals.add(Jimple.v().newLocal("$r9", RefType.v("java.lang.RuntimeException")));        
        locals.add(Jimple.v().newLocal("r10", RefType.v("java.lang.RuntimeException")));        
        locals.add(Jimple.v().newLocal("$r11", RefType.v("java.sql.SQLException")));        
        locals.add(Jimple.v().newLocal("r12", RefType.v("java.sql.SQLException")));        
        locals.add(Jimple.v().newLocal("$r13", RefType.v("java.lang.Exception")));        
        locals.add(Jimple.v().newLocal("r14", RefType.v("java.lang.Exception")));        
        locals.add(Jimple.v().newLocal("$r15", RefType.v("org.apache.tomcat.dbcp.dbcp.SQLNestedException")));        
        locals.add(Jimple.v().newLocal("$r16", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("$r17", RefType.v("java.lang.String")));        
        locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));        
        locals.add(Jimple.v().newLocal("$r18", RefType.v("java.sql.SQLException")));        
        locals.add(Jimple.v().newLocal("$r19", RefType.v("javax.sql.PooledConnection")));        
        locals.add(Jimple.v().newLocal("r20", RefType.v("java.sql.Connection")));        
        Chain<Unit> units = b.getUnits();        
        NopStmt jumpTarget0= Jimple.v().newNopStmt();        
        NopStmt jumpTarget1= Jimple.v().newNopStmt();        
        NopStmt jumpTarget2= Jimple.v().newNopStmt();        
        NopStmt jumpTarget3= Jimple.v().newNopStmt();        
        NopStmt jumpTarget4= Jimple.v().newNopStmt();        
        NopStmt jumpTarget5= Jimple.v().newNopStmt();        
        Local lhs0 = localByName(b,"r0");        
        RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");        
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
          RefType type = RefType.v("java.lang.String");          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"instanceKey",type,false);          Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs3,rhs0));        
        Local left0 = localByName(b,"$r5");        
        Value right0 = NullConstant.v();        
        Value condition0 = Jimple.v().newNeExpr(left0,right0);        
        Unit target0=jumpTarget0;        
        units.add(Jimple.v().newIfStmt(condition0,target0));        
        Local lhs4 = localByName(b,"$r6");        
        RefType type1 = RefType.v("java.sql.SQLException");        
        Value rhs1 = Jimple.v().newNewExpr(type1);        
        units.add(Jimple.v().newAssignStmt(lhs4,rhs1));        
        {        
          Local base = localByName(b,"$r6");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"<init>",parameterTypes,returnType,false);          
          Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie0));        
        Local op0 = localByName(b,"$r6");        
        units.add(Jimple.v().newThrowStmt(op0));        
        {        
          Type type = BooleanType.v();          
          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getConnectionCalled",type,false);          Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);          
        }        
        Value rhs2 = IntConstant.v(1);        
        units.add(jumpTarget0);        
        units.add(Jimple.v().newAssignStmt(lhs5,rhs2));        
        Local lhs6 = localByName(b,"r3");        
        Value rhs3 = NullConstant.v();        
        units.add(Jimple.v().newAssignStmt(lhs6,rhs3));        
        Local lhs7 = localByName(b,"r3");        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          RefType type1 = RefType.v("java.lang.String");          
          parameterTypes.add(type1);          
          RefType returnType = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getPooledConnectionAndInfo",parameterTypes,returnType,false);          
          Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs7,rhs4));        
        Unit target1=jumpTarget1;        
        units.add(Jimple.v().newGotoStmt(target1));        
        Local lhs8 = localByName(b,"$r7");        
        Value idRef3 = Jimple.v().newCaughtExceptionRef();        
        units.add(Jimple.v().newIdentityStmt(lhs8,idRef3));        
        Local lhs9 = localByName(b,"r4");        
        Local rhs5 = localByName(b,"$r7");        
        units.add(Jimple.v().newAssignStmt(lhs9,rhs5));        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"closeDueToException",parameterTypes,returnType,false);          
          Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie1));        
        Local lhs10 = localByName(b,"$r8");        
        RefType type2 = RefType.v("org.apache.tomcat.dbcp.dbcp.SQLNestedException");        
        Value rhs6 = Jimple.v().newNewExpr(type2);        
        units.add(Jimple.v().newAssignStmt(lhs10,rhs6));        
        {        
          Local base = localByName(b,"$r8");          
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
        Local op1 = localByName(b,"$r8");        
        units.add(Jimple.v().newThrowStmt(op1));        
        Local lhs11 = localByName(b,"$r9");        
        Value idRef4 = Jimple.v().newCaughtExceptionRef();        
        units.add(Jimple.v().newIdentityStmt(lhs11,idRef4));        
        Local lhs12 = localByName(b,"r10");        
        Local rhs7 = localByName(b,"$r9");        
        units.add(Jimple.v().newAssignStmt(lhs12,rhs7));        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"closeDueToException",parameterTypes,returnType,false);          
          Value ie3 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie3));        
        Local op2 = localByName(b,"r10");        
        units.add(Jimple.v().newThrowStmt(op2));        
        Local lhs13 = localByName(b,"$r11");        
        Value idRef5 = Jimple.v().newCaughtExceptionRef();        
        units.add(Jimple.v().newIdentityStmt(lhs13,idRef5));        
        Local lhs14 = localByName(b,"r12");        
        Local rhs8 = localByName(b,"$r11");        
        units.add(Jimple.v().newAssignStmt(lhs14,rhs8));        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"closeDueToException",parameterTypes,returnType,false);          
          Value ie4 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie4));        
        Local op3 = localByName(b,"r12");        
        units.add(Jimple.v().newThrowStmt(op3));        
        Local lhs15 = localByName(b,"$r13");        
        Value idRef6 = Jimple.v().newCaughtExceptionRef();        
        units.add(Jimple.v().newIdentityStmt(lhs15,idRef6));        
        Local lhs16 = localByName(b,"r14");        
        Local rhs9 = localByName(b,"$r13");        
        units.add(Jimple.v().newAssignStmt(lhs16,rhs9));        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"closeDueToException",parameterTypes,returnType,false);          
          Value ie5 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie5));        
        Local lhs17 = localByName(b,"$r15");        
        RefType type3 = RefType.v("org.apache.tomcat.dbcp.dbcp.SQLNestedException");        
        Value rhs10 = Jimple.v().newNewExpr(type3);        
        units.add(Jimple.v().newAssignStmt(lhs17,rhs10));        
        {        
          Local base = localByName(b,"$r15");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          RefType type1 = RefType.v("java.lang.Throwable");          
          parameterTypes.add(type1);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.SQLNestedException"),"<init>",parameterTypes,returnType,false);          
          Value ie6 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie6));        
        Local op4 = localByName(b,"$r15");        
        units.add(Jimple.v().newThrowStmt(op4));        
        Value left1 = NullConstant.v();        
        Local right1 = localByName(b,"r2");        
        Value condition1 = Jimple.v().newNeExpr(left1,right1);        
        Unit target2=jumpTarget2;        
        units.add(jumpTarget1);        
        units.add(Jimple.v().newIfStmt(condition1,target2));        
        Local lhs18 = localByName(b,"$r16");        
        {        
          Local base = localByName(b,"r3");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType returnType = RefType.v("java.lang.String");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"getPassword",parameterTypes,returnType,false);          
          Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs18,rhs11));        
        Value left2 = NullConstant.v();        
        Local right2 = localByName(b,"$r16");        
        Value condition2 = Jimple.v().newNeExpr(left2,right2);        
        Unit target3=jumpTarget3;        
        units.add(Jimple.v().newIfStmt(condition2,target3));        
        Unit target4=jumpTarget4;        
        units.add(Jimple.v().newGotoStmt(target4));        
        Local lhs19 = localByName(b,"$r17");        
        {        
          Local base = localByName(b,"r3");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType returnType = RefType.v("java.lang.String");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"getPassword",parameterTypes,returnType,false);          
          Value rhs12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(jumpTarget2);        
        units.add(Jimple.v().newAssignStmt(lhs19,rhs12));        
        Local lhs20 = localByName(b,"$z0");        
        {        
          Local base = localByName(b,"r2");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.Object");          
          parameterTypes.add(type0);          
          Type returnType = BooleanType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"equals",parameterTypes,returnType,false);          
          Value rhs13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs20,rhs13));        
        Local left3 = localByName(b,"$z0");        
        Value right3 = IntConstant.v(0);        
        Value condition3 = Jimple.v().newNeExpr(left3,right3);        
        Unit target5=jumpTarget4;        
        units.add(Jimple.v().newIfStmt(condition3,target5));        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"closeDueToException",parameterTypes,returnType,false);          
          Value ie7 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(jumpTarget3);        
        units.add(Jimple.v().newInvokeStmt(ie7));        
        Local lhs21 = localByName(b,"$r18");        
        RefType type4 = RefType.v("java.sql.SQLException");        
        Value rhs14 = Jimple.v().newNewExpr(type4);        
        units.add(Jimple.v().newAssignStmt(lhs21,rhs14));        
        {        
          Local base = localByName(b,"$r18");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.lang.String");          
          parameterTypes.add(type0);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"<init>",parameterTypes,returnType,false);          
          Value ie8 = Jimple.v().newSpecialInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie8));        
        Local op5 = localByName(b,"$r18");        
        units.add(Jimple.v().newThrowStmt(op5));        
        Local lhs22 = localByName(b,"$r19");        
        {        
          Local base = localByName(b,"r3");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType returnType = RefType.v("javax.sql.PooledConnection");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"getPooledConnection",parameterTypes,returnType,false);          
          Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(jumpTarget4);        
        units.add(Jimple.v().newAssignStmt(lhs22,rhs15));        
        Local lhs23 = localByName(b,"r20");        
        {        
          Local base = localByName(b,"$r19");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType returnType = RefType.v("java.sql.Connection");          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.sql.PooledConnection"),"getConnection",parameterTypes,returnType,false);          
          Value rhs16 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newAssignStmt(lhs23,rhs16));        
        {        
          Local base = localByName(b,"r0");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          RefType type0 = RefType.v("java.sql.Connection");          
          parameterTypes.add(type0);          
          RefType type1 = RefType.v("java.lang.String");          
          parameterTypes.add(type1);          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setupDefaults",parameterTypes,returnType,false);          
          Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie9));        
        {        
          Local base = localByName(b,"r20");          
          List<Type> parameterTypes = new LinkedList<Type>();          
          Type returnType = VoidType.v();          
          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"clearWarnings",parameterTypes,returnType,false);          
          Value ie10 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);          
        }        
        units.add(Jimple.v().newInvokeStmt(ie10));        
        Local retVal0 = localByName(b,"r20");        
        units.add(Jimple.v().newReturnStmt(retVal0));        
      }      
        
      public void createMethod41(SootClass c) {      
        SootMethod m = new SootMethod("getPooledConnectionAndInfo",null,null);        
        Body b = Jimple.v().newBody(m);        
        m.setActiveBody(b);        
          public void createMethod41(SootClass c) {          
            SootMethod m = new SootMethod("setupDefaults",null,null);            
            Body b = Jimple.v().newBody(m);            
            m.setActiveBody(b);            
              public void createMethod41(SootClass c) {              
                SootMethod m = new SootMethod("closeDueToException",null,null);                
                Body b = Jimple.v().newBody(m);                
                m.setActiveBody(b);                
                Chain<Local> locals = b.getLocals();                
                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));                
                locals.add(Jimple.v().newLocal("r1", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo")));                
                locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.Exception")));                
                locals.add(Jimple.v().newLocal("$r3", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r4", RefType.v("javax.sql.PooledConnection")));                
                locals.add(Jimple.v().newLocal("$r5", RefType.v("java.sql.Connection")));                
                locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.Exception")));                
                locals.add(Jimple.v().newLocal("$r7", RefType.v("java.io.PrintWriter")));                
                locals.add(Jimple.v().newLocal("$r8", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r9", RefType.v("java.lang.String")));                
                locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r11", RefType.v("java.lang.String")));                
                Chain<Unit> units = b.getUnits();                
                NopStmt jumpTarget0= Jimple.v().newNopStmt();                
                NopStmt jumpTarget1= Jimple.v().newNopStmt();                
                Local lhs0 = localByName(b,"r0");                
                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");                
                Value idRef0 = Jimple.v().newThisRef(type0);                
                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                
                Local lhs1 = localByName(b,"r1");                
                RefType paramType0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");                
                int number0=0;                
                Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);                
                units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));                
                Local left0 = localByName(b,"r1");                
                Value right0 = NullConstant.v();                
                Value condition0 = Jimple.v().newEqExpr(left0,right0);                
                Unit target0=jumpTarget0;                
                units.add(Jimple.v().newIfStmt(condition0,target0));                
                Local lhs2 = localByName(b,"$r4");                
                {                
                  Local base = localByName(b,"r1");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("javax.sql.PooledConnection");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"getPooledConnection",parameterTypes,returnType,false);                  
                  Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs2,rhs0));                
                Local lhs3 = localByName(b,"$r5");                
                {                
                  Local base = localByName(b,"$r4");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("java.sql.Connection");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.sql.PooledConnection"),"getConnection",parameterTypes,returnType,false);                  
                  Value rhs1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs3,rhs1));                
                {                
                  Local base = localByName(b,"$r5");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);                  
                  Value ie0 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie0));                
                Unit target1=jumpTarget0;                
                units.add(Jimple.v().newGotoStmt(target1));                
                Local lhs4 = localByName(b,"$r6");                
                Value idRef2 = Jimple.v().newCaughtExceptionRef();                
                units.add(Jimple.v().newIdentityStmt(lhs4,idRef2));                
                Local lhs5 = localByName(b,"r2");                
                Local rhs2 = localByName(b,"$r6");                
                units.add(Jimple.v().newAssignStmt(lhs5,rhs2));                
                Local lhs6 = localByName(b,"$r7");                
                {                
                  Local base = localByName(b,"r0");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("java.io.PrintWriter");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"getLogWriter",parameterTypes,returnType,false);                  
                  Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs6,rhs3));                
                Local lhs7 = localByName(b,"$r3");                
                RefType type1 = RefType.v("java.lang.StringBuilder");                
                Value rhs4 = Jimple.v().newNewExpr(type1);                
                units.add(Jimple.v().newAssignStmt(lhs7,rhs4));                
                {                
                  Local base = localByName(b,"$r3");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"<init>",parameterTypes,returnType,false);                  
                  Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie1));                
                Local lhs8 = localByName(b,"$r8");                
                {                
                  Local base = localByName(b,"$r3");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs8,rhs5));                
                Local lhs9 = localByName(b,"$r9");                
                {                
                  Local base = localByName(b,"r2");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("java.lang.String");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"getMessage",parameterTypes,returnType,false);                  
                  Value rhs6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs9,rhs6));                
                Local lhs10 = localByName(b,"$r10");                
                {                
                  Local base = localByName(b,"$r8");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs10,rhs7));                
                Local lhs11 = localByName(b,"$r11");                
                {                
                  Local base = localByName(b,"$r10");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("java.lang.String");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"toString",parameterTypes,returnType,false);                  
                  Value rhs8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs11,rhs8));                
                {                
                  Local base = localByName(b,"$r7");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintWriter"),"println",parameterTypes,returnType,false);                  
                  Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie2));                
                units.add(jumpTarget0);                
                units.add(Jimple.v().newReturnVoidStmt());                
              }              
                        
              public void createMethod42(SootClass c) {              
                SootMethod m = new SootMethod("testCPDS",null,null);                
                Body b = Jimple.v().newBody(m);                
                m.setActiveBody(b);                
                Chain<Local> locals = b.getLocals();                
                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));                
                locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));                
                locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));                
                locals.add(Jimple.v().newLocal("r3", RefType.v("javax.sql.ConnectionPoolDataSource")));                
                locals.add(Jimple.v().newLocal("n0", RefType.v("null_type")));                
                locals.add(Jimple.v().newLocal("r4", RefType.v("java.lang.Object")));                
                locals.add(Jimple.v().newLocal("r5", RefType.v("java.lang.Throwable")));                
                locals.add(Jimple.v().newLocal("r6", RefType.v("java.sql.SQLException")));                
                locals.add(Jimple.v().newLocal("$r7", RefType.v("java.util.Properties")));                
                locals.add(Jimple.v().newLocal("$r8", RefType.v("javax.naming.InitialContext")));                
                locals.add(Jimple.v().newLocal("r9", RefType.v("javax.naming.InitialContext")));                
                locals.add(Jimple.v().newLocal("$r10", RefType.v("javax.naming.InitialContext")));                
                locals.add(Jimple.v().newLocal("$r11", RefType.v("java.util.Properties")));                
                locals.add(Jimple.v().newLocal("$r12", RefType.v("java.lang.String")));                
                locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));                
                locals.add(Jimple.v().newLocal("$r13", RefType.v("java.sql.SQLException")));                
                locals.add(Jimple.v().newLocal("$r14", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r15", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r16", RefType.v("java.lang.String")));                
                locals.add(Jimple.v().newLocal("$r17", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r18", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r19", RefType.v("java.lang.Class")));                
                locals.add(Jimple.v().newLocal("$r20", RefType.v("java.lang.String")));                
                locals.add(Jimple.v().newLocal("$r21", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r22", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r23", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r24", RefType.v("java.lang.String")));                
                locals.add(Jimple.v().newLocal("r25", RefType.v("javax.sql.PooledConnection")));                
                locals.add(Jimple.v().newLocal("$r26", RefType.v("java.sql.SQLException")));                
                locals.add(Jimple.v().newLocal("$r27", RefType.v("java.sql.SQLException")));                
                locals.add(Jimple.v().newLocal("r28", RefType.v("java.sql.SQLException")));                
                locals.add(Jimple.v().newLocal("$r29", RefType.v("java.lang.Throwable")));                
                locals.add(Jimple.v().newLocal("$r30", RefType.v("java.sql.SQLException")));                
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
                Local lhs0 = localByName(b,"r0");                
                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");                
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
                  RefType type = RefType.v("javax.sql.ConnectionPoolDataSource");                  
                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"cpds",type,false);                  Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs3,rhs0));                
                Local left0 = localByName(b,"r3");                
                Value right0 = NullConstant.v();                
                Value condition0 = Jimple.v().newNeExpr(left0,right0);                
                Unit target0=jumpTarget3;                
                units.add(Jimple.v().newIfStmt(condition0,target0));                
                Local lhs4 = localByName(b,"n0");                
                Value rhs1 = NullConstant.v();                
                units.add(Jimple.v().newAssignStmt(lhs4,rhs1));                
                Local lhs5 = localByName(b,"$r7");                
                {                
                  RefType type = RefType.v("java.util.Properties");                  
                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"jndiEnvironment",type,false);                  Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs5,rhs2));                
                Local left1 = localByName(b,"$r7");                
                Value right1 = NullConstant.v();                
                Value condition1 = Jimple.v().newNeExpr(left1,right1);                
                Unit target1=jumpTarget0;                
                units.add(Jimple.v().newIfStmt(condition1,target1));                
                Local lhs6 = localByName(b,"$r8");                
                RefType type1 = RefType.v("javax.naming.InitialContext");                
                Value rhs3 = Jimple.v().newNewExpr(type1);                
                units.add(Jimple.v().newAssignStmt(lhs6,rhs3));                
                {                
                  Local base = localByName(b,"$r8");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.InitialContext"),"<init>",parameterTypes,returnType,false);                  
                  Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie0));                
                Local lhs7 = localByName(b,"r9");                
                Local rhs4 = localByName(b,"$r8");                
                units.add(Jimple.v().newAssignStmt(lhs7,rhs4));                
                Unit target2=jumpTarget1;                
                units.add(Jimple.v().newGotoStmt(target2));                
                Local lhs8 = localByName(b,"$r10");                
                RefType type2 = RefType.v("javax.naming.InitialContext");                
                Value rhs5 = Jimple.v().newNewExpr(type2);                
                units.add(jumpTarget0);                
                units.add(Jimple.v().newAssignStmt(lhs8,rhs5));                
                Local lhs9 = localByName(b,"$r11");                
                {                
                  RefType type = RefType.v("java.util.Properties");                  
                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"jndiEnvironment",type,false);                  Value rhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs9,rhs6));                
                {                
                  Local base = localByName(b,"$r10");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.util.Hashtable");                  
                  parameterTypes.add(type0);                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.InitialContext"),"<init>",parameterTypes,returnType,false);                  
                  Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie1));                
                Local lhs10 = localByName(b,"r9");                
                Local rhs7 = localByName(b,"$r10");                
                units.add(Jimple.v().newAssignStmt(lhs10,rhs7));                
                Local lhs11 = localByName(b,"$r12");                
                {                
                  RefType type = RefType.v("java.lang.String");                  
                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"dataSourceName",type,false);                  Value rhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);                  
                }                
                units.add(jumpTarget1);                
                units.add(Jimple.v().newAssignStmt(lhs11,rhs8));                
                Local lhs12 = localByName(b,"r4");                
                {                
                  Local base = localByName(b,"r9");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.Object");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Context"),"lookup",parameterTypes,returnType,false);                  
                  Value rhs9 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs12,rhs9));                
                Local lhs13 = localByName(b,"$z0");                
                Type type3 = BooleanType.v();                
                Local op0 = localByName(b,"r4");                
                Value rhs10 = Jimple.v().newInstanceOfExpr(type3,op0);                
                units.add(Jimple.v().newAssignStmt(lhs13,rhs10));                
                Local left2 = localByName(b,"$z0");                
                Value right2 = IntConstant.v(0);                
                Value condition2 = Jimple.v().newEqExpr(left2,right2);                
                Unit target3=jumpTarget2;                
                units.add(Jimple.v().newIfStmt(condition2,target3));                
                Local lhs14 = localByName(b,"r3");                
                RefType type4 = RefType.v("javax.sql.ConnectionPoolDataSource");                
                Local op1 = localByName(b,"r4");                
                Value rhs11 = Jimple.v().newCastExpr(type4,op1);                
                units.add(Jimple.v().newAssignStmt(lhs14,rhs11));                
                Unit target4=jumpTarget3;                
                units.add(Jimple.v().newGotoStmt(target4));                
                Local lhs15 = localByName(b,"$r13");                
                RefType type5 = RefType.v("java.sql.SQLException");                
                Value rhs12 = Jimple.v().newNewExpr(type5);                
                units.add(jumpTarget2);                
                units.add(Jimple.v().newAssignStmt(lhs15,rhs12));                
                Local lhs16 = localByName(b,"$r14");                
                RefType type6 = RefType.v("java.lang.StringBuilder");                
                Value rhs13 = Jimple.v().newNewExpr(type6);                
                units.add(Jimple.v().newAssignStmt(lhs16,rhs13));                
                {                
                  Local base = localByName(b,"$r14");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"<init>",parameterTypes,returnType,false);                  
                  Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie2));                
                Local lhs17 = localByName(b,"$r15");                
                {                
                  Local base = localByName(b,"$r14");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs17,rhs14));                
                Local lhs18 = localByName(b,"$r16");                
                {                
                  RefType type = RefType.v("java.lang.String");                  
                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"dataSourceName",type,false);                  Value rhs15 = Jimple.v().newJInstanceFieldRef(fieldRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs18,rhs15));                
                Local lhs19 = localByName(b,"$r17");                
                {                
                  Local base = localByName(b,"$r15");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs19,rhs16));                
                Local lhs20 = localByName(b,"$r18");                
                {                
                  Local base = localByName(b,"$r17");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs20,rhs17));                
                Local lhs21 = localByName(b,"$r19");                
                {                
                  Local base = localByName(b,"r4");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("java.lang.Class");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"getClass",parameterTypes,returnType,false);                  
                  Value rhs18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs21,rhs18));                
                Local lhs22 = localByName(b,"$r20");                
                {                
                  Local base = localByName(b,"$r19");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("java.lang.String");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);                  
                  Value rhs19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs22,rhs19));                
                Local lhs23 = localByName(b,"$r21");                
                {                
                  Local base = localByName(b,"$r18");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs23,rhs20));                
                Local lhs24 = localByName(b,"$r22");                
                {                
                  Local base = localByName(b,"$r21");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs24,rhs21));                
                Local lhs25 = localByName(b,"$r23");                
                {                
                  Local base = localByName(b,"$r22");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs25,rhs22));                
                Local lhs26 = localByName(b,"$r24");                
                {                
                  Local base = localByName(b,"$r23");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("java.lang.String");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"toString",parameterTypes,returnType,false);                  
                  Value rhs23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs26,rhs23));                
                {                
                  Local base = localByName(b,"$r13");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"<init>",parameterTypes,returnType,false);                  
                  Value ie3 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie3));                
                Local op2 = localByName(b,"$r13");                
                units.add(Jimple.v().newThrowStmt(op2));                
                Local lhs27 = localByName(b,"r25");                
                Value rhs24 = NullConstant.v();                
                units.add(jumpTarget3);                
                units.add(Jimple.v().newAssignStmt(lhs27,rhs24));                
                Local left3 = localByName(b,"r1");                
                Value right3 = NullConstant.v();                
                Value condition3 = Jimple.v().newEqExpr(left3,right3);                
                Unit target5=jumpTarget5;                
                units.add(Jimple.v().newIfStmt(condition3,target5));                
                Local lhs28 = localByName(b,"r25");                
                {                
                  Local base = localByName(b,"r3");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType type1 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type1);                  
                  RefType returnType = RefType.v("javax.sql.PooledConnection");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.sql.ConnectionPoolDataSource"),"getPooledConnection",parameterTypes,returnType,false);                  
                  Value rhs25 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs28,rhs25));                
                Unit target6=jumpTarget6;                
                units.add(Jimple.v().newGotoStmt(target6));                
                Local lhs29 = localByName(b,"r25");                
                {                
                  Local base = localByName(b,"r3");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("javax.sql.PooledConnection");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.sql.ConnectionPoolDataSource"),"getPooledConnection",parameterTypes,returnType,false);                  
                  Value rhs26 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                  
                }                
                units.add(jumpTarget5);                
                units.add(Jimple.v().newAssignStmt(lhs29,rhs26));                
                Local left4 = localByName(b,"r25");                
                Value right4 = NullConstant.v();                
                Value condition4 = Jimple.v().newNeExpr(left4,right4);                
                Unit target7=jumpTarget7;                
                units.add(jumpTarget6);                
                units.add(Jimple.v().newIfStmt(condition4,target7));                
                Local lhs30 = localByName(b,"$r26");                
                RefType type7 = RefType.v("java.sql.SQLException");                
                Value rhs27 = Jimple.v().newNewExpr(type7);                
                units.add(Jimple.v().newAssignStmt(lhs30,rhs27));                
                {                
                  Local base = localByName(b,"$r26");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"<init>",parameterTypes,returnType,false);                  
                  Value ie4 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie4));                
                Local op3 = localByName(b,"$r26");                
                units.add(Jimple.v().newThrowStmt(op3));                
                Local left5 = localByName(b,"r25");                
                Value right5 = NullConstant.v();                
                Value condition5 = Jimple.v().newEqExpr(left5,right5);                
                Unit target8=jumpTarget10;                
                units.add(jumpTarget7);                
                units.add(Jimple.v().newIfStmt(condition5,target8));                
                {                
                  Local base = localByName(b,"r25");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.sql.PooledConnection"),"close",parameterTypes,returnType,false);                  
                  Value ie5 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie5));                
                Unit target9=jumpTarget10;                
                units.add(Jimple.v().newGotoStmt(target9));                
                Local lhs31 = localByName(b,"$r27");                
                Value idRef3 = Jimple.v().newCaughtExceptionRef();                
                units.add(Jimple.v().newIdentityStmt(lhs31,idRef3));                
                Local lhs32 = localByName(b,"r28");                
                Local rhs28 = localByName(b,"$r27");                
                units.add(Jimple.v().newAssignStmt(lhs32,rhs28));                
                Unit target10=jumpTarget10;                
                units.add(Jimple.v().newGotoStmt(target10));                
                Local lhs33 = localByName(b,"$r29");                
                Value idRef4 = Jimple.v().newCaughtExceptionRef();                
                units.add(Jimple.v().newIdentityStmt(lhs33,idRef4));                
                Local lhs34 = localByName(b,"r5");                
                Local rhs29 = localByName(b,"$r29");                
                units.add(Jimple.v().newAssignStmt(lhs34,rhs29));                
                Local left6 = localByName(b,"r25");                
                Value right6 = NullConstant.v();                
                Value condition6 = Jimple.v().newEqExpr(left6,right6);                
                Unit target11=jumpTarget8;                
                units.add(Jimple.v().newIfStmt(condition6,target11));                
                {                
                  Local base = localByName(b,"r25");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.sql.PooledConnection"),"close",parameterTypes,returnType,false);                  
                  Value ie6 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie6));                
                Unit target12=jumpTarget8;                
                units.add(Jimple.v().newGotoStmt(target12));                
                Local lhs35 = localByName(b,"$r30");                
                Value idRef5 = Jimple.v().newCaughtExceptionRef();                
                units.add(Jimple.v().newIdentityStmt(lhs35,idRef5));                
                Local lhs36 = localByName(b,"r6");                
                Local rhs30 = localByName(b,"$r30");                
                units.add(Jimple.v().newAssignStmt(lhs36,rhs30));                
                Local op4 = localByName(b,"r5");                
                units.add(jumpTarget8);                
                units.add(Jimple.v().newThrowStmt(op4));                
                Local retVal0 = localByName(b,"r3");                
                units.add(jumpTarget10);                
                units.add(Jimple.v().newReturnStmt(retVal0));                
              }              
                        
              public void createMethod43(SootClass c) {              
                SootMethod m = new SootMethod("whenExhaustedAction",null,null);                
                Body b = Jimple.v().newBody(m);                
                m.setActiveBody(b);                
                Chain<Local> locals = b.getLocals();                
                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));                
                locals.add(Jimple.v().newLocal("i0", RefType.v("int")));                
                locals.add(Jimple.v().newLocal("i1", RefType.v("int")));                
                locals.add(Jimple.v().newLocal("b2", RefType.v("byte")));                
                Chain<Unit> units = b.getUnits();                
                NopStmt jumpTarget0= Jimple.v().newNopStmt();                
                NopStmt jumpTarget1= Jimple.v().newNopStmt();                
                NopStmt jumpTarget2= Jimple.v().newNopStmt();                
                Local lhs0 = localByName(b,"r0");                
                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");                
                Value idRef0 = Jimple.v().newThisRef(type0);                
                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                
                Local lhs1 = localByName(b,"i0");                
                Type paramType0 = IntType.v();                
                int number0=0;                
                Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);                
                units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));                
                Local lhs2 = localByName(b,"i1");                
                Type paramType1 = IntType.v();                
                int number1=1;                
                Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);                
                units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));                
                Local lhs3 = localByName(b,"b2");                
                Value rhs0 = IntConstant.v(1);                
                units.add(Jimple.v().newAssignStmt(lhs3,rhs0));                
                Local left0 = localByName(b,"i0");                
                Value right0 = IntConstant.v(0);                
                Value condition0 = Jimple.v().newGtExpr(left0,right0);                
                Unit target0=jumpTarget0;                
                units.add(Jimple.v().newIfStmt(condition0,target0));                
                Local lhs4 = localByName(b,"b2");                
                Value rhs1 = IntConstant.v(2);                
                units.add(Jimple.v().newAssignStmt(lhs4,rhs1));                
                Unit target1=jumpTarget1;                
                units.add(Jimple.v().newGotoStmt(target1));                
                Local left1 = localByName(b,"i1");                
                Value right1 = IntConstant.v(0);                
                Value condition1 = Jimple.v().newNeExpr(left1,right1);                
                Unit target2=jumpTarget1;                
                units.add(jumpTarget0);                
                units.add(Jimple.v().newIfStmt(condition1,target2));                
                Local lhs5 = localByName(b,"b2");                
                Value rhs2 = IntConstant.v(0);                
                units.add(Jimple.v().newAssignStmt(lhs5,rhs2));                
                Local retVal0 = localByName(b,"b2");                
                units.add(jumpTarget1);                
                units.add(Jimple.v().newReturnStmt(retVal0));                
              }              
                        
              public void createMethod44(SootClass c) {              
                SootMethod m = new SootMethod("getReference",null,null);                
                Body b = Jimple.v().newBody(m);                
                m.setActiveBody(b);                
                Chain<Local> locals = b.getLocals();                
                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));                
                locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));                
                locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));                
                locals.add(Jimple.v().newLocal("r3", RefType.v("javax.naming.Reference")));                
                locals.add(Jimple.v().newLocal("$r4", RefType.v("java.lang.Class")));                
                locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r7", RefType.v("java.lang.StringBuilder")));                
                locals.add(Jimple.v().newLocal("$r8", RefType.v("javax.naming.Reference")));                
                locals.add(Jimple.v().newLocal("$r9", RefType.v("javax.naming.StringRefAddr")));                
                locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.String")));                
                Chain<Unit> units = b.getUnits();                
                Local lhs0 = localByName(b,"r0");                
                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");                
                Value idRef0 = Jimple.v().newThisRef(type0);                
                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                
                Local lhs1 = localByName(b,"$r4");                
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
                  Local base = localByName(b,"$r4");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("java.lang.String");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);                  
                  Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs2,rhs1));                
                Local lhs3 = localByName(b,"$r5");                
                RefType type1 = RefType.v("java.lang.StringBuilder");                
                Value rhs2 = Jimple.v().newNewExpr(type1);                
                units.add(Jimple.v().newAssignStmt(lhs3,rhs2));                
                {                
                  Local base = localByName(b,"$r5");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"<init>",parameterTypes,returnType,false);                  
                  Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie0));                
                Local lhs4 = localByName(b,"$r6");                
                {                
                  Local base = localByName(b,"$r5");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs4,rhs3));                
                Local lhs5 = localByName(b,"$r7");                
                {                
                  Local base = localByName(b,"$r6");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType returnType = RefType.v("java.lang.StringBuilder");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"append",parameterTypes,returnType,false);                  
                  Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs5,rhs4));                
                Local lhs6 = localByName(b,"r2");                
                {                
                  Local base = localByName(b,"$r7");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType returnType = RefType.v("java.lang.String");                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuilder"),"toString",parameterTypes,returnType,false);                  
                  Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newAssignStmt(lhs6,rhs5));                
                Local lhs7 = localByName(b,"$r8");                
                RefType type2 = RefType.v("javax.naming.Reference");                
                Value rhs6 = Jimple.v().newNewExpr(type2);                
                units.add(Jimple.v().newAssignStmt(lhs7,rhs6));                
                {                
                  Local base = localByName(b,"$r8");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type0);                  
                  RefType type1 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type1);                  
                  RefType type2 = RefType.v("java.lang.String");                  
                  parameterTypes.add(type2);                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"<init>",parameterTypes,returnType,false);                  
                  Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie1));                
                Local lhs8 = localByName(b,"r3");                
                Local rhs7 = localByName(b,"$r8");                
                units.add(Jimple.v().newAssignStmt(lhs8,rhs7));                
                Local lhs9 = localByName(b,"$r9");                
                RefType type3 = RefType.v("javax.naming.StringRefAddr");                
                Value rhs8 = Jimple.v().newNewExpr(type3);                
                units.add(Jimple.v().newAssignStmt(lhs9,rhs8));                
                Local lhs10 = localByName(b,"$r10");                
                {                
                  RefType type = RefType.v("java.lang.String");                  
                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"instanceKey",type,false);                  Value rhs9 = Jimple.v().newJInstanceFieldRef(fieldRef);                  
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
                  Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie2));                
                {                
                  Local base = localByName(b,"r3");                  
                  List<Type> parameterTypes = new LinkedList<Type>();                  
                  RefType type0 = RefType.v("javax.naming.RefAddr");                  
                  parameterTypes.add(type0);                  
                  Type returnType = VoidType.v();                  
                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"add",parameterTypes,returnType,false);                  
                  Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                  
                }                
                units.add(Jimple.v().newInvokeStmt(ie3));                
                Local retVal0 = localByName(b,"r3");                
                units.add(Jimple.v().newReturnStmt(retVal0));                
              }              
                        
            }            
