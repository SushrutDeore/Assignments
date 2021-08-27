package com.loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		System.out.println("\nTable of "+number+":");
		for(int i=1; i<=10;i++)
		{
			System.out.println(number*i);
		}

	}

}
