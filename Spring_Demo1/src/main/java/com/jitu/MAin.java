package com.jitu;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MAin {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String path = "C:/Users/JITENDRA KUMAR NAYAK/eclipse-workspace/Spring_Demo1/src/main/webapp/WEB-INF/bean.xml";
		ApplicationContext context = new FileSystemXmlApplicationContext(path);
		//ApplicationContext context = new FileSystemXmlApplicationContext(s);

			Student obj = (Student) context.getBean("s1");
		
			System.out.println(	obj.getAge());
			System.out.println(	obj.getName());
	ArrayList<String> al2=obj.getAl();
	al2.stream().forEach(ele->System.out.println(ele));
Dependency d=obj.getD();
d.meth1();
Map<Integer,String> m1=obj.getM();
System.out.println(m1);
System.out.println(obj.getSet());
	}

}
