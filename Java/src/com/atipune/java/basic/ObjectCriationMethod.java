package com.atipune.java.basic;

public class ObjectCriationMethod {
int age=20;
int total=0;
void display() 
{
	System.out.println(age);
	System.out.println(total);
}

void addition()
{
	total=age+30;
}


	public static void main(String[] args) {
		ObjectCriationMethod obj1=new ObjectCriationMethod();
		obj1.display();
		obj1.addition();
		obj1.display();
		obj1. age=70;
		obj1.display();
        obj1.addition();
		obj1.display();


		


	}

}
