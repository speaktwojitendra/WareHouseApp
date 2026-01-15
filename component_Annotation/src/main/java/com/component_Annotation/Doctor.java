package com.component_Annotation;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
int doctor_id;
int doctor_age;
String dodctor_name;
public Doctor() {
	System.out.println("Doctor clss instance created");
}
}
