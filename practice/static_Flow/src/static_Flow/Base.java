package static_Flow;

public class Base {
 int i =10;
 {
	methodOne();
	System.out.println("base static block");
}

public static void main(String[] args) {
	Base b=new Base();
	System.out.println("Main method ");
}

public static void methodOne() {
	// TODO Auto-generated method stub
	
	
	System.out.println("Main Method");
}
 {
	System.out.println("Second static block");
}
 int j=20;


}

