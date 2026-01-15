package com.spring.jpa.practice;

import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.spring.jpa.practice.dboperation.DbOperation;
import com.spring.jpa.practice.dboperation.Dboperation2;

@SpringBootApplication
public class JpaPracticeApplication {

    private final DbOperation dbOperation;

    JpaPracticeApplication(DbOperation dbOperation) {
        this.dbOperation = dbOperation;
    }

	public static void main(String[] args) {
//	ConfigurableApplicationContext configurableApplicationContext=	SpringApplication.run(JpaPracticeApplication.class, args);
//	DbOperation dbOperation=	configurableApplicationContext.getBean(DbOperation.class);
	ConfigurableApplicationContext configurableApplicationContext2=SpringApplication.run(JpaPracticeApplication.class, args);
	 Dboperation2 dboperation2=    configurableApplicationContext2.getBean(Dboperation2.class);
	try (//dbOperation.addData();
	//	dbOperation.addMultipleData();
	//System.out.println(dbOperation.getDetails().get());	
	Scanner sc = new Scanner(System.in)) {
//		System.out.println("Enter your Id which you want to delete");
		//int id=sc.nextInt();
		//dbOperation.deleteDetails(id);
//		System.out.println("Enter your Name which you want to fetching");
//		String name=sc.nextLine();
//	List<CUSTOMERDETAILS>li=	dbOperation.getDetailsByName(name);
//	System.out.println(li);
//		System.out.println("Enter your cityname pls");
//		String city=sc.nextLine();
//		System.out.println(dbOperation.getDetailsByCity(city));
//		System.out.println("Enter age whose details you want to see");
//		int age=sc.nextInt();
//		
//		System.out.println(dbOperation.getByAge(age));
		
//
//		System.out.println("Enter id");
//		int id = sc.nextInt();
//		
//		
//		System.out.println("Enter your age");
//		int age = sc.nextInt();


		
//
//		dbOperation.addDetails(id, age);
//		System.out.println("Data inserted successfully");
	}

	//System.out.println(	dbOperation.getAllUserDetails());
	
	System.out.println("Welcome to jpa");
	//dbOperation.getAllDetailsBySort();
	// System.out.println(dbOperation.findByPage().getContent());
	
	//dbOperation.add();
	dboperation2.add();

	}

}
