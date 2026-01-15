package com.component_Annotation_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
	Product p1=	 (Product) context.getBean("product1");
	
System.out.println(p1.getProductId());		 
		 
	}

}
