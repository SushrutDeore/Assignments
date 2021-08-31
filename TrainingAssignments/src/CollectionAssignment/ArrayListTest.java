package CollectionAssignment;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		ArrayList al2=new ArrayList();
		al.add("Hello");
		System.out.println(al);
		
		al.add("Java");
		al.add(10);
		al.add(null);
		
		System.out.println(al);
		
		al.add(2, "Sushrut");
		System.out.println(al);
		
		al.remove(null);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(3, 50);
		System.out.println("List 2:"+al2);
		
		al.add(al2);
		System.out.println(al);
		
		al.removeAll(al);
		System.out.println("Removing all elements:"+al);
		
	}

}
