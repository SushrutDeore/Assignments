package School;

public class Student {
	
	public int rollNo=111;
	private int admissionNO=1234;
	protected int age=22;
	int courseId=1001;
	
	public void doPublic()
	{
		System.out.println("Inside Public Method of School Package");
		
	}
	
	protected void doProtected() 
	{
		System.out.println("Inside Protected Method");
	}
	
	private void doPrivate()
	{
		System.out.println("Inside Private Method");
	}
	
	void doDefault()
	{
		System.out.println("Inside Default Method");
	}
}
