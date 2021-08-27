package com.math;

public class CircleCalculator {

	public static double Area(double radius)
	{
		return Math.PI*radius*radius;
	}
	
	
	public static double Circumference(double radius)
	{
		return Math.PI*2*radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Area of Circle"+Area(4.32));
		
		System.out.println("Circumferece of circle" +Circumference(3.43));
		
	}

}
