package chapter2;
import java.util.Scanner;
public class ques19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three points for a triangle:");
		double x1=in.nextDouble();
		double y1=in.nextDouble();
		double x2=in.nextDouble();
		double y2=in.nextDouble();
		double x3=in.nextDouble();
		double y3=in.nextDouble();		
		
		double side1=Math.pow(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2)),0.5);
		double side2=Math.pow(Math.pow((x3-x2),2)+(Math.pow((y3-y2),2)),0.5);
		double side3=Math.pow(Math.pow((x1-x3),2)+(Math.pow((y1-y3),2)),0.5);
		
		double s = (side1+side2+side3)/2;
		
		double area = Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5);
		
		System.out.printf("The area of the triangle is %.2f", area);

	}

}
