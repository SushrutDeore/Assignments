package ExceptionHandling;

public class ArrayOutOfIndex {
	
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3};
		
		try
		{
			System.out.println(arr[4]);
		}
		catch (Exception e) {
			System.out.println("Element at 4th index is not available");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("List has only "+arr.length+" Elements");
		}
		
	}

}
