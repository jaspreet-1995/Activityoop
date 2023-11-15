package oop;
import java.util.Scanner;
public class Q89 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		        System.out.print("Input the number (Table to be calculated): ");
		        int number = scanner.nextInt();

		        System.out.println("Expected Output:");
		        displayMultiplicationTable(number);

		        scanner.close();
		    }

		    public static void displayMultiplicationTable(int number) {
		        for (int i = 1; i <= 10; i++) {
		            System.out.println(number + " x " + i + " = " + (number * i));
		        }
		    }

}
