package chapter06;
import java.util.Scanner;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques37 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		System.out.print("Enter a number and its width: ");
		int number = in.nextInt();
		int width = in.nextInt();

		System.out.println(
			number + " formatted to width " + width + ": " + format(number, width));
	}

	public static String format(int number, int width) {
		String num = number + ""; 
		
		if (num.length() < width) {
			for (int i = width - num.length(); i > 0; i--) {
				num = 0 + num;
			}
		}
		return num;
	}
}