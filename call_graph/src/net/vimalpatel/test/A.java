package net.vimalpatel.test;

/**
 * 
 * @author vimalkumarpatel
 * 
 * this class is purely for test purposes
 *
 */
public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new A();
		int x = 1;
		boolean testBool = (x<2)?true:false;
		
		if(true){
			
			System.out.println("THIS IS A TRUE CONDITION :)");
		}
		if(testBool){
			//call methodA
			boolean dummyBool1 = true;
			if(dummyBool1) System.out.println("DUMMY BOOL IS TRUE !");
			a.methodA();
			
		}else{

			
			a.methodA2();
			
		}
	}
	public void methodA(){
		System.out.println("still in class A, methodA()");
	}
	public void methodA2(){
		int x = 10;
		if((x==1)?true:false){
			System.out.println("the is useless IF part");
		}else{
			System.out.println("this is another useless ELSE part !!");
		}
		System.out.println("now the dummy IF-ELSE is over !!");
		methodC();
	}
	private void methodC(){
		B b = new B();
		b.methodB();
	}
}
