package oop;import java.util.Scanner;

public class Q41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=kb.nextInt();
		int reverse=0;
		do {
			int reminder=num%10;
			reverse= reverse*10+reminder;
			num=num/10;

		}while(num!=0);
		System.out.print(reverse);

	}

}
