package demo;

import java.util.*;
import java.util.Map.Entry;

class Demo{
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList(5);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		//System.out.println(al);
	Iterator i=	al.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	Vector v=new Vector();
	v.addElement(100);
	v.addElement(200);
	v.addElement(300);
	v.addElement(400);
	v.addElement(500);
        Enumeration e=v.elements();
        while(e.hasMoreElements()) {
       System.out.println(e.nextElement()); 	
       
       
       
      ListIterator li= al.listIterator(al.size());
      while(li.hasPrevious())
      {
    	  System.out.println( li.previous());
    	  
    	 
      }
       
      
      
      HashSet hash=new HashSet();
      hash.add(10);
      hash.add(20);
      hash.add(30);
      hash.add(40);
      System.out.println(hash);
       
      
      
      LinkedHashSet link=new LinkedHashSet();
      link.add(10);
      link.add(200);
      link.add(30);
      link.add(40);
      System.out.println(link);
       
        }
       
        TreeSet tree=new TreeSet(new myComparator());
        tree.add(10);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        System.out.println(tree);
        
        HashMap hash=new HashMap();
        hash.put('a',10);
        hash.put('b',20);
        hash.put('c', 30);
        hash.put(null,null);
       Set s= hash.keySet();
       System.out.println(s);
       
       TreeMap map=new TreeMap();
       map.put('a',10);
       map.put('b',20);
       map.put('c', 30);
       map.put('e',null);
      System.out.println(map.values());
      Set s1 =map.entrySet();
     Iterator itr= s1.iterator();
     while(itr.hasNext()) {
    	 Entry obj=(Entry) itr.next();
    	
    	 System.out.println(obj);
    	 
    	 
    	 
    	 Properties p=new Properties();
   Enumeration en= p.propertyNames();
   
    	 
    HashMap hash1=new HashMap();
    hash1.remove(e);
    	 
    	 
     }
      
    
	}
	
	
	
}

class myComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		if (i1>i2) {
			return 1;
		}
		else if(i1<i2)
		return -1;
		else return 0;
	}
	
}


