import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class com_webc_databaseUtils_DataBaseManager_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("com.webc.databaseUtils.DataBaseManager");    
    c.setApplicationClass();    
    Scene.v().addClass(c);    
    createMethod0(c);    
    createMethod1(c);    
    createMethod2(c);    
    createMethod3(c);    
    createMethod4(c);    
    createMethod5(c);    
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("dbNname", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("dbUser", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("dbPassword", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"dbNname");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"dbUser");    
    RefType paramType1 = RefType.v("java.lang.String");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"dbPassword");    
    RefType paramType2 = RefType.v("java.lang.String");    
    int number2=2;    
    Value idRef3 = Jimple.v().newParameterRef(paramType2, number2);    
    units.add(Jimple.v().newIdentityStmt(lhs3,idRef3));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"dbName",type,false);      Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"dbNname");    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs0));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"dbUser",type,false);      Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs1 = localByName(b,"dbUser");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs1));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"dbPassword",type,false);      Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs2 = localByName(b,"dbPassword");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("_connect",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("dbNname", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("dbUser", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("dbPassword", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"dbNname");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"dbUser");    
    RefType paramType1 = RefType.v("java.lang.String");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"dbPassword");    
    RefType paramType2 = RefType.v("java.lang.String");    
    int number2=2;    
    Value idRef3 = Jimple.v().newParameterRef(paramType2, number2);    
    units.add(Jimple.v().newIdentityStmt(lhs3,idRef3));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"dbName",type,false);      Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"dbNname");    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs0));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"dbUser",type,false);      Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs1 = localByName(b,"dbUser");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs1));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"dbPassword",type,false);      Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs2 = localByName(b,"dbPassword");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("storePageContent",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("Url", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("text", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("conn", RefType.v("java.sql.Connection")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.sql.Connection")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("r", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("E", RefType.v("java.sql.SQLException")));    
    locals.add(Jimple.v().newLocal("temp$13", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$14", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$15", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$16", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$17", RefType.v("java.util.logging.Logger")));    
    locals.add(Jimple.v().newLocal("temp$18", RefType.v("java.util.logging.Level")));    
    locals.add(Jimple.v().newLocal("temp$19", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$20", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$21", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$22", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$23", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$24", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$25", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$26", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$27", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$28", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$29", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$30", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("temp$31", RefType.v("java.lang.Throwable")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
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
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"Url");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"text");    
    RefType paramType1 = RefType.v("java.lang.String");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"conn");    
    Value rhs0 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs0));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs4 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs1 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs1));    
    Local lhs5 = localByName(b,"temp$1");    
    RefType type1 = RefType.v("java.lang.StringBuffer");    
    Value rhs2 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs2));    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    Local lhs6 = localByName(b,"temp$2");    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs3));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"print",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    Local lhs7 = localByName(b,"temp$3");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.sql.Connection");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.databaseUtils.Pool"),"getConnection",parameterTypes,returnType,true);      
      Value rhs4 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs4));    
    Local lhs8 = localByName(b,"conn");    
    Local rhs5 = localByName(b,"temp$3");    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs5));    
    Local lhs9 = localByName(b,"temp$4");    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.sql.CallableStatement");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"prepareCall",parameterTypes,returnType,false);      
      Value rhs6 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs6));    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value lhs10 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs7 = localByName(b,"temp$4");    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs7));    
    Local lhs11 = localByName(b,"temp$5");    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value rhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs8));    
    {    
      Local base = localByName(b,"temp$5");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.PreparedStatement"),"setString",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    Local lhs12 = localByName(b,"temp$6");    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value rhs9 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs9));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.PreparedStatement"),"setString",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs13 = localByName(b,"temp$7");    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value rhs10 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs10));    
    Local lhs14 = localByName(b,"temp$8");    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.PreparedStatement"),"execute",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs11));    
    Local lhs15 = localByName(b,"r");    
    Local rhs12 = localByName(b,"temp$8");    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs12));    
    Local lhs16 = localByName(b,"temp$9");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs13 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs13));    
    Local lhs17 = localByName(b,"temp$10");    
    RefType type2 = RefType.v("java.lang.StringBuffer");    
    Value rhs14 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs14));    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = BooleanType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    Local lhs18 = localByName(b,"temp$11");    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs15));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    Local lhs19 = localByName(b,"temp$12");    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value rhs16 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs16));    
    {    
      Local base = localByName(b,"temp$12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Statement"),"close",parameterTypes,returnType,false);      
      Value ie13 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie13));    
    units.add(Jimple.v().newNopStmt());    
    Local left0 = localByName(b,"conn");    
    Value right0 = NullConstant.v();    
    Value condition0 = Jimple.v().newNeExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget3;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie14 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie14));    
    Unit target2=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target2));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs20 = localByName(b,"e");    
    Value idRef3 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs20,idRef3));    
    units.add(Jimple.v().newNopStmt());    
    Unit target3=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target3));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget3);    
    units.add(Jimple.v().newNopStmt());    
    Unit target4=jumpTarget14;    
    units.add(Jimple.v().newGotoStmt(target4));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs21 = localByName(b,"E");    
    Value idRef4 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs21,idRef4));    
    Local lhs22 = localByName(b,"temp$14");    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"class$com$webc$databaseUtils$DataBaseManager",type,true);      Value rhs17 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs17));    
    Local left1 = localByName(b,"temp$14");    
    Value right1 = NullConstant.v();    
    Value condition1 = Jimple.v().newNeExpr(left1,right1);    
    Unit target5=jumpTarget4;    
    units.add(Jimple.v().newIfStmt(condition1,target5));    
    Local lhs23 = localByName(b,"temp$15");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"class$",parameterTypes,returnType,true);      
      Value rhs18 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs18));    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"class$com$webc$databaseUtils$DataBaseManager",type,true);      Value lhs24 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs19 = localByName(b,"temp$15");    
    units.add(Jimple.v().newAssignStmt(lhs24,rhs19));    
    Local lhs25 = localByName(b,"temp$13");    
    Local rhs20 = localByName(b,"temp$15");    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs20));    
    Unit target6=jumpTarget5;    
    units.add(Jimple.v().newGotoStmt(target6));    
    units.add(jumpTarget4);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs26 = localByName(b,"temp$13");    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"class$com$webc$databaseUtils$DataBaseManager",type,true);      Value rhs21 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs21));    
    units.add(jumpTarget5);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs27 = localByName(b,"temp$16");    
    {    
      Local base = localByName(b,"temp$13");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);      
      Value rhs22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs22));    
    Local lhs28 = localByName(b,"temp$17");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.util.logging.Logger");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.logging.Logger"),"getLogger",parameterTypes,returnType,true);      
      Value rhs23 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs28,rhs23));    
    Local lhs29 = localByName(b,"temp$18");    
    {    
      RefType type = RefType.v("java.util.logging.Level");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.util.logging.Level"),"SEVERE",type,true);      Value rhs24 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs29,rhs24));    
    {    
      Local base = localByName(b,"temp$17");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.util.logging.Level");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("java.lang.Throwable");      
      parameterTypes.add(type2);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.logging.Logger"),"log",parameterTypes,returnType,false);      
      Value ie15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie15));    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"printStackTrace",parameterTypes,returnType,false);      
      Value ie16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie16));    
    Local lhs30 = localByName(b,"temp$19");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs25 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs30,rhs25));    
    Local lhs31 = localByName(b,"temp$20");    
    RefType type3 = RefType.v("java.lang.StringBuffer");    
    Value rhs26 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs31,rhs26));    
    {    
      Local base = localByName(b,"temp$20");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie17 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie17));    
    {    
      Local base = localByName(b,"temp$20");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie18));    
    Local lhs32 = localByName(b,"temp$21");    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"getMessage",parameterTypes,returnType,false);      
      Value rhs27 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs32,rhs27));    
    {    
      Local base = localByName(b,"temp$20");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie19));    
    Local lhs33 = localByName(b,"temp$22");    
    {    
      Local base = localByName(b,"temp$20");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs28 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs33,rhs28));    
    {    
      Local base = localByName(b,"temp$19");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie20));    
    Local lhs34 = localByName(b,"temp$23");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs29 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs34,rhs29));    
    Local lhs35 = localByName(b,"temp$24");    
    RefType type4 = RefType.v("java.lang.StringBuffer");    
    Value rhs30 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs35,rhs30));    
    {    
      Local base = localByName(b,"temp$24");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie21 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie21));    
    {    
      Local base = localByName(b,"temp$24");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie22));    
    Local lhs36 = localByName(b,"temp$25");    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"getSQLState",parameterTypes,returnType,false);      
      Value rhs31 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs36,rhs31));    
    {    
      Local base = localByName(b,"temp$24");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie23));    
    Local lhs37 = localByName(b,"temp$26");    
    {    
      Local base = localByName(b,"temp$24");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs32 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs37,rhs32));    
    {    
      Local base = localByName(b,"temp$23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie24 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie24));    
    Local lhs38 = localByName(b,"temp$27");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs33 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs38,rhs33));    
    Local lhs39 = localByName(b,"temp$28");    
    RefType type5 = RefType.v("java.lang.StringBuffer");    
    Value rhs34 = Jimple.v().newNewExpr(type5);    
    units.add(Jimple.v().newAssignStmt(lhs39,rhs34));    
    {    
      Local base = localByName(b,"temp$28");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie25 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie25));    
    {    
      Local base = localByName(b,"temp$28");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie26 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie26));    
    Local lhs40 = localByName(b,"temp$29");    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"getErrorCode",parameterTypes,returnType,false);      
      Value rhs35 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs40,rhs35));    
    {    
      Local base = localByName(b,"temp$28");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie27 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie27));    
    Local lhs41 = localByName(b,"temp$30");    
    {    
      Local base = localByName(b,"temp$28");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs36 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs41,rhs36));    
    {    
      Local base = localByName(b,"temp$27");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie28 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie28));    
    units.add(Jimple.v().newNopStmt());    
    Local left2 = localByName(b,"conn");    
    Value right2 = NullConstant.v();    
    Value condition2 = Jimple.v().newNeExpr(left2,right2);    
    Unit target7=jumpTarget6;    
    units.add(Jimple.v().newIfStmt(condition2,target7));    
    Unit target8=jumpTarget9;    
    units.add(Jimple.v().newGotoStmt(target8));    
    units.add(jumpTarget6);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie29 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie29));    
    Unit target9=jumpTarget7;    
    units.add(Jimple.v().newGotoStmt(target9));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs42 = localByName(b,"e");    
    Value idRef5 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs42,idRef5));    
    units.add(Jimple.v().newNopStmt());    
    Unit target10=jumpTarget7;    
    units.add(Jimple.v().newGotoStmt(target10));    
    units.add(jumpTarget7);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget9);    
    units.add(Jimple.v().newNopStmt());    
    Unit target11=jumpTarget14;    
    units.add(Jimple.v().newGotoStmt(target11));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs43 = localByName(b,"temp$31");    
    Value idRef6 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs43,idRef6));    
    Local left3 = localByName(b,"conn");    
    Value right3 = NullConstant.v();    
    Value condition3 = Jimple.v().newNeExpr(left3,right3);    
    Unit target12=jumpTarget10;    
    units.add(Jimple.v().newIfStmt(condition3,target12));    
    Unit target13=jumpTarget13;    
    units.add(Jimple.v().newGotoStmt(target13));    
    units.add(jumpTarget10);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie30 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie30));    
    Unit target14=jumpTarget11;    
    units.add(Jimple.v().newGotoStmt(target14));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs44 = localByName(b,"e");    
    Value idRef7 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs44,idRef7));    
    units.add(Jimple.v().newNopStmt());    
    Unit target15=jumpTarget11;    
    units.add(Jimple.v().newGotoStmt(target15));    
    units.add(jumpTarget11);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget13);    
    units.add(Jimple.v().newNopStmt());    
    Local op0 = localByName(b,"temp$31");    
    units.add(Jimple.v().newThrowStmt(op0));    
    units.add(jumpTarget14);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod3(SootClass c) {  
    SootMethod m = new SootMethod("storeLinkPair",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("urlSrc", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("urlDest", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("conn", RefType.v("java.sql.Connection")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.sql.Connection")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("r", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.sql.CallableStatement")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("E", RefType.v("java.sql.SQLException")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$13", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$14", RefType.v("java.util.logging.Logger")));    
    locals.add(Jimple.v().newLocal("temp$15", RefType.v("java.util.logging.Level")));    
    locals.add(Jimple.v().newLocal("temp$16", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$17", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$18", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$19", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$20", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$21", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$22", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$23", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$24", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$25", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$26", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$27", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("temp$28", RefType.v("java.lang.Throwable")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
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
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"urlSrc");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"urlDest");    
    RefType paramType1 = RefType.v("java.lang.String");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"conn");    
    Value rhs0 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs0));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs4 = localByName(b,"temp$0");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.sql.Connection");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.databaseUtils.Pool"),"getConnection",parameterTypes,returnType,true);      
      Value rhs1 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs1));    
    Local lhs5 = localByName(b,"conn");    
    Local rhs2 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs2));    
    Local lhs6 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.sql.CallableStatement");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"prepareCall",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs3));    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value lhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs4 = localByName(b,"temp$1");    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs4));    
    Local lhs8 = localByName(b,"temp$2");    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value rhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs5));    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.PreparedStatement"),"setString",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs9 = localByName(b,"temp$3");    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value rhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs6));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.PreparedStatement"),"setString",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs10 = localByName(b,"temp$4");    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value rhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs7));    
    Local lhs11 = localByName(b,"temp$5");    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.PreparedStatement"),"execute",parameterTypes,returnType,false);      
      Value rhs8 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs8));    
    Local lhs12 = localByName(b,"r");    
    Local rhs9 = localByName(b,"temp$5");    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs9));    
    Local lhs13 = localByName(b,"temp$6");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs10 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs10));    
    Local lhs14 = localByName(b,"temp$7");    
    RefType type1 = RefType.v("java.lang.StringBuffer");    
    Value rhs11 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs11));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
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
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = BooleanType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs15 = localByName(b,"temp$8");    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs12));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    Local lhs16 = localByName(b,"temp$9");    
    {    
      RefType type = RefType.v("java.sql.CallableStatement");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"callableStmt",type,false);      Value rhs13 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs13));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Statement"),"close",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    units.add(Jimple.v().newNopStmt());    
    Local left0 = localByName(b,"conn");    
    Value right0 = NullConstant.v();    
    Value condition0 = Jimple.v().newNeExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget3;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    Unit target2=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target2));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs17 = localByName(b,"e");    
    Value idRef3 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs17,idRef3));    
    units.add(Jimple.v().newNopStmt());    
    Unit target3=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target3));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget3);    
    units.add(Jimple.v().newNopStmt());    
    Unit target4=jumpTarget14;    
    units.add(Jimple.v().newGotoStmt(target4));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs18 = localByName(b,"E");    
    Value idRef4 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs18,idRef4));    
    Local lhs19 = localByName(b,"temp$11");    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"class$com$webc$databaseUtils$DataBaseManager",type,true);      Value rhs14 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs14));    
    Local left1 = localByName(b,"temp$11");    
    Value right1 = NullConstant.v();    
    Value condition1 = Jimple.v().newNeExpr(left1,right1);    
    Unit target5=jumpTarget4;    
    units.add(Jimple.v().newIfStmt(condition1,target5));    
    Local lhs20 = localByName(b,"temp$12");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"class$",parameterTypes,returnType,true);      
      Value rhs15 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs15));    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"class$com$webc$databaseUtils$DataBaseManager",type,true);      Value lhs21 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs16 = localByName(b,"temp$12");    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs16));    
    Local lhs22 = localByName(b,"temp$10");    
    Local rhs17 = localByName(b,"temp$12");    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs17));    
    Unit target6=jumpTarget5;    
    units.add(Jimple.v().newGotoStmt(target6));    
    units.add(jumpTarget4);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs23 = localByName(b,"temp$10");    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"class$com$webc$databaseUtils$DataBaseManager",type,true);      Value rhs18 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs18));    
    units.add(jumpTarget5);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs24 = localByName(b,"temp$13");    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);      
      Value rhs19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs24,rhs19));    
    Local lhs25 = localByName(b,"temp$14");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.util.logging.Logger");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.logging.Logger"),"getLogger",parameterTypes,returnType,true);      
      Value rhs20 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs20));    
    Local lhs26 = localByName(b,"temp$15");    
    {    
      RefType type = RefType.v("java.util.logging.Level");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.util.logging.Level"),"SEVERE",type,true);      Value rhs21 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs21));    
    {    
      Local base = localByName(b,"temp$14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.util.logging.Level");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("java.lang.Throwable");      
      parameterTypes.add(type2);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.logging.Logger"),"log",parameterTypes,returnType,false);      
      Value ie13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie13));    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"printStackTrace",parameterTypes,returnType,false);      
      Value ie14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie14));    
    Local lhs27 = localByName(b,"temp$16");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs22 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs22));    
    Local lhs28 = localByName(b,"temp$17");    
    RefType type2 = RefType.v("java.lang.StringBuffer");    
    Value rhs23 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs28,rhs23));    
    {    
      Local base = localByName(b,"temp$17");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie15 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie15));    
    {    
      Local base = localByName(b,"temp$17");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie16));    
    Local lhs29 = localByName(b,"temp$18");    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"getMessage",parameterTypes,returnType,false);      
      Value rhs24 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs29,rhs24));    
    {    
      Local base = localByName(b,"temp$17");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie17));    
    Local lhs30 = localByName(b,"temp$19");    
    {    
      Local base = localByName(b,"temp$17");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs25 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs30,rhs25));    
    {    
      Local base = localByName(b,"temp$16");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie18));    
    Local lhs31 = localByName(b,"temp$20");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs26 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs31,rhs26));    
    Local lhs32 = localByName(b,"temp$21");    
    RefType type3 = RefType.v("java.lang.StringBuffer");    
    Value rhs27 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs32,rhs27));    
    {    
      Local base = localByName(b,"temp$21");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie19 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie19));    
    {    
      Local base = localByName(b,"temp$21");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie20));    
    Local lhs33 = localByName(b,"temp$22");    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"getSQLState",parameterTypes,returnType,false);      
      Value rhs28 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs33,rhs28));    
    {    
      Local base = localByName(b,"temp$21");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie21));    
    Local lhs34 = localByName(b,"temp$23");    
    {    
      Local base = localByName(b,"temp$21");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs29 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs34,rhs29));    
    {    
      Local base = localByName(b,"temp$20");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie22));    
    Local lhs35 = localByName(b,"temp$24");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs30 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs35,rhs30));    
    Local lhs36 = localByName(b,"temp$25");    
    RefType type4 = RefType.v("java.lang.StringBuffer");    
    Value rhs31 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs36,rhs31));    
    {    
      Local base = localByName(b,"temp$25");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie23 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie23));    
    {    
      Local base = localByName(b,"temp$25");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie24 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie24));    
    Local lhs37 = localByName(b,"temp$26");    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"getErrorCode",parameterTypes,returnType,false);      
      Value rhs32 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs37,rhs32));    
    {    
      Local base = localByName(b,"temp$25");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie25 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie25));    
    Local lhs38 = localByName(b,"temp$27");    
    {    
      Local base = localByName(b,"temp$25");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs33 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs38,rhs33));    
    {    
      Local base = localByName(b,"temp$24");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie26 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie26));    
    units.add(Jimple.v().newNopStmt());    
    Local left2 = localByName(b,"conn");    
    Value right2 = NullConstant.v();    
    Value condition2 = Jimple.v().newNeExpr(left2,right2);    
    Unit target7=jumpTarget6;    
    units.add(Jimple.v().newIfStmt(condition2,target7));    
    Unit target8=jumpTarget9;    
    units.add(Jimple.v().newGotoStmt(target8));    
    units.add(jumpTarget6);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie27 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie27));    
    Unit target9=jumpTarget7;    
    units.add(Jimple.v().newGotoStmt(target9));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs39 = localByName(b,"e");    
    Value idRef5 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs39,idRef5));    
    units.add(Jimple.v().newNopStmt());    
    Unit target10=jumpTarget7;    
    units.add(Jimple.v().newGotoStmt(target10));    
    units.add(jumpTarget7);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget9);    
    units.add(Jimple.v().newNopStmt());    
    Unit target11=jumpTarget14;    
    units.add(Jimple.v().newGotoStmt(target11));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs40 = localByName(b,"temp$28");    
    Value idRef6 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs40,idRef6));    
    Local left3 = localByName(b,"conn");    
    Value right3 = NullConstant.v();    
    Value condition3 = Jimple.v().newNeExpr(left3,right3);    
    Unit target12=jumpTarget10;    
    units.add(Jimple.v().newIfStmt(condition3,target12));    
    Unit target13=jumpTarget13;    
    units.add(Jimple.v().newGotoStmt(target13));    
    units.add(jumpTarget10);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie28 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie28));    
    Unit target14=jumpTarget11;    
    units.add(Jimple.v().newGotoStmt(target14));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs41 = localByName(b,"e");    
    Value idRef7 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs41,idRef7));    
    units.add(Jimple.v().newNopStmt());    
    Unit target15=jumpTarget11;    
    units.add(Jimple.v().newGotoStmt(target15));    
    units.add(jumpTarget11);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget13);    
    units.add(Jimple.v().newNopStmt());    
    Local op0 = localByName(b,"temp$28");    
    units.add(Jimple.v().newThrowStmt(op0));    
    units.add(jumpTarget14);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod4(SootClass c) {  
    SootMethod m = new SootMethod("executeInsertQuery",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("myQuery", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("conn", RefType.v("java.sql.Connection")));    
    locals.add(Jimple.v().newLocal("st", RefType.v("java.sql.PreparedStatement")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.sql.PreparedStatement")));    
    locals.add(Jimple.v().newLocal("result", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("E", RefType.v("java.sql.SQLException")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$13", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$14", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$15", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$16", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("temp$17", RefType.v("java.lang.Throwable")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
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
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"myQuery");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"conn");    
    Value rhs0 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs3 = localByName(b,"temp$0");    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.sql.PreparedStatement");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"prepareStatement",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs1));    
    Local lhs4 = localByName(b,"st");    
    Local rhs2 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs2));    
    Local lhs5 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"st");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.PreparedStatement"),"executeUpdate",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs3));    
    Local lhs6 = localByName(b,"result");    
    Local rhs4 = localByName(b,"temp$1");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs4));    
    Local lhs7 = localByName(b,"temp$2");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs5 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs5));    
    Local lhs8 = localByName(b,"temp$3");    
    RefType type1 = RefType.v("java.lang.StringBuffer");    
    Value rhs6 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs6));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs9 = localByName(b,"temp$4");    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs7));    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    units.add(Jimple.v().newNopStmt());    
    Local left0 = localByName(b,"conn");    
    Value right0 = NullConstant.v();    
    Value condition0 = Jimple.v().newNeExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget3;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    Unit target2=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target2));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs10 = localByName(b,"e");    
    Value idRef2 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs10,idRef2));    
    units.add(Jimple.v().newNopStmt());    
    Unit target3=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target3));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget3);    
    units.add(Jimple.v().newNopStmt());    
    Unit target4=jumpTarget12;    
    units.add(Jimple.v().newGotoStmt(target4));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs11 = localByName(b,"E");    
    Value idRef3 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs11,idRef3));    
    Local lhs12 = localByName(b,"temp$5");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs8 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs8));    
    Local lhs13 = localByName(b,"temp$6");    
    RefType type2 = RefType.v("java.lang.StringBuffer");    
    Value rhs9 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs9));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs14 = localByName(b,"temp$7");    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"getMessage",parameterTypes,returnType,false);      
      Value rhs10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs10));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    Local lhs15 = localByName(b,"temp$8");    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs11));    
    {    
      Local base = localByName(b,"temp$5");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    Local lhs16 = localByName(b,"temp$9");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs12 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs12));    
    Local lhs17 = localByName(b,"temp$10");    
    RefType type3 = RefType.v("java.lang.StringBuffer");    
    Value rhs13 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs13));    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    Local lhs18 = localByName(b,"temp$11");    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"getSQLState",parameterTypes,returnType,false);      
      Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs14));    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie13));    
    Local lhs19 = localByName(b,"temp$12");    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs15));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie14));    
    Local lhs20 = localByName(b,"temp$13");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs16 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs16));    
    Local lhs21 = localByName(b,"temp$14");    
    RefType type4 = RefType.v("java.lang.StringBuffer");    
    Value rhs17 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs17));    
    {    
      Local base = localByName(b,"temp$14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie15 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie15));    
    {    
      Local base = localByName(b,"temp$14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie16));    
    Local lhs22 = localByName(b,"temp$15");    
    {    
      Local base = localByName(b,"E");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.SQLException"),"getErrorCode",parameterTypes,returnType,false);      
      Value rhs18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs18));    
    {    
      Local base = localByName(b,"temp$14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie17));    
    Local lhs23 = localByName(b,"temp$16");    
    {    
      Local base = localByName(b,"temp$14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs19));    
    {    
      Local base = localByName(b,"temp$13");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie18));    
    units.add(Jimple.v().newNopStmt());    
    Local left1 = localByName(b,"conn");    
    Value right1 = NullConstant.v();    
    Value condition1 = Jimple.v().newNeExpr(left1,right1);    
    Unit target5=jumpTarget4;    
    units.add(Jimple.v().newIfStmt(condition1,target5));    
    Unit target6=jumpTarget7;    
    units.add(Jimple.v().newGotoStmt(target6));    
    units.add(jumpTarget4);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie19 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie19));    
    Unit target7=jumpTarget5;    
    units.add(Jimple.v().newGotoStmt(target7));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs24 = localByName(b,"e");    
    Value idRef4 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs24,idRef4));    
    units.add(Jimple.v().newNopStmt());    
    Unit target8=jumpTarget5;    
    units.add(Jimple.v().newGotoStmt(target8));    
    units.add(jumpTarget5);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget7);    
    units.add(Jimple.v().newNopStmt());    
    Unit target9=jumpTarget12;    
    units.add(Jimple.v().newGotoStmt(target9));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs25 = localByName(b,"temp$17");    
    Value idRef5 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs25,idRef5));    
    Local left2 = localByName(b,"conn");    
    Value right2 = NullConstant.v();    
    Value condition2 = Jimple.v().newNeExpr(left2,right2);    
    Unit target10=jumpTarget8;    
    units.add(Jimple.v().newIfStmt(condition2,target10));    
    Unit target11=jumpTarget11;    
    units.add(Jimple.v().newGotoStmt(target11));    
    units.add(jumpTarget8);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"conn");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.sql.Connection"),"close",parameterTypes,returnType,false);      
      Value ie20 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie20));    
    Unit target12=jumpTarget9;    
    units.add(Jimple.v().newGotoStmt(target12));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs26 = localByName(b,"e");    
    Value idRef6 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs26,idRef6));    
    units.add(Jimple.v().newNopStmt());    
    Unit target13=jumpTarget9;    
    units.add(Jimple.v().newGotoStmt(target13));    
    units.add(jumpTarget9);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget11);    
    units.add(Jimple.v().newNopStmt());    
    Local op0 = localByName(b,"temp$17");    
    units.add(Jimple.v().newThrowStmt(op0));    
    units.add(jumpTarget12);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod5(SootClass c) {  
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
