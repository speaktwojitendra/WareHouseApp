package com.predicate_And_Function;
import java.util.function.Predicate;
import java.util.function.Function;
public class Exicute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<String> predicate=s->s.length()>5;
System.out.println(predicate.test("jk"));
	Function<String,Integer> function=s->s.length();
	System.out.println(function.apply("jit"));
	
	}
	

}
