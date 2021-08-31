package StringAssignment;

import java.util.Scanner;

public class OccuranceOfWord {
	
	public static  int findCount(String str,String word)
	{
		int count=0;
		
		String a[] = str.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if(word.equals(a[i]))
			{
				count++;
			}
		}
		
	
		return count;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		
		String str="    ab gf ab nn ab";
		
		int count=findCount(str,"ab");
		System.out.println(count);
		
		
	}

}