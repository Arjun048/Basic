package com.atipune.java.typesofvarmethod;

public class MethodParameter {
	
void addition(int x,int y ,int z,float A) //Formal parameter=>we can use parameter in static and instance method.
{
	System.out.println("total="+(x+y+z+A));
}
	public static void main(String[] args) 
	{
		MethodParameter fd=new MethodParameter();
        fd.addition(22, 55, 55, 55); //Actual parameter
        
	}

}
