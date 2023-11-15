package oop;
import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);  
		System.out.print("Enter the value 1: ");  
		double n1 = kb.nextDouble();  
		System.out.print("Enter the value 2: ");  
		double n2 = kb.nextDouble();  
		System.out.print("Enter the value 3: ");  
		double n3 = kb.nextDouble(); 
		double n4= n2*n2- 4.0*n1*n3;
		
		if(n4>0.0) {
			double v1=(-n2 + Math.pow(n4,0.5))/ (2.0 * n1);  
			double v2 = (-n2 - Math.pow(n4, 0.5)) / (2.0 * n1); 
			System.out.println("The roots are " + v1 + " and " + v2);
		}else if(n4==0.0) {
			double v1 = -n2 / (2.0 * n1);  
			System.out.println("The root is " + v1);  
			}   
			else   
			{  
			System.out.println("Roots are not real.");  
			} 
		
		}


}
