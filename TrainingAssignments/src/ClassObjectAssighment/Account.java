package ClassObjectAssighment;

import java.util.Scanner;

public class Account {
	
	private String name;
	private int age;
	private int AccountNo;
	private double Balance;
	private String typeOfAccount;
	private final int minBalance=1000;
	
	
	
	
	
	public Account() {
		super();
	}





	public Account(String name, int age, int accountNo, double balance, String typeOfAccount) {
		
		this.name = name;
		this.age = age;
		this.AccountNo = accountNo;
		this.Balance = balance;
		this.typeOfAccount = typeOfAccount;
	}





	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name of Account holder");
		this.name=sc.nextLine();
		System.out.println("Enter the Account number");
		this.AccountNo=sc.nextInt();
		System.out.println("Enter the type of account");
		this.typeOfAccount=sc.next();
		System.out.println("Enter the Balance");
		this.Balance=sc.nextDouble();
		System.out.println("Enter the Age");
		this.age=sc.nextInt();
		
		//Account obj=new Account(name,age,accNo,bal,accType);
		
		
		
		
	}
	
	public void display()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Account Number : "+this.AccountNo);
		System.out.println("Account Type : "+this.typeOfAccount);
		System.out.println("Balance : "+this.Balance);
		System.out.println("Age : "+this.age);
	}
	
	public void deposit(double depositAmount)
	{
		this.Balance=this.Balance+depositAmount;
		System.out.println("Updated Balance : "+this.Balance);
	}
	
	public void widraw(double Amount)
	{
		if((this.Balance-Amount)>=1000)
		{
			System.out.println("Take the Money");
			this.Balance=this.Balance-Amount;
			System.out.println("Updated Balance : "+this.Balance);
		}
		
	}
	
	public double getBalance()
	{
		return this.Balance;
	}
	
	public static void main(String[] args) {
		
		
		Account acc1=new Account();
		acc1.insert();
		acc1.display();
		acc1.getBalance();
		Scanner sc=new Scanner(System.in);
		System.out.println("How much money do you want to Widraw");
		int Amount=sc.nextInt();
		acc1.widraw(Amount);
		
		System.out.println("Enter amount to be deposit");
		Amount=sc.nextInt();
		acc1.deposit(Amount);
		double bal=acc1.getBalance();
		
		System.out.println("Balance : "+bal);
	}
	
	
	
	

}