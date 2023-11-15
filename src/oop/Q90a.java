package oop;
import java.util.Scanner;
public class Q90a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of lines: ");
		        int lines = scanner.nextInt();

		        System.out.println("Pattern:");

		        for (int i = 0; i < lines; i++) {
		            // Print numbers in decreasing order
		            for (int j = i; j >= 0; j--) {
		                System.out.print(lines - j);
		            }

		            System.out.println();
		        }

		      
		    }

}
