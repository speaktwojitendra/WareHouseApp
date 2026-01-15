package com.autowiring;

public class Patient {
	int id;
	int age;
	String name;
	String address;
	public Patient() {
		
	}
	public Patient(int id,int age,String name,String address) {
		this.id=id;
		this.age=age;
		this.name=name;
		this.address=address;
		
	}
	
}
