package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test1 implements Serializable{
	transient int i=10;
	int j=20;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test1 t=new Test1();
		System.out.println("Serialization started");
		
		FileOutputStream fos=new FileOutputStream("jit.text");
		ObjectOutputStream ous=new ObjectOutputStream(fos);
		ous.writeObject(t);
		System.out.println("Serialization ended");
		System.out.println("DeSerialization started");
		FileInputStream fis=new FileInputStream("jit.text");
		ObjectInputStream ois=new ObjectInputStream(fis);
		//Test1 t2=(Test1) ois.readObject();
	Object o=	ois.readObject();
	System.out.println(o instanceof Test1);
		//0System.out.println(t2.i+"  "+t2.j);
	}
}

