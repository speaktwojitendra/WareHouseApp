package com.static_;

public class Static_Method implements A,B{

public static void method1() {
	System.out.println("Sttic method class method");
	A.method1();
	B.method1();
}
public static void main(String[] args) {
	Static_Method static_Method=new Static_Method();
	static_Method.method1();
	A a= new Static_Method();
}
}
