package oop;import java.util.Scanner;

public class Q46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Give me a number: ");
		int n= kk.nextInt();
		table(n);
		kk.close();
	}
	public static void table(int mt) {
		int multiply=1;
		int i;
		for (i=1; i<=10; i++) {
			multiply=i*mt;
			System.out.println(i+ " X "+mt+ " = "+ multiply);

		}
	}

}
