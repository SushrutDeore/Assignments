package com.loops;

public class PrimeNumber {
	
	public static void isPrime(int n)
	{
		int i,m=0,flag=0;      
		 m=n/2;      
		 if(n==0||n==1)
		 {  
		   flag=1;      
		  }
		 else
		 {  
		    for(i=2;i<=m;i++)
		    {      
		    	if(n%i==0)
		    	{      
			     flag=1;      
			     break;      
		    	}      
		   } 
		    
		   if(flag==0) 
		   System.out.println(n+" is prime number"); 
		  }
	}
	
	
	public static void main(String[] args) {
		
		for(int i=300;i<=400;i++)
		{
			isPrime(i);
		}
	}

}
