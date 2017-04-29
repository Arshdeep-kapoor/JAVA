package chapter06;
/**
 * @author Arshdeep Kapoor
 * 
 */
public class ques27 {
	public static void main(String[] args){
		int no_of_emrips=100;
		int no_per_line=10;
		
		int count=0;
		int num=2;
		while(count<=no_of_emrips){
			if(isEmirp(num)){
				count++;
				if (count%no_per_line==0){
					System.out.println(num+"   ");
				}
				else{
					System.out.print(num+"   ");
				}
			}
		num++;	
		}
	}
	public static boolean isEmirp(int x){
		if (isPrime(x)){
			if (!isPalindrome(x)){
				if(isPrime(reverseOf(x))){
					return true;
				}
			}
		}
		return false;
	}
	public static boolean isPrime(int x){
		int divisor =2;
		while (divisor<x){
			if (x%divisor==0){
				return false;
			}
			else
				divisor++;
		}
		return true;
	}
	
	public static boolean isPalindrome(int x){
		return x==reverseOf(x)?true:false;
	}
	
	public static int reverseOf(int x){
		String m= x+"";
		int n=0;
		for(int j=0;j<m.length();j++){
			n=n*10+(x%10);
			x=x/10;
		}
		return n;
	}
}
