package mapAssignments;

import java.util.SortedMap;
import java.util.TreeMap;

public class sortString {
	
	public static void main(String[] args) {
		
		String str="Hello my name is Sushrut Deore.";
		
		String[] arrayStr=str.split(" ");
		
		
		SortedMap map=new TreeMap();
		int count=0;
		for(String i:arrayStr)
		{
			++count;
			map.put(i,count);
		}
		
		System.out.println(map);
		
		
		
		
		
	}

}
