package com.atipune.java.datatype;

public class FloatDataType {
//default data type of floating type data type is 'double'.
//memeory size is 4 byte (32 bits)
//accuracy upto seven digit from decimal point
	 float f1=33.77f;//ok
	 float f2=33;//compilar automatically shows the value is double ata type 
	//default data type of floating type data type is 'double'.
     float f3=23.123456789f;//accuracy upto seven digit from decimal point

	public void dislpay() {
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

	}
	
	
	public static void main(String[] args) {
		
		FloatDataType fdt=new FloatDataType();
		fdt.dislpay();
	}

}
