package oop;import java.util.Scanner;

public class Q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number: ");
    	int n=kk.nextInt();
    	System.out.print("enter power for num: "); // power used to multiple the number by power means number multiply by itself by the power you given 
    	int p=kk.nextInt();

    	int i=0;
    	int power=1;
    	
    	do {
    		i++;
    	 power= power*n;    	}while(i<p);
    	System.out.print(power);
kk.close();
	}

}
