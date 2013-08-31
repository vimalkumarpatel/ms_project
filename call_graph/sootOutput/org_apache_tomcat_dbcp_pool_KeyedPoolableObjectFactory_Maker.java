                                                                    import java.util.*;                                                                    
                                                                    import soot.*;                                                                    
                                                                    import soot.jimple.*;                                                                    
                                                                    import soot.util.*;                                                                    
                                                                                                                                        
                                                                    public class                                                                     org_apache_tomcat_dbcp_pool_KeyedPoolableObjectFactory_Maker                                                                     {                                                                    
                                                                    private static Local localByName(Body b, String name) {                                                                    
                                                                    	for(Local l: b.getLocals()) {                                                                    
                                                                    		if(l.getName().equals(name))                                                                    
                                                                    			return l;                                                                    
                                                                    	}                                                                    
                                                                    	throw new IllegalArgumentException("No such local: "+name);                                                                    
                                                                    }                                                                    
                                                                      public void create() {                                                                      
                                                                        SootClass c = new SootClass("org.apache.tomcat.dbcp.pool.KeyedPoolableObjectFactory");                                                                        
                                                                        c.setApplicationClass();                                                                        
                                                                        Scene.v().addClass(c);                                                                        
                                                                        createMethod0(c);                                                                        
                                                                        createMethod1(c);                                                                        
                                                                        createMethod2(c);                                                                        
                                                                        createMethod3(c);                                                                        
                                                                        createMethod4(c);                                                                        
                                                                      }                                                                      
                                                                                                                                        
                                                                      public void createMethod0(SootClass c) {                                                                      
                                                                        SootMethod m = new SootMethod("makeObject",null,null);                                                                        
                                                                        Body b = Jimple.v().newBody(m);                                                                        
                                                                        m.setActiveBody(b);                                                                        
                                                                          public void createMethod0(SootClass c) {                                                                          
                                                                            SootMethod m = new SootMethod("destroyObject",null,null);                                                                            
                                                                            Body b = Jimple.v().newBody(m);                                                                            
                                                                            m.setActiveBody(b);                                                                            
                                                                              public void createMethod0(SootClass c) {                                                                              
                                                                                SootMethod m = new SootMethod("validateObject",null,null);                                                                                
                                                                                Body b = Jimple.v().newBody(m);                                                                                
                                                                                m.setActiveBody(b);                                                                                
                                                                                  public void createMethod0(SootClass c) {                                                                                  
                                                                                    SootMethod m = new SootMethod("activateObject",null,null);                                                                                    
                                                                                    Body b = Jimple.v().newBody(m);                                                                                    
                                                                                    m.setActiveBody(b);                                                                                    
                                                                                      public void createMethod0(SootClass c) {                                                                                      
                                                                                        SootMethod m = new SootMethod("passivateObject",null,null);                                                                                        
                                                                                        Body b = Jimple.v().newBody(m);                                                                                        
                                                                                        m.setActiveBody(b);                                                                                        
                                                                                        }                                                                                        
