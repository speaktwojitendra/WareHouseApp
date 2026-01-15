package com.di.DipendancyInjection_field_Interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
    	context.scan("com.*");
    	context.refresh();
        System.out.println( "Hello World!" );
    Lion lion=    (Lion) context.getBean("lion");
    Animal animal= (Animal) context.getBean("lion");
 lion.countOfLegs();
 System.out.println(lion.getAnimal());
 animal.countOfLegs();
        
    }
}
