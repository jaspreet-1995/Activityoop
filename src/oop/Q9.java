package oop;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Enter your age :");
		int age= kk.nextInt();
		
		if(age>=18) {
			System.out.print("You are eligible to vote");
		}else {
			System.out.print("Sorry! You are not eligible to vote");

		}
		kk.close();
	}
}
