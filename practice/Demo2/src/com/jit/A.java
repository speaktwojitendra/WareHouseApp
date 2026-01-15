package com.jit;

public class A {
 static C m() {
	System.out.println("hello welcome");
	return new C() {
		public void msg1() {
			System.out.println("Message1 ");
		}
		public void msg2() {
			System.out.println("Message2");
		}
	};
}
}
