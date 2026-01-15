package com.jit1;

 abstract  class Abstraction {
public abstract void add(int a,int b);
public void subtract(int a,int b) {
	System.out.println(a-b);
}
public Abstraction() {
	System.out.println("Abstraction class constructor called");
	this.subtract(20,10 );
}
}
class Normal extends Abstraction{
	public static void main(String[] args) {
		
		Normal normal=new Normal();
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
