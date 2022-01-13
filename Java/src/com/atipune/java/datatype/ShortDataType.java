package com.atipune.java.datatype;

public class ShortDataType {
//in integrated data type "int' is the default
//range of the short data type is
//memory size 2byte (16 bits)
	
	short s1=555;//ok
	short s2=(short)34677;//if the value is out of the range ,use the explicit type casting
	public void display() {
		System.out.println(s1);
		System.out.println(s2);
	}
	
	public static void main(String[] args) 
	{
		ShortDataType sdt=new ShortDataType();
		sdt.display();
	}

}
