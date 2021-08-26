package Switch;

import java.util.Scanner;

public class weekDays {

	public static void main(String[] args) {
		
		int no;
		System.out.println("Enter the number between 1 to 7 ...");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		
		switch(no)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;	
		case 3:
			System.out.println("Wednesday");
			break;	
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("error, day does not exist");
			
			
			
			
			
		}
	}
}
