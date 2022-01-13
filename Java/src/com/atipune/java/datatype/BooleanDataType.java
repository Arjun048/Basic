package com.atipune.java.datatype;

public class BooleanDataType {
//boolean data type only allow true or false value.

	boolean b1; //if no any value to the data type compiler automatically gives default value is 'false'
	boolean b2=true;
	boolean b3=false;
	//boolean b4='A'; not ok
	//boolean b5=True; not ok
	//boolean b6=False; not ok

void display() {
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	
}

	public static void main(String[] args) {
		BooleanDataType bdt =new BooleanDataType();
		bdt.display();
	}

}
