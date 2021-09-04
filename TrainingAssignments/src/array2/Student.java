package array2;
//Creating a Student class.
//Creating array of the student class and using constuctor and setter method inside and display the information.
public class Student {
	
	public int rollNo;
	public String name;
	public String[] hobbies;
	

	public Student(int rollNo, String name, String[] hobbies) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.hobbies = hobbies;
	}

	public void getStudent()
	{
		
		
		System.out.println("Roll Number : "+this.rollNo);
		System.out.println("Name : "+this.name);
		System.out.println("Hobbies : ");
		for(int i=0;i<hobbies.length;i++)
		{
			System.out.print(hobbies[i]+" ,");
		}
	}
	




	public static void main(String[] args) {
		
		Student[] students=new Student[2];
		
		String[] hobby1= {"Reading","Singing"};
		String[] hobby2= {"Writing","Playing"};
		
		students[0]=new Student(123,"Ram",hobby1);
		students[1]=new Student(124,"Sham",hobby2);
		
		
		students[0].getStudent();
		System.out.println(" ");
		System.out.println(" ");
		students[1].getStudent();
		
		
	}

}
