package array2;

import java.util.Scanner;
//Printing outer elements of an array.
public class OuterElements {

	public static void main(String[] args) {
		
		int[][] arr=new int[4][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}	
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if (i == 0 || j == 0 || i ==3 || j ==3)
				{
					
					System.out.println(arr[i][j]);
					
				}
				
				
			}
		}
		
	}
}
