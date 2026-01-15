package com.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	@Autowired
Animal animal;
	public Zoo() {
		System.out.println("Zoo class Object reated");
	}

}
