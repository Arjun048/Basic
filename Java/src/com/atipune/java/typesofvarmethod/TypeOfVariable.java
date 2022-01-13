 package com.atipune.java.typesofvarmethod;

public class TypeOfVariable {
int x=20;//instance/non static variable
static int y=40;//static variable
static TypeOfVariable vt; //global variable used for 
//block
	{
		
	}
//static block
	static
	{
		
	}
	void addition()   //Non static method
	{
		int x=27;//local variable
	}

	void disply()   	//instance method or non static method

	{
		System.out.println(x);//instance variable or non static variable
		System.out.println(y);//static variable
	}
	//static method
	public static void main(String[] args) 	  //static method

	{
		System.out.println(y);//access only static variable
		TypeOfVariable vt=new TypeOfVariable();
		System.out.println(vt.x);//by using object creation we can access the non static variable
	}
	static void multiplication() 	//static method

	{
		System.out.println(vt.x);
		
	}

}
