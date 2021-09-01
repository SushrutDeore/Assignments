package ExceptionHandling;

public class Extras1 {
	
	public static String demoMethod()
	{
	try
	{
		return "From try";
	}
	finally 
	{
		return "From Finally";
	}
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(demoMethod());
	}

}
