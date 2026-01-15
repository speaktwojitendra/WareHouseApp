package com.college;

import java.util.*;

public class College {
	Student s;
	String CollegeNmae;
	List al;
	public College() {
		System.out.println("College constructor called");
	}
	
public College(Student s,String CollegeName,List al) {
	System.out.println("Parameterised constructor called");
	this.s=s;
	this.CollegeNmae=CollegeName;
	this.al=al;
	
}
	
}
