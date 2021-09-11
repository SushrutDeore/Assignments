package mapAssignments;

import java.util.HashMap;
import java.util.Set;

public class assignmentHW7 {
	
	public static void main(String[] args) {
		HashMap map=new HashMap();
		
		map.put(101, "One");
		map.put(102, "Two");
		map.put(103, "Three");
		
		System.out.println("before");
		System.out.println(map);
		Set key=map.keySet();
		
		for(Object i:key)
		{
			map.remove(i);
		}
		
		
		System.out.println("after");
		System.out.println(map);
		
		
	}

}
