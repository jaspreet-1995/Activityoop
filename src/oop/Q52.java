package oop;
import java.util.Arrays;
public class Q52 {
	public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6}; // Example array
        int elementToInsert = 3; // Element to insert
        int position = 2; // Position to insert the element
        System.out.println("Original Array: " + Arrays.toString(array));
        array = insertElement(array, elementToInsert, position);
        System.out.println("Array after inserting " + elementToInsert + " at position " + position + ": " + Arrays.toString(array));
    }
    public static int[] insertElement(int[] arr, int element, int position) {
        int[] result = new int[arr.length + 1];
        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }
        // Insert the element
        result[position] = element;
        // Copy elements after the position
        for (int i = position; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }return result;


    }}
