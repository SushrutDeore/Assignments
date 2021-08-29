package com.loops;

import java.util.Scanner;

public class CheckString {
	
	public static boolean compare(String str,String str2)
	{
		int a=str.length();
		int b=str2.length();
		int min,max,char1,char2;
		boolean flag = false;
		
		if(a>b)
		{
			max=a;
			min=b;
		}
		else
		{
			min=a;
			max=b;
		}
		
		
		for(int i=0;i<min;i++)
		{
			 char1=(int)str.charAt(i);
			 char2=(int)str2.charAt(i);
			 if(char1==char2)
			 {
				 flag=true;
				
			 }
			 else
			 {
				 
				 flag=false;
				 break;
			 }
			
		}
				
		return flag;	
		
	}
	
public static void main(String[] args) {
	
	String str="Krishnamurthy";
	
	System.out.println("Enter the name");
	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	
	System.out.println(compare(str, str1));
//	if(str.equals(str1))
//		System.out.println("Equal");
//	else
//		System.out.println("Different");
	
	
	
	
	
}
}
