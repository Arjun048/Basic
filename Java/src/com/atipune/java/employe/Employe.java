package com.atipune.java.employe;

public class Employe {
int empId;
String empName,empCompany,empAddress;
void display() 
{	
	System.out.println("**************");
    System.out.println(empId);
	System.out.println(empName);
	System.out.println(empCompany);
	System.out.println(empAddress);
	System.out.println("***********");

}
	public static void main(String[] args) 
	{
	System.out.println("1st employee employee ");
	Employe emp1 =new Employe();
	emp1.empId=3444;
	emp1.empCompany="TATA";
	emp1.empName="Arjun";
	emp1.empAddress="Pune";		
	emp1.display();
	
	System.out.println("2 nd employee information");
	Employe emp2 =new Employe();
	emp2.empId=26266;
	emp2.empCompany="TATA";
	emp2.empName="Ajit";
	emp2.empAddress="mumbai";		
	emp2.display();
	
	System.out.println("3nd employee information");
	Employe emp3 =new Employe();
	emp3.empId=2644;
	emp3.empCompany="TATA";
	emp3.empName="Ganesh";
	emp3.empAddress="goa";		
	emp3.display();
	

	

	}

}
