import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class com_webc_utils_Logger_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("com.webc.utils.Logger");    
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
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("<clinit>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.File")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.io.PrintWriter")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.io.File")));    
    locals.add(Jimple.v().newLocal("fw", RefType.v("java.io.FileWriter")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.io.FileWriter")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.io.File")));    
    locals.add(Jimple.v().newLocal("bw", RefType.v("java.io.BufferedWriter")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("java.io.BufferedWriter")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.io.PrintWriter")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.io.PrintWriter")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.util.Date")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.io.PrintWriter")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("java.util.Date")));    
    locals.add(Jimple.v().newLocal("temp$13", RefType.v("long")));    
    locals.add(Jimple.v().newLocal("temp$14", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"temp$0");    
    Value rhs0 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs0,rhs0));    
    {    
      RefType type = RefType.v("java.io.File");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"f",type,true);      Value lhs1 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs1 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs1));    
    Local lhs2 = localByName(b,"temp$1");    
    Value rhs2 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs2));    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value lhs3 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs3 = localByName(b,"temp$1");    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs3));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs4 = localByName(b,"temp$2");    
    RefType type0 = RefType.v("java.io.File");    
    Value rhs4 = Jimple.v().newNewExpr(type0);    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs4));    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.File"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      RefType type = RefType.v("java.io.File");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"f",type,true);      Value lhs5 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs5 = localByName(b,"temp$2");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs5));    
    Local lhs6 = localByName(b,"temp$3");    
    RefType type1 = RefType.v("java.io.FileWriter");    
    Value rhs6 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs6));    
    Local lhs7 = localByName(b,"temp$4");    
    {    
      RefType type = RefType.v("java.io.File");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"f",type,true);      Value rhs7 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs7));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.io.File");      
      parameterTypes.add(type0);      
      Type type1 = BooleanType.v();      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.FileWriter"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs8 = localByName(b,"fw");    
    Local rhs8 = localByName(b,"temp$3");    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs8));    
    Local lhs9 = localByName(b,"temp$5");    
    RefType type2 = RefType.v("java.io.BufferedWriter");    
    Value rhs9 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs9));    
    {    
      Local base = localByName(b,"temp$5");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.io.Writer");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.BufferedWriter"),"<init>",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs10 = localByName(b,"bw");    
    Local rhs10 = localByName(b,"temp$5");    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs10));    
    Local lhs11 = localByName(b,"temp$6");    
    RefType type3 = RefType.v("java.io.PrintWriter");    
    Value rhs11 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs11));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.io.Writer");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintWriter"),"<init>",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value lhs12 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs12 = localByName(b,"temp$6");    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs12));    
    Local lhs13 = localByName(b,"temp$7");    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value rhs13 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs13));    
    Local lhs14 = localByName(b,"temp$8");    
    RefType type4 = RefType.v("java.util.Date");    
    Value rhs14 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs14));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Date"),"<init>",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs15 = localByName(b,"temp$9");    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Date"),"toString",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs15));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintWriter"),"println",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    Local lhs16 = localByName(b,"temp$10");    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value rhs16 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs16));    
    Local lhs17 = localByName(b,"temp$11");    
    RefType type5 = RefType.v("java.lang.StringBuffer");    
    Value rhs17 = Jimple.v().newNewExpr(type5);    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs17));    
    {    
      Local base = localByName(b,"temp$11");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    {    
      Local base = localByName(b,"temp$11");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    Local lhs18 = localByName(b,"temp$12");    
    RefType type6 = RefType.v("java.util.Date");    
    Value rhs18 = Jimple.v().newNewExpr(type6);    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs18));    
    Local lhs19 = localByName(b,"temp$13");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = LongType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.System"),"currentTimeMillis",parameterTypes,returnType,true);      
      Value rhs19 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs19));    
    {    
      Local base = localByName(b,"temp$12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = LongType.v();      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Date"),"<init>",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    {    
      Local base = localByName(b,"temp$11");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    Local lhs20 = localByName(b,"temp$14");    
    {    
      Local base = localByName(b,"temp$11");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs20));    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintWriter"),"println",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target0));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs21 = localByName(b,"e");    
    Value idRef0 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs21,idRef0));    
    units.add(Jimple.v().newNopStmt());    
    Unit target1=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("writeLogTime",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintWriter")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.util.Date")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs0,rhs0));    
    Local lhs1 = localByName(b,"temp$1");    
    RefType type0 = RefType.v("java.lang.StringBuffer");    
    Value rhs1 = Jimple.v().newNewExpr(type0);    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs1));    
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
    Local lhs2 = localByName(b,"temp$2");    
    RefType type1 = RefType.v("java.util.Date");    
    Value rhs2 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs2));    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Date"),"<init>",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs3 = localByName(b,"temp$3");    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Date"),"toString",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs3));    
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
    Local lhs4 = localByName(b,"temp$4");    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs4));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintWriter"),"write",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("log",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("msg", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintWriter")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"msg");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef0 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.utils.Logger"),"writeLogTime",parameterTypes,returnType,true);      
      Value ie0 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.utils.Logger"),"writeLoggingClass",parameterTypes,returnType,true);      
      Value ie1 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintWriter"),"write",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod3(SootClass c) {  
    SootMethod m = new SootMethod("writeLoggingClass",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("st", RefType.v("java.lang.StackTraceElement[]")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.StackTraceElement[]")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.io.PrintWriter")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.lang.StackTraceElement[]")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.lang.StackTraceElement")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    units.add(Jimple.v().newNopStmt());    
    Local lhs0 = localByName(b,"temp$0");    
    RefType type0 = RefType.v("java.lang.Exception");    
    Value rhs0 = Jimple.v().newNewExpr(type0);    
    units.add(Jimple.v().newAssignStmt(lhs0,rhs0));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Exception"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local op0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newThrowStmt(op0));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs1 = localByName(b,"e");    
    Value idRef0 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef0));    
    Local lhs2 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"e");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType baseType = RefType.v("java.lang.StackTraceElement");      
      int numDimensions=1;      
      Type returnType = ArrayType.v(baseType, numDimensions);      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"getStackTrace",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"st");    
    Local rhs2 = localByName(b,"temp$1");    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"temp$2");    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value rhs3 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local lhs5 = localByName(b,"temp$3");    
    RefType type1 = RefType.v("java.lang.StringBuffer");    
    Value rhs4 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
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
    Local lhs6 = localByName(b,"temp$4");    
    Local rhs5 = localByName(b,"st");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    Local lhs7 = localByName(b,"temp$5");    
    Value rhs6 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    Local lhs8 = localByName(b,"temp$6");    
    Local base0 = localByName(b,"temp$4");    
    Local index0 = localByName(b,"temp$5");    
    Value rhs7 = Jimple.v().newArrayRef(base0, index0);    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    Local lhs9 = localByName(b,"temp$7");    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StackTraceElement"),"getClassName",parameterTypes,returnType,false);      
      Value rhs8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs8));    
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
    Local lhs10 = localByName(b,"temp$8");    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs9));    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintWriter"),"write",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    units.add(Jimple.v().newNopStmt());    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target0));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod4(SootClass c) {  
    SootMethod m = new SootMethod("log",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("e", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintWriter")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"e");    
    RefType paramType0 = RefType.v("java.lang.Exception");    
    int number0=0;    
    Value idRef0 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.utils.Logger"),"writeLogTime",parameterTypes,returnType,true);      
      Value ie0 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.utils.Logger"),"writeLoggingClass",parameterTypes,returnType,true);      
      Value ie1 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    {    
      Local base = localByName(b,"e");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.io.PrintWriter");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"printStackTrace",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod5(SootClass c) {  
    SootMethod m = new SootMethod("log",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    Chain<Unit> units = b.getUnits();    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod6(SootClass c) {  
    SootMethod m = new SootMethod("main",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("args", RefType.v("java.lang.String[]")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.io.File")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.io.IOException")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.io.PrintWriter")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("java.io.File")));    
    locals.add(Jimple.v().newLocal("ff", RefType.v("java.io.File")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.io.File")));    
    locals.add(Jimple.v().newLocal("fis", RefType.v("java.io.FileInputStream")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.io.FileInputStream")));    
    locals.add(Jimple.v().newLocal("dis", RefType.v("java.io.DataInputStream")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.io.DataInputStream")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    NopStmt jumpTarget2= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"args");    
    RefType baseType = RefType.v("java.lang.String");    
    int numDimensions=1;    
    Type paramType0 = ArrayType.v(baseType, numDimensions);    
    int number0=0;    
    Value idRef0 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"temp$1");    
    {    
      RefType type = RefType.v("java.io.File");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"f",type,true);      Value rhs1 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"temp$2");    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.File"),"getAbsolutePath",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
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
    Local lhs4 = localByName(b,"temp$3");    
    RefType type0 = RefType.v("java.io.IOException");    
    Value rhs3 = Jimple.v().newNewExpr(type0);    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.IOException"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Exception");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.utils.Logger"),"log",parameterTypes,returnType,true);      
      Value ie2 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs5 = localByName(b,"temp$4");    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value rhs4 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintWriter"),"close",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    Local lhs6 = localByName(b,"temp$5");    
    Value rhs5 = NullConstant.v();    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    {    
      RefType type = RefType.v("java.io.File");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"f",type,true);      Value lhs7 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs6 = localByName(b,"temp$5");    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    Local lhs8 = localByName(b,"temp$6");    
    RefType type1 = RefType.v("java.io.File");    
    Value rhs7 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.File"),"<init>",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs9 = localByName(b,"ff");    
    Local rhs8 = localByName(b,"temp$6");    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs8));    
    Local lhs10 = localByName(b,"temp$7");    
    RefType type2 = RefType.v("java.io.FileInputStream");    
    Value rhs9 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs9));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.io.File");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.FileInputStream"),"<init>",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    Local lhs11 = localByName(b,"fis");    
    Local rhs10 = localByName(b,"temp$7");    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs10));    
    Local lhs12 = localByName(b,"temp$8");    
    RefType type3 = RefType.v("java.io.DataInputStream");    
    Value rhs11 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs11));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.io.InputStream");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.DataInputStream"),"<init>",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    Local lhs13 = localByName(b,"dis");    
    Local rhs12 = localByName(b,"temp$8");    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs12));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs14 = localByName(b,"temp$9");    
    {    
      Local base = localByName(b,"dis");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.FilterInputStream"),"available",parameterTypes,returnType,false);      
      Value rhs13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs13));    
    Local left0 = localByName(b,"temp$9");    
    Value right0 = IntConstant.v(0);    
    Value condition0 = Jimple.v().newGtExpr(left0,right0);    
    Unit target0=jumpTarget1;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget2;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs15 = localByName(b,"temp$10");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs14 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs14));    
    Local lhs16 = localByName(b,"temp$11");    
    {    
      Local base = localByName(b,"dis");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.DataInputStream"),"readLine",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs15));    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    Unit target2=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target2));    
    units.add(jumpTarget2);    
    units.add(Jimple.v().newNopStmt());    
    {    
      Local base = localByName(b,"dis");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.FilterInputStream"),"close",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod7(SootClass c) {  
    SootMethod m = new SootMethod("getPrintWriter",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintWriter")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.io.PrintWriter");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.utils.Logger"),"pw",type,true);      Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs0,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod8(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.utils.Logger")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.utils.Logger");    
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
