package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
	
	
	
	public static void sort(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
			
	
		}
		
		
		System.out.println("Sorted array::");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		sort(arr);
	}

}
