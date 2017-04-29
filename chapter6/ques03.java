package chapter06;
import java.util.Scanner;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques03 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = in.nextInt();
		
		System.out.println(num + (isPalindrome(num) ? " is " : " is not ") +
				"a palindrome.");
	}
		public static boolean isPalindrome(int number){
			return number == reverse(number) ? true : false;
		}

		public static int reverse(int number){
			String reverse = ""; 	
			String n = number + ""; 
	
			for (int i = n.length() - 1; i >= 0; i--) {
				reverse += n.charAt(i);
			}
			return Integer.parseInt(reverse); 
		}
}