package conditionalStatement;

import java.util.Scanner;

public class evenOdd {
public static void main(String[] args) {
	
	System.out.println("Enter the Number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	if(n%2==0)
		System.out.println("Even number");
	else
		System.out.println("Odd Number");
}
}
