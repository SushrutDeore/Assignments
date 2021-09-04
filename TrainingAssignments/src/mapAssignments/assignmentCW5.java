package mapAssignments;

import java.util.HashMap;
import java.util.Set;

public class assignmentCW5 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		Set<Integer> key=map.keySet();
		
		for(int i:key)
		{
			System.out.println(i+" : "+map.get(i));
		}
		
	}

}
