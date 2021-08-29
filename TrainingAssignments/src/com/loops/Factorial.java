package com.loops;



public class Factorial {

	
	public static int findFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		int sum=0,n=3;
		for(int i=1;i<=n;i++)
		{
			sum=sum+findFactorial(i);
			
		}
		
		System.out.println(sum);
		
		
	}
}
