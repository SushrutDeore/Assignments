package Switch;

import java.util.Scanner;



public class Area {
public static void main(String[] args) {
	
	int ch;
	double area,perimeter,circumference;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the choice");
	System.out.println("1.Area of Sqaure \n 2. Area of Triangle \n 3. Area of Circle \n 4.Perimeter of rectangle\n 5.Circumferece of circle\n");
	ch=sc.nextInt();
	
	switch(ch)
	{
		case 1:
			
			float side;
			System.out.println("Enter the side");
			side=sc.nextFloat();
			area = side*side;
			System.out.println("Area of Square : "+ area);
			break;
			
		case 2:
			float base,height;
			System.out.println("Enter the base");
			base=sc.nextFloat();
			System.out.println("Enter the height");
			height=sc.nextFloat();
			area=0.5*height*base;
			System.out.println("Area of triangle is : "+area);
			break;
	
		case 3:
			float radius;
			System.out.println("Enter the radius");
			radius=sc.nextFloat();
			area=3.14*radius*radius;
			System.out.println("Area of circle is : "+area);
			break;
			
		case 4:
			float lenght,width;
			System.out.println("Enter the lenght and breadth");
			lenght=sc.nextFloat();
			width=sc.nextFloat();
			perimeter=2*(lenght+width);
			System.out.println("Perimeter of rectangle is : "+perimeter);
			break;
			
		case 5:
			float radius1;
			System.out.println("Enter the radius ");
			radius1=sc.nextFloat();
			circumference=2*3.14*radius1;
			
			System.out.println("Circumference of circle is "+circumference  );
			break;
			
	default: 
		System.out.println("invalid");
	}
	
	
}
}
