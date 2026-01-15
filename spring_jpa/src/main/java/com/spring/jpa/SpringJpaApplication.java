package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext     configurableApplicationContext=     	SpringApplication.run(SpringJpaApplication.class, args);
Operation_class operation_class=		configurableApplicationContext.getBean(Operation_class.class);
operation_class.add_Details();
		
	}

}
