package oop;
import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print(" enter number ");
		int nn=kk.nextInt();
		int sum=0;
		int count=1;

		while(count<=nn) {
			sum=sum+count;
			count++;
			
		}
		System.out.println("sum = "+ sum);
		System.out.println();
		System.out.println("done ");
	kk.close();
	}
}
