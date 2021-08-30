package Array2;

import java.util.Scanner;

public class ThreexFourArray {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int row=3,column=4;
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

