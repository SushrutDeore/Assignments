package mapAssignments;

import java.util.HashMap;

public class assignmentCW8 {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, Student> map=new HashMap<Integer, Student>();
		map.put(1, new Student("Ram", 102));
		map.put(2, new Student("Sham", 103));
		
		System.out.println(map);
		
	}

}
