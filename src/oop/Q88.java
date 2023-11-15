package oop;
import java.util.Scanner;

public class Q88 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);

        System.out.print("Input the grade: ");
        char grade = scanner.next().toUpperCase().charAt(0); 

        String description = getGradeDescription(grade);

        System.out.println("Expected Output:");
        System.out.println("You have chosen: " + description);

        scanner.close();
    }

    public static String getGradeDescription(char grade) {
        switch (grade) {
            case 'E':
                return "Excellent";
            case 'V':
                return "Very Good";
            case 'G':
                return "Good";
            case 'A':
                return "Average";
            case 'F':
                return "Fail";
            default:
                return "Invalid Grade";
        }
    }

}
