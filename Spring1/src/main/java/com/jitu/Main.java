package com.jitu;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.context.ApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory container=new FileSystemXmlApplicationContext("NewFile.xml");
Object o=container.getBean("hello");
HelloBean h=(HelloBean) o;
h.sayHello();

	}

}
