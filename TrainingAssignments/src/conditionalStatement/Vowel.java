package conditionalStatement;

import java.util.Scanner;

public class Vowel {
public static void main(String[] args) {
	
	String str;
	System.out.println("Enter the alphabate");
	Scanner sc=new Scanner(System.in);
	str=sc.next();
	char ch=str.charAt(0);  
	
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        System.out.println(ch + " is vowel");
    else
        System.out.println(ch + " is consonant");
	
}
}
