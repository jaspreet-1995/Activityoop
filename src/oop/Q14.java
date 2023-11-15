package oop;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		String a= kk.next();
		String b= kk.next();
		if(a.equals(b)){
		System.out.print("both strings are equal ");
		}else {
			System.out.print("both strings are not equal ");
		}
		kk.close();
	}

}
