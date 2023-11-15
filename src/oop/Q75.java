package oop;

public class Q75 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3,0,2,3,};
		int w = 10;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int l=j+1;l<arr.length;l++) {
					for(int m=l+1;m<arr.length;m++) {
						if(arr[i]+arr[j]+arr[l]+arr[m] == w) {
							System.out.println("The combination of two elements "+arr[i]+" + "+arr[j]+" + "+arr[l]+" + "+arr[m]+"="+w);	
					}
				}
			}
				
			}
		}
	}


}
