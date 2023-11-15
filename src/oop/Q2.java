package oop; 
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kk = new Scanner(System.in);
		System.out.print("enter a number 1 ");
        double num1=kk.nextDouble();
		System.out.print("enter a number 2 ");
		double num2=kk.nextDouble();
		System.out.print("enter a number 3 ");
		double num3=kk.nextDouble();
				double average= (num1+num2+num3)/3;
		System.out.println(" the average is : " + average);
		
		kk.close();
	}

}
