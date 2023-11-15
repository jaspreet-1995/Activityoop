package oop;
import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number:");
		double num1 = kb.nextDouble();
		System.out.print("Enter the number 2:");
		double num2 = kb.nextDouble();
		System.out.print("Enter the number 3:");
		double num3 = kb.nextDouble();
		System.out.print("Enter the number 4:");
		double num4 = kb.nextDouble();
		
		double largest1 = Math.max(num1, num2);
		double largest2= Math.max(largest1,num3);
		double largest3 = Math.max(largest2, num4);
		
		System.out.println("The largest number is: "+largest3);
		
	}


}
