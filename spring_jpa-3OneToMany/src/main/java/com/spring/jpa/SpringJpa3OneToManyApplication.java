package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpa3OneToManyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext configurableApplicationContext=	SpringApplication.run(SpringJpa3OneToManyApplication.class, args);
Dboperation dboperation=	configurableApplicationContext.getBean(Dboperation.class);
	dboperation.addDetails();
	}

}
