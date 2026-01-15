package demo;
import java.util.*;

public class queue {
public static void main(String[] args) {
PriorityQueue pq=new PriorityQueue();
for(int i=1;i<10;i++) {
	pq.offer(i);
}
System.out.println(pq);
System.out.println(pq.poll());
System.out.println(pq);
System.out.println(pq.remove());
System.out.println(pq);
System.out.println(pq.peek());
System.out.println(pq);
System.out.println(pq.element());
System.out.println(pq);


System.out.println(pq);
List c=new ArrayList(pq);

Collections.sort(c);
System.out.println(c);

}
}
