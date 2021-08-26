package Switch;

import java.util.Scanner;


public class vowel {
	
	public static void main(String[] args) {
		
		String alphabate;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Character");
		
		alphabate=sc.next();
		
		char ch=alphabate.charAt(0);  
		
		switch(ch)
		{
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;	
		case 'o':
			System.out.println("Vowel");
			break;	
		case 'u':
			System.out.println("Vowel");
			break;	
		default:
			System.out.println("Alphabate");
		
		}
		
	}

}
