package ExceptionHandling;

public class UnknownOpException extends Exception {
	
	public UnknownOpException()
	{
		super("UnknownOpException");
	}
	
	public UnknownOpException(char op)
	{
		super(op+" ia an unknown operator");
	}
	
	public UnknownOpException(String msg)
	
	{
		super(msg);
	}

}
