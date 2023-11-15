package oop;
import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner bb = new Scanner(System.in);

	        System.out.print("Enter the total purchase amount: $");
	        double amount = bb.nextDouble();

	        double discount = calculateDiscount(amount);

	        System.out.println("Discount: $" + discount);
	        double amount2 = amount - discount;
	        System.out.println("Final Amount to Pay: " + amount2);

	        bb.close();
	    }

	    public static double calculateDiscount(double amount) {
	        double discount = 0.0;

	        if (amount >= 100) {
	            discount = amount * 0.10;
	        } else if ( amount>= 50) {
	            discount = amount * 0.05;
	        }

	        return discount;
	    }
	}
	

