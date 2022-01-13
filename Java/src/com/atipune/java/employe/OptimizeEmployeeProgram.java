package com.atipune.java.employe;

public class OptimizeEmployeeProgram {
int empId;
String empName;
String empCompany;
String empAddress;
float empSal;

void instantData (int Id,String Name, String Company,String Address, float Sal ) {
	empId=Id;
	empName=Name;
	empCompany=Company ;
	empAddress=Address;
	empSal=Sal;
}

void Display() {
	System.out.println("*****************");
	System.out.println("Emp ID="+empId);
	System.out.println("emp Company="+empName);
	System.out.println("emp Address ="+empCompany);
	System.out.println("emp Name="+empAddress);
	System.out.println("emp Sal="+empSal);
	System.out.println("*****************");

}
	public static void main(String[] args) {
		System.out.println("Emp 1 informatiom");
		OptimizeEmployeeProgram emp1 = new OptimizeEmployeeProgram();
		emp1.instantData(2222, "Ganesh", "google", "Pune", 344554555);
		emp1.Display();

		
		System.out.println("Emp 2 informatiom");
		OptimizeEmployeeProgram emp2 = new OptimizeEmployeeProgram();
         emp2.instantData(3333, "Arjun", "google", "Pune", 344554555);
		emp2.Display();

		System.out.println("employee 3 rd information");
		OptimizeEmployeeProgram emp3= new OptimizeEmployeeProgram();
		emp3.instantData(444444, "Ajit", "TATA", "Basrshi", 1250000000000000000000f);
		emp3.Display();
	}

}
