package oop;import java.util.Scanner;

public class Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number: ");
    	int n=kk.nextInt();
    	int i=1;
    	int factorial=1;
    	
    	do {
    		factorial=factorial*i;
    		i++;

    	}while(i<=n);
    	System.out.print("Factorial of "+ n + " is "+ factorial);
    	kk.close();
	}
}
