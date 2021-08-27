package Arrays;

import java.util.Scanner;

public class Temperature {

	
	public static void main(String[] args) {
		
		
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many records do you want to enter");
		size=sc.nextInt();
		double[] temp=new double[size];
		System.out.println("Enter the temperature values...");
		
		double sum=0;
		for(int i=0;i<size;i++)
		{
			
			temp[i]=sc.nextDouble();
			sum+=temp[i];
			
		}
		
		double avgTemp=sum/10;
		System.out.println("Average temperature is : "+avgTemp);
		
		for(int i=0;i<size;i++)
		{
			if(temp[i]>avgTemp)
				System.out.println(i+")"+temp[i]+"Temperature is More than average temperature ");
			else if(temp[i]<avgTemp)
				System.out.println(i+")"+temp[i]+"Temperature is Less that Average temperature");
			else
				System.out.println(i+")"+temp[i]+"Temperature is equal to average temperature");
		}
		
	}
}
