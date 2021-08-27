package ClassObjectAssighment;

import java.util.Scanner;

public class Employee {

	
	private int id;
	private String name;
	private double salary;
	
//	public void setEmployee()
//	{
//		Scanner sc=new Scanner(System.in);
//		
//		
//		System.out.println("Enter the ID..");
//		this.id=sc.nextInt();
//		System.out.println("Enter the Name..");
//		this.Name=sc.next();
//		System.out.println("Enter the Salary..");
//		this.Salary=sc.nextDouble();
//	}
//	
//	public void getEmployee()
//	{
//		System.out.println("ID : "+this.id);
//		System.out.println("Name : "+this.Name);
//		System.out.println("Salary : "+this.Salary);
//	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	public double getSalary()
	{
		return this.salary;
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(123);
		e.setName("Sushrut");
		e.setSalary(20000.00);
		
		System.out.println("ID : "+e.getId()  );
		System.out.println("Name  "+e.getName()  );
		System.out.println("Salary : "+e.getSalary());
		
	}
	
	
	
}
