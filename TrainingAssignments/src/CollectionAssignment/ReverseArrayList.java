package CollectionAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseArrayList {

	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		System.out.println(list);
//		for(int i=list.size()-1;i>=0;i--)
//		{
//			System.out.println(list.get(i));
//		}
		
		Collections.reverse(list);
		System.out.println(list);
		
		ListIterator<String> litr=list.listIterator(list.size());
		while(litr.hasPrevious())
		{
			System.out.println("///");
			System.out.println(litr.previous());
		}
		
	}
}
