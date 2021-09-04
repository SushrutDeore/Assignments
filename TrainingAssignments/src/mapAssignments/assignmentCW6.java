package mapAssignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class assignmentCW6 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		Set<Integer> key=map.keySet();
		
		System.out.println("__KEY--");
		for(int i:key)
		{
			System.out.println(i);
		}
		
		Collection str=map.values();
		
		System.out.println("--VALUES--");
		System.out.println(str);
	
		
		
	}

}
