import java.util.Scanner;

public class SalesReport {
		public int records;
		public Sales[] team;	
	public void getTeam()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of records:");
		this.records=sc.nextInt();
		
		
		for(int i=0;i<records;i++)
		{
			System.out.println(i);
			this.team[i].setData();
		}
		
	}
	
	public void report()
	{
		double[] amount=new double[this.records];
		for(int i=0;i<this.records;i++)
		{
			amount[i]=this.team[i].amount;	
		}
		
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
		
		System.out.println("Highest Sales Amount "+max);
		System.out.println("Lowest Sales Amount  "+min);
	}
	

}
