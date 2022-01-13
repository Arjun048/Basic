package com.atipune.java.datatype;

public class LongDataType {
//Default data type is 'int'
//range 
//Memory size 8byte (64 bits)
	
	long l1= 9860538436l;
	long l2=7038475392l;
	long l3= (long)67837827389827l;
	
	public void display() {
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

	}
	
	public static void main(String[] args) {
		LongDataType ldt=new LongDataType();
		ldt.display();

	}

}
