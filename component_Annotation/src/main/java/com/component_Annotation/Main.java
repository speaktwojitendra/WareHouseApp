package com.component_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	 ApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
	 Patient p=(Patient) context.getBean("patient");
	System.out.println(p.patient_age); 
}
}
