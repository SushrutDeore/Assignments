package conditionalStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	
	
	int res = 0,n1,n2,ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Operation");
	System.out.println("1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
	ch=sc.nextInt();
	System.out.println("Enter the numbers");
	
	n1=sc.nextInt();
	n2=sc.nextInt();
	
	if(ch==1)
		res=n1+n2;
	else if(ch==2)
		res=n1-n2;
	else if(ch==3)
		res=n1*n2;
	else if(ch==4)
		res=n1/n2;

	
	
System.out.println("Answer : "+res);
		
	
	
	
}
}