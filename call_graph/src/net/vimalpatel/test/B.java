package net.vimalpatel.test;

/**
 * 
 * @author vimalkumarpatel
 * 
 * this class is purely for test purposes
 *
 */
public class B {

	public boolean method_B1(){
		System.out.println("this is method B.b() here.");
		return true;
	}

	public static void main(String[] args){
		B b = new B();
		int x=10;
		
		if(x>1){
			System.out.println("IF...");
			System.out.println("IF....");
			
			System.out.println("IF..");
		}else{
			System.out.println("ELSE...");
			if(b.method_B1()){
				System.out.println("xxx");
			}else{
				System.out.println("ELSE..");
			}
		}
	}
}
