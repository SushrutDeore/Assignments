package Switch;

import java.util.Scanner;

public class printNumber {
public static void main(String[] args) {
	
	int no;
	System.out.println("Enter the number between 1 to 5");
	Scanner sc=new Scanner(System.in);
	no=sc.nextInt();
	
	switch(no)
	{
	case 1:
		System.out.println("One");
		break;
	case 2:
		System.out.println("Two");
		break;
	case 3:
		System.out.println("Three");
		break;
	case 4:
		System.out.println("Four");
		break;
	case 5:
		System.out.println("Five");
		break;
		
	default:
		System.out.println("Invalid");
	
	}
		
}
}
