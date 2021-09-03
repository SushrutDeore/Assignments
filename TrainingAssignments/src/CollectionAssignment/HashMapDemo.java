  package CollectionAssignment;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String, Integer> mountains=new HashMap<String, Integer>();
		
		 mountains.put("Everest", 99999);
		 mountains.put("Everest", 29029);
		 mountains.put("K2", 28251);
		 mountains.put("Kangchenjunga", 28169);
		 mountains.put("Denali", 20335);
		 
		 System.out.println(mountains);
		 
		 System.out.println();
		 System.out.println("Everest in the mountains map ??");
		 System.out.println("Ans"+mountains.containsKey("Everest"));
		 
		 System.out.println();
		 System.out.println("Updating the height of K2");
		 mountains.put("K2", 30000);
		 System.out.println(mountains);
		 
		 mountains.remove("Denali");
		 System.out.println(mountains);
		 for (String keyMountainName : mountains.keySet())
		 {
		 Integer height = mountains.get(keyMountainName);
		 System.out.println(keyMountainName + " :" +
		 height.intValue() + " ft");
		 }
		 
		 
		
		
		
		
	}

}
