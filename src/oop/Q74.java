package oop;

public class Q74 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3,0,4};
		int w = 4;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == w) {
				System.out.println("The combination of two elements "+arr[i]+" + "+arr[j]+"="+w);
				}
				}
		}
	}

}
