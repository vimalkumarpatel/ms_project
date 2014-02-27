package net.vimalpatel.test;

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
			int dummyInt1 = 10;
			boolean dummyBool1 = true;
			a.methodA();
			Long dummyLong1 = new Long(10);
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
