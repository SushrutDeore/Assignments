package ClassObjectAssighment;

import java.util.Scanner;

public class Money {

	private long dollars;
	private long cents;
	
	public void set(long newDollars)
	{
		if(newDollars<0)
		{
			System.out.println("Negative Amount Entered");
			System.exit(0);
		}
		else
		{
			dollars=newDollars;
			cents=0;
		}
	}
	
	public void set(double newAmount)
	{
		if(newAmount<0)
		{
			System.out.println("Negative number of money not allowed");
			System.exit(0);
		}
		else
		{
			long allCents=Math.round(newAmount*100);
			dollars=allCents/100;
			cents=allCents%100;
		}
	}
	
	public void set(Money moneyObject)
	{
		this.dollars=moneyObject.dollars;
		this.cents=moneyObject.cents;
	}
	
	public void set(String amountString)
	{
		String dollarString = null;
		String centsString = null;
		
		if(amountString.charAt(0)=='$')
			amountString=amountString.substring(1);
		amountString=amountString.trim();
		
		int pointLocation=amountString.indexOf(".");
		
		if(pointLocation < 0)
		{
			cents=0;
			dollars=Long.parseLong(amountString);
			
		}
		else
		{
			dollarString=amountString.substring(0,pointLocation);
			centsString=amountString.substring(pointLocation+1);
			
		}
		
		if(centsString.length() <=1)
			centsString=centsString+"0";
		
		dollars=Long.parseLong(dollarString);
		cents=Long.parseLong(centsString);
		
		if((dollars <0) || (cents < 0) || (cents > 99))
		{
			System.out.println("Illegal representation of money");
			System.exit(0);
		}
		
	}
	
	
	public void  readInput()
	{
		System.out.println("Enter the amount");
		Scanner sc=new Scanner(System.in);
		String amount=sc.nextLine();
		set(amount.trim());
	}
	
	
	public void writeOutput()
	{
		
		System.out.println("$"+ dollars);
		if(cents <0)
			System.out.println(".0"+ cents);
		else
			System.out.println("."+ cents);
	}
	
	
	public Money times(int n)
	{
		Money Product=new Money();
		Product.cents=n*cents;
		long carryDollars=Product.cents/100;
		Product.cents=Product.cents%100;
		Product.dollars=n*dollars + carryDollars;
		return Product;
	}
	
	public Money add(Money otherAmount)
	{
		Money sum=new Money();
		sum.cents=this.cents+otherAmount.cents;
		long carryDollars=sum.cents/100;
		sum.cents=sum.cents %100;
		sum.dollars=this.dollars+otherAmount.dollars+carryDollars;
		return sum;
	}
	
	public static void main(String[] args) {
		Money start=new Money();
		Money goal=new Money();           
		
		System.out.println("Enter your current savings");
		start.readInput();
		
		goal=start.times(2);
		
		System.out.println("If you Double that you will have");
		goal.writeOutput();
		
		System.out.println("Or better yet:");
		
		goal=start.add(goal);
		System.out.println("IF triple that original amount you will have:");
		goal.writeOutput();
		
		System.out.println(".....");
		
		
	}
	
	

}
	
	
