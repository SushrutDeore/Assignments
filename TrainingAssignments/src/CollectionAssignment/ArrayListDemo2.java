package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
			list.add(i);
		
		Iterator<Integer> itr=list.iterator();
		System.out.println("List :");
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Removing 6 from the list");
		Iterator<Integer> itr1=list.iterator();
		while(itr1.hasNext())
		{
			
			Integer a=itr1.next();
			if(a==6)
				itr1.remove();
			else
				System.out.println(a);
			
		}
		
		
		
		
		
				
	
	}

}
