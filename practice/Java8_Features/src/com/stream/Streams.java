package com.stream;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Streams {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		for(int i=10;i<=100;i+=10) {
			list.add(i);
		}
		System.out.println(list);
		list.stream().filter(k->k%2==0).forEach(ele->System.out.print(ele+", "));
		List<Integer> evenList = (List<Integer>) list.stream()
			    .filter(i -> i % 2 == 0)
			    .collect(Collectors.toList());
		System.out.println(evenList+",");
	Integer i=	list.stream().filter(k->k%2==0).max((a,b)->a.compareTo(b)).get();
	System.out.println(i);
List<Integer> l=	list.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
System.out.println(l);
	}

}
