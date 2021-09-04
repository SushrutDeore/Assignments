package mapAssignments;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class assignmentHW2 {
	
public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		map.put(101, "One");
		map.put(102, "Two");
		
		System.out.println(map.isEmpty());
		
		
		LinkedHashMap map2=new LinkedHashMap();
		System.out.println(map2.isEmpty());
}


}
