package com.equal_method;

class Student{
	public String name;
	public int age;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object o) {
		Student s2=(Student)o;
	if(s2.name.equals(this.name)&&(s2.age==this.age)) {
		return true;
	}
		//return  true;
	else
		return false;
	}
	
		
}


public class EqualMethod {
public static void main(String[] args) {
	Student s1=new Student("jk",25);
	Student s2=new Student ("jk",25);
System.out.println(s1.equals(s2)); 
String s10="jit";
String s11="jit";
System.out.println(s10==s11);
System.out.println(s10.hashCode());
System.out.println(s11.hashCode());
	}
}
