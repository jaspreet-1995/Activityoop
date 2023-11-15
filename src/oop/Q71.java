package oop;
import java.util.*;


public class Q71 {

	public static void main(String[] args) {
        
        int[] array = {76, 71, 65, 63, 66, 75};

                System.out.println("Original Array: " + Arrays.toString(array));

        int num1 = 77;
        int num2 = 65;

 System.out.println("Result: " + result(array, num1, num2));
    }	

    
    public static boolean result(int[] array_nums, int num1, int num2) {
      
        for (int number : array_nums) {
      
            boolean r = number != num1 && number != num2;
           if (r) {
                return false;
            }
        }
       return true;
}
}