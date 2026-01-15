package com.di.DipendancyInjection_field_Interface;

import org.springframework.stereotype.Component;

@Component("tiger")
public class Tiger implements Animal {

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

	public Tiger() {
		System.out.println("Tiger calss object created");
	}

	
	

}
