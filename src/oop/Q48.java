package oop;

public class Q48 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 5, 10, 15, 20, 25 };

        int targetValue = 20;

        boolean found = false;

        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break; 
            }
        }

        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);

	}

	}

}
