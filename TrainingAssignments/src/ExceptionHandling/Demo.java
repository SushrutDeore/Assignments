package ExceptionHandling;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		try
		{
			if(a<0)
				throw   new Exception("Error");
			
			System.out.println(10/a);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
