package chapter13;
import java.util.Scanner;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques01 {public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	System.out.print("Enter three sides of the triangle: ");
	double side1 = in.nextDouble();
	double side2 = in.nextDouble();
	double side3 = in.nextDouble();

	System.out.print("Enter a color: ");
	String color = in.next();

	System.out.print("Is the triangle filled (true / false)? ");
	boolean filled = in.nextBoolean();

	// Create a Triangle
	Triangle triangle = new Triangle(side1, side2, side3, color, filled);

	System.out.println(triangle);
}
}