package com.college;

public class Student {
String Student_id;
String Sname;
int Sage;
public Student() {
	System.out.println("Object created");
}
public Student(String Student_id,String Sname,int Sage) {
	this.Student_id=Student_id;
	this.Sage=Sage;
	this.Sname=Sname;
	
	System.out.println("Parameterised conStructor  is called ");

}



}
