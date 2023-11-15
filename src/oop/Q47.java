package oop;import java.util.Scanner;

public class Q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Give me number for array elements: ");
		int n= kk.nextInt();
		int[] ak= new int[n];

	      for(int i =0; i<n; i++){
	    	  System.out.print("enter value: ");
	    	  ak[i] = kk.nextInt();}
		int avrg = 0;
		int sum=0;
		for(int i =0; i<n; i++){
	    	  sum = sum + ak[i];
	      }
		avrg= sum/n;
		System.out.println("Sum of all values is = "+sum);
		System.out.print("Average is "+ avrg);

kk.close();
		}
}


