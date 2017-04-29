package chapter05;
import java.util.Scanner;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		int max = in.nextInt();	
		int count = 1;			
		int number=max;			

		while (number > 0) {
			number = in.nextInt();
			if (number > max) {
				max = number;
				count = 1;
				continue;
			}
			if (number == max){
				count++;
				}
		} 
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}
}