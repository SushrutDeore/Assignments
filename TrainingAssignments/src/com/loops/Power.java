package com.loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the base");
		int base=sc.nextInt();
		System.out.println("Enter the Index");
		int index=sc.nextInt();
		
		double answer=Math.pow(base, index);
		
		System.out.println(answer);
	}

}
