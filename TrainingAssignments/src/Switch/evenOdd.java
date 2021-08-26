package Switch;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter the number..");
		Scanner sc=new  Scanner(System.in);
		number=sc.nextInt();

		switch (number%2) {
		case 1:
			  System.out.println(number+" is odd number.");
			break;
		case 0:
			System.out.println(number+" is even number.");
			break;
			
		
			
			
		default:
			System.out.println(" Invalid Input");
			
					}
	}

}
