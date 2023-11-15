package oop;import java.util.Scanner;

public class Q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number: ");
    	double num= kk.nextInt();
    	square(num);
    	kk.close();
	}
public static void square(double A) {
	double c=0;
	double i=1;
	do {
		i++; 
		c=A*A;
	}
		while(i<A);
	System.out.print(c);

}
}
