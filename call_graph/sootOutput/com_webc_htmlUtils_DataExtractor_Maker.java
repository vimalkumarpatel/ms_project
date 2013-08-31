import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.util.*;

public class com_webc_htmlUtils_DataExtractor_Maker {
private static Local localByName(Body b, String name) {
	for(Local l: b.getLocals()) {
		if(l.getName().equals(name))
			return l;
	}
	throw new IllegalArgumentException("No such local: "+name);
}
  public void create() {  
    SootClass c = new SootClass("com.webc.htmlUtils.DataExtractor");    
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
  }  

  public void createMethod0(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("dbman", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("res", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("int")));    
    locals.add(Jimple.v().newLocal("a", RefType.v("net.vimalpatel.test.A")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("net.vimalpatel.test.A")));    
    Chain<Unit> units = b.getUnits();    
    NopStmt jumpTarget0= Jimple.v().newNopStmt();    
    NopStmt jumpTarget1= Jimple.v().newNopStmt();    
    NopStmt jumpTarget2= Jimple.v().newNopStmt();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"dbman");    
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
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"dbman",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"dbman");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    Local lhs3 = localByName(b,"res");    
    Value rhs1 = IntConstant.v(6);    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs1));    
    Value left0 = IntConstant.v(6);    
    Local right0 = localByName(b,"res");    
    Value condition0 = Jimple.v().newLtExpr(left0,right0);    
    Unit target0=jumpTarget0;    
    units.add(Jimple.v().newIfStmt(condition0,target0));    
    Unit target1=jumpTarget1;    
    units.add(Jimple.v().newGotoStmt(target1));    
    units.add(jumpTarget0);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs4 = localByName(b,"temp$0");    
    Local rhs2 = localByName(b,"res");    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs2));    
    Local lhs5 = localByName(b,"temp$1");    
    Local left1 = localByName(b,"temp$0");    
    Value right1 = IntConstant.v(1);    
    Value rhs3 = Jimple.v().newAddExpr(left1,right1);    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs3));    
    Local lhs6 = localByName(b,"res");    
    Local rhs4 = localByName(b,"temp$1");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs4));    
    Unit target2=jumpTarget2;    
    units.add(Jimple.v().newGotoStmt(target2));    
    units.add(jumpTarget1);    
    units.add(Jimple.v().newNopStmt());    
    Local lhs7 = localByName(b,"temp$2");    
    RefType type1 = RefType.v("net.vimalpatel.test.A");    
    Value rhs5 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs5));    
    {    
      Local base = localByName(b,"temp$2");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("net.vimalpatel.test.A"),"<init>",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs8 = localByName(b,"a");    
    Local rhs6 = localByName(b,"temp$2");    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs6));    
    {    
      Local base = localByName(b,"a");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("net.vimalpatel.test.A"),"methodA",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    {    
      Local base = localByName(b,"a");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("net.vimalpatel.test.A"),"methodA2",parameterTypes,returnType,false);      
      Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie3));    
    units.add(jumpTarget2);    
    units.add(Jimple.v().newNopStmt());    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod1(SootClass c) {  
    SootMethod m = new SootMethod("<init>",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("htmlpage", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("inpUrl", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("qm", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("dbman", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"htmlpage");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    Local lhs2 = localByName(b,"inpUrl");    
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
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"htmlpage",type,false);      Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"htmlpage");    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs0));    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"inpUrl",type,false);      Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs1 = localByName(b,"inpUrl");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs1));    
    {    
      RefType type = RefType.v("com.webc.utils.QueueManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"qm",type,false);      Value lhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs2 = localByName(b,"qm");    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs2));    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"dbman",type,false);      Value lhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs3 = localByName(b,"dbman");    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs3));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod2(SootClass c) {  
    SootMethod m = new SootMethod("processpage",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"extractlinks",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"extracttext",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod3(SootClass c) {  
    SootMethod m = new SootMethod("extractlinks",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("com.webc.utils.QueueManager")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    locals.add(Jimple.v().newLocal("temp$6", RefType.v("com.webc.htmlUtils.LinkExtractor")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    RefType type1 = RefType.v("com.webc.htmlUtils.LinkExtractor");    
    Value rhs0 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"getHtmlpage",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"temp$2");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.net.URL");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"getInpUrl",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"temp$3");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("com.webc.utils.QueueManager");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"getQm",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local lhs5 = localByName(b,"temp$4");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"getDbman",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.net.URL");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("com.webc.utils.QueueManager");      
      parameterTypes.add(type2);      
      RefType type3 = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      parameterTypes.add(type3);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      RefType type = RefType.v("com.webc.htmlUtils.LinkExtractor");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"le",type,false);      Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs5 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    Local lhs7 = localByName(b,"temp$5");    
    {    
      RefType type = RefType.v("com.webc.htmlUtils.LinkExtractor");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"le",type,false);      Value rhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    {    
      Local base = localByName(b,"temp$5");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"findlinks",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    Local lhs8 = localByName(b,"temp$6");    
    {    
      RefType type = RefType.v("com.webc.htmlUtils.LinkExtractor");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"le",type,false);      Value rhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs8,rhs7));    
    {    
      Local base = localByName(b,"temp$6");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.LinkExtractor"),"ValidateAllLinks",parameterTypes,returnType,false);      
      Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie2));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod4(SootClass c) {  
    SootMethod m = new SootMethod("extracttext",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    locals.add(Jimple.v().newLocal("temp$1", RefType.v("java.net.URL")));    
    locals.add(Jimple.v().newLocal("temp$2", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$3", RefType.v("java.lang.String")));    
    locals.add(Jimple.v().newLocal("temp$4", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    locals.add(Jimple.v().newLocal("temp$5", RefType.v("com.webc.htmlUtils.TextExtractor")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    RefType type1 = RefType.v("com.webc.htmlUtils.TextExtractor");    
    Value rhs0 = Jimple.v().newNewExpr(type1);    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local lhs2 = localByName(b,"temp$1");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.net.URL");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"getInpUrl",parameterTypes,returnType,false);      
      Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs1));    
    Local lhs3 = localByName(b,"temp$2");    
    {    
      Local base = localByName(b,"temp$1");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.net.URL"),"toString",parameterTypes,returnType,false);      
      Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs3,rhs2));    
    Local lhs4 = localByName(b,"temp$3");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("java.lang.String");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"getHtmlpage",parameterTypes,returnType,false);      
      Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs4,rhs3));    
    Local lhs5 = localByName(b,"temp$4");    
    {    
      Local base = localByName(b,"this");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType returnType = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"getDbman",parameterTypes,returnType,false);      
      Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs5,rhs4));    
    {    
      Local base = localByName(b,"temp$0");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      RefType type0 = RefType.v("java.lang.String");      
      parameterTypes.add(type0);      
      RefType type1 = RefType.v("java.lang.String");      
      parameterTypes.add(type1);      
      RefType type2 = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      parameterTypes.add(type2);      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"<init>",parameterTypes,returnType,false);      
      Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie0));    
    {    
      RefType type = RefType.v("com.webc.htmlUtils.TextExtractor");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"te",type,false);      Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs5 = localByName(b,"temp$0");    
    units.add(Jimple.v().newAssignStmt(lhs6,rhs5));    
    Local lhs7 = localByName(b,"temp$5");    
    {    
      RefType type = RefType.v("com.webc.htmlUtils.TextExtractor");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"te",type,false);      Value rhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs7,rhs6));    
    {    
      Local base = localByName(b,"temp$5");      
      List<Type> parameterTypes = new LinkedList<Type>();      
      Type returnType = VoidType.v();      
      SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("com.webc.htmlUtils.TextExtractor"),"extracttext",parameterTypes,returnType,false);      
      Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);      
    }    
    units.add(Jimple.v().newInvokeStmt(ie1));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod5(SootClass c) {  
    SootMethod m = new SootMethod("getHtmlpage",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"htmlpage",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod6(SootClass c) {  
    SootMethod m = new SootMethod("setHtmlpage",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("htmlpage", RefType.v("java.lang.String")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"htmlpage");    
    RefType paramType0 = RefType.v("java.lang.String");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.lang.String");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"htmlpage",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"htmlpage");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod7(SootClass c) {  
    SootMethod m = new SootMethod("getInpUrl",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("java.net.URL")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"inpUrl",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod8(SootClass c) {  
    SootMethod m = new SootMethod("setInpUrl",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("inpUrl", RefType.v("java.net.URL")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"inpUrl");    
    RefType paramType0 = RefType.v("java.net.URL");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("java.net.URL");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"inpUrl",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"inpUrl");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod9(SootClass c) {  
    SootMethod m = new SootMethod("getQm",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("com.webc.utils.QueueManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("com.webc.utils.QueueManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"qm",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod10(SootClass c) {  
    SootMethod m = new SootMethod("setQm",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("qm", RefType.v("com.webc.utils.QueueManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"qm");    
    RefType paramType0 = RefType.v("com.webc.utils.QueueManager");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("com.webc.utils.QueueManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"qm",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"qm");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

  public void createMethod11(SootClass c) {  
    SootMethod m = new SootMethod("getDbman",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("temp$0", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"temp$0");    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"dbman",type,false);      Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    units.add(Jimple.v().newAssignStmt(lhs1,rhs0));    
    Local retVal0 = localByName(b,"temp$0");    
    units.add(Jimple.v().newReturnStmt(retVal0));    
  }  

  public void createMethod12(SootClass c) {  
    SootMethod m = new SootMethod("setDbman",null,null);    
    Body b = Jimple.v().newBody(m);    
    m.setActiveBody(b);    
    Chain<Local> locals = b.getLocals();    
    locals.add(Jimple.v().newLocal("this", RefType.v("com.webc.htmlUtils.DataExtractor")));    
    locals.add(Jimple.v().newLocal("dbman", RefType.v("com.webc.databaseUtils.DataBaseManager")));    
    Chain<Unit> units = b.getUnits();    
    Local lhs0 = localByName(b,"this");    
    RefType type0 = RefType.v("com.webc.htmlUtils.DataExtractor");    
    Value idRef0 = Jimple.v().newThisRef(type0);    
    units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));    
    Local lhs1 = localByName(b,"dbman");    
    RefType paramType0 = RefType.v("com.webc.databaseUtils.DataBaseManager");    
    int number0=0;    
    Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);    
    units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));    
    {    
      RefType type = RefType.v("com.webc.databaseUtils.DataBaseManager");      
      SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("com.webc.htmlUtils.DataExtractor"),"dbman",type,false);      Value lhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);      
    }    
    Local rhs0 = localByName(b,"dbman");    
    units.add(Jimple.v().newAssignStmt(lhs2,rhs0));    
    units.add(Jimple.v().newReturnVoidStmt());    
  }  

}
