                                                            import java.util.*;                                                            
                                                            import soot.*;                                                            
                                                            import soot.jimple.*;                                                            
                                                            import soot.util.*;                                                            
                                                                                                                        
                                                            public class                                                             org_apache_tomcat_dbcp_dbcp_datasources_UserPassKey_Maker                                                             {                                                            
                                                            private static Local localByName(Body b, String name) {                                                            
                                                            	for(Local l: b.getLocals()) {                                                            
                                                            		if(l.getName().equals(name))                                                            
                                                            			return l;                                                            
                                                            	}                                                            
                                                            	throw new IllegalArgumentException("No such local: "+name);                                                            
                                                            }                                                            
                                                              public void create() {                                                              
                                                                SootClass c = new SootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                
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
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));                                                                
                                                                locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                
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
                                                                  Local base = localByName(b,"r0");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"<init>",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"username",type,false);                                                                  Value lhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                Local rhs0 = localByName(b,"r1");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs3,rhs0));                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"password",type,false);                                                                  Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                Local rhs1 = localByName(b,"r2");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs4,rhs1));                                                                
                                                                units.add(Jimple.v().newReturnVoidStmt());                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod1(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("getPassword",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"password",type,false);                                                                  Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                Local retVal0 = localByName(b,"$r1");                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod2(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("getUsername",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"username",type,false);                                                                  Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                Local retVal0 = localByName(b,"$r1");                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod3(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("equals",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));                                                                
                                                                locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("r2", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));                                                                
                                                                locals.add(Jimple.v().newLocal("z0", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("z1", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z2", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r3", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r4", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z3", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r7", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r8", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z4", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r9", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z5", RefType.v("boolean")));                                                                
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
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"r1");                                                                
                                                                RefType paramType0 = RefType.v("java.lang.Object");                                                                
                                                                int number0=0;                                                                
                                                                Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));                                                                
                                                                Local left0 = localByName(b,"r1");                                                                
                                                                Value right0 = NullConstant.v();                                                                
                                                                Value condition0 = Jimple.v().newNeExpr(left0,right0);                                                                
                                                                Unit target0=jumpTarget0;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition0,target0));                                                                
                                                                Value retVal0 = IntConstant.v(0);                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                                Local left1 = localByName(b,"r1");                                                                
                                                                Local right1 = localByName(b,"r0");                                                                
                                                                Value condition1 = Jimple.v().newNeExpr(left1,right1);                                                                
                                                                Unit target1=jumpTarget1;                                                                
                                                                units.add(jumpTarget0);                                                                
                                                                units.add(Jimple.v().newIfStmt(condition1,target1));                                                                
                                                                Value retVal1 = IntConstant.v(1);                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal1));                                                                
                                                                Local lhs2 = localByName(b,"$z2");                                                                
                                                                Type type1 = BooleanType.v();                                                                
                                                                Local op0 = localByName(b,"r1");                                                                
                                                                Value rhs0 = Jimple.v().newInstanceOfExpr(type1,op0);                                                                
                                                                units.add(jumpTarget1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs2,rhs0));                                                                
                                                                Local left2 = localByName(b,"$z2");                                                                
                                                                Value right2 = IntConstant.v(0);                                                                
                                                                Value condition2 = Jimple.v().newNeExpr(left2,right2);                                                                
                                                                Unit target2=jumpTarget2;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition2,target2));                                                                
                                                                Value retVal2 = IntConstant.v(0);                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal2));                                                                
                                                                Local lhs3 = localByName(b,"r2");                                                                
                                                                RefType type2 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                
                                                                Local op1 = localByName(b,"r1");                                                                
                                                                Value rhs1 = Jimple.v().newCastExpr(type2,op1);                                                                
                                                                units.add(jumpTarget2);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs3,rhs1));                                                                
                                                                Local lhs4 = localByName(b,"$r3");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"username",type,false);                                                                  Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs4,rhs2));                                                                
                                                                Local left3 = localByName(b,"$r3");                                                                
                                                                Value right3 = NullConstant.v();                                                                
                                                                Value condition3 = Jimple.v().newNeExpr(left3,right3);                                                                
                                                                Unit target3=jumpTarget4;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition3,target3));                                                                
                                                                Local lhs5 = localByName(b,"$r4");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"username",type,false);                                                                  Value rhs3 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs5,rhs3));                                                                
                                                                Local left4 = localByName(b,"$r4");                                                                
                                                                Value right4 = NullConstant.v();                                                                
                                                                Value condition4 = Jimple.v().newNeExpr(left4,right4);                                                                
                                                                Unit target4=jumpTarget3;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition4,target4));                                                                
                                                                Local lhs6 = localByName(b,"$z3");                                                                
                                                                Value rhs4 = IntConstant.v(1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs6,rhs4));                                                                
                                                                Unit target5=jumpTarget5;                                                                
                                                                units.add(Jimple.v().newGotoStmt(target5));                                                                
                                                                Local lhs7 = localByName(b,"$z3");                                                                
                                                                Value rhs5 = IntConstant.v(0);                                                                
                                                                units.add(jumpTarget3);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs7,rhs5));                                                                
                                                                Unit target6=jumpTarget5;                                                                
                                                                units.add(Jimple.v().newGotoStmt(target6));                                                                
                                                                Local lhs8 = localByName(b,"$r5");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"username",type,false);                                                                  Value rhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget4);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs8,rhs6));                                                                
                                                                Local lhs9 = localByName(b,"$r6");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"username",type,false);                                                                  Value rhs7 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs9,rhs7));                                                                
                                                                Local lhs10 = localByName(b,"$z3");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r5");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"equals",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs10,rhs8));                                                                
                                                                Local lhs11 = localByName(b,"z0");                                                                
                                                                Local rhs9 = localByName(b,"$z3");                                                                
                                                                units.add(jumpTarget5);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs11,rhs9));                                                                
                                                                Local lhs12 = localByName(b,"$r7");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"password",type,false);                                                                  Value rhs10 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs12,rhs10));                                                                
                                                                Local left5 = localByName(b,"$r7");                                                                
                                                                Value right5 = NullConstant.v();                                                                
                                                                Value condition5 = Jimple.v().newNeExpr(left5,right5);                                                                
                                                                Unit target7=jumpTarget8;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition5,target7));                                                                
                                                                Local lhs13 = localByName(b,"$r8");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"password",type,false);                                                                  Value rhs11 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs13,rhs11));                                                                
                                                                Local left6 = localByName(b,"$r8");                                                                
                                                                Value right6 = NullConstant.v();                                                                
                                                                Value condition6 = Jimple.v().newNeExpr(left6,right6);                                                                
                                                                Unit target8=jumpTarget7;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition6,target8));                                                                
                                                                Local lhs14 = localByName(b,"$z4");                                                                
                                                                Value rhs12 = IntConstant.v(1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs14,rhs12));                                                                
                                                                Unit target9=jumpTarget9;                                                                
                                                                units.add(Jimple.v().newGotoStmt(target9));                                                                
                                                                Local lhs15 = localByName(b,"$z4");                                                                
                                                                Value rhs13 = IntConstant.v(0);                                                                
                                                                units.add(jumpTarget7);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs15,rhs13));                                                                
                                                                Unit target10=jumpTarget9;                                                                
                                                                units.add(Jimple.v().newGotoStmt(target10));                                                                
                                                                Local lhs16 = localByName(b,"$r9");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"password",type,false);                                                                  Value rhs14 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget8);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs16,rhs14));                                                                
                                                                Local lhs17 = localByName(b,"$r10");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"password",type,false);                                                                  Value rhs15 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs17,rhs15));                                                                
                                                                Local lhs18 = localByName(b,"$z4");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r9");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"equals",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs18,rhs16));                                                                
                                                                Local lhs19 = localByName(b,"z1");                                                                
                                                                Local rhs17 = localByName(b,"$z4");                                                                
                                                                units.add(jumpTarget9);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs19,rhs17));                                                                
                                                                Local left7 = localByName(b,"z0");                                                                
                                                                Value right7 = IntConstant.v(0);                                                                
                                                                Value condition7 = Jimple.v().newEqExpr(left7,right7);                                                                
                                                                Unit target11=jumpTarget11;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition7,target11));                                                                
                                                                Local left8 = localByName(b,"z1");                                                                
                                                                Value right8 = IntConstant.v(0);                                                                
                                                                Value condition8 = Jimple.v().newEqExpr(left8,right8);                                                                
                                                                Unit target12=jumpTarget11;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition8,target12));                                                                
                                                                Local lhs20 = localByName(b,"$z5");                                                                
                                                                Value rhs18 = IntConstant.v(1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs20,rhs18));                                                                
                                                                Unit target13=jumpTarget13;                                                                
                                                                units.add(Jimple.v().newGotoStmt(target13));                                                                
                                                                Local lhs21 = localByName(b,"$z5");                                                                
                                                                Value rhs19 = IntConstant.v(0);                                                                
                                                                units.add(jumpTarget11);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs21,rhs19));                                                                
                                                                Local retVal3 = localByName(b,"$z5");                                                                
                                                                units.add(jumpTarget13);                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal3));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod4(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("hashCode",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r2", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                NopStmt jumpTarget0= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget1= Jimple.v().newNopStmt();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"username",type,false);                                                                  Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                Local left0 = localByName(b,"$r1");                                                                
                                                                Value right0 = NullConstant.v();                                                                
                                                                Value condition0 = Jimple.v().newEqExpr(left0,right0);                                                                
                                                                Unit target0=jumpTarget0;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition0,target0));                                                                
                                                                Local lhs2 = localByName(b,"$r2");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"username",type,false);                                                                  Value rhs1 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs2,rhs1));                                                                
                                                                Local lhs3 = localByName(b,"$i0");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"hashCode",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs3,rhs2));                                                                
                                                                Unit target1=jumpTarget1;                                                                
                                                                units.add(Jimple.v().newGotoStmt(target1));                                                                
                                                                Local lhs4 = localByName(b,"$i0");                                                                
                                                                Value rhs3 = IntConstant.v(0);                                                                
                                                                units.add(jumpTarget0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs4,rhs3));                                                                
                                                                Local retVal0 = localByName(b,"$i0");                                                                
                                                                units.add(jumpTarget1);                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod5(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("toString",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.StringBuffer")));                                                                
                                                                locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.StringBuffer")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r4", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.StringBuffer")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.StringBuffer")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r7", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r8", RefType.v("java.lang.StringBuffer")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.String")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                RefType type1 = RefType.v("java.lang.StringBuffer");                                                                
                                                                Value rhs0 = Jimple.v().newNewExpr(type1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"<init>",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                Local lhs2 = localByName(b,"r2");                                                                
                                                                Local rhs1 = localByName(b,"$r1");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs2,rhs1));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.StringBuffer");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);                                                                  
                                                                  Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie1));                                                                
                                                                Local lhs3 = localByName(b,"$r4");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"username",type,false);                                                                  Value rhs2 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs3,rhs2));                                                                
                                                                Local lhs4 = localByName(b,"$r5");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.StringBuffer");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs4,rhs3));                                                                
                                                                Local lhs5 = localByName(b,"$r6");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r5");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.StringBuffer");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs5,rhs4));                                                                
                                                                Local lhs6 = localByName(b,"$r7");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"password",type,false);                                                                  Value rhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs6,rhs5));                                                                
                                                                Local lhs7 = localByName(b,"$r8");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r6");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.StringBuffer");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs7,rhs6));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r8");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = CharType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.StringBuffer");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"append",parameterTypes,returnType,false);                                                                  
                                                                  Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie2));                                                                
                                                                Local lhs8 = localByName(b,"$r10");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.StringBuffer"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs8,rhs7));                                                                
                                                                Local retVal0 = localByName(b,"$r10");                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                            }                                                            
