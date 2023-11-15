package oop;

public class Q76 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,6,3,2};
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int l=j+1;l<arr.length;l++) {
					if(arr[i]+arr[j]>= l) {
						count = count +1;
						break;
				}
				}
	}

}System.out.println("The following numbers can form a triangle "+count);	
	}

}
