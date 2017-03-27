package chapter2;
import java.util.Scanner;

public class ques07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of minutes:");
		double min = in.nextDouble();
		
		int days= (int)min/(60*24);
		int years= (int)(days/365);
		days= days%365;

		
		System.out.printf("%.0f minutes is approximately %d years"
				+ " and %d days", min, years, days);
		

	}

}
