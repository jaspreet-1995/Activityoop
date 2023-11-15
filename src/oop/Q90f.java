package oop;
import java.util.Scanner;


public class Q90f {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println("please give a line");
		int line = kb.nextInt();
		int number=1;
		
		for (int i=1; i<=line; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(number+ " ");
				number++;
			}
			System.out.println();
		}
		// TODO Auto-generated method stub
		System.out.println();

	}

}
