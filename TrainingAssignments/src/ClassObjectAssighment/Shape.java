package ClassObjectAssighment;

public class Shape {
	
	public double area(double radius)
	{
		return 3.14*radius*radius;
	}
	
	public int area(int side)
	{
		return side*side;
	}

	public int area(int lenght, int breadth)
	{
		return lenght*breadth;
	}
	public static void main(String[] args) {
		
		Shape s=new Shape();
		
		System.out.println("Area of Circle : "+s.area(4.23));
		System.out.println("Area of Sqaure : "+s.area(4));
		System.out.println("Area of Rectangel : "+s.area(3, 4));
		
	}
}
