package oop;

public class Q53 {
    public static void main(String[] args) {
        int[] array = {7, 2, 9, 4, 5, 1, 6, 3, 8}; // Example array

        int max = array[0];
        int min = array[0];

        // Finding the maximum and minimum values
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Printing the maximum and minimum values
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}



