package com.lessons.patients;

import java.util.Scanner;

/**
		// call for patient charges
		// call for calculating added charges
		// call for adding another patient. 
		// So a total of three methods I know I need. 
 */

public class Patients {



	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double medical = 0, lab = 0, hospital = 0, total;

		String response = null;
		do {
			if(checkHospitalStay() == true) {
				System.out.println("Enter hospital charges: ");
				hospital = scan.nextDouble();
			}else {
				hospital = 0;

			}
			System.out.println("Enter medication charges: ");
			medical = scan.nextDouble();
			System.out.println("Enter the lab charges: ");
			lab = scan.nextDouble();
			total = hospital + medical + lab;
			printTotal(total);


			System.out.println("Enter another patient? (yes/no): ");
			response = scan.next();
		}while(response.equalsIgnoreCase("yes"));
		System.out.println("Thank you for using our facilities. \n\nGoodbye");
	}	
	
	
	public static boolean checkHospitalStay() {
		Scanner scan = new Scanner(System.in);
		String response = "";
		System.out.println("Is this for overnight?(yes/no): ");
		response = scan.next();
		if(response.equalsIgnoreCase("yes"))
			return true;
		else
			return false;
	}
	
	
	public static void printTotal(double total) {
		System.out.printf("The total charges for your stay are: $%6.2f \n", total);


	}



}
