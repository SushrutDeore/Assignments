package StringAssignment;

import java.util.Scanner;
//We are finding the count of character in the word which user will provide in input.
public class CharacterOccurance2 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String str1=sc.next();
		String str=str1.toLowerCase();
		System.out.println("Enter the character");
		String ch=sc.next();
		char a=ch.charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==a)
				count++;
		}
		
		System.out.println(count);
	}
	
}
