package com.lessons.methods;

import java.util.Scanner;

public class Conditionally {



		public static void main(String[] args) {
			boolean checkmonth = false;


			do {


				/*Scanner check = new Scanner(System.in);
			 		System.out.println("do you want to continue?");
			 		checkmonth = check.hasNextBoolean(); 
			 		if(checkmonth = true) {*/
				Scanner month = new Scanner(System.in);
				System.out.println("Please enter the month you were born. \n#: ");

				int monthNumber = month.nextInt();

				if (monthNumber >= 1 && monthNumber <= 3) {
					System.out.println("This is the first quarter.");
				}else if (monthNumber >= 4 && monthNumber <= 6) {
					System.out.println("This is the second quarter.");
				}else if (monthNumber >= 7 && monthNumber <= 9) {
					System.out.println("This is the third quarter.");
				}else if (monthNumber >= 10 && monthNumber <= 12) {
					System.out.println("This is the fourth quarter.");
				}else {
					System.out.println(" That is not a known value. ");
				}

				/*	
			 		}else {
			 			System.out.println("goodbye.");
			 		}*/
				System.out.println("would you like to try again?");
				Scanner scan = new Scanner(System.in);
				checkmonth = scan.hasNextBoolean();

				month.close();
			}while(checkmonth != true);
			
			
		
			
			
		}
		
	}