package Arrays;

import java.util.Scanner;

public class BookRecords {
	
	public static void main(String[] args) {
		
		int row,column=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of records");
		row=sc.nextInt();
		
		String[][] records=new String[row][column];
		
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
			{
				records[i][j]=sc.next();
			}
		
		
		for(int i=0;i<row;i++)
		{
			System.out.println(" ");
			for(int j=0;j<column;j++)
			{
				System.out.print(records[i][j]+" ");
			}
		}

	}

}
