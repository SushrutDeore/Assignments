package ExceptionHandling;

import java.util.Scanner;

public class PrelimCalculator {
		private double result;
		private double precision=0.0001;
		
		public PrelimCalculator()
		{
			this.result=0;
		}
		
		public void reset()
		{
			this.result=0;
			
		}
		
		public void setResult(double newResult)
		{
			this.result=newResult;
		}
		
		public double getResult()
		{
			return this.result;
		}
		
		
	
		public double evaluate(char op,double n1,double n2) throws DivideByZeroException, UnknownOpException
		{
			double answer;
			switch(op)
			{
			case '+':
				answer=n1+n2;
				break;
				
			case '-':
				answer=n1-n2;
				break;
			
			case '*':
				answer=n1*n2;
				break;
				
			case '/':
				if((-precision <n2) && (n2< precision))
					throw new DivideByZeroException();
				answer=n1/n2;
				break;
				
			default:
				throw new UnknownOpException(op); 
				
			}
			
			return answer;
		}
		
		public void doCalculation() throws DivideByZeroException,UnknownOpException
		{
			Scanner sc=new Scanner(System.in);
			boolean done=false;
			result=0;
			System.out.println("Result = "+result);
			
			
			while(!done)
			{
				char nextOP=sc.next().charAt(0);
				if((nextOP=='e') || (nextOP=='E'))
					done=true;
				
				else
				{
					double nextNumber=sc.nextDouble();
					result=evaluate(nextOP, result, nextNumber);
					System.out.println("Result "+nextOP+" "+nextNumber+" +"+result);
					
					System.out.println("Updated result ="+result );
				}
			}
			
			
			
		}
		
		public static void main(String[] args)throws DivideByZeroException,UnknownOpException {
			
			PrelimCalculator clerk=new PrelimCalculator();
			try
			{
			System.out.println("Calculator is on");
			System.out.println("Format of each line");
			System.out.println("Operator space number");
			System.out.println("For example : + 3");
			System.out.println("To end enter the letter e");
			clerk.doCalculation();
			}
			catch(UnknownOpException e)
			{
				System.out.println(e.getLocalizedMessage());
			}
			catch(DivideByZeroException e)
			{
				System.out.println(e.getLocalizedMessage());
			}
			
			System.out.println("The final result is : "+ clerk.getResult());
			
		}
		
}
