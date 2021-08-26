package conditionalStatement;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		
		int number;
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		
		number=sc.nextInt();
		
		if(number%5==0 && number%11==0)
		  System.out.println("Number is divisible by 5 as well as 11");
			
		else
			System.out.println("Number is not divisible 5 nor 11");
	}
}
