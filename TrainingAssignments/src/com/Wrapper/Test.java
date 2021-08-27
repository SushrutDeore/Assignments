package com.Wrapper;

public class Test {

	public static void main(String[] args) {
		
		Integer a=new Integer(11);
		int b=11;
		
		byte abyte=a.byteValue();
		
		//b=(int)a;
		if(a==b)
		{
			System.out.println("Equal value");
			
		}
		else
			System.out.println("Not equal");
	}
		
	
}
