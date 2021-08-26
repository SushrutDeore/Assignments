package conditionalStatement;

import java.util.Scanner;

public class maxFrom3 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		System.out.println("Enter the Numbers");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		if(n1>n2 && n1>n3)
			System.out.println( n1+" is Greater than "+n2+" and "+n3);
		else if(n2>n3)
			System.out.println( n2+" is Greater than "+n1+" and "+n3);
		else
			System.out.println( n3+" is Greater than "+n1+" and "+n2);
	}
}
