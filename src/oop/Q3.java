package oop;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kk= new Scanner(System.in);
		System.out.print("enter a number 1 ");
        int num1= kk.nextInt();
		System.out.print("enter a number 1 ");
        int num2= kk.nextInt();
        
        System.out.println("maximum number is  "+Math.max(num1,num2)); 
        
        kk.close();
	}

}
