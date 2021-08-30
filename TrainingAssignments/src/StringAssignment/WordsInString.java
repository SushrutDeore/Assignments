package StringAssignment;

import java.util.Scanner;

public class WordsInString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentense");
		String str1=sc.next();
		char[] ch=new  char[str1.length()];
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			ch[i]=str1.charAt(i);
			
			if(ch[i]==' ')
			{
			count=count+1;	
			}
			
		}
		
		System.out.println(count);
	}

}
