package oop;
import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num=kb.nextInt();
		int reverse=0;
		int i=1;
		
		while(num!=0) {
			int rr=num%10;
			reverse=reverse*10+rr;
			num=num/10;
		}
		System.out.print("reversed number is : "+reverse);
		kb.close();
	}

}
