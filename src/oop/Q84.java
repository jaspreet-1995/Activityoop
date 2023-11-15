package oop;

public class Q84 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        int[] array = {16, 17, 4, 3, 5, 2};

        System.out.println("Original Array: ");
        printArray(array);

        replaceWithNextGreatest(array);

        System.out.println("\nArray after Replacement: ");
        printArray(array);
    }

    public static void replaceWithNextGreatest(int[] arr) {
        int n = arr.length;
          int maxFromRight = arr[n - 1];
          arr[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
           int temp = arr[i];

            arr[i] = maxFromRight;
             if (temp > maxFromRight) {
                maxFromRight = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
