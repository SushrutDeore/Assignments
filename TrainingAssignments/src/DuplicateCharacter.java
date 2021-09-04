
public class DuplicateCharacter {

	
	public static void main(String[] args) {
		String str="asaabadss";
		
		char[] arr=str.toCharArray();
		
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			int charCount=0;
			for(int j=0;j<len;j++)
			{
				
				 if(arr[i]==arr[j])
				{
					charCount++;
					
				}
						
			}  
			
			System.out.println(arr[i]+" "+charCount);
			
			
			
		}
	}
}
