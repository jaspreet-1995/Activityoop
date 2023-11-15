package oop;

public class Q57 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]s1= {"Work","Culture","Sun","ccs","Maths","abs"};
		String []s2= {"pdf","jpg","png","Work","charm","Checking"};
		
		for(int i = 0; i < s1.length; i++){
			   for(int j = 0; j < s2.length; j++){// inner loop
			    if(s1[i].equals(s2[j])){
			     System.out.println("Common elements are : " + s1[i]);
			     break;
			    }
			   }
			  }
	}

}
