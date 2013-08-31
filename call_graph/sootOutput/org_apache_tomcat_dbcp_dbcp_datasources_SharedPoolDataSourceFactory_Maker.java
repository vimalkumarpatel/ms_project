                                                            import java.util.*;                                                            
                                                            import soot.*;                                                            
                                                            import soot.jimple.*;                                                            
                                                            import soot.util.*;                                                            
                                                                                                                        
                                                            public class                                                             org_apache_tomcat_dbcp_dbcp_datasources_SharedPoolDataSourceFactory_Maker                                                             {                                                            
                                                            private static Local localByName(Body b, String name) {                                                            
                                                            	for(Local l: b.getLocals()) {                                                            
                                                            		if(l.getName().equals(name))                                                            
                                                            			return l;                                                            
                                                            	}                                                            
                                                            	throw new IllegalArgumentException("No such local: "+name);                                                            
                                                            }                                                            
                                                              public void create() {                                                              
                                                                SootClass c = new SootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory");                                                                
                                                                c.setApplicationClass();                                                                
                                                                Scene.v().addClass(c);                                                                
                                                                createMethod0(c);                                                                
                                                                createMethod1(c);                                                                
                                                                createMethod2(c);                                                                
                                                                createMethod3(c);                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod0(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("<init>",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r0");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"<init>",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                units.add(Jimple.v().newReturnVoidStmt());                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod1(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("isCorrectClass",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory")));                                                                
                                                                locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r2", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"r1");                                                                
                                                                RefType paramType0 = RefType.v("java.lang.String");                                                                
                                                                int number0=0;                                                                
                                                                Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));                                                                
                                                                Local lhs2 = localByName(b,"$r2");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory"),"SHARED_POOL_CLASSNAME",type,true);                                                                  Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs2,rhs0));                                                                
                                                                Local lhs3 = localByName(b,"$z0");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"equals",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs3,rhs1));                                                                
                                                                Local retVal0 = localByName(b,"$z0");                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod2(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("getNewInstance",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory")));                                                                
                                                                locals.add(Jimple.v().newLocal("r1", RefType.v("javax.naming.Reference")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r2", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));                                                                
                                                                locals.add(Jimple.v().newLocal("r3", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource")));                                                                
                                                                locals.add(Jimple.v().newLocal("r4", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r7", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));                                                                
                                                                locals.add(Jimple.v().newLocal("r8", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r9", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r11", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i1", RefType.v("int")));                                                                
                                                                locals.add(Jimple.v().newLocal("r12", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r13", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r14", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r15", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i2", RefType.v("int")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                NopStmt jumpTarget0= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget1= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget2= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget3= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget4= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget5= Jimple.v().newNopStmt();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"r1");                                                                
                                                                RefType paramType0 = RefType.v("javax.naming.Reference");                                                                
                                                                int number0=0;                                                                
                                                                Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));                                                                
                                                                Local lhs2 = localByName(b,"$r2");                                                                
                                                                RefType type1 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");                                                                
                                                                Value rhs0 = Jimple.v().newNewExpr(type1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs2,rhs0));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"<init>",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                Local lhs3 = localByName(b,"r3");                                                                
                                                                Local rhs1 = localByName(b,"$r2");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs3,rhs1));                                                                
                                                                Local lhs4 = localByName(b,"r4");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs4,rhs2));                                                                
                                                                Local left0 = localByName(b,"r4");                                                                
                                                                Value right0 = NullConstant.v();                                                                
                                                                Value condition0 = Jimple.v().newEqExpr(left0,right0);                                                                
                                                                Unit target0=jumpTarget0;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition0,target0));                                                                
                                                                Local lhs5 = localByName(b,"$r5");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r4");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs5,rhs3));                                                                
                                                                Local left1 = localByName(b,"$r5");                                                                
                                                                Value right1 = NullConstant.v();                                                                
                                                                Value condition1 = Jimple.v().newEqExpr(left1,right1);                                                                
                                                                Unit target1=jumpTarget0;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition1,target1));                                                                
                                                                Local lhs6 = localByName(b,"$r6");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r4");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs6,rhs4));                                                                
                                                                Local lhs7 = localByName(b,"$r7");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r6");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs7,rhs5));                                                                
                                                                Local lhs8 = localByName(b,"$i0");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs6 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs8,rhs6));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r3");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"setMaxActive",parameterTypes,returnType,false);                                                                  
                                                                  Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie1));                                                                
                                                                Local lhs9 = localByName(b,"r8");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs9,rhs7));                                                                
                                                                Local left2 = localByName(b,"r8");                                                                
                                                                Value right2 = NullConstant.v();                                                                
                                                                Value condition2 = Jimple.v().newEqExpr(left2,right2);                                                                
                                                                Unit target2=jumpTarget2;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition2,target2));                                                                
                                                                Local lhs10 = localByName(b,"$r9");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r8");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs10,rhs8));                                                                
                                                                Local left3 = localByName(b,"$r9");                                                                
                                                                Value right3 = NullConstant.v();                                                                
                                                                Value condition3 = Jimple.v().newEqExpr(left3,right3);                                                                
                                                                Unit target3=jumpTarget2;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition3,target3));                                                                
                                                                Local lhs11 = localByName(b,"$r10");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r8");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs11,rhs9));                                                                
                                                                Local lhs12 = localByName(b,"$r11");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r10");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs12,rhs10));                                                                
                                                                Local lhs13 = localByName(b,"$i1");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs11 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs13,rhs11));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r3");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"setMaxIdle",parameterTypes,returnType,false);                                                                  
                                                                  Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie2));                                                                
                                                                Local lhs14 = localByName(b,"r12");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget2);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs14,rhs12));                                                                
                                                                Local left4 = localByName(b,"r12");                                                                
                                                                Value right4 = NullConstant.v();                                                                
                                                                Value condition4 = Jimple.v().newEqExpr(left4,right4);                                                                
                                                                Unit target4=jumpTarget4;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition4,target4));                                                                
                                                                Local lhs15 = localByName(b,"$r13");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r12");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs15,rhs13));                                                                
                                                                Local left5 = localByName(b,"$r13");                                                                
                                                                Value right5 = NullConstant.v();                                                                
                                                                Value condition5 = Jimple.v().newEqExpr(left5,right5);                                                                
                                                                Unit target5=jumpTarget4;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition5,target5));                                                                
                                                                Local lhs16 = localByName(b,"$r14");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r12");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs16,rhs14));                                                                
                                                                Local lhs17 = localByName(b,"$r15");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r14");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs17,rhs15));                                                                
                                                                Local lhs18 = localByName(b,"$i2");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs16 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs18,rhs16));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r3");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource"),"setMaxWait",parameterTypes,returnType,false);                                                                  
                                                                  Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie3));                                                                
                                                                Local retVal0 = localByName(b,"r3");                                                                
                                                                units.add(jumpTarget4);                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod3(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("<clinit>",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("$r0", RefType.v("java.lang.Class")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"$r0");                                                                
                                                                Value rhs0 = ClassConstant.v("org/apache/tomcat/dbcp/dbcp/datasources/SharedPoolDataSource");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs0,rhs0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r0");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Class"),"getName",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs1));                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSourceFactory"),"SHARED_POOL_CLASSNAME",type,true);                                                                  Value lhs2 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                Local rhs2 = localByName(b,"$r1");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs2,rhs2));                                                                
                                                                units.add(Jimple.v().newReturnVoidStmt());                                                                
                                                              }                                                              
                                                                                                                        
                                                            }                                                            
