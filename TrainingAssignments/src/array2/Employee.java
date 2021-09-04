package array2;

import java.util.Scanner;
//Creating array of class Employee. Taking values for its variables and displying the same.
public class Employee {
	
	public int id;
	public String name;
	public double salary;
	
	
	public void setEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Salary");
		double salary=sc.nextDouble();
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public void displayEmployee()
	{
		System.out.println(" ");
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Slary : "+this.salary);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many reocrds do you want to insert");
		int n=sc.nextInt();
		Employee[] emp=new Employee[n];
		System.out.println("Enter the records");
		
		for(int i=0;i<n;i++)
		{
			emp[i]=new Employee();
			emp[i].setEmployee();
			
			
		}
		
		System.out.println("Records : ");
		for(int i=0;i<n;i++)
		{
			emp[i].displayEmployee();
		}
		
		

		
		
		
		
	}

}
