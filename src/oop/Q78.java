package oop;

public class Q78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,1,2,3,4};
		
		int min=arr[0];
		int wantedIndex =0;
		int i =0;
		
		for( i =0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
				wantedIndex=i;
			}
		}
		System.out.println("Rotation count is: "+ wantedIndex);
		
	}

}
