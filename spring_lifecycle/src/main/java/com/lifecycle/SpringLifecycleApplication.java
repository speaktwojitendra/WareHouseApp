package com.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLifecycleApplication {

	public static void main(String[] args) {
ApplicationContext context=		SpringApplication.run(SpringLifecycleApplication.class, args);
		System.out.println("Destroyed");
	Lifecycle life=	context.getBean(Lifecycle.class);
	System.out.println(life.id);
		
		
	}

}
