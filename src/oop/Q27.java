package oop;
import java.util.Scanner;
public class Q27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me the month:");
		int month = kb.nextInt();
		int days=0;
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				days =28;
				break;
	}
	System.out.println("the month has " +days + " days");

}

}
