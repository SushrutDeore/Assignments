package array2;

import java.util.Scanner;
//Finding Minimum number between the Elements in each Column.
public class MinInColumn {

	public static int findMin(int[] arr)
	{
		
		int min=arr[0];
		for (int i = 1; i < arr.length; i++)
		{
            if (arr[i] < min)
                min = arr[i];
		}
		
		return min;
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
		
		int[] temp=new int[row];
		for(int j=0;j<column;j++)
		{
		for(int i=0;i<row;i++)
		{
			temp[i]=arr[i][j];
		}
		
		System.out.println("Minimun in Column "+j+findMin(temp));
		}
		
	}

}
