package oop;
import java.util.Arrays;
public class Q50 {
	public static void main(String[] args) {
        int[] array = {5, 7, 3, 4, 11}; // Example array
        int elementToRemove = 4; // Example element to remove
        System.out.println("Original Array: " + Arrays.toString(array));

        array = removeElement(array, elementToRemove);

        System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(array));
    }

    public static int[] removeElement(int[] arr, int target) {
        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }


}
