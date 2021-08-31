package StringAssignment;

import java.util.Scanner;

//We take a count of number of words entered by user in sentense.
public class WordCount {

	public static int wordCount(String str)
	{
		
		int count=0;
		char[] ch=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			
			if( ((i>0) && ch[i]!=' ') && (ch[i-1]==' ') || ((ch[0]!=' ') && (i==0)))
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(wordCount(str));
	}
}
