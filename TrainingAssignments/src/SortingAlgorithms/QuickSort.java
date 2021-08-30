package SortingAlgorithms;

import java.util.Scanner;

public class QuickSort {
	
	public static void printArray(int[] arr)
	{
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static int partition(int[] arr,int low,int high)
	{
		int pivot=arr[(low+high)/2];
		
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(pivot<arr[high])
			{
				high--;
			}
			if(low>=high)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
				
			}
		}
		return low;
	}
	
	
	public static void recursion(int[] arr,int low,int high)
	{
		int pi=partition(arr, low, high);
		if(low<pi-1)
			recursion(arr, low, pi-1);
		if(pi<high)
			recursion(arr, pi, high);
		
		
		printArray(arr);
		
	
	}
	
	public static void main(String[] args) {
		
//		System.out.println("Enter the number of elements");
//		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		
//		int[] arr=new int[size];
//		System.out.println("Enter array elements");
//		for(int i=0;i<size;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		
		int[] arr= {12,13,14,22,14,16};
		
		recursion(arr, 0, arr.length-1);
		
		
		
	}
}
