package oop;

public class Q67 {
	public static void main(String[] args) {
        int[] arr = {12, 448, 8, 15, 67, 110};

        int difference = findDifference(arr);

        System.out.println("The difference between the largest and smallest values is: " + difference);
    }

    public static int findDifference(int[] arr) {
        if (arr.length < 1) {
            System.out.println("Array must have a length of at least 1.");
            return -1; // Return -1 to indicate an error
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

}
