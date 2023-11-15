package oop;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number ");

		int a= kk.nextInt();
		
		if(a%2!=0){
			System.out.println(a +" number is odd ");
		}else {
			System.out.println(a +" number is even ");
		}
		kk.close();
	}

}
