package com.atipune.java.datatype;

public class CharDataType {
//memory size 2 byte(16 bits)
//range-0 to 65535
	
	char ch1='@';
	char ch2='$';
	char ch3=66;
	char ch4=88;
	
	void display() {
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);

	}
	public static void main(String[] args) {
		CharDataType cdt=new CharDataType();
		cdt.display();
	}

}
