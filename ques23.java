package chapter2;
import java.util.Scanner;

public class ques23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the driving distance in miles:");
		double d = in.nextDouble();
		System.out.print("Enter miles per gallon:");
		double m = in.nextDouble();
		System.out.print("Enter price per gallon:");
		double p = in.nextDouble();
		
		double total=(d/m)*p;
		
		System.out.printf("The cost of driving is $%.2f",total);

	}

}
