package com.example.demo;

import java.beans.BeanProperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JkApplication {

	public static void main(String[] args) {
ApplicationContext context=	SpringApplication.run(JkApplication.class, args);
		System.out.println("Welcome to SpringBoot");
		System.out.println(context.getBean("student"));
		System.out.println(context.getBean("getStudent"));
		System.out.println(context.getBean(Student.class));
	}
	
	@Bean
	public Student getStudent() {
		
		Student student =new Student();
		return student;
		
	}
	

}
