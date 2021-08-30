package StringAssignment;

import java.util.Arrays;
import java.util.Scanner;
// Here we will check for anagram string.
//Two Words can be called as anagram if character of both words are same.
public class Anagram {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st Word");
		String str1=sc.next();
		
		System.out.println("Enter the 2nd word");
		String str2=sc.next();
		
		
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(ch1.length==ch2.length)
		{
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Yes");
			}
			else
				System.out.println("NO");
		}
		else
			System.out.println("NO");
		
		
		
	}

}
