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
		

		if(testBool){
			//call methodA
			boolean dummyBool1 = true;
			if(dummyBool1) System.out.println("DUMMY BOOL IS TRUE !");
			a.method_dummy();
			System.out.println("just a filling statement 0");
		}else{
			System.out.println("just a filling statement 1");
			int i=0;
			i = i+10;
			i++;
			if(i>10){
				System.out.println("just a filling statement 1.1-I");
				i=i+15;
				if(i<20){
					i=i*2;
					System.out.println("just a filling statement 1.1.1-I");
				}else{
					System.out.println("just a filling statement 1.1.1-E");
					a.method_A1();
					System.out.println("XOXOXOXOXOX");
				}
			}else{
				System.out.println("just a filling statement 1.1-E");
			}
		}
	}
	public void method_dummy(){
		System.out.println("XOXOXOXO, methodA()");
	}
	public void method_A1(){
		int x = 10;
		if((x==1)?true:false){
			System.out.println("the is useless IF part");
		}else{
			System.out.println("this is another useless ELSE part !!");
		}
		if(method_A2()){
			System.out.println("Testing Call to next method in IF condition");
		}
		
	}
	private boolean method_A2(){
		B b = new B();
		b.method_B1();
		return true;
	}
}
