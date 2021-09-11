package mapAssignments;

import java.util.HashMap;

public class assignmentHW8 {
	
	public static void main(String[] args) {
		
		HashMap<Student, Integer> map=new  HashMap<Student, Integer>();
		
		map.put(new Student("Sushrut", 101), 1);
		map.put(new Student("Deore", 102),2);
		System.out.println(map);
	}

}
