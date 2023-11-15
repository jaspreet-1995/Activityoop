package oop;
import java.util.Scanner;
public class Q86 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scanner = new Scanner(System.in);

		        System.out.print("Input the number of terms: ");
		        int n = scanner.nextInt();

		        int sum = calculateSeriesSum(n);
                System.out.println("Expected Output:");
		        displaySeries(n);
		        System.out.println("\nThe Sum is: "  + sum);

		        scanner.close();
		    }

		    public static void displaySeries(int n) {
		        for (int i = 1; i <= n; i++) {
		            System.out.print(getSeriesTerm(i) + " ");
		        }
		    }

		    public static int calculateSeriesSum(int n) {
		        int sum = 0;

		        for (int i = 1; i <= n; i++) {
		            sum += getSeriesTerm(i);
		        }

		        return sum;
		    }

		    public static int getSeriesTerm(int term) {
		        return Integer.parseInt("1".repeat(term));
		    }
}
