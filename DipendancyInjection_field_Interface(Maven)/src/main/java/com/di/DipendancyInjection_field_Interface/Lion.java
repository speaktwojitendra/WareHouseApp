package com.di.DipendancyInjection_field_Interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lion")
public class Lion implements Animal{
	@Qualifier("lion")
	@Autowired
private Animal animal;
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Lion() {
		System.out.println("This is lion class object");
	}

	@Override
	public void countOfLegs() {
		// TODO Auto-generated method stub
		System.out.println("Animal have 4 legs");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is an Animal");
	}

	

	

}
