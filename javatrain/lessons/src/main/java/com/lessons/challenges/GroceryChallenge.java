package com.lessons.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryChallenge {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> groceries = new ArrayList<String>();
		groceries.add("Chocolate bars");
		groceries.add("Artisan Bread");
		groceries.add("Hamburger meat");
		groceries.add("Honny Nut Cereal");
		groceries.add("Orange Juice");
		groceries.add("Diet Coke");
		System.out.println("Here is the current list: \n" +
				groceries.toString());
		System.out.println("Enter item or \"quit\" to exit");
		String newItem = scan.nextLine();
		boolean found = false;
		while(newItem.equalsIgnoreCase("quit") == false) {
			for (int i = 0; i < groceries.size(); i++) {
				if(newItem.equalsIgnoreCase(groceries.get(i))) {
					System.out.println("This item is already in the list. ");
					found = true;
					
				}
				
			}
			if(found == false) {
				groceries.add(newItem);
				System.out.println(" added new item to the list: "+ newItem);
			}
			System.out.println("\nHere is your current list: \n" +
					groceries.toString());
			System.out.println("Enter item or \"quit\" to exit");
			newItem = scan.nextLine();
		}
		 System.out.println("\nHere is your current list: \n" +
					groceries.toString());
	}

	
	
	
}
