package com.atipune.java.typesofvarmethod;

public class ReturnType {
int  multiplication(int a,int b,int c)
{
	return a+b+c;
}
	public static void main(String[] args) 
	{
		ReturnType rt=new ReturnType();
		int total=rt.multiplication(55, 3, 4);
		System.out.println(total);
		int avg=total/2;
		System.out.println(avg);
		int sub=avg-1;
		System.out.println(sub);
	}
	


}
