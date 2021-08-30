package Array2;

public class UniquePair {
	
	
	
	
	public static void main(String[] args) {
		
		int[] array= {2,4,3,5,6,-2,4,7,8,9};
		
		int sum=7,temp=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				temp=array[i]+array[j];
				if(temp==sum)
				{
					System.out.println("["+array[i]+","+array[j]+"]");
				}
			}
		}
	}

}
