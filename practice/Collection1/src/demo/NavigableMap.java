package demo;
import java.util.*;

public class NavigableMap {
public static void main(String[] args) {
	TreeMap treemap=new TreeMap();
	treemap.put('a',10);
	treemap.put('b', 20);
	treemap.put('c', 30);
	treemap.put('d',40);
	treemap.put('e', 50);
	treemap.put('f', 60);
	System.out.println(	treemap.ceilingEntry('a'));
	System.out.println(treemap.floorKey('c'));
	
	
	TreeSet treeset=new TreeSet();
	treeset.add(30);
	treeset.add(10);
	treeset.add(20);
		treeset.add(30);
	treeset.add(40);
	treeset.add(50);
	
Set s=	 treeset.descendingSet();
System.out.println(s);
Integer arr[]= {10,20,30,40};
List l=Arrays.asList(arr);
System.out.println(l);


}
}
