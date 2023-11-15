package oop;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kk= new Scanner(System.in);
		char cc= kk.next().charAt(0);
		if(cc=='a' || cc=='e' || cc=='i' || cc=='o' || cc=='u') {
		System.out.print(cc+ " is a Vowel");
		}else{
			System.out.print(cc+ " is consonant");
		}
	}

}
