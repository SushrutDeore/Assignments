package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
	
	public static void sort(int[] arr)
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int current=arr[i];
			int j=i-1;
			while( j>=0 &&arr[j]>current )
			{
			arr[j+1]=arr[j];
			j--;
			}
			arr[j+1]=current;
		}
		
		System.out.println("Sorted array");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the numbers");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort(arr);
		
	}

}
