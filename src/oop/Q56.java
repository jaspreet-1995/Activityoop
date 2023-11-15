package oop;

public class Q56 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []st= {"Jassi","singh","bunty","Ram","jasi","bunty"};
		
		for(int i=0; i<st.length; i++) {
			for(int j=i+1; j<st.length;j++) {
				if((st[i].equals(st[j])) && (i!=j)){
                    System.out.println("Duplicate value : " + st[j]);
				}
			}
		}
	}

}


