package com.atipune.java.employe;

public class Practice1 {
int StudentRollnumber, StudentAdharcard;
String StudentName,StudentSchoolName;

void Details(int Rollnumber,int Adharcard,String Name,String SchoolName) {
	StudentRollnumber=Rollnumber;
	StudentAdharcard=Adharcard;
	StudentName=Name;
	StudentSchoolName=SchoolName;
	}
	

void display() {
	System.out.println("************");
	System.out.println("Stdent Roll Number="+StudentRollnumber);
	System.out.println("Adhar Number="+StudentAdharcard);
	System.out.println("Student Name="+StudentName);
	System.out.println("School Name="+StudentSchoolName);
	System.out.println("************");

}


public static void main(String[] args) {
	Practice1 std1=new Practice1();
	std1.Details(3333, 12344455, "arjun", "AIT,vita");
     std1.display();

 	Practice1 std2=new Practice1();
	std2.Details(4444, 12344455, "Ajit", "AIT,vita");
    std2.display();

}

}
