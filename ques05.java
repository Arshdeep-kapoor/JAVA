package chapter2;
import java.util.Scanner;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate:");
		double s = in.nextDouble();
		double g_rate = in.nextDouble();

		double grat = s*g_rate/100;
		double total=grat+s;
		
		System.out.format("The gratuity is $%.1f and total is $%.1f",grat,total);

}}