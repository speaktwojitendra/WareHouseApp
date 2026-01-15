package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path="C:\\Users\\JITENDRA KUMAR NAYAK\\eclipse-workspace\\Spring_Demo1\\src\\main\\webapp\\WEB-INF\\lib\\Autowire.xml";
ApplicationContext ap=new FileSystemXmlApplicationContext(path);
Hospital hos=(Hospital)ap.getBean("h");
//Student s1=(Student)ap.getBean("s");
System.out.println(hos.getHospitalName());
System.out.println(hos.getP().name);
System.out.println(hos.getP().age);
System.out.println(hos.getP().address);
//System.out.println(s1.getCol().cname);
	}

	
	

}
