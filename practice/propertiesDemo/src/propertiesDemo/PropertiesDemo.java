package propertiesDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
public static void main(String[] args) throws IOException {
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream("C:\\\\Users\\\\JITENDRA KUMAR NAYAK\\\\eclipse-workspace\\\\db.properties");
	p.load(fis);
	System.out.println(p);
	
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\JITENDRA KUMAR NAYAK\\eclipse-workspace\\db.properties");
	p.setProperty("lljllll", "jkjjk");
	p.store(fos,"Demo");
	
}
}
