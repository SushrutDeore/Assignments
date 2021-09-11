import StringAssignment.WordCount;

public class DuplicateCharacter {

	
	public static void main(String[] args) {
		String str="asaabadss";
		
		char[] arr=str.toCharArray();
		
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			int charCount=1;
			for(int j=i+1;j<len;j++)
			{
				
				 if(arr[i]==arr[j])
				{
					charCount++;
					arr[j]='0';
					
				}
				 
						
			}  
			
			if(charCount > 1 && arr[i] != '0')
			{
				System.out.println("Repeated");
                System.out.println(arr[i]+""+charCount);
			}
			
			
			
		}
	}
}
