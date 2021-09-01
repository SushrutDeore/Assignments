package ExceptionHandling;

public class DemoThrowMethod {
	
	
	public static void validateAge(int age)
	{
		if(age<18)
			throw new ArithmeticException("Age is less than 18");
		else
			System.out.println("Valid");
	}
	
	public static void main(String[] args) {
		validateAge(14);
		System.out.println("End....!");
	}

}
