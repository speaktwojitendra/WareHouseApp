package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Lifecycle implements InitializingBean,DisposableBean,CommandLineRunner {
	int id;
	

	public int getId() {
		return id;
	}
	@Value("10")
	public void setId( int id) {
		 System.out.println("Setter injection initiated");
		this.id = id;
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy method called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Innit method called");
	}
	public Lifecycle() {
		System.out.println("Lifecycle object Created");
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println(args[1]);	
	System.out.println("run method called");
	}

}
