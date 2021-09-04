package mapAssignments;

import java.util.HashMap;
import java.util.Set;

public class assignmentCW1 {
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put("Hello", 100);
		map.put("Hi", 200);
		
		Set key=map.keySet();
		
		for(Object i:key)
		{
			System.out.println(i+" -> "+map.get(i));
		}
	}

}
