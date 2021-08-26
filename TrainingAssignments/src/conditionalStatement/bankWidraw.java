package conditionalStatement;

import java.util.Scanner;

public class bankWidraw {

	
	public static void main(String[] args) {
		
		int amount,n1,n2,n3,n4,n5,n6,n7,n8;
		System.out.println("Enter the Amount");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		
		while(amount>=2000)
		{
			n1=amount/2000;
			amount=amount%2000;
			System.out.println("2000 x "+n1);
			break;
		}
		
		while(amount>=500)
		{
			n2=amount/500;
			amount=amount%500;
			System.out.println("500 x "+n2);
			break;
		}
		
		while(amount>=200)
		{
			n3=amount/200;
			amount=amount%200;
			System.out.println("200 x "+n3);
			break;
		}
	
		while(amount>=100)
		{
			n4=amount/100;
			amount=amount%100;
			System.out.println("100 x "+n4);
			break;
		}
		while(amount>=50)
		{
			n5=amount/50;
			amount=amount%50;
			System.out.println("500 x "+n5);
			break;
		}
		while(amount>=20)
		{
			n6=amount/20;
			amount=amount%20;
			System.out.println("20 x "+n6);
			break;
		}
		
		while(amount>=10)
		{
			n7=amount/10;
			amount=amount%10;
			System.out.println("10 x "+n7);
			break;
		}
		while(amount>=1)
		{
			n8=amount/1;
			amount=amount%1;
			System.out.println("1 x "+n8);
			break;
		}
		
		
		
}
}