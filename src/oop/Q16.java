package oop;
import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = kb.nextInt();
		
		int sqrnum = (int) Math.sqrt(num);
		
		if(sqrnum * sqrnum == num) {
			System.out.print("Thats perfect :");
		}else {
			System.out.print("not perfect:");
		}
	}


}
