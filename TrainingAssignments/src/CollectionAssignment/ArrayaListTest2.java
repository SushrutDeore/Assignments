package CollectionAssignment;

import java.util.ArrayList;

public class ArrayaListTest2 {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		
		System.out.println("Size of Array List : "+al.size());
		System.out.println(al);
		
		
		al.add(null);
		al.add(10);
		al.add(null);
		
		System.out.println("Size of Array List : "+al.size());
		System.out.println(al);
		
		al.add("Hello");
		al.add("Hello");
		al.add("Hello");
		al.add("Hello");
		
		System.out.println("Size of Array List : "+al.size());
		System.out.println(al);
		
		
		System.out.println("Element at 2nd Location : "+al.get(3));
		
		System.out.println("Position of One : "+al.indexOf("One"));
		
		System.out.println("Last position of : "+al.lastIndexOf("Hello"));
		
		System.out.println("---------------------");
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		al2.add(60);
		System.out.println(al2);
		System.out.println("Size of Array List : "+al2.size());
		
		al2.remove(40);
		System.out.println(al2);
		System.out.println("Size of Array List : "+al.size());
		 
		
		
	}

}
