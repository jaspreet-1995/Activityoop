package oop;
import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthNum;
		String monthName;
		Scanner kb= new Scanner(System.in);
		System.out.print("Enter a number: ");
		 monthNum= kb.nextInt();
//		 monthName= kb.next();

		switch(monthNum){
		case 1:
			monthName= "jan";
			break;
		case 2:
			monthName= "feb";
			break;
		case 3:
			monthName= "march";
			break;
		case 4:
			monthName= "april";
			break;
		case 5:
			monthName= "may";
			break;
		case 6:
			monthName= "jun";
			break;
		case 7:
			monthName= "july";
			break;
		case 8:
			monthName= "aug";
			break;
		case 9:
			monthName= "sep";
			break;
		case 10:
			monthName="oct";
			break;

		case 11:
			monthName="nov";
			break;

		case 12:
			monthName="dec";
			break;
		default:
			monthName="Not defined";
			break;
		}
		System.out.print("As per your input month is  "+ monthName);
		kb.close();
	}

}
