package array2;

import java.util.Scanner;
//Finding Maximum number between the Elements in each Row.
public class MaxInRow {

	
	public static int findMax(int[] arr)
	{
		int max=arr[0];
		
		for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
		
		return max;
	}
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
			int[] temp=new int[column];
			for(int j=0;j<column;j++)
			{
			temp[j]=arr[i][j];	
			}
			System.out.println("Max in"+(i+1)+"row"+findMax(temp));
		}
		
	}
}
