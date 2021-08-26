package conditionalStatement;

import java.util.Scanner;

public class Identify {

	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any caracter");
        String str= sc.next();
        char ch=str.charAt(0);
        
        if (Character.isAlphabetic(ch))
        	System.out.println(ch + " is A ALPHABET.");

        else if (Character.isDigit(ch)) 
        	System.out.println(ch + " is A DIGIT.");

         else 
        	 System.out.println(ch + " is A SPECIAL CHARACTER.");
}
}
