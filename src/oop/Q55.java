package oop;
import java.util.*;
public class Q55 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1}; // Replace this array with your own

        System.out.println("Original Array: " + Arrays.toString(array));

        // Call the function to find duplicates in the array
        findDuplicates(array);
    }

    public static void findDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("Duplicate elements in the array are: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

}
