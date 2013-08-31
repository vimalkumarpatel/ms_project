                                                            import java.util.*;                                                            
                                                            import soot.*;                                                            
                                                            import soot.jimple.*;                                                            
                                                            import soot.util.*;                                                            
                                                                                                                        
                                                            public class                                                             org_apache_tomcat_dbcp_dbcp_datasources_PooledConnectionAndInfo_Maker                                                             {                                                            
                                                            private static Local localByName(Body b, String name) {                                                            
                                                            	for(Local l: b.getLocals()) {                                                            
                                                            		if(l.getName().equals(name))                                                            
                                                            			return l;                                                            
                                                            	}                                                            
                                                            	throw new IllegalArgumentException("No such local: "+name);                                                            
                                                            }                                                            
                                                              public void create() {                                                              
                                                                SootClass c = new SootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");                                                                
                                                                c.setApplicationClass();                                                                
                                                                Scene.v().addClass(c);                                                                
                                                                createMethod0(c);                                                                
                                                                createMethod1(c);                                                                
                                                                createMethod2(c);                                                                
                                                                createMethod3(c);                                                                
                                                                createMethod4(c);                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod0(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("<init>",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo")));                                                                
                                                                locals.add(Jimple.v().newLocal("r1", RefType.v("javax.sql.PooledConnection")));                                                                
                                                                locals.add(Jimple.v().newLocal("r2", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("r3", RefType.v("java.lang.String")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r4", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"r1");                                                                
                                                                RefType paramType0 = RefType.v("javax.sql.PooledConnection");                                                                
                                                                int number0=0;                                                                
                                                                Value idRef1 = Jimple.v().newParameterRef(paramType0, number0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs1,idRef1));                                                                
                                                                Local lhs2 = localByName(b,"r2");                                                                
                                                                RefType paramType1 = RefType.v("java.lang.String");                                                                
                                                                int number1=1;                                                                
                                                                Value idRef2 = Jimple.v().newParameterRef(paramType1, number1);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs2,idRef2));                                                                
                                                                Local lhs3 = localByName(b,"r3");                                                                
                                                                RefType paramType2 = RefType.v("java.lang.String");                                                                
                                                                int number2=2;                                                                
                                                                Value idRef3 = Jimple.v().newParameterRef(paramType2, number2);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs3,idRef3));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"r0");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("java.lang.Object"),"<init>",parameterTypes,returnType,false);                                                                  
                                                                  Value ie0 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie0));                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("javax.sql.PooledConnection");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"pooledConnection",type,false);                                                                  Value lhs4 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                Local rhs0 = localByName(b,"r1");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs4,rhs0));                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"username",type,false);                                                                  Value lhs5 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                Local rhs1 = localByName(b,"r2");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs5,rhs1));                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"password",type,false);                                                                  Value lhs6 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                Local rhs2 = localByName(b,"r3");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs6,rhs2));                                                                
                                                                Local lhs7 = localByName(b,"$r4");                                                                
                                                                RefType type1 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                
                                                                Value rhs3 = Jimple.v().newNewExpr(type1);                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs7,rhs3));                                                                
                                                                {                                                                
                                                                  Local base = localByName(b,"$r4");                                                                  
                                                                  List<Type> parameterTypes = new LinkedList<Type>();                                                                  
                                                                  RefType type0 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type0);                                                                  
                                                                  RefType type1 = RefType.v("java.lang.String");                                                                  
                                                                  parameterTypes.add(type1);                                                                  
                                                                  Type returnType = VoidType.v();                                                                  
                                                                  SootMethodRef methodRef = Scene.v().makeMethodRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey"),"<init>",parameterTypes,returnType,false);                                                                  
                                                                  Value ie1 = Jimple.v().newSpecialInvokeExpr(base,methodRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newInvokeStmt(ie1));                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"upkey",type,false);                                                                  Value lhs8 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                Local rhs4 = localByName(b,"$r4");                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs8,rhs4));                                                                
                                                                units.add(Jimple.v().newReturnVoidStmt());                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod1(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("getPooledConnection",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("javax.sql.PooledConnection")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("javax.sql.PooledConnection");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"pooledConnection",type,false);                                                                  Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                Local retVal0 = localByName(b,"$r1");                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod2(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("getUserPassKey",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.UserPassKey");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"upkey",type,false);                                                                  Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                Local retVal0 = localByName(b,"$r1");                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod3(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("getPassword",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"password",type,false);                                                                  Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                Local retVal0 = localByName(b,"$r1");                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                              public void createMethod4(SootClass c) {                                                              
                                                                SootMethod m = new SootMethod("getUsername",null,null);                                                                
                                                                Body b = Jimple.v().newBody(m);                                                                
                                                                m.setActiveBody(b);                                                                
                                                                Chain<Local> locals = b.getLocals();                                                                
                                                                locals.add(Jimple.v().newLocal("r0", RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo")));                                                                
                                                                locals.add(Jimple.v().newLocal("$r1", RefType.v("java.lang.String")));                                                                
                                                                Chain<Unit> units = b.getUnits();                                                                
                                                                Local lhs0 = localByName(b,"r0");                                                                
                                                                RefType type0 = RefType.v("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo");                                                                
                                                                Value idRef0 = Jimple.v().newThisRef(type0);                                                                
                                                                units.add(Jimple.v().newIdentityStmt(lhs0,idRef0));                                                                
                                                                Local lhs1 = localByName(b,"$r1");                                                                
                                                                {                                                                
                                                                  RefType type = RefType.v("java.lang.String");                                                                  
                                                                  SootFieldRef fieldRef = Scene.v().makeFieldRef(Scene.v().getSootClass("org.apache.tomcat.dbcp.dbcp.datasources.PooledConnectionAndInfo"),"username",type,false);                                                                  Value rhs0 = Jimple.v().newJInstanceFieldRef(fieldRef);                                                                  
                                                                }                                                                
                                                                units.add(Jimple.v().newAssignStmt(lhs1,rhs0));                                                                
                                                                Local retVal0 = localByName(b,"$r1");                                                                
                                                                units.add(Jimple.v().newReturnStmt(retVal0));                                                                
                                                              }                                                              
                                                                                                                        
                                                            }                                                            
