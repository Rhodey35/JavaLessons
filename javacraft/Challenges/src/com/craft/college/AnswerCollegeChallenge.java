package com.craft.college;

import java.util.Scanner;

public class AnswerCollegeChallenge {



	/**
	 * 
	 * @param args
	 * 
	 * 
	 */

	// first we put in the static scanner object for taking all the user
	// inputs. The static means it is a member of this class. 
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String name = getName();
		printTotal(name);
	}
	private static String getName() {
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		return name;
	}

	public static void printTotal(String name) {

		double total = 0; 
		if (onCampus(name)) {
			total = calculateTotal(estimatedLivingExpenses(), booksAndSupplies(),
					creditHours(), costPerCredit());
		} else {
			total = calculateTotal(booksAndSupplies(), creditHours(),
					costPerCredit());
		}
		String year = getYear();

		if (year.equalsIgnoreCase("other")) 
			System.out.printf("The total cost for " + name + " is $%7.2f", total);
		 else 
			System.out.printf("The total cost for " + name + " as a " + year + " is $%7.2f ", total);
			System.out.println();

	}

		public static boolean onCampus(String name) {

			boolean invalidResponse = true;
			do {
				System.out.println("Is " + name + " living on campus? (yes/no): ");
				String response = scan.nextLine();
				if(response.equalsIgnoreCase("yes"))
					return true;
				else if (response.equalsIgnoreCase("no"))
					return false;
				else
					System.out.println("invalid");
			}while(invalidResponse);
			return false;
		}
		public static double estimatedLivingExpenses() {
			double total = 0; 
			try { 
				System.out.println("How many weeks using the dorms?: ");
				String value = scan.nextLine();
				int weeks = Integer.parseInt(value);
				System.out.println("Your estimated weekly costs");
				value = scan.nextLine();
				double weeklyExpenses = Double.parseDouble(value);
				System.out.println("What is the cost of room/board for the year?: ");
				value = scan.nextLine();
				double roomBoard = Double.parseDouble(value);
				total = weeks * weeklyExpenses + roomBoard;
			}catch(Exception e) {
				System.out.println("Invalid");
				e.printStackTrace();
			}finally {
				return total;
			}
		}

		public static double booksAndSupplies() {
			System.out.println("Estimated cost of supplies?: ");
			double cost = scan.nextDouble();
			return cost;

		}
		public static int creditHours() {
			System.out.println("Credit hours of school?: ");
			int hours = scan.nextInt();
			return hours;

		}

		public static double costPerCredit() {
			System.out.println("Cost per credit hour?: ");
			double costCredit = scan.nextDouble();
			scan.nextLine();
			return costCredit;
		}

		public static double calculateTotal(double livingExpenses, double books, int credit, double cost) {
			return livingExpenses + books + (credit*cost);

		}

		public static double calculateTotal(double books, int credit, double cost) {
			return books + (credit*cost);

		}
		
		public static String getYear() {
			System.out.println("What year of college are you attending("
					+ " Freshmen, Sophmore, Junior, Senior, other)?");
			String yearName = scan.nextLine();
			return yearName;
		}



	}






