package think;
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float wt,ht;
		System.out.println("Enter the weight and height");
		wt=sc.nextFloat();
		ht=sc.nextFloat();
		
		double bmi=wt/(ht*ht);
		System.out.println("BMI value : "+bmi);
		
		if(bmi<18.5)
			System.out.println("Underweight");
		else if(bmi>25 && bmi<30)
			System.out.println("Overweight");
		else if(bmi >18.5 && bmi<25)
			System.out.println("normal");
		else
			System.out.println("obese");
	}
}
