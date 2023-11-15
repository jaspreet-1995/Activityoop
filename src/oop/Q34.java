package oop;
import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=kb.nextInt();
		int i=0;
		//10 is given as range //
		while( i<10) {
			i++;
			int mpl=i*num;
			System.out.println(num +"X" + i + "="+ mpl);
		}
		System.out.println();
	}

}
