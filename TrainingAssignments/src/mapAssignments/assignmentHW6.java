package mapAssignments;

import java.util.HashMap;

public class assignmentHW6 {
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		map.put(101, "One");
		map.put(102, "Two");
		
		System.out.println(map);
		
		map.remove(102);
		
		System.out.println(map);
	}

}
