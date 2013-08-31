            import java.util.*;            
            import soot.*;            
            import soot.jimple.*;            
            import soot.util.*;            
                        
            public class             org_apache_tomcat_dbcp_pool_KeyedObjectPool_Maker             {            
            private static Local localByName(Body b, String name) {            
            	for(Local l: b.getLocals()) {            
            		if(l.getName().equals(name))            
            			return l;            
            	}            
            	throw new IllegalArgumentException("No such local: "+name);            
            }            
              public void create() {              
                SootClass c = new SootClass("org.apache.tomcat.dbcp.pool.KeyedObjectPool");                
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
              }              
                        
              public void createMethod0(SootClass c) {              
                SootMethod m = new SootMethod("borrowObject",null,null);                
                Body b = Jimple.v().newBody(m);                
                m.setActiveBody(b);                
                  public void createMethod0(SootClass c) {                  
                    SootMethod m = new SootMethod("returnObject",null,null);                    
                    Body b = Jimple.v().newBody(m);                    
                    m.setActiveBody(b);                    
                      public void createMethod0(SootClass c) {                      
                        SootMethod m = new SootMethod("invalidateObject",null,null);                        
                        Body b = Jimple.v().newBody(m);                        
                        m.setActiveBody(b);                        
                          public void createMethod0(SootClass c) {                          
                            SootMethod m = new SootMethod("addObject",null,null);                            
                            Body b = Jimple.v().newBody(m);                            
                            m.setActiveBody(b);                            
                              public void createMethod0(SootClass c) {                              
                                SootMethod m = new SootMethod("getNumIdle",null,null);                                
                                Body b = Jimple.v().newBody(m);                                
                                m.setActiveBody(b);                                
                                  public void createMethod0(SootClass c) {                                  
                                    SootMethod m = new SootMethod("getNumActive",null,null);                                    
                                    Body b = Jimple.v().newBody(m);                                    
                                    m.setActiveBody(b);                                    
                                      public void createMethod0(SootClass c) {                                      
                                        SootMethod m = new SootMethod("getNumIdle",null,null);                                        
                                        Body b = Jimple.v().newBody(m);                                        
                                        m.setActiveBody(b);                                        
                                          public void createMethod0(SootClass c) {                                          
                                            SootMethod m = new SootMethod("getNumActive",null,null);                                            
                                            Body b = Jimple.v().newBody(m);                                            
                                            m.setActiveBody(b);                                            
                                              public void createMethod0(SootClass c) {                                              
                                                SootMethod m = new SootMethod("clear",null,null);                                                
                                                Body b = Jimple.v().newBody(m);                                                
                                                m.setActiveBody(b);                                                
                                                  public void createMethod0(SootClass c) {                                                  
                                                    SootMethod m = new SootMethod("clear",null,null);                                                    
                                                    Body b = Jimple.v().newBody(m);                                                    
                                                    m.setActiveBody(b);                                                    
                                                      public void createMethod0(SootClass c) {                                                      
                                                        SootMethod m = new SootMethod("close",null,null);                                                        
                                                        Body b = Jimple.v().newBody(m);                                                        
                                                        m.setActiveBody(b);                                                        
                                                          public void createMethod0(SootClass c) {                                                          
                                                            SootMethod m = new SootMethod("setFactory",null,null);                                                            
                                                            Body b = Jimple.v().newBody(m);                                                            
                                                            m.setActiveBody(b);                                                            
                                                            }                                                            
