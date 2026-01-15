package com.default_method;


public class Default_Method implements Left,Right {
public void method1() {
	System.out.println("Implementetaion class method");
	Left.super.method1();
}
public static void main(String[] args) {
	Default_Method default_Method=new Default_Method();
	default_Method.method1();
	Left left=default_Method;
	left.method1();
	Right right=default_Method;
	right.method1();
	
}
}
