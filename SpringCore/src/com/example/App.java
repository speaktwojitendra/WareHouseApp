package com.example;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GreetingService service = (GreetingService) context.getBean("greetingService");
        service.greet();
    }
}
