package oop;

import java.util.Scanner;
public class Q23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = kb.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("Sunday:");
			break;
		case 2:
			System.out.print("mon:");
			break;
		case 3:
			System.out.print("tue:");
			break;
		case 4:
			System.out.print("wed:");
			break;
		case 5:
			System.out.print("thur:");
			break;
		case 6:
			System.out.print("fri:");
			break;
		case 7:
			System.out.print("sat:");
			break;
		default:
			System.out.print("Not a day:");
			break;
		}


}
}
