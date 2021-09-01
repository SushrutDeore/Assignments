package ExceptionHandling;

import java.util.Scanner;

public class MultipleCatch {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3};
		
		int index;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the index .");
		index=sc.nextInt();
		
		System.out.println("Enter the number for division.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try
		{
			if(b<=0)
				throw new DivideByZeroException();
			else
				System.out.println("a/b= "+a/b);
			
			if(index>=3)
				throw new IndexOutOfBoundsException(); 
		}
		catch(DivideByZeroException e)
		{
			System.out.println("Error...!   :You have entered Denominator value 0.");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Error...!   :Array has only 3 Elements.");
		}
		
		finally {
			System.out.println("Thank you.");
		}
		
		
	}

}
