package oop;
import java.util.Scanner;
public class Q85 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int n = scanner.nextInt();

        displayCube(n);

        scanner.close();
    }

    public static void displayCube(int n) {
        System.out.println("Expected Output:");

        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
        }
    }


}
