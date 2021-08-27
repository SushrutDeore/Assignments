package com.loops;

import java.util.Scanner;

public class DigitProduct {
	
	public static void main(String[] args) {
		int number,sum=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		number=sc.nextInt();
		while(number>0)
		{
			int temp;
			temp=number%10;
			sum=sum+temp;
			number=number/10;
			count++;
		}
		
		System.out.println(sum);
		System.out.println(count);
	}

}
