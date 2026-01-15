package com.component_Annotation;

import org.springframework.stereotype.Component;

@Component
public class Patient {
int patient_id;
int patient_age;
String patient_Name;
public Patient() {
	System.out.println("patient class insatnce created");
}

}
