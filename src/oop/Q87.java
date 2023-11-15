package oop;
import java.util.Scanner;
public class Q87 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        
        double sum = calculateSum(numbers);
        double average = calculateAverage(numbers);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }

    public static double calculateSum(double[] arr) {
        double sum = 0;

        for (double num : arr) {
            sum += num;
        }

        return sum;
    }

    public static double calculateAverage(double[] arr) {
        if (arr.length == 0) {
            return 0; 
        }

        double sum = calculateSum(arr);
        return sum / arr.length;
    }
}
