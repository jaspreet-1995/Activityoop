package oop;
import java.util.Scanner;
public class Q90c {

	public static void main(String[] args) {
		
		Scanner kb=new Scanner (System.in);
		
		System.out.println("Please eneter a number");
		
		int line =kb.nextInt();
		
		for (int i=0; i <line ; i++)
		{
			for (int j=0; j<i; j++)
			{
				System.out.print(" ");
				
			}
			for (int k=0; k<line-i; k++)
			{
				System.out.print("* ");
			}
		System.out.println();	
			
		}
	
	}

}
