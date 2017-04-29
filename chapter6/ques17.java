package chapter06;
import java.util.Scanner;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		System.out.print("Enter n: ");
		int n = in.nextInt();

		printMatrix(n);
	}

	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols ++) {
				System.out.print((int)(Math.random() * 2));
			}
			System.out.println();
		}
	}
}