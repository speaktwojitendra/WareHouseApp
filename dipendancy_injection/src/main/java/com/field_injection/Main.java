package com.field_injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context1=new AnnotationConfigApplicationContext("Configure.class");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		Order order=context.getBean(Order.class);
		System.out.println(order.getProduct());
		

	}

}
