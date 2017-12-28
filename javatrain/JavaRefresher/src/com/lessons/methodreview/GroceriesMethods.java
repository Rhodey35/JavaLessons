package com.lessons.methodreview;

import java.util.Scanner;

public class GroceriesMethods {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		double total = getTotal();
		print(total);


	}


	public static double getTotal() {

		double total = 0;
		Boolean moreItems = true;
		char response;
		while(moreItems) {
			total += getItemPrice(getItemName());
			System.out.println("Add more items? (Y/N): " );
			response = scan.next().charAt(0);
			if (response != 'y' &&  response != 'Y') 
				moreItems = false;
			scan.nextLine();
		}
		return total;
	}
	public static String getItemName() {
		String name; 
		System.out.println("Enter item: ");
		name = scan.nextLine();
		return name;

	}

	public static double getItemPrice(String value) {
		double price = 0;

		try {System.out.println(" Enter price for " + value + ": ");
		price = scan.nextDouble();
		}catch(Exception e) { 
			System.out.println("That was not a recognized entry, please try again.");
			e.printStackTrace();
		}
		int quantity = getItemQuantity();
		return quantity * price;

	}

	public static int getItemQuantity() {
		System.out.println("Enter the quantity for this item: ");
		int quantity = scan.nextInt();
		return quantity;

	}

	public static void print(double total) { 
		System.out.printf("\n\nYour groceries came to: $%5.2f" , total , "\n\nexiting program.");
	}

}





