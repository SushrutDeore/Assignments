package ClassObjectAssighment;

public class TestAccount {
	
	public long AccNo;
	public String CustomerName;
	
	
	public TestAccount()
	{
		System.out.println("We are inside Default Constructor");
		AccNo=111;
		CustomerName="abc";
	}
	
	public TestAccount(long accno,String name)
	{
		this.AccNo=accno;
		this.CustomerName=name;
		System.out.println("We are inside Parameterised Constructor");
	}
	
	public void display()
	{
		System.out.println("Account Number : "+this.AccNo);
		System.out.println("Name : "+this.CustomerName);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TestAccount acc1=new TestAccount();
		acc1.display();
		
		TestAccount acc2=new TestAccount(9999,"Sushrut");
		acc2.display();

	}

}
