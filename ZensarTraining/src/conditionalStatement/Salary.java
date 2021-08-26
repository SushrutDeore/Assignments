package conditionalStatement;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		double basic,hra,da,Salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Salary amount");
		basic=sc.nextFloat();
		System.out.println("Basic Salary : "+basic);
		
		if(basic<=10000)
		{
			hra=(basic*20)/100;
			da=(basic *80)/100;
			Salary=basic+hra+da;
			System.out.println("Gross Salary : "+Salary);
			
			
		}
		else if(basic<=20000)
		{
			hra=(basic*25)/100;
			da=(basic*90)/100;
			Salary=basic+hra+basic;
			System.out.println("Gross Salary : "+Salary);
			
			
		}
		
		else if(basic>20000)
		{
			hra=(basic*10)/100;
			da=(basic*12)/100;
			Salary=basic+hra+da;
			System.out.println("Gross Salary : "+Salary);
			
			
		}
		
		else
			System.out.println("Error");
	}
}
