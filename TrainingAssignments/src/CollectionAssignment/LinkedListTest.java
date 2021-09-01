package CollectionAssignment;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add(10);
		ll.add("Hello");
		ll.add(2, "One");
		
		System.out.println(ll);
		
		ll.add("Two");
		ll.add("Three");
		
		System.out.println(ll);
		
		ll.remove("Two");
		System.out.println(ll);
		
		ll.addFirst("First");
		System.out.println(ll);
		
		ll.addLast("Last");
		System.out.println(ll);
		
		
		System.out.println(ll.contains("One"));
		
		System.out.println("Element at 3rd position  "+ll.get(2));
		
		System.out.println("First element:  "+ll.getFirst());
		
		
		
		
	}

}
