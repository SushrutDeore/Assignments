package mapAssignments;

import java.util.HashMap;

public class assignmentHW9 {
	
public static void main(String[] args) {
		
		HashMap<Integer,Student> map=new  HashMap();
		
		map.put(1,new Student("Sushrut", 101));
		map.put(2,new Student("Deore", 102));
		System.out.println(map);
	}


}
