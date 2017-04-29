package chapter04;
import java.util.Scanner;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		String s = in.nextLine();
		char ch = s.charAt(0);

		if (Character.isLetter(ch))
		{
			switch(Character.toUpperCase(ch))
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(ch + " is a vowel"); break;
				default : System.out.println(ch + " is a consonant"); 
			}
		}
		else
			System.out.println(ch + " is an invalid input");
	}
}