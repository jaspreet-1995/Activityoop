package oop;
import java.util.Scanner;

public class Q21 {
	//multiple of both 3 and 5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
//		int multiples=0;
		int nn = kb.nextInt();
		for(int i=0; i<=nn; i++) {
			if(nn%3==0 && nn%5==0) {
				System.out.print(i);
			}
		}
		kb.close();

	}

} 
