package CollectionAssignment;

public class InvalidName extends Exception {
	
	public InvalidName()
	{
		super("Invalid Name");
	}
	
	public InvalidName(String str)
	{
		super(str);
	}

}
