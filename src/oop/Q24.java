package oop;
import java.util.Scanner;

public class Q24 {
//check if a number is even, odd, or prime using else-if statements.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cc=new Scanner(System.in);
		System.out.println("Enter a number");
		int DD= cc.nextInt();
		
		
		if(DD%2==0) {
			System.out.println(DD + " is a even number");
		}else{
			System.out.println(DD + " is a odd number");
		}
		int counter =0;
		for(int i =1; i<=DD; i++) {
			if(DD%i==0) {
				counter++;
			}
		}
		if(counter==2) {
			System.out.println(DD + " is a prime number");

		}else {
			System.out.println(DD + " is a not a number");
		}
		cc.close();
    }
}