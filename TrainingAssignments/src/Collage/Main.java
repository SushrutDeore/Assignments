package Collage;

import School.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Student s=new Student();
		System.out.println("Inside Collage Package");
		s.doPublic();
		
		//s.doProtected();
		//s.doDefault();
		//s.doPrivate();
		
	}

}
