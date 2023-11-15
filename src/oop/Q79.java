package oop;

public class Q79 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


        int[] array = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        System.out.println("Original Array: ");
        printArray(array);

        separateNegativePositive(array);

        System.out.println("\nArray after Separation: ");
        printArray(array);
    }

    public static void separateNegativePositive(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
           
            while (arr[left] < 0 && left < right) {
                left++;
            }

            
            while (arr[right] >= 0 && left < right) {
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
