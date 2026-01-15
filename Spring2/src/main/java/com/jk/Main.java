package com.jk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\JITENDRA KUMAR NAYAK\\eclipse-workspace\\Spring2\\src\\main\\webapp\\WEB-INF\\lib\\new.xml";
ApplicationContext ap=new FileSystemXmlApplicationContext(path);
College s=(College)ap.getBean("col");
s.name="jkbk";
System.out.println(s.name);

College s1=(College)ap.getBean("col");
System.out.println(s1.name);
System.out.println(s.name);

	}

}
