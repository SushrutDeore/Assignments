package SalesRepo;
import java.util.Scanner;

public class SalesReport {
		public int records;
		public Sales[] team;
		
		
		public SalesReport(int record)
		{
			this.records=record;
			this.team=new Sales[record];
		}
	public void getTeam()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<this.records;i++)
		{
			System.out.println("Enter the name:");
			String nm=sc.next();
			System.out.println("Enter the amount:");
			double amt=sc.nextDouble();
			team[i]=new Sales(nm,amt);
		}
		
	}
	
	public void report()
	{
		double[] amount=new double[this.records];
		double avgSales=0,sum=0;
		for(int i=0;i<this.records;i++)
		{
			amount[i]=this.team[i].amount;
			sum=this.team[i].amount;
			
		}
		this.compare(amount);
		avgSales=sum/this.records;
		System.out.println("Average sale : "+avgSales);
	}
	
	public void compare(double arr[])
	{
		
		double max=arr[0];
		double min=arr[0];
		
		for(int i=1; i< arr.length; i++)
		 {
		 if(arr[i] > max)
		 max = arr[i];
		 else if (arr[i] < min)
		 min = arr[i];
		 
		 }
		for(int i=0;i<this.records;i++)
		{
			if(max==this.team[i].amount)
				System.out.println("Highest Sales-->> "+this.team[i].DisplayData());
			else if(min==this.team[i].amount)
				System.out.println("Lowest Sales-->> "+this.team[i].DisplayData());
			else 
				System.out.println(this.team[i].DisplayData());
		}
		
		
		
		
		System.out.println("Highest Sales  "+max);
		System.out.println("Lowest Sales   "+min);
	}
	

}
