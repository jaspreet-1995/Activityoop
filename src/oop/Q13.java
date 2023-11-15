package oop;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print( "Enter Year : ");
		int year= kk.nextInt();
		
		if(year%400==0 || year%4==0 && year%100!=0) {
			System.out.print(year + " is a leap year");
		}else {
			System.out.print(year + " is not a leap year");
		}
	}

}
