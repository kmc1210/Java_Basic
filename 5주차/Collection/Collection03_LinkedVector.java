package java10_Collection;
import java.util.*;

public class Collection03_LinkedVector {
	public static void main(String[] args) {
		
		List llist = new LinkedList();
		llist.add(10);
		llist.add(20);
		llist.add(30);
		
		System.out.println(llist);
		
		System.out.println("==================");
		
		List v = new Vector();
		
		v.add("A");
		v.add("B");
		v.add("C");
		
		System.out.println( v );
		
	}
}
