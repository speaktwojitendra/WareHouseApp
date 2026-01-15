package com.component_Annotation_spring;

public class Order {
	
	
	
public Order() {
		
System.out.println("Order Insatnce Created");
	}
private int  orderId;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getOrderCount() {
	return orderCount;
}
public void setOrderCount(int orderCount) {
	this.orderCount = orderCount;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
private int orderCount;
private String orderDate;

	
}
