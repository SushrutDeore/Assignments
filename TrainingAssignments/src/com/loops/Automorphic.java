package com.loops;

public class Automorphic {

	
	public static void isAutomorphic(int n)
	{
		int square=n*n;
		
		if((n%10)==(square%10))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	public static void main(String[] args) {
		
		isAutomorphic(13);
	}
}
