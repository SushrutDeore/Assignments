package StringAssignment;

import java.util.Scanner;
//Searching for String is palindrome or not.
public class Palindrome {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] str2=new char[str.length()];
		char[] str1=str.toCharArray();
		for(int i=str.length()-1;i<=0;i--)
		{
			str2[i]=str.charAt(i);
		}
		
		
		
		if(str1==str2)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("not Palindrome");
	}
}
