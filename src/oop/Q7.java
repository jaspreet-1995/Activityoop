package oop;import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("enter a number  ");
      int num1= kk.nextInt();
      boolean primenum= true;
      
      if(num1<=1) {
    	  primenum=false;
    	  }else {
    		  for(int i=2;i<num1/2; i++) {
    			  if(num1%i==0) {
    				  primenum =false;
    				  break;
    			  }
    		  }
    	  }
      if(primenum) {
    	  System.out.print(num1 + " is a prime number.");
      }else {
    	  System.out.print(num1 + " is not a prime number.");
      }
      
      kk.close();
	}

}
