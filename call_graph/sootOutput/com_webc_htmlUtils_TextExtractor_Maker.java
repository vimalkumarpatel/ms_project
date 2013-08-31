import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class com_webc_htmlUtils_TextExtractor_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("com.webc.htmlUtils.TextExtractor");    
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
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    locals.add(Jimple.v().newLocal("InpUrl", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("htmlpage", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("dbman", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.TextExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"InpUrl");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"htmlpage");    
    RefType paramType1 = RefType.v("java.lang.String");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"dbman");    
    RefType paramType2 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
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
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"htmlpage",type,false);      Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"htmlpage");    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs0));    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"dbman",type,false);      Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs1 = localByName(b,"dbman");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs1));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"InpUrl",type,false);      Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs2 = localByName(b,"InpUrl");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("extracttext",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$13", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$14", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$15", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$16", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$17", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$18", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$19", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$20", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$21", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$22", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("temp$23", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$24", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$25", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$26", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.TextExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmlpage",parameterTypes,returnType,false);      
      Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"replaceAll",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"setHtmltext",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs3 = localByName(b,"temp$2");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmlpage",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"temp$3");    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"replaceAll",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"setHtmltext",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs5 = localByName(b,"temp$4");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmlpage",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    Local lhs6 = localByName(b,"temp$5");    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"replaceAll",parameterTypes,returnType,false);      
      Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"setHtmltext",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    Local lhs7 = localByName(b,"temp$6");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmlpage",parameterTypes,returnType,false);      
      Value rhs6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    Local lhs8 = localByName(b,"temp$7");    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"replaceAll",parameterTypes,returnType,false);      
      Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"setHtmltext",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    Local lhs9 = localByName(b,"temp$8");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmlpage",parameterTypes,returnType,false);      
      Value rhs8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs8));    
    Local lhs10 = localByName(b,"temp$9");    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"replaceAll",parameterTypes,returnType,false);      
      Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs9));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"setHtmltext",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs11 = localByName(b,"temp$10");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmltext",parameterTypes,returnType,false);      
      Value rhs10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs10));    
    Local lhs12 = localByName(b,"temp$11");    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"replaceAll",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs11));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"setHtmltext",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    Local lhs13 = localByName(b,"temp$12");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmltext",parameterTypes,returnType,false);      
      Value rhs12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs12));    
    Local lhs14 = localByName(b,"temp$13");    
    {    
      Local base = localByName(b,"temp$12");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"replaceAll",parameterTypes,returnType,false);      
      Value rhs13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs13));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"setHtmltext",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    Local lhs15 = localByName(b,"temp$14");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmltext",parameterTypes,returnType,false);      
      Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs14));    
    Local lhs16 = localByName(b,"temp$15");    
    {    
      Local base = localByName(b,"temp$14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"replaceAll",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs15));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"setHtmltext",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    Local lhs17 = localByName(b,"temp$16");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmltext",parameterTypes,returnType,false);      
      Value rhs16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs16));    
    Local lhs18 = localByName(b,"temp$17");    
    {    
      Local base = localByName(b,"temp$16");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"replaceAll",parameterTypes,returnType,false);      
      Value rhs17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs17));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"setHtmltext",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs19 = localByName(b,"temp$18");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs18 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs18));    
    {    
      Local base = localByName(b,"temp$18");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    Local lhs20 = localByName(b,"temp$19");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs19 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs19));    
    Local lhs21 = localByName(b,"temp$20");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"getHtmltext",parameterTypes,returnType,false);      
      Value rhs20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs20));    
    {    
      Local base = localByName(b,"temp$19");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    Local lhs22 = localByName(b,"temp$21");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs21 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs21));    
    {    
      Local base = localByName(b,"temp$21");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    Local lhs23 = localByName(b,"temp$22");    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"dbman",type,false);      Value rhs22 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs22));    
    Local lhs24 = localByName(b,"temp$23");    
    RefType type1 = RefType.v("java.lang.StringBuffer");    
    Value rhs23 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs24,rhs23));    
    {    
      Local base = localByName(b,"temp$23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    {    
      Local base = localByName(b,"temp$23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie13));    
    Local lhs25 = localByName(b,"temp$24");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"InpUrl",type,false);      Value rhs24 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs24));    
    {    
      Local base = localByName(b,"temp$23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie14));    
    {    
      Local base = localByName(b,"temp$23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie15));    
    Local lhs26 = localByName(b,"temp$25");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"htmltext",type,false);      Value rhs25 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs25));    
    {    
      Local base = localByName(b,"temp$23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie16));    
    {    
      Local base = localByName(b,"temp$23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie17));    
    Local lhs27 = localByName(b,"temp$26");    
    {    
      Local base = localByName(b,"temp$23");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs26 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs26));    
    {    
      Local base = localByName(b,"temp$22");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"executeInsertQuery",parameterTypes,returnType,false);      
      Value ie18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie18));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("getHtmlpage",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.TextExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"htmlpage",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod3(SootClass c) {  
    SootMethod m = new SootMethod("setHtmlpage",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    locals.add(Jimple.v().newLocal("htmlpage", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.TextExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"htmlpage");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"htmlpage",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"htmlpage");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod4(SootClass c) {  
    SootMethod m = new SootMethod("getHtmltext",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.TextExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"htmltext",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod5(SootClass c) {  
    SootMethod m = new SootMethod("setHtmltext",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    locals.add(Jimple.v().newLocal("htmltext", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.TextExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"htmltext");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"htmltext",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"htmltext");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod6(SootClass c) {  
    SootMethod m = new SootMethod("getDbman",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.TextExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"dbman",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod7(SootClass c) {  
    SootMethod m = new SootMethod("setDbman",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    locals.add(Jimple.v().newLocal("dbman", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.TextExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"dbman");    
    RefType paramType0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"dbman",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"dbman");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

}
