package com.field_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Order {
@Autowired	
private Product product;
public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

private int order_id;
public int getOrder_id() {
	return order_id;
}

public void setOrder_id(int order_id) {
	this.order_id = order_id;
}

public String getOrder_name() {
	return order_name;
}

public void setOrder_name(String order_name) {
	this.order_name = order_name;
}

private String order_name;

public Order() {
	System.out.println("Order object Created");
}

}
