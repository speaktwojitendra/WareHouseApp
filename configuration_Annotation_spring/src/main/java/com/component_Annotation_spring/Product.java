package com.component_Annotation_spring;

public class Product {
	
	
 public Product() {
		System.out.println("Product Class Instance Created");
	}
 private int productId;
 public int getProductId() {
	return productId;
}
 public void setProductId(int productId) {
	this.productId = productId;
 }
 public String getProductName() {
	return productName;
 }
 public void setProductName(String productName) {
	this.productName = productName;
 }
 public int getProductCount() {
	return productCount;
 }
 public void setProductCount(int productCount) {
	this.productCount = productCount;
 }
 private String productName;
 private int productCount;
}
