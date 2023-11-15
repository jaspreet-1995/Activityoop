package oop;import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number: ");
    	double A= kk.nextInt();
    	double c=0;
    	double i=1;
    	while(i<A) {
    		i++; 
    		c=A*A;
    		 
    	}
    	System.out.print(c);
    	kk.close();
	}
}
