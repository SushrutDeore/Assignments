package CollectionAssignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap m=new HashMap();
		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		
		System.out.println(m);
		
		
		System.out.println(m.put(2, "Tooo"));
		
		System.out.println(m);
		
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		System.out.println(s1);
		
		
		
		
	}
}
