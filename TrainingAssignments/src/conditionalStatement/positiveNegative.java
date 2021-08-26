package conditionalStatement;

import java.util.Scanner;

public class positiveNegative {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
			System.out.println("Positive number");
		else if(n<0)
			System.out.println("Negative number");
		else
			System.out.println(" Number is zero");
	}
}
