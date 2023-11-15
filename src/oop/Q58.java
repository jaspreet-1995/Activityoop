package oop;

public class Q58 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1= {264,444,44,125,458,166,235,365,47};
		int []arr2=  {125,235,448,166,228,369,148,444,365};
		for(int i=0;i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
			    if(arr1[i]==(arr2[j])){
				     System.out.println("Common elements are : " + arr1[i]);
				     break;
				}
			}
		}
	}


}
