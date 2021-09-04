package mapAssignments;

import java.util.HashMap;

public class assignmentCW2 {
	
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		map.put("Hello", 1000);
		map.put(1000, "Hello");
		
		System.out.println(map);
	}

}
