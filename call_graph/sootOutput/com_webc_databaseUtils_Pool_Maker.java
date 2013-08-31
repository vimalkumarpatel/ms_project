import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class com_webc_databaseUtils_Pool_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("com.webc.databaseUtils.Pool");    
    c.setApplicationClass();    
    Scene.v().addClass(c);    
    createMethod0(c);    
    createMethod1(c);    
    createMethod2(c);    
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("<clinit>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("fis", RefType.v("java.io.FileInputStream")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.FileInputStream")));    
    locals.add(Jimple.v().newLocal("properties", RefType.v("java.util.Properties")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.util.Properties")));    
    locals.add(Jimple.v().newLocal("dbType", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.io.FileInputStream")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("cpds", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("tds", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.io.FileNotFoundException")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.io.IOException")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    NopStmt jumpTarget2= Jimple.v().newNopStmt();    
    NopStmt jumpTarget3= Jimple.v().newNopStmt();    
    units.add(Jimple.v().newNopStmt());    
    Local lhs0 = localByName(b,"temp$0");    
    RefType type0 = RefType.v("java.io.FileInputStream");    
    Value rhs0 = Jimple.v().newNewExpr(type0);    
    units.add(Jimple.v().newAssignStmt(lhs0,rhs0));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.FileInputStream"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs1 = localByName(b,"fis");    
    Local rhs1 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs1));    
    Local lhs2 = localByName(b,"temp$1");    
    RefType type1 = RefType.v("java.util.Properties");    
    Value rhs2 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs2));    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs3 = localByName(b,"properties");    
    Local rhs3 = localByName(b,"temp$1");    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs3));    
    {    
      Local base = localByName(b,"properties");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.io.InputStream");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"load",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs4 = localByName(b,"temp$2");    
    {    
      Local base = localByName(b,"properties");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"getProperty",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs4));    
    Local lhs5 = localByName(b,"dbType");    
    Local rhs5 = localByName(b,"temp$2");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs5));    
    {    
      Local base = localByName(b,"properties");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Hashtable"),"clear",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    {    
      Local base = localByName(b,"fis");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.FileInputStream"),"close",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs6 = localByName(b,"temp$3");    
    RefType type2 = RefType.v("java.io.FileInputStream");    
    Value rhs6 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs6));    
    Local lhs7 = localByName(b,"temp$4");    
    RefType type3 = RefType.v("java.lang.StringBuffer");    
    Value rhs7 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs7));    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs8 = localByName(b,"temp$5");    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs8));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.FileInputStream"),"<init>",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    Local lhs9 = localByName(b,"fis");    
    Local rhs9 = localByName(b,"temp$3");    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs9));    
    {    
      Local base = localByName(b,"properties");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.io.InputStream");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"load",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    Local lhs10 = localByName(b,"temp$6");    
    RefType type4 = RefType.v("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");    
    Value rhs10 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs10));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"<init>",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    Local lhs11 = localByName(b,"cpds");    
    Local rhs11 = localByName(b,"temp$6");    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs11));    
    {    
      Local base = localByName(b,"cpds");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setMaxActive",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    Local lhs12 = localByName(b,"temp$7");    
    {    
      Local base = localByName(b,"properties");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"getProperty",parameterTypes,returnType,false);      
      Value rhs12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs12));    
    {    
      Local base = localByName(b,"cpds");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setUrl",parameterTypes,returnType,false);      
      Value ie13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie13));    
    Local lhs13 = localByName(b,"temp$8");    
    {    
      Local base = localByName(b,"properties");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"getProperty",parameterTypes,returnType,false);      
      Value rhs13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs13));    
    {    
      Local base = localByName(b,"cpds");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setUser",parameterTypes,returnType,false);      
      Value ie14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie14));    
    Local lhs14 = localByName(b,"temp$9");    
    {    
      Local base = localByName(b,"properties");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Properties"),"getProperty",parameterTypes,returnType,false);      
      Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs14));    
    {    
      Local base = localByName(b,"cpds");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS"),"setPassword",parameterTypes,returnType,false);      
      Value ie15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie15));    
    Local lhs15 = localByName(b,"temp$10");    
    RefType type5 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");    
    Value rhs15 = Jimple.v().newNewExpr(type5);    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs15));    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"<init>",parameterTypes,returnType,false);      
      Value ie16 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie16));    
    Local lhs16 = localByName(b,"tds");    
    Local rhs16 = localByName(b,"temp$10");    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs16));    
    {    
      Local base = localByName(b,"tds");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("javax.sql.ConnectionPoolDataSource");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setConnectionPoolDataSource",parameterTypes,returnType,false);      
      Value ie17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie17));    
    {    
      Local base = localByName(b,"tds");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"setMaxActive",parameterTypes,returnType,false);      
      Value ie18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie18));    
    {    
      Local base = localByName(b,"tds");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"setMaxWait",parameterTypes,returnType,false);      
      Value ie19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie19));    
    {    
      RefType type = RefType.v("javax.sql.DataSource");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.Pool"),"ds",type,true);      Value lhs17 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs17 = localByName(b,"tds");    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs17));    
    {    
      Local base = localByName(b,"properties");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Hashtable"),"clear",parameterTypes,returnType,false);      
      Value ie20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie20));    
    {    
      Local base = localByName(b,"fis");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.FileInputStream"),"close",parameterTypes,returnType,false);      
      Value ie21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie21));    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target0));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs18 = localByName(b,"e");    
    Value idRef0 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs18,idRef0));    
    {    
      Local base = localByName(b,"e");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"printStackTrace",parameterTypes,returnType,false);      
      Value ie22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie22));    
    units.add(Jimple.v().newNopStmt());    
    Unit target1=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs19 = localByName(b,"e");    
    Value idRef1 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs19,idRef1));    
    {    
      Local base = localByName(b,"e");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"printStackTrace",parameterTypes,returnType,false);      
      Value ie23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie23));    
    units.add(Jimple.v().newNopStmt());    
    Unit target2=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target2));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs20 = localByName(b,"e");    
    Value idRef2 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs20,idRef2));    
    {    
      Local base = localByName(b,"e");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"printStackTrace",parameterTypes,returnType,false);      
      Value ie24 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie24));    
    units.add(Jimple.v().newNopStmt());    
    Unit target3=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target3));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("getConnection",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("javax.sql.DataSource")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.sql.Connection")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("javax.sql.DataSource");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.Pool"),"ds",type,true);      Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs0,rhs0));    
    Local lhs1 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.sql.Connection");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.sql.DataSource"),"getConnection",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs1));    
    Local retVal0 = localByName(b,"temp$1");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.databaseUtils.Pool")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.databaseUtils.Pool");    
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
