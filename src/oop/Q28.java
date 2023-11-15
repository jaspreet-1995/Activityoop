
package oop;
import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Enter a char or line : ");
		char cc= kk.nextLine().charAt(0);
		int vowels;
		
		if(cc=='a' || cc=='e' || cc=='i' || cc=='o' || cc=='u') {
			vowels=1;
		}else if(cc >='a'&& cc<='z') {
			vowels=2;
		}else {
			vowels=3;
		}
		
		switch(vowels) {
		case 1:
			System.out.print(cc+ " is a vowel");
			break;	
		case 2:
			System.out.print(cc+ " is a constant");
			break;
		case 3:
			System.out.print("Entered input is not a letter or character ");
			break;
		default:
			System.out.print(" null");

			break;

		}
		kk.close();
			}
}
