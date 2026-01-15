package com.example;

import org.apache.catalina.core.ApplicationContext;

public class MainApp {
	


	    public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");
	        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	        obj.getMessage();
	    }
	}

