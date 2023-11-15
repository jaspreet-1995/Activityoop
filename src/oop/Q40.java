package oop;import java.util.Scanner;

public class Q40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number: ");
    	int n= kk.nextInt();
    	int i=1;

    	int fibo=0;
    	int fibo1=1;
    	int fibo2;
		System.out.println(fibo + " "+ fibo1);
		System.out.println("Fibonacci series is :");

    	
    	do {
    		i++;
    		fibo2=fibo +fibo1;
    		fibo=fibo1;
    		fibo1=fibo2;
    		System.out.print(fibo2+" ");
    	}while(i<=n);

	}

}
