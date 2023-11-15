package oop;import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int nn=kk.nextInt();
		if(nn>0){
			System.out.println("absolute value of a number is "+ nn);
			
		}else {
			System.out.println(nn*(-1));
		}
		kk.close();
	}

}
