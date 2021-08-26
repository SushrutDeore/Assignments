package Switch;

import java.util.Scanner;

public class monthDays {

	public static void main(String[] args) {
		 String month;
		 
		 System.out.println("Enter the Month  -->");
		 Scanner sc=new Scanner(System.in);
		 month=sc.next();
		 
		 switch(month)
		 {
		 case "January":
			 System.out.println("31 Days in January");
			 	break;
			 	
		 case "February":
			 System.out.println("28/29 Days in February");
			 	break;
		
		 case "March":
			 System.out.println("31 Days in March");
			 	break;
		
		 case "April":
			 System.out.println("30 Days in April");
			 	break;
			 	
		 case "May":
			 System.out.println("31 Days in May");
			 	break;
			 	
		 case "June":
			 System.out.println("30 Days in June");
			 	break;
		 
		 case "July":
			 System.out.println("31 Days in July");
			 	break;
		
		 case "August":
			 System.out.println("31 Days in January");
			 	break;
		
		 case "September":
			 System.out.println("30 Days in September");
			 	break;
		
		 case "October":
			 System.out.println("31 Days in October");
			 	break;
		 
		 case "November":
			 System.out.println("30 Days in November");
			 	break;
		 
		 case "December":
			 System.out.println("31 Days in December");
			 	break;
			 	
		default:
			 System.out.println("Try again..");
		
		 
		 
		 }
	}
}
