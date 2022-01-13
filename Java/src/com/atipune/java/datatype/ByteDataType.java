package com.atipune.java.datatype;

public class ByteDataType {
	
	//Default data type of integrated data type is"int".
	//Memory size is 1 byte(8 bit)
	//Range- -128-127 
	//if the is value is out of the Range then use explicit type casting;
	//source =(source type)Destination
     byte b1=123;//ok
     byte b2=120; //if the is value is out of the Range then use explicit type casting;


public void displY() {
	
System.out.println(b1);
System.out.println(b2);
}
 public static void main(String[] args) {
	 ByteDataType bdt=new ByteDataType();
	 bdt.displY();
}

		}
