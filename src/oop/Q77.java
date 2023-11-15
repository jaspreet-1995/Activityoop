package oop;
import java.util.Arrays;
public class Q77 {



	public static void main(String[] args) {
		int arr[] = {4,6,3,2};
		System.out.println(Arrays.toString(arr));
	  
	    int[] newArray = new int[arr.length];

	    for(int i=0;i<arr.length;i++) {
	        for(int j=i+1;j<arr.length;j++) {
	            newArray[j]=arr[i++];
	        }
	    }
	    newArray[0]=arr[arr.length-1];
	    System.out.println("The new array after one rotation" + Arrays.toString(newArray));
	}
	}



