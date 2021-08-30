package StringAssignment;

import java.util.Scanner;
//We are validating email id entered by user.
public class Email {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Email id");
		String email=sc.next();
		int len=email.length();
		char[] ch=email.toCharArray();
		int atflag=0,dotflag=0;
		for(int i=0;i<len;i++)
		{
			if(ch[i]=='@')
			{
				atflag=1;
			}
			else if(ch[i]=='.')
			{
				dotflag=1;
			}
		}
		
		if((atflag==1) && (dotflag==1))
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
	}

}
