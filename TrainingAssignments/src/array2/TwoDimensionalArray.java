package array2;

import java.util.Scanner;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		int row,column;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column");
		row=sc.nextInt();
		column=sc.nextInt();
		int[][] arr=new int[row][column];
		
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			System.out.println(" ");
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}

	
	}

}
