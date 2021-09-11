package mapAssignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class assignmentHW10 {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(101);
		list.add(102);
		
		System.out.println("List:");
		System.out.println(list);
		
		HashMap map=new HashMap();
		
		Iterator itr=list.iterator();
		int count=0;
		while(itr.hasNext())
		{
			++count;
			map.put(count, itr.next());
		}
		
		System.out.println("Map:");
		System.out.println(map);
	}

}
