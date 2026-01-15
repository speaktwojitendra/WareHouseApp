package com.java8.features;

@FunctionalInterface
interface C{
	public void m1();
}
class Test{
	int x=100;
	public void m2() {
	
		C c=()->{System.out.println("Inner lambda Function");
		int x=500;
		System.out.println(this.x);
		System.out.println(x);
		};
	c.m1();	
	}
}

@FunctionalInterface
 interface A{
	public int add(int a,int b);
}
@FunctionalInterface
interface B extends A{
public int add(int a,int b);	
}
public class Functional_Interface {
public static void main(String[] args) {
	B m=(a,b)->a+b;
	
int l=	m.add(10,20);
System.out.println(l);
Thread t=new Thread(()->{
	for(int i=0;i<=10;i++) {
		System.out.println(i);
	}
});
t.start();
new Test().m2();
}
}
