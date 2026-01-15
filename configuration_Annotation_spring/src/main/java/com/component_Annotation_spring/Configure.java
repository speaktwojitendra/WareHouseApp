package com.component_Annotation_spring;

import java.beans.BeanProperty;
import java.beans.JavaBean;

import org.springframework.context.annotation.Bean;
//import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {
@Bean("product1")
	public Product getProduct() {
		Product p=new Product();
		p.setProductId(100);
		return p;
	}
	
@Bean("order1")
public Order getOrder() {
	Order o=new Order();
	
	return o;
}
	
}
