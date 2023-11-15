package oop;
import java.util.Arrays;

public class Q51 {
    public static void main(String[] args) {
        int[] originalArray = {5, 7, 8, 9, 10}; // Example array
        int[] copiedArray = new int[originalArray.length]; // Initialize new array for copying

        // Copy the original array to the new array by iterating
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Print the original and copied arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }


}
