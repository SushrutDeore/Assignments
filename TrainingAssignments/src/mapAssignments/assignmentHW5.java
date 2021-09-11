package mapAssignments;

import java.util.HashMap;

public class assignmentHW5 {
	
public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		map.put(101, "One");
		map.put(102, "Two");
		
		System.out.println(map.containsValue("One"));
	}

}
