package com.loops;

public class PalindromeNumber {
	
	public static void isPalindrome(int number)
	{
		int r,n,temp=0;
		
		n=number;
		
		while(n>0)
		{
		
			r=n%10;
			temp=(temp*10)+r;
			n=n/10;
			
			
		}
		
		if(number==temp)
			System.out.println(number+"  Is Palindrome");
		
		
			
	}
	
	


	
	
	public static void main(String[] args) {
		
		
		for(int i=100;i<=500;i++)
		{
			isPalindrome(i);
		}
		
	
		
	}
		

}
