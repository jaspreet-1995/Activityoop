package oop;

public class Q72 {
	 public static void main(String[] args) {
	        
	        int number[] = {30, 60, 30, 40, 70, 60, 66};  

	  
	        System.out.println("Original array length: " + number.length);

	        
	        System.out.print("Array elements are: ");
	        for (int i = 0; i < number.length; i++) {
	            System.out.print(number[i] + " ");
	        }

	        
	        System.out.println("\nThe new length of the array is: " + array_sort(number));
	    }

	        public static int array_sort(int[] nums) {
	    
	        int index = 1;
	        
	    for (int i = 1; i < nums.length; i++) {
	    
	            if (nums[i] != nums[index - 1])
	    nums[index++] = nums[i];
	        }
	    
	        return index;
	    }

}
