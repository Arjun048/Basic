package com.atipune.java.datatype;

public class IntDataType {
//Default data type for integrated data type is 'int'
//range of the 
//memory size is 4 byte(32 bits)
	int i1=533663;
	int i2=636363;
	int i3=(int)67778888778l;
	
	public void display() {
	System.out.println("=>"+i1);
	System.out.println("=>"+i2);
	System.out.println("=>"+i3);
	}
	public static void main(String[] args) {
		IntDataType idt=new IntDataType();
		idt.display();
	}

}
