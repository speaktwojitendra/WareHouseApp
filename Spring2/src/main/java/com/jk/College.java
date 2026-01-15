package com.jk;

public class College {
	public College() {
		System.out.println("College Constructor called");
	}
Student stu;
public College(Student stu1) {
	super();
	this.stu = stu1;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
String name;


}
