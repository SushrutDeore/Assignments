package SalesRepo;
import java.util.Scanner;

public class Sales {
	
	public String name;
	public double amount;
	
	public Sales()
	{
		this.name="X";
		this.amount=0.0;
	}
	
	public Sales(String name, double amount)
	{
		this.name=name;
		this.amount=amount;
	}
	
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the name of Salesman:");
		this.name=sc.next();
		System.out.println("Enter the Sale Amount:");
		this.amount=sc.nextDouble();
			
	}
	
	
	
	
	public String DisplayData()
	{
		return "Name : "+this.name+" Amount : "+this.amount;
		
	}
	
	
	
	

}
