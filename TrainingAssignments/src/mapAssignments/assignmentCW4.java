package mapAssignments;

import java.util.HashMap;
import java.util.Set;

public class assignmentCW4 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		map.put(1, 111);
		map.put(2, 222);
		map.put(3, 333);
		map.put(4, 444);
		
		Set<Integer> countSetr=map.keySet();
		
		int count=countSetr.size();
		System.out.println(count);
	}

}
