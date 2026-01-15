package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringSecurityApplication {

    
	


    

	public static void main(String[] args) {
		
	ConfigurableApplicationContext configurableApplicationContext=	SpringApplication.run(SpringSecurityApplication.class, args);
		
	Demo d=(Demo)configurableApplicationContext.getBean(Demo.class);
	d.getToken();

		}
	}


