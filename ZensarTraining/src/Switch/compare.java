package Switch;

import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		int number1,number2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First number");
		number1=sc.nextInt();
		
		System.out.println("Enter Second number");
		number2=sc.nextInt();
		
		switch (number1/number2) 
		{
		case 1:
			System.out.println(number1+"is greater than "+number2);
			break ;
		
			
			
		default:
			System.out.println(number2+" is greater then "+number1);
	}
}

}