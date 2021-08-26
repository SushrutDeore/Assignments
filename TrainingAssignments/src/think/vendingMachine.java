package think;

import java.util.Scanner;

public class vendingMachine {

	public static void main(String[] args) {
		
		int amount,constant;
		int quarter,dime,nickel,pennies,dollar;
		System.out.println("Enter the amount in cents");	
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		constant=amount;
		
		dollar= amount/100;
		
		amount=amount%100;
		
		quarter=amount/25;
		
		amount=amount%25;
		
		dime=amount/10;
		
		amount=amount%10;
		
		nickel=amount/5;
		
		amount=amount%5;
		
		pennies=amount;
		
		System.out.println(constant+" Cents in coins::");
		if(dollar!=0)
		{
			System.out.println("Dollar : "+dollar);
		}
		System.out.println("Quarter : "+quarter);
		System.out.println("Dime : "+dime);
		System.out.println("Nickel : "+nickel);
		System.out.println("Pennies : "+pennies);
		
		
		
		
	}

}
