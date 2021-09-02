package CollectionAssignment;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TodoList {
	
	public static void main(String[] args) {
		
		ArrayList<String > al=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		String myString;
		int noOfEntries,j=1;
		System.out.println("How much entries do you want to make");
		noOfEntries=sc.nextInt();
		System.out.println("Enter the task.");
		boolean flag=true;
		try
		{
		while(flag && j<=noOfEntries)
		{
			System.out.println("Enter the entry");
			myString=sc.next();
			if(myString.equalsIgnoreCase("Seeta"))                        
			{
				throw new InvalidName();
			}
			al.add(myString);
			j++;
//			System.out.println("More Entries??");
//			String str=sc.nextLine();
//			if(str.equalsIgnoreCase("yes"))
//				flag=true;
//			else
//				flag=false;
			
		}
		}
		catch (InvalidName e) {
			System.out.println(e.getMessage());
		
		}
		int count=0;
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
		System.out.println(++count + " "+itr.next());
		}
	}

}
