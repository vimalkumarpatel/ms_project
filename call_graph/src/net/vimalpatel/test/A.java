package net.vimalpatel.test;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
		a.methodA2();
	}
	public void methodA(){
		System.out.println("still in class A, methodA()");
	}
	public void methodA2(){
		methodC();
	}
	private void methodC(){
		B b = new B();
		b.methodB();
	}

}
