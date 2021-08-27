package com.loops;

public class BreakInFor {

	
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++)
		{
			if(i==3)
			{
				System.out.println("Break from.."+i);
				break;
			}
			System.out.println(i);
		}
	}
}
