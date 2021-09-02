package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		String name;
		int rollNo;
		double percentage;
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter Name,Roll Number,Percentage for Student :"+(i+1));
		name=sc.next();
		rollNo=sc.nextInt();
		percentage=sc.nextDouble();
		
		Student s=new Student(rollNo,name,percentage);
		list.add(s);
		
		}
		
	/*	System.out.println("----Student Information----");
		for (int j = 0; j < list.size(); j++) { 		      
	          
			Student s1=list.get(j);
			s1.displayStudent();
	      }  
		*/
		for(Student s4:list)
		{
			s4.displayStudent();
		}
		
	/*	Iterator<Student> itr=list.iterator();
		while(itr.hasNext())
		{
			Student s3=itr.next();
			s3.displayStudent();
		}
		
		
		*/
		
	
	}
}
