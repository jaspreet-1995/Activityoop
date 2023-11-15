package oop;import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number ");
		int num1= kk.nextInt();
      
      if (num1<0) {
    	  System.out.print("Can't do the factorial becouse the "+ num1 + " is a negative number");  
      }else {
    	  int factorial=1;
      for(int i=1; i<=num1; i++) {
      	factorial=factorial*i;
      }
    System.out.println("factorial of " +num1 +" is "+ factorial); 
	}
kk.close();
}}
