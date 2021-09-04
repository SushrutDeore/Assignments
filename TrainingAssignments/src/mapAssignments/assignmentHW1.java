package mapAssignments;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class assignmentHW1 {
	
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		map.put(101, "One");
		map.put(102, "Two");
		System.out.println(map);
		LinkedHashMap map2=new LinkedHashMap();
		
		map2.putAll(map);
		map2.put("A", "Hello");
		System.out.println(map2);
	}

}
