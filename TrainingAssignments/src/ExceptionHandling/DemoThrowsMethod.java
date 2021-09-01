package ExceptionHandling;

public class DemoThrowsMethod {
	
	public static void method1(int a) throws Exception
	{
		if(a<=0)
			throw new Exception("Zero is there");
	}
	
	
	public static void main(String[] args) throws Exception {
		
		method1(0);
	}
	

}
