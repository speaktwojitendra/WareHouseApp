package com.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Java8 {
public static void main(String[] args) {
	ArrayList<Integer> arraylist=new ArrayList<>();
	arraylist.add(100);
	arraylist.add(200);
	arraylist.add(300);
	Stream stream=Stream.of(arraylist);
//stream.forEach(System.out::println);
	stream.toArray(Integer[]::new);
	
}
}
