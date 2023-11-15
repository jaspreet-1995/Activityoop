package oop;
import java.util.Arrays;
public class Q54 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Replace this array with your own

        System.out.println("Original Array: " + Arrays.toString(array));

        // Call the function to reverse the array
        reverseArray(array);

        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at the start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers inward
            start++;
            end--;
        }
    }

}
