import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class com_webc_htmlUtils_LinkExtractor_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("com.webc.htmlUtils.LinkExtractor");    
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
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("html", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("currURL", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("qm", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("dbman", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"html");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"currURL");    
    RefType paramType1 = RefType.v("java.net.URL");    
    int number1=1;    
    Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);    
    units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));    
    Local lhs3 = localByName(b,"qm");    
    RefType paramType2 = RefType.v("com.webc.utils.QueueManager");    
    int number2=2;    
    Value idRef3 = Jimple.v().newParameterRef(paramType2, number2);    
    units.add(Jimple.v().newIdentityStmt(lhs3,idRef3));    
    Local lhs4 = localByName(b,"dbman");    
    RefType paramType3 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    int number3=3;    
    Value idRef4 = Jimple.v().newParameterRef(paramType3, number3);    
    units.add(Jimple.v().newIdentityStmt(lhs4,idRef4));    
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
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"html");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs0));    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs1 = localByName(b,"currURL");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs1));    
    Local lhs7 = localByName(b,"temp$0");    
    RefType type1 = RefType.v("java.util.ArrayList");    
    Value rhs2 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs2));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value lhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs3 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs3));    
    {    
      RefType type = RefType.v("com.webc.utils.QueueManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"qm",type,false);      Value lhs9 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs4 = localByName(b,"qm");    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs4));    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"dbman",type,false);      Value lhs10 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs5 = localByName(b,"dbman");    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs5));    
    Local lhs11 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"currURL");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"toString",parameterTypes,returnType,false);      
      Value rhs6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs6));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"enlistURL",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("getarrLstURL",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.util.ArrayList")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("setarrLstURL",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("hm", RefType.v("java.util.ArrayList")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"hm");    
    RefType paramType0 = RefType.v("java.util.ArrayList");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"hm");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod3(SootClass c) {  
    SootMethod m = new SootMethod("getParentURL",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.net.URL")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod4(SootClass c) {  
    SootMethod m = new SootMethod("setParentURL",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("currURL", RefType.v("java.net.URL")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"currURL");    
    RefType paramType0 = RefType.v("java.net.URL");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"currURL");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod5(SootClass c) {  
    SootMethod m = new SootMethod("getURLcount",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"URLcount",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod6(SootClass c) {  
    SootMethod m = new SootMethod("setURLcount",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("URLcount", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"URLcount");    
    Type paramType0 = IntType.v();    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"URLcount",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"URLcount");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod7(SootClass c) {  
    SootMethod m = new SootMethod("getHtmlpage",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod8(SootClass c) {  
    SootMethod m = new SootMethod("setHtmlpage",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("htmlpage", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"htmlpage");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"htmlpage");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod9(SootClass c) {  
    SootMethod m = new SootMethod("findlinks",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("stPt", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("endPt", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("char")));    
    locals.add(Jimple.v().newLocal("temp$13", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$14", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$15", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$16", RefType.v("char")));    
    locals.add(Jimple.v().newLocal("temp$17", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$18", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$19", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$20", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$21", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$22", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$23", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$24", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$25", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$26", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$27", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$28", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$29", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$30", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$31", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$32", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$33", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$34", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$35", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$36", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$37", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$38", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$39", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$40", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$41", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$42", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$43", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$44", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$45", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$46", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$47", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$48", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$49", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$50", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$51", RefType.v("java.lang.String")));    
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
    NopStmt jumpTarget26= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"stPt");    
    Value rhs0 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"endPt");    
    Value rhs1 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"temp");    
    Value rhs2 = StringConstant.v("");    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    Local left0 = localByName(b,"stPt");    
    Value right0 = IntConstant.v(-1);    
    Value condition0 = Jimple.v().newNeExpr(left0,right0);    
    Unit target0=jumpTarget1;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget25;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs4 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs3 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local lhs5 = localByName(b,"temp$1");    
    RefType type1 = RefType.v("java.lang.StringBuffer");    
    Value rhs4 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
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
      Type type0 = IntType.v();      
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
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs6 = localByName(b,"temp$2");    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    Local lhs7 = localByName(b,"temp$3");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    Local lhs8 = localByName(b,"temp$4");    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"indexOf",parameterTypes,returnType,false);      
      Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    Local lhs9 = localByName(b,"stPt");    
    Local rhs8 = localByName(b,"temp$4");    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs8));    
    Local left1 = localByName(b,"temp$4");    
    Value right1 = IntConstant.v(-1);    
    Value condition1 = Jimple.v().newEqExpr(left1,right1);    
    Unit target2=jumpTarget2;    
    units.add(Jimple.v().newIfStmt(condition1,target2));    
    Unit target3=jumpTarget3;    
    units.add(Jimple.v().newGotoStmt(target3));    
    units.add(jumpTarget2);    
    units.add(Jimple.v().newNopStmt());    
    Unit target4=jumpTarget25;    
    units.add(Jimple.v().newGotoStmt(target4));    
    units.add(jumpTarget3);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs10 = localByName(b,"temp$5");    
    Local rhs9 = localByName(b,"stPt");    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs9));    
    Local lhs11 = localByName(b,"temp$6");    
    Value rhs10 = StringConstant.v("href=");    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs10));    
    Local lhs12 = localByName(b,"temp$7");    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"length",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs11));    
    Local lhs13 = localByName(b,"temp$8");    
    Local left2 = localByName(b,"temp$5");    
    Local right2 = localByName(b,"temp$7");    
    Value rhs12 = Jimple.v().newAddExpr(left2,right2);    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs12));    
    Local lhs14 = localByName(b,"temp$9");    
    Local left3 = localByName(b,"temp$8");    
    Value right3 = IntConstant.v(1);    
    Value rhs13 = Jimple.v().newAddExpr(left3,right3);    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs13));    
    Local lhs15 = localByName(b,"stPt");    
    Local rhs14 = localByName(b,"temp$9");    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs14));    
    Local lhs16 = localByName(b,"temp$10");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs15 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs15));    
    Local lhs17 = localByName(b,"temp$11");    
    Local left4 = localByName(b,"stPt");    
    Value right4 = IntConstant.v(1);    
    Value rhs16 = Jimple.v().newSubExpr(left4,right4);    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs16));    
    Local lhs18 = localByName(b,"temp$12");    
    {    
      Local base = localByName(b,"temp$10");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = CharType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"charAt",parameterTypes,returnType,false);      
      Value rhs17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs17));    
    Local lhs19 = localByName(b,"temp$13");    
    Type type2 = IntType.v();    
    Local op0 = localByName(b,"temp$12");    
    Value rhs18 = Jimple.v().newCastExpr(type2,op0);    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs18));    
    Local left5 = localByName(b,"temp$13");    
    Value right5 = IntConstant.v(39);    
    Value condition2 = Jimple.v().newNeExpr(left5,right5);    
    Unit target5=jumpTarget4;    
    units.add(Jimple.v().newIfStmt(condition2,target5));    
    Unit target6=jumpTarget18;    
    units.add(Jimple.v().newGotoStmt(target6));    
    units.add(jumpTarget4);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs20 = localByName(b,"temp$14");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs19 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs19));    
    Local lhs21 = localByName(b,"temp$15");    
    Local left6 = localByName(b,"stPt");    
    Value right6 = IntConstant.v(1);    
    Value rhs20 = Jimple.v().newSubExpr(left6,right6);    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs20));    
    Local lhs22 = localByName(b,"temp$16");    
    {    
      Local base = localByName(b,"temp$14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type returnType = CharType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"charAt",parameterTypes,returnType,false);      
      Value rhs21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs21));    
    Local lhs23 = localByName(b,"temp$17");    
    Type type3 = IntType.v();    
    Local op1 = localByName(b,"temp$16");    
    Value rhs22 = Jimple.v().newCastExpr(type3,op1);    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs22));    
    Local left7 = localByName(b,"temp$17");    
    Value right7 = IntConstant.v(34);    
    Value condition3 = Jimple.v().newNeExpr(left7,right7);    
    Unit target7=jumpTarget5;    
    units.add(Jimple.v().newIfStmt(condition3,target7));    
    Unit target8=jumpTarget18;    
    units.add(Jimple.v().newGotoStmt(target8));    
    Unit target9=jumpTarget5;    
    units.add(Jimple.v().newGotoStmt(target9));    
    units.add(jumpTarget5);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs24 = localByName(b,"temp$18");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs23 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs24,rhs23));    
    Local lhs25 = localByName(b,"temp$19");    
    RefType type4 = RefType.v("java.lang.StringBuffer");    
    Value rhs24 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs24));    
    {    
      Local base = localByName(b,"temp$19");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    {    
      Local base = localByName(b,"temp$19");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    Local lhs26 = localByName(b,"temp$20");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs25 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs25));    
    Local lhs27 = localByName(b,"temp$21");    
    Local left8 = localByName(b,"stPt");    
    Value right8 = IntConstant.v(6);    
    Value rhs26 = Jimple.v().newSubExpr(left8,right8);    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs26));    
    Local lhs28 = localByName(b,"temp$22");    
    Local rhs27 = localByName(b,"stPt");    
    units.add(Jimple.v().newAssignStmt(lhs28,rhs27));    
    Local lhs29 = localByName(b,"temp$23");    
    Local left9 = localByName(b,"temp$22");    
    Value right9 = IntConstant.v(2);    
    Value rhs28 = Jimple.v().newAddExpr(left9,right9);    
    units.add(Jimple.v().newAssignStmt(lhs29,rhs28));    
    Local lhs30 = localByName(b,"temp$24");    
    {    
      Local base = localByName(b,"temp$20");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs29 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs30,rhs29));    
    {    
      Local base = localByName(b,"temp$19");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    {    
      Local base = localByName(b,"temp$19");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    Local lhs31 = localByName(b,"temp$25");    
    {    
      Local base = localByName(b,"temp$19");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs30 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs31,rhs30));    
    {    
      Local base = localByName(b,"temp$18");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    Local left10 = localByName(b,"stPt");    
    Value right10 = IntConstant.v(-1);    
    Value condition4 = Jimple.v().newNeExpr(left10,right10);    
    Unit target10=jumpTarget7;    
    units.add(Jimple.v().newIfStmt(condition4,target10));    
    Unit target11=jumpTarget14;    
    units.add(Jimple.v().newGotoStmt(target11));    
    units.add(jumpTarget7);    
    units.add(Jimple.v().newNopStmt());    
    Local left11 = localByName(b,"endPt");    
    Value right11 = IntConstant.v(-1);    
    Value condition5 = Jimple.v().newNeExpr(left11,right11);    
    Unit target12=jumpTarget8;    
    units.add(Jimple.v().newIfStmt(condition5,target12));    
    Unit target13=jumpTarget14;    
    units.add(Jimple.v().newGotoStmt(target13));    
    Unit target14=jumpTarget8;    
    units.add(Jimple.v().newGotoStmt(target14));    
    units.add(jumpTarget8);    
    units.add(Jimple.v().newNopStmt());    
    Local left12 = localByName(b,"stPt");    
    Local right12 = localByName(b,"endPt");    
    Value condition6 = Jimple.v().newLtExpr(left12,right12);    
    Unit target15=jumpTarget10;    
    units.add(Jimple.v().newIfStmt(condition6,target15));    
    Unit target16=jumpTarget14;    
    units.add(Jimple.v().newGotoStmt(target16));    
    Unit target17=jumpTarget10;    
    units.add(Jimple.v().newGotoStmt(target17));    
    units.add(jumpTarget10);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs32 = localByName(b,"temp$26");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs31 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs32,rhs31));    
    Local lhs33 = localByName(b,"temp$27");    
    {    
      Local base = localByName(b,"temp$26");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"length",parameterTypes,returnType,false);      
      Value rhs32 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs33,rhs32));    
    Local left13 = localByName(b,"endPt");    
    Local right13 = localByName(b,"temp$27");    
    Value condition7 = Jimple.v().newLtExpr(left13,right13);    
    Unit target18=jumpTarget12;    
    units.add(Jimple.v().newIfStmt(condition7,target18));    
    Unit target19=jumpTarget14;    
    units.add(Jimple.v().newGotoStmt(target19));    
    Unit target20=jumpTarget12;    
    units.add(Jimple.v().newGotoStmt(target20));    
    units.add(jumpTarget12);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs34 = localByName(b,"temp$28");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs33 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs34,rhs33));    
    Local lhs35 = localByName(b,"temp$29");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs34 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs35,rhs34));    
    Local lhs36 = localByName(b,"temp$30");    
    {    
      Local base = localByName(b,"temp$29");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs35 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs36,rhs35));    
    {    
      Local base = localByName(b,"temp$28");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    units.add(jumpTarget14);    
    units.add(Jimple.v().newNopStmt());    
    Unit target21=jumpTarget24;    
    units.add(Jimple.v().newGotoStmt(target21));    
    units.add(jumpTarget18);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs37 = localByName(b,"temp$31");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs36 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs37,rhs36));    
    Local lhs38 = localByName(b,"temp$32");    
    Local rhs37 = localByName(b,"stPt");    
    units.add(Jimple.v().newAssignStmt(lhs38,rhs37));    
    Local lhs39 = localByName(b,"temp$33");    
    Local left14 = localByName(b,"temp$32");    
    Value right14 = IntConstant.v(1);    
    Value rhs38 = Jimple.v().newAddExpr(left14,right14);    
    units.add(Jimple.v().newAssignStmt(lhs39,rhs38));    
    Local lhs40 = localByName(b,"temp$34");    
    {    
      Local base = localByName(b,"temp$31");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"indexOf",parameterTypes,returnType,false);      
      Value rhs39 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs40,rhs39));    
    Local lhs41 = localByName(b,"endPt");    
    Local rhs40 = localByName(b,"temp$34");    
    units.add(Jimple.v().newAssignStmt(lhs41,rhs40));    
    Local left15 = localByName(b,"temp$34");    
    Value right15 = IntConstant.v(-1);    
    Value condition8 = Jimple.v().newEqExpr(left15,right15);    
    Unit target22=jumpTarget20;    
    units.add(Jimple.v().newIfStmt(condition8,target22));    
    Unit target23=jumpTarget23;    
    units.add(Jimple.v().newGotoStmt(target23));    
    units.add(jumpTarget20);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs42 = localByName(b,"temp$35");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs41 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs42,rhs41));    
    Local lhs43 = localByName(b,"temp$36");    
    Local rhs42 = localByName(b,"stPt");    
    units.add(Jimple.v().newAssignStmt(lhs43,rhs42));    
    Local lhs44 = localByName(b,"temp$37");    
    Local left16 = localByName(b,"temp$36");    
    Value right16 = IntConstant.v(1);    
    Value rhs43 = Jimple.v().newAddExpr(left16,right16);    
    units.add(Jimple.v().newAssignStmt(lhs44,rhs43));    
    Local lhs45 = localByName(b,"temp$38");    
    {    
      Local base = localByName(b,"temp$35");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"indexOf",parameterTypes,returnType,false);      
      Value rhs44 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs45,rhs44));    
    Local lhs46 = localByName(b,"endPt");    
    Local rhs45 = localByName(b,"temp$38");    
    units.add(Jimple.v().newAssignStmt(lhs46,rhs45));    
    Local left17 = localByName(b,"temp$38");    
    Value right17 = IntConstant.v(-1);    
    Value condition9 = Jimple.v().newEqExpr(left17,right17);    
    Unit target24=jumpTarget21;    
    units.add(Jimple.v().newIfStmt(condition9,target24));    
    Unit target25=jumpTarget22;    
    units.add(Jimple.v().newGotoStmt(target25));    
    units.add(jumpTarget21);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget22);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget23);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs47 = localByName(b,"temp$39");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs46 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs47,rhs46));    
    Local lhs48 = localByName(b,"temp$40");    
    RefType type5 = RefType.v("java.lang.StringBuffer");    
    Value rhs47 = Jimple.v().newNewExpr(type5);    
    units.add(Jimple.v().newAssignStmt(lhs48,rhs47));    
    {    
      Local base = localByName(b,"temp$40");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    {    
      Local base = localByName(b,"temp$40");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie13));    
    {    
      Local base = localByName(b,"temp$40");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie14));    
    {    
      Local base = localByName(b,"temp$40");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie15));    
    {    
      Local base = localByName(b,"temp$40");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie16));    
    Local lhs49 = localByName(b,"temp$41");    
    {    
      Local base = localByName(b,"temp$40");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs48 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs49,rhs48));    
    {    
      Local base = localByName(b,"temp$39");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie17));    
    Local lhs50 = localByName(b,"temp$42");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs49 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs50,rhs49));    
    Local lhs51 = localByName(b,"temp$43");    
    {    
      Local base = localByName(b,"temp$42");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs50 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs51,rhs50));    
    Local lhs52 = localByName(b,"temp");    
    Local rhs51 = localByName(b,"temp$43");    
    units.add(Jimple.v().newAssignStmt(lhs52,rhs51));    
    Local lhs53 = localByName(b,"temp$44");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs52 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs53,rhs52));    
    Local lhs54 = localByName(b,"temp$45");    
    RefType type6 = RefType.v("java.lang.StringBuffer");    
    Value rhs53 = Jimple.v().newNewExpr(type6);    
    units.add(Jimple.v().newAssignStmt(lhs54,rhs53));    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie18 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie18));    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie19));    
    Local lhs55 = localByName(b,"temp$46");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"URLcount",type,false);      Value rhs54 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs55,rhs54));    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie20));    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie21));    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie22));    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie23));    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie24 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie24));    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie25 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie25));    
    Local lhs56 = localByName(b,"temp$47");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs55 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs56,rhs55));    
    Local lhs57 = localByName(b,"temp$48");    
    {    
      Local base = localByName(b,"temp$47");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs56 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs57,rhs56));    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie26 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie26));    
    Local lhs58 = localByName(b,"temp$49");    
    {    
      Local base = localByName(b,"temp$45");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs57 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs58,rhs57));    
    {    
      Local base = localByName(b,"temp$44");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie27 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie27));    
    Local lhs59 = localByName(b,"temp$50");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"htmlpage",type,false);      Value rhs58 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs59,rhs58));    
    Local lhs60 = localByName(b,"temp$51");    
    {    
      Local base = localByName(b,"temp$50");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs59 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs60,rhs59));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"enlistURL",parameterTypes,returnType,false);      
      Value ie28 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie28));    
    units.add(jumpTarget24);    
    units.add(Jimple.v().newNopStmt());    
    Unit target26=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target26));    
    units.add(jumpTarget25);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod10(SootClass c) {  
    SootMethod m = new SootMethod("ValidateAllLinks",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("tempurl", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("objlst", RefType.v("java.lang.Object[]")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.Object[]")));    
    locals.add(Jimple.v().newLocal("newlst", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("tempInt", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("NoOfParent", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("i", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("tempStr", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.lang.Object[]")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$13", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("currentDirPath", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$14", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$15", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$16", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$17", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$18", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$19", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$20", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$21", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$22", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$23", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$24", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$25", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$26", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$27", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$28", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$29", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$30", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$31", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$32", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$33", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$34", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$35", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$36", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$37", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$38", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$39", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$40", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$41", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$42", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$43", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$44", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$45", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$46", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$47", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$48", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$49", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$50", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$51", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$52", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$53", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$54", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$55", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$56", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$57", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$58", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$59", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$60", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$61", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$62", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$63", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$64", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("temp$65", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("temp$66", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$67", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("temp$68", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$69", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$70", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("ex", RefType.v("java.lang.Exception")));    
    locals.add(Jimple.v().newLocal("temp$71", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$72", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$73", RefType.v("java.lang.Class")));    
    locals.add(Jimple.v().newLocal("temp$74", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$75", RefType.v("java.util.logging.Logger")));    
    locals.add(Jimple.v().newLocal("temp$76", RefType.v("java.util.logging.Level")));    
    locals.add(Jimple.v().newLocal("temp$77", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("temp$78", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("temp$79", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$80", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$81", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("i", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$82", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("temp$83", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$84", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("temp$85", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("temp$86", RefType.v("java.lang.Object")));    
    locals.add(Jimple.v().newLocal("temp$87", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$88", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$89", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$90", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$91", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$92", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$93", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("temp$94", RefType.v("java.util.Queue")));    
    locals.add(Jimple.v().newLocal("temp$95", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$96", RefType.v("java.lang.String")));    
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
    NopStmt jumpTarget26= Jimple.v().newNopStmt();    
    NopStmt jumpTarget27= Jimple.v().newNopStmt();    
    NopStmt jumpTarget28= Jimple.v().newNopStmt();    
    NopStmt jumpTarget29= Jimple.v().newNopStmt();    
    NopStmt jumpTarget30= Jimple.v().newNopStmt();    
    NopStmt jumpTarget31= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType baseType = RefType.v("java.lang.Object");      
      int numDimensions=1;      
      Type returnType = ArrayType.v(baseType, numDimensions);      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"toArray",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"objlst");    
    Local rhs2 = localByName(b,"temp$1");    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"temp$2");    
    RefType type1 = RefType.v("java.util.ArrayList");    
    Value rhs3 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    Local lhs5 = localByName(b,"newlst");    
    Local rhs4 = localByName(b,"temp$2");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    Local lhs6 = localByName(b,"NoOfParent");    
    Value rhs5 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    Local lhs7 = localByName(b,"i");    
    Value rhs6 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs8 = localByName(b,"temp$3");    
    Local op0 = localByName(b,"objlst");    
    Value rhs7 = Jimple.v().newLengthExpr(op0);    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    Local left0 = localByName(b,"i");    
    Local right0 = localByName(b,"temp$3");    
    Value condition0 = Jimple.v().newLtExpr(left0,right0);    
    Unit target0=jumpTarget1;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget28;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs9 = localByName(b,"temp$4");    
    Local rhs8 = localByName(b,"objlst");    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs8));    
    Local lhs10 = localByName(b,"temp$5");    
    Local rhs9 = localByName(b,"i");    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs9));    
    Local lhs11 = localByName(b,"temp$6");    
    Local base0 = localByName(b,"temp$4");    
    Local index0 = localByName(b,"temp$5");    
    Value rhs10 = Jimple.v().newArrayRef(base0, index0);    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs10));    
    Local lhs12 = localByName(b,"temp$7");    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs11));    
    Local lhs13 = localByName(b,"tempStr");    
    Local rhs12 = localByName(b,"temp$7");    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs12));    
    Local lhs14 = localByName(b,"temp$8");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs13 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs13));    
    Local lhs15 = localByName(b,"temp$9");    
    RefType type2 = RefType.v("java.lang.StringBuffer");    
    Value rhs14 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs14));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie5));    
    Local lhs16 = localByName(b,"temp$10");    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs15));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    Local lhs17 = localByName(b,"temp$11");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"toLowerCase",parameterTypes,returnType,false);      
      Value rhs16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs17,rhs16));    
    Local lhs18 = localByName(b,"temp$12");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"startsWith",parameterTypes,returnType,false);      
      Value rhs17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs18,rhs17));    
    Local left1 = localByName(b,"temp$12");    
    Value right1 = IntConstant.v(0);    
    Value condition1 = Jimple.v().newEqExpr(left1,right1);    
    Unit target2=jumpTarget2;    
    units.add(Jimple.v().newIfStmt(condition1,target2));    
    Unit target3=jumpTarget22;    
    units.add(Jimple.v().newGotoStmt(target3));    
    units.add(jumpTarget2);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs19 = localByName(b,"temp$13");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"startsWith",parameterTypes,returnType,false);      
      Value rhs18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs19,rhs18));    
    Local left2 = localByName(b,"temp$13");    
    Value right2 = IntConstant.v(0);    
    Value condition2 = Jimple.v().newEqExpr(left2,right2);    
    Unit target4=jumpTarget3;    
    units.add(Jimple.v().newIfStmt(condition2,target4));    
    Unit target5=jumpTarget22;    
    units.add(Jimple.v().newGotoStmt(target5));    
    Unit target6=jumpTarget3;    
    units.add(Jimple.v().newGotoStmt(target6));    
    units.add(jumpTarget3);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs20 = localByName(b,"temp$14");    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value rhs19 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs20,rhs19));    
    Local lhs21 = localByName(b,"temp$15");    
    {    
      Local base = localByName(b,"temp$14");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"toString",parameterTypes,returnType,false);      
      Value rhs20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs21,rhs20));    
    Local lhs22 = localByName(b,"temp$16");    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value rhs21 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs22,rhs21));    
    Local lhs23 = localByName(b,"temp$17");    
    {    
      Local base = localByName(b,"temp$16");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"toString",parameterTypes,returnType,false);      
      Value rhs22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs23,rhs22));    
    Local lhs24 = localByName(b,"temp$18");    
    {    
      Local base = localByName(b,"temp$17");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"lastIndexOf",parameterTypes,returnType,false);      
      Value rhs23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs24,rhs23));    
    Local lhs25 = localByName(b,"temp$19");    
    Local rhs24 = localByName(b,"temp$18");    
    units.add(Jimple.v().newAssignStmt(lhs25,rhs24));    
    Local lhs26 = localByName(b,"temp$20");    
    Local left3 = localByName(b,"temp$19");    
    Value right3 = IntConstant.v(1);    
    Value rhs25 = Jimple.v().newAddExpr(left3,right3);    
    units.add(Jimple.v().newAssignStmt(lhs26,rhs25));    
    Local lhs27 = localByName(b,"temp$21");    
    {    
      Local base = localByName(b,"temp$15");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs26 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs27,rhs26));    
    Local lhs28 = localByName(b,"currentDirPath");    
    Local rhs27 = localByName(b,"temp$21");    
    units.add(Jimple.v().newAssignStmt(lhs28,rhs27));    
    Local lhs29 = localByName(b,"temp$22");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"startsWith",parameterTypes,returnType,false);      
      Value rhs28 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs29,rhs28));    
    Local left4 = localByName(b,"temp$22");    
    Value right4 = IntConstant.v(0);    
    Value condition3 = Jimple.v().newEqExpr(left4,right4);    
    Unit target7=jumpTarget9;    
    units.add(Jimple.v().newIfStmt(condition3,target7));    
    Unit target8=jumpTarget5;    
    units.add(Jimple.v().newGotoStmt(target8));    
    units.add(jumpTarget5);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget6);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs30 = localByName(b,"temp$23");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"startsWith",parameterTypes,returnType,false);      
      Value rhs29 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs30,rhs29));    
    Local left5 = localByName(b,"temp$23");    
    Value right5 = IntConstant.v(0);    
    Value condition4 = Jimple.v().newEqExpr(left5,right5);    
    Unit target9=jumpTarget8;    
    units.add(Jimple.v().newIfStmt(condition4,target9));    
    Unit target10=jumpTarget7;    
    units.add(Jimple.v().newGotoStmt(target10));    
    units.add(jumpTarget7);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs31 = localByName(b,"temp$24");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"length",parameterTypes,returnType,false);      
      Value rhs30 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs31,rhs30));    
    Local lhs32 = localByName(b,"temp$25");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs31 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs32,rhs31));    
    Local lhs33 = localByName(b,"tempStr");    
    Local rhs32 = localByName(b,"temp$25");    
    units.add(Jimple.v().newAssignStmt(lhs33,rhs32));    
    Local lhs34 = localByName(b,"temp$26");    
    Local rhs33 = localByName(b,"NoOfParent");    
    units.add(Jimple.v().newAssignStmt(lhs34,rhs33));    
    Local lhs35 = localByName(b,"temp$27");    
    Local left6 = localByName(b,"temp$26");    
    Value right6 = IntConstant.v(1);    
    Value rhs34 = Jimple.v().newAddExpr(left6,right6);    
    units.add(Jimple.v().newAssignStmt(lhs35,rhs34));    
    Local lhs36 = localByName(b,"NoOfParent");    
    Local rhs35 = localByName(b,"temp$27");    
    units.add(Jimple.v().newAssignStmt(lhs36,rhs35));    
    Unit target11=jumpTarget6;    
    units.add(Jimple.v().newGotoStmt(target11));    
    units.add(jumpTarget8);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs37 = localByName(b,"temp$28");    
    Local rhs36 = localByName(b,"NoOfParent");    
    units.add(Jimple.v().newAssignStmt(lhs37,rhs36));    
    Local lhs38 = localByName(b,"temp$29");    
    Local left7 = localByName(b,"temp$28");    
    Value right7 = IntConstant.v(-1);    
    Value rhs37 = Jimple.v().newAddExpr(left7,right7);    
    units.add(Jimple.v().newAssignStmt(lhs38,rhs37));    
    Local lhs39 = localByName(b,"NoOfParent");    
    Local rhs38 = localByName(b,"temp$29");    
    units.add(Jimple.v().newAssignStmt(lhs39,rhs38));    
    Unit target12=jumpTarget18;    
    units.add(Jimple.v().newGotoStmt(target12));    
    units.add(jumpTarget9);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs40 = localByName(b,"temp$30");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"startsWith",parameterTypes,returnType,false);      
      Value rhs39 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs40,rhs39));    
    Local left8 = localByName(b,"temp$30");    
    Value right8 = IntConstant.v(0);    
    Value condition5 = Jimple.v().newEqExpr(left8,right8);    
    Unit target13=jumpTarget11;    
    units.add(Jimple.v().newIfStmt(condition5,target13));    
    Unit target14=jumpTarget10;    
    units.add(Jimple.v().newGotoStmt(target14));    
    units.add(jumpTarget10);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs41 = localByName(b,"temp$31");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs40 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs41,rhs40));    
    Local lhs42 = localByName(b,"temp$32");    
    RefType type3 = RefType.v("java.lang.StringBuffer");    
    Value rhs41 = Jimple.v().newNewExpr(type3);    
    units.add(Jimple.v().newAssignStmt(lhs42,rhs41));    
    {    
      Local base = localByName(b,"temp$32");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    {    
      Local base = localByName(b,"temp$32");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    Local lhs43 = localByName(b,"temp$33");    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value rhs42 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs43,rhs42));    
    Local lhs44 = localByName(b,"temp$34");    
    {    
      Local base = localByName(b,"temp$33");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"toString",parameterTypes,returnType,false);      
      Value rhs43 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs44,rhs43));    
    {    
      Local base = localByName(b,"temp$32");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    Local lhs45 = localByName(b,"temp$35");    
    {    
      Local base = localByName(b,"temp$32");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs44 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs45,rhs44));    
    {    
      Local base = localByName(b,"temp$31");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    Local lhs46 = localByName(b,"temp$36");    
    RefType type4 = RefType.v("java.lang.StringBuffer");    
    Value rhs45 = Jimple.v().newNewExpr(type4);    
    units.add(Jimple.v().newAssignStmt(lhs46,rhs45));    
    {    
      Local base = localByName(b,"temp$36");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    Local lhs47 = localByName(b,"temp$37");    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value rhs46 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs47,rhs46));    
    Local lhs48 = localByName(b,"temp$38");    
    {    
      Local base = localByName(b,"temp$37");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"getProtocol",parameterTypes,returnType,false);      
      Value rhs47 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs48,rhs47));    
    {    
      Local base = localByName(b,"temp$36");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    {    
      Local base = localByName(b,"temp$36");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie13));    
    Local lhs49 = localByName(b,"temp$39");    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value rhs48 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs49,rhs48));    
    Local lhs50 = localByName(b,"temp$40");    
    {    
      Local base = localByName(b,"temp$39");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"getHost",parameterTypes,returnType,false);      
      Value rhs49 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs50,rhs49));    
    {    
      Local base = localByName(b,"temp$36");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie14));    
    {    
      Local base = localByName(b,"temp$36");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie15));    
    Local lhs51 = localByName(b,"temp$41");    
    {    
      Local base = localByName(b,"temp$36");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs50 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs51,rhs50));    
    Local lhs52 = localByName(b,"tempStr");    
    Local rhs51 = localByName(b,"temp$41");    
    units.add(Jimple.v().newAssignStmt(lhs52,rhs51));    
    Unit target15=jumpTarget17;    
    units.add(Jimple.v().newGotoStmt(target15));    
    units.add(jumpTarget11);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs53 = localByName(b,"temp$42");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"indexOf",parameterTypes,returnType,false);      
      Value rhs52 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs53,rhs52));    
    Local lhs54 = localByName(b,"tempInt");    
    Local rhs53 = localByName(b,"temp$42");    
    units.add(Jimple.v().newAssignStmt(lhs54,rhs53));    
    Local left9 = localByName(b,"temp$42");    
    Value right9 = IntConstant.v(-1);    
    Value condition6 = Jimple.v().newNeExpr(left9,right9);    
    Unit target16=jumpTarget12;    
    units.add(Jimple.v().newIfStmt(condition6,target16));    
    Unit target17=jumpTarget13;    
    units.add(Jimple.v().newGotoStmt(target17));    
    units.add(jumpTarget12);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs55 = localByName(b,"temp$43");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs54 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs55,rhs54));    
    Local lhs56 = localByName(b,"tempStr");    
    Local rhs55 = localByName(b,"temp$43");    
    units.add(Jimple.v().newAssignStmt(lhs56,rhs55));    
    Unit target18=jumpTarget16;    
    units.add(Jimple.v().newGotoStmt(target18));    
    units.add(jumpTarget13);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs57 = localByName(b,"temp$44");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"indexOf",parameterTypes,returnType,false);      
      Value rhs56 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs57,rhs56));    
    Local lhs58 = localByName(b,"tempInt");    
    Local rhs57 = localByName(b,"temp$44");    
    units.add(Jimple.v().newAssignStmt(lhs58,rhs57));    
    Local left10 = localByName(b,"temp$44");    
    Value right10 = IntConstant.v(-1);    
    Value condition7 = Jimple.v().newNeExpr(left10,right10);    
    Unit target19=jumpTarget14;    
    units.add(Jimple.v().newIfStmt(condition7,target19));    
    Unit target20=jumpTarget15;    
    units.add(Jimple.v().newGotoStmt(target20));    
    units.add(jumpTarget14);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs59 = localByName(b,"temp$45");    
    {    
      Local base = localByName(b,"tempStr");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs58 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs59,rhs58));    
    Local lhs60 = localByName(b,"tempStr");    
    Local rhs59 = localByName(b,"temp$45");    
    units.add(Jimple.v().newAssignStmt(lhs60,rhs59));    
    units.add(jumpTarget15);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget16);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget17);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget18);    
    units.add(Jimple.v().newNopStmt());    
    units.add(jumpTarget19);    
    units.add(Jimple.v().newNopStmt());    
    Local left11 = localByName(b,"NoOfParent");    
    Value right11 = IntConstant.v(0);    
    Value condition8 = Jimple.v().newNeExpr(left11,right11);    
    Unit target21=jumpTarget20;    
    units.add(Jimple.v().newIfStmt(condition8,target21));    
    Unit target22=jumpTarget21;    
    units.add(Jimple.v().newGotoStmt(target22));    
    units.add(jumpTarget20);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs61 = localByName(b,"temp$46");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs60 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs61,rhs60));    
    Local lhs62 = localByName(b,"temp$47");    
    RefType type5 = RefType.v("java.lang.StringBuffer");    
    Value rhs61 = Jimple.v().newNewExpr(type5);    
    units.add(Jimple.v().newAssignStmt(lhs62,rhs61));    
    {    
      Local base = localByName(b,"temp$47");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie16 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie16));    
    {    
      Local base = localByName(b,"temp$47");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie17));    
    {    
      Local base = localByName(b,"temp$47");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie18));    
    {    
      Local base = localByName(b,"temp$47");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie19));    
    {    
      Local base = localByName(b,"temp$47");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie20));    
    Local lhs63 = localByName(b,"temp$48");    
    {    
      Local base = localByName(b,"temp$47");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs62 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs63,rhs62));    
    {    
      Local base = localByName(b,"temp$46");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie21));    
    Local lhs64 = localByName(b,"temp$49");    
    {    
      Local base = localByName(b,"currentDirPath");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"lastIndexOf",parameterTypes,returnType,false);      
      Value rhs63 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs64,rhs63));    
    Local lhs65 = localByName(b,"temp$50");    
    {    
      Local base = localByName(b,"currentDirPath");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs64 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs65,rhs64));    
    Local lhs66 = localByName(b,"currentDirPath");    
    Local rhs65 = localByName(b,"temp$50");    
    units.add(Jimple.v().newAssignStmt(lhs66,rhs65));    
    Local lhs67 = localByName(b,"temp$51");    
    {    
      Local base = localByName(b,"currentDirPath");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"lastIndexOf",parameterTypes,returnType,false);      
      Value rhs66 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs67,rhs66));    
    Local lhs68 = localByName(b,"temp$52");    
    {    
      Local base = localByName(b,"currentDirPath");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs67 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs68,rhs67));    
    Local lhs69 = localByName(b,"currentDirPath");    
    Local rhs68 = localByName(b,"temp$52");    
    units.add(Jimple.v().newAssignStmt(lhs69,rhs68));    
    Local lhs70 = localByName(b,"temp$53");    
    {    
      Local base = localByName(b,"currentDirPath");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"lastIndexOf",parameterTypes,returnType,false);      
      Value rhs69 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs70,rhs69));    
    Local lhs71 = localByName(b,"temp$54");    
    Local rhs70 = localByName(b,"temp$53");    
    units.add(Jimple.v().newAssignStmt(lhs71,rhs70));    
    Local lhs72 = localByName(b,"temp$55");    
    Local left12 = localByName(b,"temp$54");    
    Value right12 = IntConstant.v(1);    
    Value rhs71 = Jimple.v().newAddExpr(left12,right12);    
    units.add(Jimple.v().newAssignStmt(lhs72,rhs71));    
    Local lhs73 = localByName(b,"temp$56");    
    {    
      Local base = localByName(b,"currentDirPath");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      Type type1 = IntType.v();      
      parameterTypes.add(type1);      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"substring",parameterTypes,returnType,false);      
      Value rhs72 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs73,rhs72));    
    Local lhs74 = localByName(b,"currentDirPath");    
    Local rhs73 = localByName(b,"temp$56");    
    units.add(Jimple.v().newAssignStmt(lhs74,rhs73));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs75 = localByName(b,"temp$57");    
    Local rhs74 = localByName(b,"NoOfParent");    
    units.add(Jimple.v().newAssignStmt(lhs75,rhs74));    
    Local lhs76 = localByName(b,"temp$58");    
    Local left13 = localByName(b,"temp$57");    
    Value right13 = IntConstant.v(-1);    
    Value rhs75 = Jimple.v().newAddExpr(left13,right13);    
    units.add(Jimple.v().newAssignStmt(lhs76,rhs75));    
    Local lhs77 = localByName(b,"NoOfParent");    
    Local rhs76 = localByName(b,"temp$58");    
    units.add(Jimple.v().newAssignStmt(lhs77,rhs76));    
    Unit target23=jumpTarget19;    
    units.add(Jimple.v().newGotoStmt(target23));    
    units.add(jumpTarget21);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs78 = localByName(b,"temp$59");    
    RefType type6 = RefType.v("java.lang.StringBuffer");    
    Value rhs77 = Jimple.v().newNewExpr(type6);    
    units.add(Jimple.v().newAssignStmt(lhs78,rhs77));    
    {    
      Local base = localByName(b,"temp$59");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie22 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie22));    
    {    
      Local base = localByName(b,"temp$59");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie23 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie23));    
    {    
      Local base = localByName(b,"temp$59");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie24 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie24));    
    Local lhs79 = localByName(b,"temp$60");    
    {    
      Local base = localByName(b,"temp$59");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs78 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs79,rhs78));    
    Local lhs80 = localByName(b,"tempStr");    
    Local rhs79 = localByName(b,"temp$60");    
    units.add(Jimple.v().newAssignStmt(lhs80,rhs79));    
    Local lhs81 = localByName(b,"temp$61");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs80 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs81,rhs80));    
    Local lhs82 = localByName(b,"temp$62");    
    RefType type7 = RefType.v("java.lang.StringBuffer");    
    Value rhs81 = Jimple.v().newNewExpr(type7);    
    units.add(Jimple.v().newAssignStmt(lhs82,rhs81));    
    {    
      Local base = localByName(b,"temp$62");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie25 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie25));    
    {    
      Local base = localByName(b,"temp$62");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie26 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie26));    
    {    
      Local base = localByName(b,"temp$62");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie27 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie27));    
    Local lhs83 = localByName(b,"temp$63");    
    {    
      Local base = localByName(b,"temp$62");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs82 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs83,rhs82));    
    {    
      Local base = localByName(b,"temp$61");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie28 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie28));    
    Local lhs84 = localByName(b,"temp$64");    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value rhs83 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs84,rhs83));    
    Local lhs85 = localByName(b,"temp$65");    
    {    
      Local base = localByName(b,"temp$64");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"remove",parameterTypes,returnType,false);      
      Value rhs84 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs85,rhs84));    
    Local lhs86 = localByName(b,"temp$66");    
    RefType type8 = RefType.v("java.lang.String");    
    Local op1 = localByName(b,"temp$65");    
    Value rhs85 = Jimple.v().newCastExpr(type8,op1);    
    units.add(Jimple.v().newAssignStmt(lhs86,rhs85));    
    Local lhs87 = localByName(b,"temp$67");    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value rhs86 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs87,rhs86));    
    {    
      Local base = localByName(b,"temp$67");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.Object");      
      parameterTypes.add(type1);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"add",parameterTypes,returnType,false);      
      Value ie29 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie29));    
    units.add(jumpTarget22);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    Local lhs88 = localByName(b,"temp$68");    
    RefType type9 = RefType.v("java.net.URL");    
    Value rhs87 = Jimple.v().newNewExpr(type9);    
    units.add(Jimple.v().newAssignStmt(lhs88,rhs87));    
    {    
      Local base = localByName(b,"temp$68");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"<init>",parameterTypes,returnType,false);      
      Value ie30 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie30));    
    Local lhs89 = localByName(b,"tempurl");    
    Local rhs88 = localByName(b,"temp$68");    
    units.add(Jimple.v().newAssignStmt(lhs89,rhs88));    
    Local lhs90 = localByName(b,"temp$69");    
    {    
      Local base = localByName(b,"tempurl");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"getQuery",parameterTypes,returnType,false);      
      Value rhs89 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs90,rhs89));    
    Local lhs91 = localByName(b,"temp$70");    
    {    
      Local base = localByName(b,"newlst");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"add",parameterTypes,returnType,false);      
      Value rhs90 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs91,rhs90));    
    Unit target24=jumpTarget26;    
    units.add(Jimple.v().newGotoStmt(target24));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs92 = localByName(b,"ex");    
    Value idRef1 = Jimple.v().newCaughtExceptionRef();    
    units.add(Jimple.v().newIdentityStmt(lhs92,idRef1));    
    Local lhs93 = localByName(b,"temp$72");    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"class$com$webc$htmlUtils$LinkExtractor",type,true);      Value rhs91 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs93,rhs91));    
    Local left14 = localByName(b,"temp$72");    
    Value right14 = NullConstant.v();    
    Value condition9 = Jimple.v().newNeExpr(left14,right14);    
    Unit target25=jumpTarget24;    
    units.add(Jimple.v().newIfStmt(condition9,target25));    
    Local lhs94 = localByName(b,"temp$73");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Class");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"class$",parameterTypes,returnType,true);      
      Value rhs92 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs94,rhs92));    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"class$com$webc$htmlUtils$LinkExtractor",type,true);      Value lhs95 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    Local rhs93 = localByName(b,"temp$73");    
    units.add(Jimple.v().newAssignStmt(lhs95,rhs93));    
    Local lhs96 = localByName(b,"temp$71");    
    Local rhs94 = localByName(b,"temp$73");    
    units.add(Jimple.v().newAssignStmt(lhs96,rhs94));    
    Unit target26=jumpTarget25;    
    units.add(Jimple.v().newGotoStmt(target26));    
    units.add(jumpTarget24);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs97 = localByName(b,"temp$71");    
    {    
      RefType type = RefType.v("java.lang.Class");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"class$com$webc$htmlUtils$LinkExtractor",type,true);      Value rhs95 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs97,rhs95));    
    units.add(jumpTarget25);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs98 = localByName(b,"temp$74");    
    {    
      Local base = localByName(b,"temp$71");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);      
      Value rhs96 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs98,rhs96));    
    Local lhs99 = localByName(b,"temp$75");    
    {    
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.util.logging.Logger");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.logging.Logger"),"getLogger",parameterTypes,returnType,true);      
      Value rhs97 = Jimple.v().newStaticInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs99,rhs97));    
    Local lhs100 = localByName(b,"temp$76");    
    {    
      RefType type = RefType.v("java.util.logging.Level");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.util.logging.Level"),"SEVERE",type,true);      Value rhs98 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs100,rhs98));    
    {    
      Local base = localByName(b,"temp$75");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.util.logging.Level");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("java.lang.Throwable");      
      parameterTypes.add(type2);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.logging.Logger"),"log",parameterTypes,returnType,false);      
      Value ie31 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie31));    
    {    
      Local base = localByName(b,"ex");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Throwable"),"printStackTrace",parameterTypes,returnType,false);      
      Value ie32 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie32));    
    Local lhs101 = localByName(b,"temp$77");    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value rhs99 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs101,rhs99));    
    Local lhs102 = localByName(b,"temp$78");    
    {    
      Local base = localByName(b,"temp$77");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"remove",parameterTypes,returnType,false);      
      Value rhs100 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs102,rhs100));    
    Local lhs103 = localByName(b,"temp$79");    
    RefType type10 = RefType.v("java.lang.String");    
    Local op2 = localByName(b,"temp$78");    
    Value rhs101 = Jimple.v().newCastExpr(type10,op2);    
    units.add(Jimple.v().newAssignStmt(lhs103,rhs101));    
    units.add(Jimple.v().newNopStmt());    
    Unit target27=jumpTarget26;    
    units.add(Jimple.v().newGotoStmt(target27));    
    units.add(jumpTarget26);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newNopStmt());    
    Local lhs104 = localByName(b,"temp$80");    
    Local rhs102 = localByName(b,"i");    
    units.add(Jimple.v().newAssignStmt(lhs104,rhs102));    
    Local lhs105 = localByName(b,"temp$81");    
    Local left15 = localByName(b,"temp$80");    
    Value right15 = IntConstant.v(1);    
    Value rhs103 = Jimple.v().newAddExpr(left15,right15);    
    units.add(Jimple.v().newAssignStmt(lhs105,rhs103));    
    Local lhs106 = localByName(b,"i");    
    Local rhs104 = localByName(b,"temp$81");    
    units.add(Jimple.v().newAssignStmt(lhs106,rhs104));    
    Unit target28=jumpTarget0;    
    units.add(Jimple.v().newGotoStmt(target28));    
    units.add(jumpTarget28);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs107 = localByName(b,"i");    
    Value rhs105 = IntConstant.v(0);    
    units.add(Jimple.v().newAssignStmt(lhs107,rhs105));    
    units.add(jumpTarget29);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs108 = localByName(b,"temp$82");    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value rhs106 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs108,rhs106));    
    Local lhs109 = localByName(b,"temp$83");    
    {    
      Local base = localByName(b,"temp$82");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"size",parameterTypes,returnType,false);      
      Value rhs107 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs109,rhs107));    
    Local left16 = localByName(b,"i");    
    Local right16 = localByName(b,"temp$83");    
    Value condition10 = Jimple.v().newLtExpr(left16,right16);    
    Unit target29=jumpTarget30;    
    units.add(Jimple.v().newIfStmt(condition10,target29));    
    Unit target30=jumpTarget31;    
    units.add(Jimple.v().newGotoStmt(target30));    
    units.add(jumpTarget30);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs110 = localByName(b,"temp$84");    
    {    
      RefType type = RefType.v("com.webc.utils.QueueManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"qm",type,false);      Value rhs108 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs110,rhs108));    
    Local lhs111 = localByName(b,"temp$85");    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value rhs109 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs111,rhs109));    
    Local lhs112 = localByName(b,"temp$86");    
    {    
      Local base = localByName(b,"temp$85");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.Object");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"get",parameterTypes,returnType,false);      
      Value rhs110 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs112,rhs110));    
    Local lhs113 = localByName(b,"temp$87");    
    RefType type11 = RefType.v("java.lang.String");    
    Local op3 = localByName(b,"temp$86");    
    Value rhs111 = Jimple.v().newCastExpr(type11,op3);    
    units.add(Jimple.v().newAssignStmt(lhs113,rhs111));    
    Local lhs114 = localByName(b,"temp$88");    
    {    
      Local base = localByName(b,"temp$87");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"toString",parameterTypes,returnType,false);      
      Value rhs112 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs114,rhs112));    
    {    
      Local base = localByName(b,"temp$84");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"AddUrl",parameterTypes,returnType,false);      
      Value ie33 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie33));    
    units.add(Jimple.v().newNopStmt());    
    Local lhs115 = localByName(b,"temp$89");    
    Local rhs113 = localByName(b,"i");    
    units.add(Jimple.v().newAssignStmt(lhs115,rhs113));    
    Local lhs116 = localByName(b,"temp$90");    
    Local left17 = localByName(b,"temp$89");    
    Value right17 = IntConstant.v(1);    
    Value rhs114 = Jimple.v().newAddExpr(left17,right17);    
    units.add(Jimple.v().newAssignStmt(lhs116,rhs114));    
    Local lhs117 = localByName(b,"i");    
    Local rhs115 = localByName(b,"temp$90");    
    units.add(Jimple.v().newAssignStmt(lhs117,rhs115));    
    Unit target31=jumpTarget29;    
    units.add(Jimple.v().newGotoStmt(target31));    
    units.add(jumpTarget31);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs118 = localByName(b,"temp$91");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs116 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs118,rhs116));    
    Local lhs119 = localByName(b,"temp$92");    
    RefType type12 = RefType.v("java.lang.StringBuffer");    
    Value rhs117 = Jimple.v().newNewExpr(type12);    
    units.add(Jimple.v().newAssignStmt(lhs119,rhs117));    
    {    
      Local base = localByName(b,"temp$92");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie34 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie34));    
    {    
      Local base = localByName(b,"temp$92");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie35 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie35));    
    Local lhs120 = localByName(b,"temp$93");    
    {    
      RefType type = RefType.v("com.webc.utils.QueueManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"qm",type,false);      Value rhs118 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs120,rhs118));    
    Local lhs121 = localByName(b,"temp$94");    
    {    
      Local base = localByName(b,"temp$93");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.util.Queue");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.utils.QueueManager"),"getQueue",parameterTypes,returnType,false);      
      Value rhs119 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs121,rhs119));    
    Local lhs122 = localByName(b,"temp$95");    
    {    
      Local base = localByName(b,"temp$94");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = IntType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Collection"),"size",parameterTypes,returnType,false);      
      Value rhs120 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs122,rhs120));    
    {    
      Local base = localByName(b,"temp$92");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type type0 = IntType.v();      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie36 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie36));    
    Local lhs123 = localByName(b,"temp$96");    
    {    
      Local base = localByName(b,"temp$92");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs121 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs123,rhs121));    
    {    
      Local base = localByName(b,"temp$91");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.PrintStream"),"println",parameterTypes,returnType,false);      
      Value ie37 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie37));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod11(SootClass c) {  
    SootMethod m = new SootMethod("enlistURL",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("newURL", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.util.ArrayList")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("boolean")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.io.PrintStream")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$7", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("temp$8", RefType.v("java.lang.StringBuffer")));    
    locals.add(Jimple.v().newLocal("temp$9", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$10", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$11", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$12", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$13", RefType.v("int")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"newURL");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.util.ArrayList");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"arrLstURL",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    Local lhs3 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      Type returnType = BooleanType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.ArrayList"),"add",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs1));    
    Local lhs4 = localByName(b,"temp$2");    
    {    
      RefType type = RefType.v("java.io.PrintStream");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("java.lang.System"),"out",type,true);      Value rhs2 = Jimple.v().newStaticFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs2));    
    Local lhs5 = localByName(b,"temp$3");    
    RefType type1 = RefType.v("java.lang.StringBuffer");    
    Value rhs3 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs3));    
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
    Local lhs6 = localByName(b,"temp$4");    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value rhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs4));    
    Local lhs7 = localByName(b,"temp$5");    
    {    
      Local base = localByName(b,"temp$4");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"toString",parameterTypes,returnType,false);      
      Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs5));    
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
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie4));    
    Local lhs8 = localByName(b,"temp$6");    
    {    
      Local base = localByName(b,"temp$3");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs6));    
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
    Local lhs9 = localByName(b,"temp$7");    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"dbman",type,false);      Value rhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs9,rhs7));    
    Local lhs10 = localByName(b,"temp$8");    
    RefType type2 = RefType.v("java.lang.StringBuffer");    
    Value rhs8 = Jimple.v().newNewExpr(type2);    
    units.add(Jimple.v().newAssignStmt(lhs10,rhs8));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);      
      Value ie6 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie6));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie7));    
    Local lhs11 = localByName(b,"temp$9");    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"parentURL",type,false);      Value rhs9 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs11,rhs9));    
    Local lhs12 = localByName(b,"temp$10");    
    {    
      Local base = localByName(b,"temp$9");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"toString",parameterTypes,returnType,false);      
      Value rhs10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs12,rhs10));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie8));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie9));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie10));    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.Object");      
      parameterTypes.add(type0);      
      RefType returnType = RefType.v("java.lang.StringBuffer");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);      
      Value ie11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie11));    
    Local lhs13 = localByName(b,"temp$11");    
    {    
      Local base = localByName(b,"temp$8");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);      
      Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs13,rhs11));    
    {    
      Local base = localByName(b,"temp$7");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.databaseUtils.DataBaseManager"),"executeInsertQuery",parameterTypes,returnType,false);      
      Value ie12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie12));    
    Local lhs14 = localByName(b,"temp$12");    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"URLcount",type,false);      Value rhs12 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs14,rhs12));    
    Local lhs15 = localByName(b,"temp$13");    
    Local left0 = localByName(b,"temp$12");    
    Value right0 = IntConstant.v(1);    
    Value rhs13 = Jimple.v().newAddExpr(left0,right0);    
    units.add(Jimple.v().newAssignStmt(lhs15,rhs13));    
    {    
      Type type = IntType.v();      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"URLcount",type,false);      Value lhs16 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs14 = localByName(b,"temp$13");    
    units.add(Jimple.v().newAssignStmt(lhs16,rhs14));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod12(SootClass c) {  
    SootMethod m = new SootMethod("getDbman",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"dbman",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod13(SootClass c) {  
    SootMethod m = new SootMethod("setDbman",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("dbman", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"dbman");    
    RefType paramType0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"dbman",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"dbman");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod14(SootClass c) {  
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
