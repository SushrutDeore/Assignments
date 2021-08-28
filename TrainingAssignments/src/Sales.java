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
	
		
	public String DisplayData()
	{
		return "Name : "+this.name+" Amount : "+this.amount;
		
	}
	
	
	
	

}
