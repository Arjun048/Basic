package com.atipune.java.datatype;

public class DoubleDataType {
//default data type of the floating data type is 'double'
//Memory size is 8 byte (64 bits)
//accuracy upto 14-15 digit from the decimal point
	
	double d1=23.445;//ok
	double d2=23.1234567894555656755;//accuracy upto 14-15 digit from the decimal point
void display() {
	System.out.println(d1);
	System.out.println(d2);

}
	public static void main(String[] args) {
		DoubleDataType ddt =new DoubleDataType();
		ddt.display();

	}

}
