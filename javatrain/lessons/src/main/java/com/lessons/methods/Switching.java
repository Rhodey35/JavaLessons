package com.lessons.methods;

import java.util.Scanner;

public class Switching {


	public static void main(String[] args) {

		Scanner switchscan = new Scanner(System.in);
		System.out.println("Enter first three leters of your month: ");
		String input = switchscan.nextLine();


		switch(input) {
		case "Jan":
			System.out.println("The month of January");
			break;
		case "Feb":
			System.out.println("The month of February");
			break;
		case "Mar":
			System.out.println("The month of March");
			break;
		case "Apr":
			System.out.println("The month of April");
			break;
		case "May":
			System.out.println("The month of May");
			break;
		case "Jun":
			System.out.println("The month of June");
			break;
		case "Jul":
			System.out.println("The month of July");
			break;
		case "Aug":
			System.out.println("The month of August");
			break;
		case "Sep":
			System.out.println("The month of September");
			break;
		case "Oct":
			System.out.println("The month of October");
			break;
		case "Nov":
			System.out.println("The month of November");
			break;
		case "Dec":
			System.out.println("The month of December");
			break;
		default:
			System.out.println("This is not a recognized month.");




			/*
			 * Scanner switchscan = new Scanner(System.in);
			 *		 System.out.println("Guess a number: ");
	 		 String input = switchscan.nextLine();
	 		 int monthNumber = Integer.parseInt(input);

	 		 switch(monthNumber) {
	 		 case 1:
	 			 System.out.println("The month of January");
	 			 break;
	 		 case 2:
	 			 System.out.println("The month of January");
	 			 break;
	 		 case 3:
	 			 System.out.println("The month of January");
	 			 break;
			 */
		}

	}


}
