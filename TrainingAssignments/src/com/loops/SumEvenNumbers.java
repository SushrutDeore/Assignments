package com.loops;

public class SumEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10,sum=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		
		System.out.println("Sum is : "+sum);
		
	}

}
