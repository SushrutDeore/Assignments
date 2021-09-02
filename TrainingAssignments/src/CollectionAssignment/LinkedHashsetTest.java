package CollectionAssignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashsetTest {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> list=new LinkedHashSet<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("One");
		
		
		Iterator i=list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
