package CollectionAssignment;

import java.util.HashMap;

public class CountWords {
	
	public static void main(String[] args) {
		
		String str="My name is name Java is is my my Java java ";
		
		String[] arr=str.split(" ");
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int wordCount=map.get(arr[i]);
				map.put(arr[i], wordCount+1);
			}
			else
				map.put(arr[i], 1);
			
			
		}
		
		
		System.out.println(map);
	}
	

}
