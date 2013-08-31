                                                            import java.util.*;                                                            
                                                            import soot.*;                                                            
                                                            import soot.jimple.*;                                                            
                                                            import soot.util.*;                                                            
                                                                                                                        
                                                            public class                                                             org_apache_tomcat_dbcp_dbcp_datasources_InstanceKeyObjectFactory_Maker                                                             {                                                            
                                                            private static Local localByName(Body b, String name) {                                                            
                                                            	for(Local l: b.getLocals()) {                                                            
                                                            		if(l.getName().equals(name))                                                            
                                                            			return l;                                                            
                                                            	}                                                            
                                                            	throw new IllegalArgumentException("No such local: "+name);                                                            
                                                            }                                                            
                                                              public void create() {                                                              
                                                                SootClass c = new SootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory");                                                                
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
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod0(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("<init>",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory");                                                                
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
                                                                units.add(Jimple.v().newReturnVoidStmt());                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod1(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("registerNewInstance",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));                                                                
                                                                locals.add(Jimple.v().newLocal("i0", RefType.v("int")));                                                                
                                                                locals.add(Jimple.v().newLocal("r1", RefType.v("java.util.Iterator")));                                                                
                                                                locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("r3", RefType.v("java.lang.NumberFormatException")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r4", RefType.v("java.util.Map")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r5", RefType.v("java.util.Set")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z1", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r7", RefType.v("java.lang.Integer")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i1", RefType.v("int")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r8", RefType.v("java.lang.NumberFormatException")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i2", RefType.v("int")));                                                                
                                                                locals.add(Jimple.v().newLocal("r9", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r10", RefType.v("java.util.Map")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                NopStmt jumpTarget0= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget1= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget2= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget3= Jimple.v().newNopStmt();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType paramType0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");                                                                
                                                                int number0=0;                                                                
                                                                Value idRef0 = Jimple.v().newParameterRef(paramType0, number0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"i0");                                                                
                                                                Value rhs0 = IntConstant.v(0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                Local lhs2 = localByName(b,"$r4");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.util.Map");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"instanceMap",type,true);                                                                  Value rhs1 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs2,rhs1));                                                                
                                                                Local lhs3 = localByName(b,"$r5");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r4");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.util.Set");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"keySet",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs2 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs3,rhs2));                                                                
                                                                Local lhs4 = localByName(b,"r1");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r5");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.util.Iterator");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Set"),"iterator",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs3 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs4,rhs3));                                                                
                                                                Local lhs5 = localByName(b,"$z0");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Iterator"),"hasNext",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs4 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs5,rhs4));                                                                
                                                                Local left0 = localByName(b,"$z0");                                                                
                                                                Value right0 = IntConstant.v(0);                                                                
                                                                Value condition0 = Jimple.v().newEqExpr(left0,right0);                                                                
                                                                Unit target0=jumpTarget3;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition0,target0));                                                                
                                                                Local lhs6 = localByName(b,"r2");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Iterator"),"next",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs5 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs6,rhs5));                                                                
                                                                Local lhs7 = localByName(b,"$z1");                                                                
                                                                Type type0 = BooleanType.v();                                                                
                                                                Local op0 = localByName(b,"r2");                                                                
                                                                Value rhs6 = Jimple.v().newInstanceOfExpr(type0,op0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs7,rhs6));                                                                
                                                                Local left1 = localByName(b,"$z1");                                                                
                                                                Value right1 = IntConstant.v(0);                                                                
                                                                Value condition1 = Jimple.v().newEqExpr(left1,right1);                                                                
                                                                Unit target1=jumpTarget1;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition1,target1));                                                                
                                                                Local lhs8 = localByName(b,"$r6");                                                                
                                                                RefType type1 = RefType.v("java.lang.String");                                                                
                                                                Local op1 = localByName(b,"r2");                                                                
                                                                Value rhs7 = Jimple.v().newCastExpr(type1,op1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs8,rhs7));                                                                
                                                                Local lhs9 = localByName(b,"$r7");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Integer");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"valueOf",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs8 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs9,rhs8));                                                                
                                                                Local lhs10 = localByName(b,"$i1");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r7");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"intValue",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs10,rhs9));                                                                
                                                                Local lhs11 = localByName(b,"i0");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type type1 = IntType.v();                                                                  
                                                                  parameterTypes.add(type1);                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Math"),"max",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs10 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs11,rhs10));                                                                
                                                                Unit target2=jumpTarget1;                                                                
                                                                units.add(Jimple.v().newGotoStmt(target2));                                                                
                                                                Local lhs12 = localByName(b,"$r8");                                                                
                                                                Value idRef1 = Jimple.v().newCaughtExceptionRef();                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs12,idRef1));                                                                
                                                                Local lhs13 = localByName(b,"r3");                                                                
                                                                Local rhs11 = localByName(b,"$r8");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs13,rhs11));                                                                
                                                                Unit target3=jumpTarget0;                                                                
                                                                units.add(jumpTarget1);                                                                
                                                                units.add(Jimple.v().newGotoStmt(target3));                                                                
                                                                Local lhs14 = localByName(b,"$i2");                                                                
                                                                Local left2 = localByName(b,"i0");                                                                
                                                                Value right2 = IntConstant.v(1);                                                                
                                                                Value rhs12 = Jimple.v().newAddExpr(left2,right2);                                                                
                                                                units.add(jumpTarget3);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs14,rhs12));                                                                
                                                                Local lhs15 = localByName(b,"r9");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.String"),"valueOf",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs13 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs15,rhs13));                                                                
                                                                Local lhs16 = localByName(b,"$r10");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.util.Map");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"instanceMap",type,true);                                                                  Value rhs14 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs16,rhs14));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r10");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType type1 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type1);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"put",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                Local retVal0 = localByName(b,"r9");                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod2(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("removeInstance",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("java.util.Map")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType paramType0 = RefType.v("java.lang.String");                                                                
                                                                int number0=0;                                                                
                                                                Value idRef0 = Jimple.v().newParameterRef(paramType0, number0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.util.Map");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"instanceMap",type,true);                                                                  Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"remove",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                units.add(Jimple.v().newReturnVoidStmt());                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod3(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("closeAll",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("$r0", RefType.v("java.util.Map")));                                                                
                                                                locals.add(Jimple.v().newLocal("r1", RefType.v("java.util.Iterator")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r2", RefType.v("java.util.Set")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r3", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r4", RefType.v("java.util.Map$Entry")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r6", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r7", RefType.v("java.util.Map")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                NopStmt jumpTarget0= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget1= Jimple.v().newNopStmt();                                                                
                                                                Local lhs0 = localByName(b,"$r0");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.util.Map");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"instanceMap",type,true);                                                                  Value rhs0 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs0,rhs0));                                                                
                                                                Local lhs1 = localByName(b,"$r2");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r0");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.util.Set");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"entrySet",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs1));                                                                
                                                                Local lhs2 = localByName(b,"r1");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.util.Iterator");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Set"),"iterator",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs2 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs2,rhs2));                                                                
                                                                Local lhs3 = localByName(b,"$z0");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Iterator"),"hasNext",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs3 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs3,rhs3));                                                                
                                                                Local left0 = localByName(b,"$z0");                                                                
                                                                Value right0 = IntConstant.v(0);                                                                
                                                                Value condition0 = Jimple.v().newEqExpr(left0,right0);                                                                
                                                                Unit target0=jumpTarget1;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition0,target0));                                                                
                                                                Local lhs4 = localByName(b,"$r3");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Iterator"),"next",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs4 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs4,rhs4));                                                                
                                                                Local lhs5 = localByName(b,"$r4");                                                                
                                                                RefType type0 = RefType.v("java.util.Map$Entry");                                                                
                                                                Local op0 = localByName(b,"$r3");                                                                
                                                                Value rhs5 = Jimple.v().newCastExpr(type0,op0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs5,rhs5));                                                                
                                                                Local lhs6 = localByName(b,"$r5");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r4");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map$Entry"),"getValue",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs6 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs6,rhs6));                                                                
                                                                Local lhs7 = localByName(b,"$r6");                                                                
                                                                RefType type1 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");                                                                
                                                                Local op1 = localByName(b,"$r5");                                                                
                                                                Value rhs7 = Jimple.v().newCastExpr(type1,op1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs7,rhs7));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r6");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"close",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                Unit target1=jumpTarget0;                                                                
                                                                units.add(Jimple.v().newGotoStmt(target1));                                                                
                                                                Local lhs8 = localByName(b,"$r7");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.util.Map");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"instanceMap",type,true);                                                                  Value rhs8 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs8,rhs8));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r7");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"clear",parameterTypes,returnType,false);                                                                  
                                                                  Value ie1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie1));                                                                
                                                                units.add(Jimple.v().newReturnVoidStmt());                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod4(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("getObjectInstance",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory")));                                                                
                                                                locals.add(Jimple.v().newLocal("r1", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("r2", RefType.v("javax.naming.Name")));                                                                
                                                                locals.add(Jimple.v().newLocal("r3", RefType.v("javax.naming.Context")));                                                                
                                                                locals.add(Jimple.v().newLocal("r4", RefType.v("java.util.Hashtable")));                                                                
                                                                locals.add(Jimple.v().newLocal("r5", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("r6", RefType.v("javax.naming.Reference")));                                                                
                                                                locals.add(Jimple.v().newLocal("r7", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("r8", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("r9", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z1", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r11", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r12", RefType.v("java.util.Map")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r13", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r14", RefType.v("java.util.Map")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r15", RefType.v("java.util.Map")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                NopStmt jumpTarget0= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget1= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget2= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget3= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget4= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget5= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget6= Jimple.v().newNopStmt();                                                                
                                                                NopStmt jumpTarget7= Jimple.v().newNopStmt();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory");                                                                
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
                                                                Unit target0=jumpTarget3;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition0,target0));                                                                
                                                                Local lhs7 = localByName(b,"r6");                                                                
                                                                RefType type2 = RefType.v("javax.naming.Reference");                                                                
                                                                Local op1 = localByName(b,"r1");                                                                
                                                                Value rhs2 = Jimple.v().newCastExpr(type2,op1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs7,rhs2));                                                                
                                                                Local lhs8 = localByName(b,"$r10");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r6");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"getClassName",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs8,rhs3));                                                                
                                                                Local lhs9 = localByName(b,"$z1");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r0");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"isCorrectClass",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs9,rhs4));                                                                
                                                                Local left1 = localByName(b,"$z1");                                                                
                                                                Value right1 = IntConstant.v(0);                                                                
                                                                Value condition1 = Jimple.v().newEqExpr(left1,right1);                                                                
                                                                Unit target1=jumpTarget3;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition1,target1));                                                                
                                                                Local lhs10 = localByName(b,"r7");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r6");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs10,rhs5));                                                                
                                                                Local left2 = localByName(b,"r7");                                                                
                                                                Value right2 = NullConstant.v();                                                                
                                                                Value condition2 = Jimple.v().newEqExpr(left2,right2);                                                                
                                                                Unit target2=jumpTarget0;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition2,target2));                                                                
                                                                Local lhs11 = localByName(b,"$r11");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r7");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs11,rhs6));                                                                
                                                                Local left3 = localByName(b,"$r11");                                                                
                                                                Value right3 = NullConstant.v();                                                                
                                                                Value condition3 = Jimple.v().newEqExpr(left3,right3);                                                                
                                                                Unit target3=jumpTarget0;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition3,target3));                                                                
                                                                Local lhs12 = localByName(b,"$r12");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.util.Map");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"instanceMap",type,true);                                                                  Value rhs7 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs12,rhs7));                                                                
                                                                Local lhs13 = localByName(b,"$r13");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r7");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs13,rhs8));                                                                
                                                                Local lhs14 = localByName(b,"r5");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r12");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs9 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs14,rhs9));                                                                
                                                                Unit target4=jumpTarget3;                                                                
                                                                units.add(Jimple.v().newGotoStmt(target4));                                                                
                                                                Local lhs15 = localByName(b,"r8");                                                                
                                                                Value rhs10 = NullConstant.v();                                                                
                                                                units.add(jumpTarget0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs15,rhs10));                                                                
                                                                Local left4 = localByName(b,"r2");                                                                
                                                                Value right4 = NullConstant.v();                                                                
                                                                Value condition4 = Jimple.v().newEqExpr(left4,right4);                                                                
                                                                Unit target5=jumpTarget2;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition4,target5));                                                                
                                                                Local lhs16 = localByName(b,"r8");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs16,rhs11));                                                                
                                                                Local lhs17 = localByName(b,"$r14");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.util.Map");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"instanceMap",type,true);                                                                  Value rhs12 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs17,rhs12));                                                                
                                                                Local lhs18 = localByName(b,"r5");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r14");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs13 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs18,rhs13));                                                                
                                                                Local left5 = localByName(b,"r5");                                                                
                                                                Value right5 = NullConstant.v();                                                                
                                                                Value condition5 = Jimple.v().newNeExpr(left5,right5);                                                                
                                                                Unit target6=jumpTarget3;                                                                
                                                                units.add(jumpTarget2);                                                                
                                                                units.add(Jimple.v().newIfStmt(condition5,target6));                                                                
                                                                Local lhs19 = localByName(b,"r9");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r0");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("javax.naming.Reference");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"getNewInstance",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs14 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs19,rhs14));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r0");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("javax.naming.Reference");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType type1 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");                                                                  
                                                                  parameterTypes.add(type1);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"setCommonProperties",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                Local lhs20 = localByName(b,"r5");                                                                
                                                                Local rhs15 = localByName(b,"r9");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs20,rhs15));                                                                
                                                                Local left6 = localByName(b,"r8");                                                                
                                                                Value right6 = NullConstant.v();                                                                
                                                                Value condition6 = Jimple.v().newEqExpr(left6,right6);                                                                
                                                                Unit target7=jumpTarget3;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition6,target7));                                                                
                                                                Local lhs21 = localByName(b,"$r15");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.util.Map");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"instanceMap",type,true);                                                                  Value rhs16 = Jimple.v().newStaticFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs21,rhs16));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r15");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType type1 = RefType.v("java.lang.Object");                                                                  
                                                                  parameterTypes.add(type1);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.Map"),"put",parameterTypes,returnType,false);                                                                  
                                                                  Value ie1 = Jimple.v().newInterfaceInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie1));                                                                
                                                                Local retVal0 = localByName(b,"r5");                                                                
                                                                units.add(jumpTarget3);                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod5(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("setCommonProperties",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory")));                                                                
                                                                locals.add(Jimple.v().newLocal("r1", RefType.v("javax.naming.Reference")));                                                                
                                                                locals.add(Jimple.v().newLocal("r2", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource")));                                                                
                                                                locals.add(Jimple.v().newLocal("r3", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("r4", RefType.v("byte[]")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r5", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r6", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r7", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("r8", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r9", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r10", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r11", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r12", RefType.v("java.lang.Boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z0", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("r13", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r14", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r15", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r16", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r17", RefType.v("java.lang.Boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z1", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("r18", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r19", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r20", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r21", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("r22", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r23", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r24", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r25", RefType.v("byte[]")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r26", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r27", RefType.v("java.util.Properties")));                                                                
                                                                locals.add(Jimple.v().newLocal("r28", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r29", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r30", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r31", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i0", RefType.v("int")));                                                                
                                                                locals.add(Jimple.v().newLocal("r32", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r33", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r34", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r35", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z2", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("r36", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r37", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r38", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r39", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r40", RefType.v("java.lang.Boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z3", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("r41", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r42", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r43", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r44", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i1", RefType.v("int")));                                                                
                                                                locals.add(Jimple.v().newLocal("r45", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r46", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r47", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r48", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i2", RefType.v("int")));                                                                
                                                                locals.add(Jimple.v().newLocal("r49", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r50", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r51", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r52", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$i3", RefType.v("int")));                                                                
                                                                locals.add(Jimple.v().newLocal("r53", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r54", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r55", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r56", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r57", RefType.v("java.lang.Boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("$z4", RefType.v("boolean")));                                                                
                                                                locals.add(Jimple.v().newLocal("r58", RefType.v("javax.naming.RefAddr")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r59", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r60", RefType.v("java.lang.Object")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r61", RefType.v("java.lang.String")));                                                                
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
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"r1");                                                                
                                                                RefType paramType0 = RefType.v("javax.naming.Reference");                                                                
                                                                int number0=0;                                                                
                                                                Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));                                                                
                                                                Local lhs2 = localByName(b,"r2");                                                                
                                                                RefType paramType1 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource");                                                                
                                                                int number1=1;                                                                
                                                                Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));                                                                
                                                                Local lhs3 = localByName(b,"r3");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs3,rhs0));                                                                
                                                                Local left0 = localByName(b,"r3");                                                                
                                                                Value right0 = NullConstant.v();                                                                
                                                                Value condition0 = Jimple.v().newEqExpr(left0,right0);                                                                
                                                                Unit target0=jumpTarget0;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition0,target0));                                                                
                                                                Local lhs4 = localByName(b,"$r5");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r3");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs4,rhs1));                                                                
                                                                Local left1 = localByName(b,"$r5");                                                                
                                                                Value right1 = NullConstant.v();                                                                
                                                                Value condition1 = Jimple.v().newEqExpr(left1,right1);                                                                
                                                                Unit target1=jumpTarget0;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition1,target1));                                                                
                                                                Local lhs5 = localByName(b,"$r6");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r3");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs5,rhs2));                                                                
                                                                Local lhs6 = localByName(b,"$r7");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r6");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs6,rhs3));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setDataSourceName",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                Local lhs7 = localByName(b,"r8");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs7,rhs4));                                                                
                                                                Local left2 = localByName(b,"r8");                                                                
                                                                Value right2 = NullConstant.v();                                                                
                                                                Value condition2 = Jimple.v().newEqExpr(left2,right2);                                                                
                                                                Unit target2=jumpTarget2;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition2,target2));                                                                
                                                                Local lhs8 = localByName(b,"$r9");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r8");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs8,rhs5));                                                                
                                                                Local left3 = localByName(b,"$r9");                                                                
                                                                Value right3 = NullConstant.v();                                                                
                                                                Value condition3 = Jimple.v().newEqExpr(left3,right3);                                                                
                                                                Unit target3=jumpTarget2;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition3,target3));                                                                
                                                                Local lhs9 = localByName(b,"$r10");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r8");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs9,rhs6));                                                                
                                                                Local lhs10 = localByName(b,"$r11");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r10");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs10,rhs7));                                                                
                                                                Local lhs11 = localByName(b,"$r12");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Boolean");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"valueOf",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs8 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs11,rhs8));                                                                
                                                                Local lhs12 = localByName(b,"$z0");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r12");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"booleanValue",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs12,rhs9));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = BooleanType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setDefaultAutoCommit",parameterTypes,returnType,false);                                                                  
                                                                  Value ie1 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie1));                                                                
                                                                Local lhs13 = localByName(b,"r13");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget2);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs13,rhs10));                                                                
                                                                Local left4 = localByName(b,"r13");                                                                
                                                                Value right4 = NullConstant.v();                                                                
                                                                Value condition4 = Jimple.v().newEqExpr(left4,right4);                                                                
                                                                Unit target4=jumpTarget4;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition4,target4));                                                                
                                                                Local lhs14 = localByName(b,"$r14");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r13");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs14,rhs11));                                                                
                                                                Local left5 = localByName(b,"$r14");                                                                
                                                                Value right5 = NullConstant.v();                                                                
                                                                Value condition5 = Jimple.v().newEqExpr(left5,right5);                                                                
                                                                Unit target5=jumpTarget4;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition5,target5));                                                                
                                                                Local lhs15 = localByName(b,"$r15");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r13");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs12 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs15,rhs12));                                                                
                                                                Local lhs16 = localByName(b,"$r16");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r15");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs13 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs16,rhs13));                                                                
                                                                Local lhs17 = localByName(b,"$r17");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Boolean");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"valueOf",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs14 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs17,rhs14));                                                                
                                                                Local lhs18 = localByName(b,"$z1");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r17");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"booleanValue",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs15 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs18,rhs15));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = BooleanType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setDefaultReadOnly",parameterTypes,returnType,false);                                                                  
                                                                  Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie2));                                                                
                                                                Local lhs19 = localByName(b,"r18");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs16 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget4);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs19,rhs16));                                                                
                                                                Local left6 = localByName(b,"r18");                                                                
                                                                Value right6 = NullConstant.v();                                                                
                                                                Value condition6 = Jimple.v().newEqExpr(left6,right6);                                                                
                                                                Unit target6=jumpTarget6;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition6,target6));                                                                
                                                                Local lhs20 = localByName(b,"$r19");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r18");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs17 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs20,rhs17));                                                                
                                                                Local left7 = localByName(b,"$r19");                                                                
                                                                Value right7 = NullConstant.v();                                                                
                                                                Value condition7 = Jimple.v().newEqExpr(left7,right7);                                                                
                                                                Unit target7=jumpTarget6;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition7,target7));                                                                
                                                                Local lhs21 = localByName(b,"$r20");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r18");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs18 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs21,rhs18));                                                                
                                                                Local lhs22 = localByName(b,"$r21");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r20");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs19 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs22,rhs19));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setDescription",parameterTypes,returnType,false);                                                                  
                                                                  Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie3));                                                                
                                                                Local lhs23 = localByName(b,"r22");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs20 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget6);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs23,rhs20));                                                                
                                                                Local left8 = localByName(b,"r22");                                                                
                                                                Value right8 = NullConstant.v();                                                                
                                                                Value condition8 = Jimple.v().newEqExpr(left8,right8);                                                                
                                                                Unit target8=jumpTarget8;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition8,target8));                                                                
                                                                Local lhs24 = localByName(b,"$r23");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r22");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs21 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs24,rhs21));                                                                
                                                                Local left9 = localByName(b,"$r23");                                                                
                                                                Value right9 = NullConstant.v();                                                                
                                                                Value condition9 = Jimple.v().newEqExpr(left9,right9);                                                                
                                                                Unit target9=jumpTarget8;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition9,target9));                                                                
                                                                Local lhs25 = localByName(b,"$r24");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r22");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs22 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs25,rhs22));                                                                
                                                                Local lhs26 = localByName(b,"$r25");                                                                
                                                                Type baseType = ByteType.v();                                                                
                                                                int numDimensions=1;                                                                
                                                                Type type1 = ArrayType.v(baseType, numDimensions);                                                                
                                                                Local op0 = localByName(b,"$r24");                                                                
                                                                Value rhs23 = Jimple.v().newCastExpr(type1,op0);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs26,rhs23));                                                                
                                                                Local lhs27 = localByName(b,"r4");                                                                
                                                                Type baseType = ByteType.v();                                                                
                                                                int numDimensions=1;                                                                
                                                                Type type2 = ArrayType.v(baseType, numDimensions);                                                                
                                                                Local op1 = localByName(b,"$r25");                                                                
                                                                Value rhs24 = Jimple.v().newCastExpr(type2,op1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs27,rhs24));                                                                
                                                                Local lhs28 = localByName(b,"$r26");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type baseType = ByteType.v();                                                                  
                                                                  int numDimensions=1;                                                                  
                                                                  Type type0 = ArrayType.v(baseType, numDimensions);                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"deserialize",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs25 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs28,rhs25));                                                                
                                                                Local lhs29 = localByName(b,"$r27");                                                                
                                                                RefType type3 = RefType.v("java.util.Properties");                                                                
                                                                Local op2 = localByName(b,"$r26");                                                                
                                                                Value rhs26 = Jimple.v().newCastExpr(type3,op2);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs29,rhs26));                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.util.Properties");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"jndiEnvironment",type,false);                                                                  Value lhs30 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                Local rhs27 = localByName(b,"$r27");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs30,rhs27));                                                                
                                                                Local lhs31 = localByName(b,"r28");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs28 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget8);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs31,rhs28));                                                                
                                                                Local left10 = localByName(b,"r28");                                                                
                                                                Value right10 = NullConstant.v();                                                                
                                                                Value condition10 = Jimple.v().newEqExpr(left10,right10);                                                                
                                                                Unit target10=jumpTarget10;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition10,target10));                                                                
                                                                Local lhs32 = localByName(b,"$r29");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r28");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs29 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs32,rhs29));                                                                
                                                                Local left11 = localByName(b,"$r29");                                                                
                                                                Value right11 = NullConstant.v();                                                                
                                                                Value condition11 = Jimple.v().newEqExpr(left11,right11);                                                                
                                                                Unit target11=jumpTarget10;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition11,target11));                                                                
                                                                Local lhs33 = localByName(b,"$r30");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r28");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs30 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs33,rhs30));                                                                
                                                                Local lhs34 = localByName(b,"$r31");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r30");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs31 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs34,rhs31));                                                                
                                                                Local lhs35 = localByName(b,"$i0");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs32 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs35,rhs32));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setLoginTimeout",parameterTypes,returnType,false);                                                                  
                                                                  Value ie4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie4));                                                                
                                                                Local lhs36 = localByName(b,"r32");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs33 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget10);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs36,rhs33));                                                                
                                                                Local left12 = localByName(b,"r32");                                                                
                                                                Value right12 = NullConstant.v();                                                                
                                                                Value condition12 = Jimple.v().newEqExpr(left12,right12);                                                                
                                                                Unit target12=jumpTarget12;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition12,target12));                                                                
                                                                Local lhs37 = localByName(b,"$r33");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r32");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs34 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs37,rhs34));                                                                
                                                                Local left13 = localByName(b,"$r33");                                                                
                                                                Value right13 = NullConstant.v();                                                                
                                                                Value condition13 = Jimple.v().newEqExpr(left13,right13);                                                                
                                                                Unit target13=jumpTarget12;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition13,target13));                                                                
                                                                Local lhs38 = localByName(b,"$r34");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r32");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs35 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs38,rhs35));                                                                
                                                                Local lhs39 = localByName(b,"$r35");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r34");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs36 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs39,rhs36));                                                                
                                                                Local lhs40 = localByName(b,"$z2");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"getBoolean",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs37 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs40,rhs37));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = BooleanType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setTestOnBorrow",parameterTypes,returnType,false);                                                                  
                                                                  Value ie5 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie5));                                                                
                                                                Local lhs41 = localByName(b,"r36");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs38 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget12);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs41,rhs38));                                                                
                                                                Local left14 = localByName(b,"r36");                                                                
                                                                Value right14 = NullConstant.v();                                                                
                                                                Value condition14 = Jimple.v().newEqExpr(left14,right14);                                                                
                                                                Unit target14=jumpTarget14;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition14,target14));                                                                
                                                                Local lhs42 = localByName(b,"$r37");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r36");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs39 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs42,rhs39));                                                                
                                                                Local left15 = localByName(b,"$r37");                                                                
                                                                Value right15 = NullConstant.v();                                                                
                                                                Value condition15 = Jimple.v().newEqExpr(left15,right15);                                                                
                                                                Unit target15=jumpTarget14;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition15,target15));                                                                
                                                                Local lhs43 = localByName(b,"$r38");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r36");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs40 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs43,rhs40));                                                                
                                                                Local lhs44 = localByName(b,"$r39");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r38");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs41 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs44,rhs41));                                                                
                                                                Local lhs45 = localByName(b,"$r40");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Boolean");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"valueOf",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs42 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs45,rhs42));                                                                
                                                                Local lhs46 = localByName(b,"$z3");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r40");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"booleanValue",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs43 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs46,rhs43));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = BooleanType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setTestOnReturn",parameterTypes,returnType,false);                                                                  
                                                                  Value ie6 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie6));                                                                
                                                                Local lhs47 = localByName(b,"r41");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs44 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget14);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs47,rhs44));                                                                
                                                                Local left16 = localByName(b,"r41");                                                                
                                                                Value right16 = NullConstant.v();                                                                
                                                                Value condition16 = Jimple.v().newEqExpr(left16,right16);                                                                
                                                                Unit target16=jumpTarget16;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition16,target16));                                                                
                                                                Local lhs48 = localByName(b,"$r42");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r41");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs45 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs48,rhs45));                                                                
                                                                Local left17 = localByName(b,"$r42");                                                                
                                                                Value right17 = NullConstant.v();                                                                
                                                                Value condition17 = Jimple.v().newEqExpr(left17,right17);                                                                
                                                                Unit target17=jumpTarget16;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition17,target17));                                                                
                                                                Local lhs49 = localByName(b,"$r43");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r41");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs46 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs49,rhs46));                                                                
                                                                Local lhs50 = localByName(b,"$r44");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r43");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs47 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs50,rhs47));                                                                
                                                                Local lhs51 = localByName(b,"$i1");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs48 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs51,rhs48));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setTimeBetweenEvictionRunsMillis",parameterTypes,returnType,false);                                                                  
                                                                  Value ie7 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie7));                                                                
                                                                Local lhs52 = localByName(b,"r45");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs49 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget16);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs52,rhs49));                                                                
                                                                Local left18 = localByName(b,"r45");                                                                
                                                                Value right18 = NullConstant.v();                                                                
                                                                Value condition18 = Jimple.v().newEqExpr(left18,right18);                                                                
                                                                Unit target18=jumpTarget18;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition18,target18));                                                                
                                                                Local lhs53 = localByName(b,"$r46");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r45");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs50 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs53,rhs50));                                                                
                                                                Local left19 = localByName(b,"$r46");                                                                
                                                                Value right19 = NullConstant.v();                                                                
                                                                Value condition19 = Jimple.v().newEqExpr(left19,right19);                                                                
                                                                Unit target19=jumpTarget18;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition19,target19));                                                                
                                                                Local lhs54 = localByName(b,"$r47");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r45");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs51 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs54,rhs51));                                                                
                                                                Local lhs55 = localByName(b,"$r48");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r47");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs52 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs55,rhs52));                                                                
                                                                Local lhs56 = localByName(b,"$i2");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs53 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs56,rhs53));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setNumTestsPerEvictionRun",parameterTypes,returnType,false);                                                                  
                                                                  Value ie8 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie8));                                                                
                                                                Local lhs57 = localByName(b,"r49");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs54 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget18);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs57,rhs54));                                                                
                                                                Local left20 = localByName(b,"r49");                                                                
                                                                Value right20 = NullConstant.v();                                                                
                                                                Value condition20 = Jimple.v().newEqExpr(left20,right20);                                                                
                                                                Unit target20=jumpTarget20;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition20,target20));                                                                
                                                                Local lhs58 = localByName(b,"$r50");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r49");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs55 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs58,rhs55));                                                                
                                                                Local left21 = localByName(b,"$r50");                                                                
                                                                Value right21 = NullConstant.v();                                                                
                                                                Value condition21 = Jimple.v().newEqExpr(left21,right21);                                                                
                                                                Unit target21=jumpTarget20;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition21,target21));                                                                
                                                                Local lhs59 = localByName(b,"$r51");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r49");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs56 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs59,rhs56));                                                                
                                                                Local lhs60 = localByName(b,"$r52");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r51");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs57 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs60,rhs57));                                                                
                                                                Local lhs61 = localByName(b,"$i3");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = IntType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Integer"),"parseInt",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs58 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs61,rhs58));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = IntType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setMinEvictableIdleTimeMillis",parameterTypes,returnType,false);                                                                  
                                                                  Value ie9 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie9));                                                                
                                                                Local lhs62 = localByName(b,"r53");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs59 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget20);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs62,rhs59));                                                                
                                                                Local left22 = localByName(b,"r53");                                                                
                                                                Value right22 = NullConstant.v();                                                                
                                                                Value condition22 = Jimple.v().newEqExpr(left22,right22);                                                                
                                                                Unit target22=jumpTarget22;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition22,target22));                                                                
                                                                Local lhs63 = localByName(b,"$r54");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r53");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs60 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs63,rhs60));                                                                
                                                                Local left23 = localByName(b,"$r54");                                                                
                                                                Value right23 = NullConstant.v();                                                                
                                                                Value condition23 = Jimple.v().newEqExpr(left23,right23);                                                                
                                                                Unit target23=jumpTarget22;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition23,target23));                                                                
                                                                Local lhs64 = localByName(b,"$r55");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r53");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs61 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs64,rhs61));                                                                
                                                                Local lhs65 = localByName(b,"$r56");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r55");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs62 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs65,rhs62));                                                                
                                                                Local lhs66 = localByName(b,"$r57");                                                                
                                                                {                                                                
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Boolean");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"valueOf",parameterTypes,returnType,true);                                                                  
                                                                  Value rhs63 = Jimple.v().newStaticInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs66,rhs63));                                                                
                                                                Local lhs67 = localByName(b,"$z4");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r57");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = BooleanType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Boolean"),"booleanValue",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs64 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs67,rhs64));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type type0 = BooleanType.v();                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setTestWhileIdle",parameterTypes,returnType,false);                                                                  
                                                                  Value ie10 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie10));                                                                
                                                                Local lhs68 = localByName(b,"r58");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r1");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType returnType = RefType.v("javax.naming.RefAddr");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.Reference"),"get",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs65 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(jumpTarget22);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs68,rhs65));                                                                
                                                                Local left24 = localByName(b,"r58");                                                                
                                                                Value right24 = NullConstant.v();                                                                
                                                                Value condition24 = Jimple.v().newEqExpr(left24,right24);                                                                
                                                                Unit target24=jumpTarget24;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition24,target24));                                                                
                                                                Local lhs69 = localByName(b,"$r59");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r58");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs66 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs69,rhs66));                                                                
                                                                Local left25 = localByName(b,"$r59");                                                                
                                                                Value right25 = NullConstant.v();                                                                
                                                                Value condition25 = Jimple.v().newEqExpr(left25,right25);                                                                
                                                                Unit target25=jumpTarget24;                                                                
                                                                units.add(Jimple.v().newIfStmt(condition25,target25));                                                                
                                                                Local lhs70 = localByName(b,"$r60");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r58");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.Object");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("javax.naming.RefAddr"),"getContent",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs67 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs70,rhs67));                                                                
                                                                Local lhs71 = localByName(b,"$r61");                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r60");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType returnType = RefType.v("java.lang.String");                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"toString",parameterTypes,returnType,false);                                                                  
                                                                  Value rhs68 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs71,rhs68));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r2");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyDataSource"),"setValidationQuery",parameterTypes,returnType,false);                                                                  
                                                                  Value ie11 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie11));                                                                
                                                                units.add(jumpTarget24);                                                                
                                                                units.add(Jimple.v().newReturnVoidStmt());                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod6(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("isCorrectClass",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                  public void createMethod6(SootClass c) {                                                                  
                                                                    SootMethod m = new SootMethod("getNewInstance",null,null);                                                                    
                                                                    Body b = Jimple.v().newBody(m);                                                                    
                                                                    m.setActiveBody(b);                                                                    
                                                                      public void createMethod6(SootClass c) {                                                                      
                                                                        SootMethod m = new SootMethod("deserialize",null,null);                                                                        
                                                                        Body b = Jimple.v().newBody(m);                                                                        
                                                                        m.setActiveBody(b);                                                                        
                                                                        Chain<Local> locals = b.getLocals();                                                                        
                                                                        locals.add(Jimple.v().newLocal("r0", RefType.v("byte[]")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("r1", RefType.v("java.io.ObjectInputStream")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("$r2", RefType.v("java.io.ByteArrayInputStream")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("r3", RefType.v("java.lang.Object")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("r4", RefType.v("java.io.IOException")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("r5", RefType.v("java.lang.Throwable")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("r6", RefType.v("java.io.IOException")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("$r7", RefType.v("java.io.ObjectInputStream")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("$r8", RefType.v("java.io.IOException")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("$r9", RefType.v("java.lang.Throwable")));                                                                        
                                                                        locals.add(Jimple.v().newLocal("$r10", RefType.v("java.io.IOException")));                                                                        
                                                                        Chain<Unit> units = b.getUnits();                                                                        
                                                                        NopStmt jumpTarget0= Jimple.v().newNopStmt();                                                                        
                                                                        NopStmt jumpTarget1= Jimple.v().newNopStmt();                                                                        
                                                                        NopStmt jumpTarget2= Jimple.v().newNopStmt();                                                                        
                                                                        NopStmt jumpTarget3= Jimple.v().newNopStmt();                                                                        
                                                                        Local lhs0 = localByName(b,"r0");                                                                        
                                                                        Type baseType = ByteType.v();                                                                        
                                                                        int numDimensions=1;                                                                        
                                                                        Type paramType0 = ArrayType.v(baseType, numDimensions);                                                                        
                                                                        int number0=0;                                                                        
                                                                        Value idRef0 = Jimple.v().newParameterRef(paramType0, number0);                                                                        
                                                                        units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                        
                                                                        Local lhs1 = localByName(b,"r1");                                                                        
                                                                        Value rhs0 = NullConstant.v();                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                        
                                                                        Local lhs2 = localByName(b,"$r7");                                                                        
                                                                        RefType type0 = RefType.v("java.io.ObjectInputStream");                                                                        
                                                                        Value rhs1 = Jimple.v().newNewExpr(type0);                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs2,rhs1));                                                                        
                                                                        Local lhs3 = localByName(b,"$r2");                                                                        
                                                                        RefType type1 = RefType.v("java.io.ByteArrayInputStream");                                                                        
                                                                        Value rhs2 = Jimple.v().newNewExpr(type1);                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs3,rhs2));                                                                        
                                                                        {                                                                        
                                                                          Local base = localByName(b,"$r2");                                                                          
                                                                          List<Type> parameterTypes = new LinkedList<Type>();                                                                          
                                                                          Type baseType = ByteType.v();                                                                          
                                                                          int numDimensions=1;                                                                          
                                                                          Type type0 = ArrayType.v(baseType, numDimensions);                                                                          
                                                                          parameterTypes.add(type0);                                                                          
                                                                          Type returnType = VoidType.v();                                                                          
                                                                          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.ByteArrayInputStream"),"<init>",parameterTypes,returnType,false);                                                                          
                                                                          Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                          
                                                                        }                                                                        
                                                                        units.add(Jimple.v().newInvokeStmt(ie0));                                                                        
                                                                        {                                                                        
                                                                          Local base = localByName(b,"$r7");                                                                          
                                                                          List<Type> parameterTypes = new LinkedList<Type>();                                                                          
                                                                          RefType type0 = RefType.v("java.io.InputStream");                                                                          
                                                                          parameterTypes.add(type0);                                                                          
                                                                          Type returnType = VoidType.v();                                                                          
                                                                          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.ObjectInputStream"),"<init>",parameterTypes,returnType,false);                                                                          
                                                                          Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                          
                                                                        }                                                                        
                                                                        units.add(Jimple.v().newInvokeStmt(ie1));                                                                        
                                                                        Local lhs4 = localByName(b,"r1");                                                                        
                                                                        Local rhs3 = localByName(b,"$r7");                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs4,rhs3));                                                                        
                                                                        Local lhs5 = localByName(b,"r3");                                                                        
                                                                        {                                                                        
                                                                          Local base = localByName(b,"r1");                                                                          
                                                                          List<Type> parameterTypes = new LinkedList<Type>();                                                                          
                                                                          RefType returnType = RefType.v("java.lang.Object");                                                                          
                                                                          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.ObjectInputStream"),"readObject",parameterTypes,returnType,false);                                                                          
                                                                          Value rhs4 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                          
                                                                        }                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs5,rhs4));                                                                        
                                                                        Local left0 = localByName(b,"r1");                                                                        
                                                                        Value right0 = NullConstant.v();                                                                        
                                                                        Value condition0 = Jimple.v().newEqExpr(left0,right0);                                                                        
                                                                        Unit target0=jumpTarget0;                                                                        
                                                                        units.add(Jimple.v().newIfStmt(condition0,target0));                                                                        
                                                                        {                                                                        
                                                                          Local base = localByName(b,"r1");                                                                          
                                                                          List<Type> parameterTypes = new LinkedList<Type>();                                                                          
                                                                          Type returnType = VoidType.v();                                                                          
                                                                          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.ObjectInputStream"),"close",parameterTypes,returnType,false);                                                                          
                                                                          Value ie2 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                          
                                                                        }                                                                        
                                                                        units.add(Jimple.v().newInvokeStmt(ie2));                                                                        
                                                                        Unit target1=jumpTarget0;                                                                        
                                                                        units.add(Jimple.v().newGotoStmt(target1));                                                                        
                                                                        Local lhs6 = localByName(b,"$r8");                                                                        
                                                                        Value idRef1 = Jimple.v().newCaughtExceptionRef();                                                                        
                                                                        units.add(Jimple.v().newIdentityStmt(lhs6,idRef1));                                                                        
                                                                        Local lhs7 = localByName(b,"r4");                                                                        
                                                                        Local rhs5 = localByName(b,"$r8");                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs7,rhs5));                                                                        
                                                                        Local retVal0 = localByName(b,"r3");                                                                        
                                                                        units.add(jumpTarget0);                                                                        
                                                                        units.add(Jimple.v().newReturnStmt(retVal0));                                                                        
                                                                        Local lhs8 = localByName(b,"$r9");                                                                        
                                                                        Value idRef2 = Jimple.v().newCaughtExceptionRef();                                                                        
                                                                        units.add(Jimple.v().newIdentityStmt(lhs8,idRef2));                                                                        
                                                                        Local lhs9 = localByName(b,"r5");                                                                        
                                                                        Local rhs6 = localByName(b,"$r9");                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs9,rhs6));                                                                        
                                                                        Local left1 = localByName(b,"r1");                                                                        
                                                                        Value right1 = NullConstant.v();                                                                        
                                                                        Value condition1 = Jimple.v().newEqExpr(left1,right1);                                                                        
                                                                        Unit target2=jumpTarget2;                                                                        
                                                                        units.add(Jimple.v().newIfStmt(condition1,target2));                                                                        
                                                                        {                                                                        
                                                                          Local base = localByName(b,"r1");                                                                          
                                                                          List<Type> parameterTypes = new LinkedList<Type>();                                                                          
                                                                          Type returnType = VoidType.v();                                                                          
                                                                          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.io.ObjectInputStream"),"close",parameterTypes,returnType,false);                                                                          
                                                                          Value ie3 = Jimple.v().newVirtualInvokeExpr(base,methodRef);                                                                          
                                                                        }                                                                        
                                                                        units.add(Jimple.v().newInvokeStmt(ie3));                                                                        
                                                                        Unit target3=jumpTarget2;                                                                        
                                                                        units.add(Jimple.v().newGotoStmt(target3));                                                                        
                                                                        Local lhs10 = localByName(b,"$r10");                                                                        
                                                                        Value idRef3 = Jimple.v().newCaughtExceptionRef();                                                                        
                                                                        units.add(Jimple.v().newIdentityStmt(lhs10,idRef3));                                                                        
                                                                        Local lhs11 = localByName(b,"r6");                                                                        
                                                                        Local rhs7 = localByName(b,"$r10");                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs11,rhs7));                                                                        
                                                                        Local op0 = localByName(b,"r5");                                                                        
                                                                        units.add(jumpTarget2);                                                                        
                                                                        units.add(Jimple.v().newThrowStmt(op0));                                                                        
                                                                      }                                                                      
                                                                                                                                        
                                                                      public void createMethod7(SootClass c) {                                                                      
                                                                        SootMethod m = new SootMethod("<clinit>",null,null);                                                                        
                                                                        Body b = Jimple.v().newBody(m);                                                                        
                                                                        m.setActiveBody(b);                                                                        
                                                                        Chain<Local> locals = b.getLocals();                                                                        
                                                                        locals.add(Jimple.v().newLocal("$r0", RefType.v("java.util.HashMap")));                                                                        
                                                                        Chain<Unit> units = b.getUnits();                                                                        
                                                                        Local lhs0 = localByName(b,"$r0");                                                                        
                                                                        RefType type0 = RefType.v("java.util.HashMap");                                                                        
                                                                        Value rhs0 = Jimple.v().newNewExpr(type0);                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs0,rhs0));                                                                        
                                                                        {                                                                        
                                                                          Local base = localByName(b,"$r0");                                                                          
                                                                          List<Type> parameterTypes = new LinkedList<Type>();                                                                          
                                                                          Type returnType = VoidType.v();                                                                          
                                                                          SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.util.HashMap"),"<init>",parameterTypes,returnType,false);                                                                          
                                                                          Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                          
                                                                        }                                                                        
                                                                        units.add(Jimple.v().newInvokeStmt(ie0));                                                                        
                                                                        {                                                                        
                                                                          RefType type = RefType.v("java.util.Map");                                                                          
                                                                          SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.InstanceKeyObjectFactory"),"instanceMap",type,true);                                                                          Value lhs1 = Jimple.v().newStaticFieldRef(fieldRef);                                                                          
                                                                        }                                                                        
                                                                        Local rhs1 = localByName(b,"$r0");                                                                        
                                                                        units.add(Jimple.v().newAssignStmt(lhs1,rhs1));                                                                        
                                                                        units.add(Jimple.v().newReturnVoidStmt());                                                                        
                                                                      }                                                                      
                                                                                                                                        
                                                                    }                                                                    
