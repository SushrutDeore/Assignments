package ExceptionHandling;

public class HandleArrayOutOfIndex {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		
		try
		{
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Array has only 3 elements");
		}
	}

}
