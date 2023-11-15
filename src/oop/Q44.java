package oop;import java.util.Scanner;

public class Q44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=kb.nextInt();
		natural(num);
		kb.close();
	}
		
		public static void natural(int nn){
		for(int i=1; i<=nn ;i++)
		{
			System.out.println("natural number "+ i);
			System.out.println();

		}
		}
}
