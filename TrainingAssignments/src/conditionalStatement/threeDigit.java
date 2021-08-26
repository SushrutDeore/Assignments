package conditionalStatement;

import java.util.Scanner;

public class threeDigit {

	
	public static void main(String[] args) {
		
		
		int n,sum=0,n1,n2,n3;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n<1000 && n>99)
			System.out.println(n+" this is three digit number");
		else
			System.out.println(n+"  is not three digit number");
		
		
			
			n1=n%10;
			n=n/10;
			n2=n%10;
			n=n/10;
			n3=n%10;
			n=n/10;
		
		sum=n1+n3;
		System.out.println("Sum is "+sum);
	}
}
