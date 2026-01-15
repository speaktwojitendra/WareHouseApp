package com.field_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Flipkart {
	
@Autowired
private Order order;

public Order getOrder() {
	return order;
}

public void setOrder(Order order) {
	this.order = order;
}

public Flipkart() {
	System.out.println("Flipkart class object created");
}


}
