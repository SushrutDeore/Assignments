package SalesRepo;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the np of records");
	int n=sc.nextInt();
	SalesReport sr=new SalesReport(n);
	sr.getTeam();
	sr.report();
}
}
