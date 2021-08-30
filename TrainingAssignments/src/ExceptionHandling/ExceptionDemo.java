package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the number of donuts");
			int donutCount=sc.nextInt();
			
			System.out.println("Enter the number of glasses of milk");
			int milkCount=sc.nextInt();
			
			if(milkCount<0)
				throw new Exception("Exception : No milk");
			
			double donutsPerGlass=donutCount/milkCount;
			System.out.println("Donuts : "+donutCount);
			System.out.println("Milk count : "+milkCount);
			System.out.println("You have "+donutsPerGlass+" donuts for each glass of milk");
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("GO get some milk");
		}
		
		finally {
			System.out.println("Welcome........");
		}
	}

}
