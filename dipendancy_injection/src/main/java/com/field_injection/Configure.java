package com.field_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {
	@Bean("product1")
public Product getProduct() {
	System.out.println("Product1 instance created");
	Product product=new Product();
	return product;
}
}
