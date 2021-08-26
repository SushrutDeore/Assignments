package conditionalStatement;

import java.util.Scanner;

public class leapYear {
public static void main(String[] args) {

	int Year;
	System.out.println("Enter the Year");
	Scanner sc=new Scanner(System.in);
	
	Year=sc.nextInt();
	
	if(Year%4==0)
		System.out.println("Leap Year");
	else
		System.out.println("Normal Year");
}
}

