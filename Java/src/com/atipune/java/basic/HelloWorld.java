package com.atipune.java.basic;

class A{
	 
	 void test() {
		
		 
		
	}
}
class B extends A{
	
	public  void test() {
		
	}
}
public class HelloWorld {
	

	public static void main(String[] args) {
	

		StringBuffer s1=new StringBuffer("Hello");
		StringBuffer s2=new StringBuffer("Hello");
	
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
	}

}
