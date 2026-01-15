package com.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\JITENDRA KUMAR NAYAK\\eclipse-workspace\\Spring_Demo1\\src\\main\\webapp\\WEB-INF\\lib\\college.xml";
ApplicationContext apcon=new FileSystemXmlApplicationContext(path);
College c=(College)apcon.getBean("c");

System.out.println(c.s.Sname);
System.out.print(c.al);
	}


}
