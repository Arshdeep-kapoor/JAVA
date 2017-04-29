package chapter05;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques33 {
	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		while (number<=10000){
			int sumOfFactors=0;
			for(int i = (number-1);i>=1;i--){
				if (number%i==0){
					sumOfFactors+=i;
				}
			}
			if(sumOfFactors==number){
				count++;
				System.out.println("the "+count+" perfect number is " + number );
			}
			number++;
		}
	}
}