package oop;

import java.util.Arrays;
public class Q81 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		
	     int[] array = {7, 1, 4, 2, 8, 3, 6, 5};

	        System.out.println("Original Array: ");
	        printArray(array);

	        sortAlternateMinMax(array);

	        System.out.println("\nArray after Sorting: ");
	        printArray(array);
	    }

	    public static void sortAlternateMinMax(int[] arr) {
	        Arrays.sort(arr);

	        int[] result = new int[arr.length];
	        int left = 0, right = arr.length - 1;

	        for (int i = 0; i < arr.length; i++) {
	            if (i % 2 == 0) {
	                result[i] = arr[right];
	                right--;
	            } else {
	                result[i] = arr[left];
	                left++;
	            }
	        }

	       
	        System.arraycopy(result, 0, arr, 0, arr.length);
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

}
