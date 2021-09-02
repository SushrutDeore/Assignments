package CollectionAssignment;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(2, 500);
		System.out.println(list);
		
//		Object[] array=list.toArray();
//		
//		for(Object obj:array)
//			System.out.println(obj);
		
	}
}
