package com.jit;

public class B extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=A.m();
c.msg1();
c.msg2();

B b=new B();
B b1=new B();
//b1.currentThread().setPriority(1);
Thread.currentThread().setPriority(10);
b1.start();
b.start();
Thread t=new Thread();
System.out.println(t.currentThread().getName());
t.start();



	}
public void run() {
	
	System.out.println(Thread.currentThread().getName()); 
	System.out.println("Thread started");
}
}
