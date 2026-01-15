package com.value;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ValueAnnotationApplication {

    private final Zoo zoo;

    ValueAnnotationApplication(Zoo zoo) {
        this.zoo = zoo;
    }

	public static void main(String[] args) {
ApplicationContext context=	SpringApplication.run(ValueAnnotationApplication.class, args);
 System.out.println(context.getBean(Zoo.class).animal);
 System.out.println(context.getBean(Zoo.class).animal.getAnimalName());
 System.out.println(context.getBean(Zoo.class).animal.getAnimalId());
 
	}

}
