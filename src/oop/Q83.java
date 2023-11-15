package oop;

public class Q83 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        int[] array = {12, 5, 8, 3, 7, 2, 10, 6};

		        System.out.println("Original Array: ");
		        printArray(array);

		        separateEvenOdd(array);

		        System.out.println("\nArray after Separation: ");
		        printArray(array);
		    }

		    public static void separateEvenOdd(int[] arr) {
		        int left = 0;
		        int right = arr.length - 1;

		        while (left < right) {
		           while (arr[left] % 2 == 0 && left < right) {
		                left++;
		            }

		          
		            while (arr[right] % 2 != 0 && left < right) {
		                right--;
		            }

		           if (left < right) {
		                int temp = arr[left];
		                arr[left] = arr[right];
		                arr[right] = temp;
		                left++;
		                right--;
		            }
		        }
		    }

		    public static void printArray(int[] arr) {
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }

}
