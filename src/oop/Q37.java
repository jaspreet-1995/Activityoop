package oop;import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number: ");
    	int n= kk.nextInt();
    	int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=n);
	kk.close();	
	}
}
