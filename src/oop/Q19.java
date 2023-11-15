package oop;
import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("enter a number  ");
	      int n= kk.nextInt();
	      
	      if(n%2==0 && n>0) {
	    	  System.out.print( n+ "  is even and positive number");
	      }else if(n%2!=0 && n>0) {
	    	  System.out.print( n+ "  is not a even but positive number");
	      }else{
	    	  System.out.print( n+ " is not even and a negative number");
	      }
	}

}
