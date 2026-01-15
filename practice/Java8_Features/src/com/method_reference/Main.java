package com.method_reference;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Interf1 interf1=new Check()::show;
interf1.print();
Interf1 interf12=Check::print;
interf12.print();
Interf1 interf13=Check::new;
interf13.print();
	}

}
