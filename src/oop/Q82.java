package oop;

public class Q82 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] array = {0, 1, 1, 0, 1, 0, 0, 1};

		        System.out.println("Original Array: ");
		        printArray(array);

		        separateZerosOnes(array);

		        System.out.println("\nArray after Separation: ");
		        printArray(array);
		    }

		    public static void separateZerosOnes(int[] arr) {
		        int left = 0;
		        int right = arr.length - 1;

		        while (left < right) {
		         while (arr[left] == 0 && left < right) {
		                left++;
		            }

		           while (arr[right] == 1 && left < right) {
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
