package CollectionAssignment;

public class Student {
	
	public int rollNo;
	public String name;
	public double percentage;
	
	public Student()
	{
		
	}
	
	public Student(int rollno,String name, double percentage)
	{
		this.rollNo=rollno;
		this.name=name;
		this.percentage=percentage;
	}
	
	

	public   void  displayStudent()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Roll Number : "+this.rollNo);
		System.out.println("Percentage : "+this.percentage);
	}
	
	
	

}
