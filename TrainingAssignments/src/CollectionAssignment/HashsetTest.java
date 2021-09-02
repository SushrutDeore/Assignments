package CollectionAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {
	
	public static void main(String[] args) {
		
		HashSet<String> s=new HashSet();
		
		s.add("B");
		s.add("A");
		s.add("One");
		s.add(null);
		
		//System.out.println(s);
		
		
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		
		s.addAll(al);
		
		Iterator<String> i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
