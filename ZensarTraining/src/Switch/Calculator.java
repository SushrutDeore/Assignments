package Switch;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		int res,number1,number2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First number");
		number1=sc.nextInt();
		
		System.out.println("Enter Second number");
		number2=sc.nextInt();
		
		System.out.println("Enter the Choice");
		System.out.println("\n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4. Division\n");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			res=number1+number2;
			System.out.println(number1+" + "+number2+" = "+res);
			break;
		case 2:
			if(number1>=number2)
			 { 
				res=number1-number2;
			  System.out.println(number1+" - "+number2+" = "+res);
			 }
			else
				System.out.println("Not possible");
			
			
			 break;
		case 3:
			res=number1*number2;
			System.out.println(number1+" * "+number2+" = "+res);
			break;	
		case 4:
			res=number1/number2;
			System.out.println(number1+" / "+number2+" = "+res);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
