package com.lessons.challenges.menu;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileChallenge {

	public static void main(String[] args) {
		File menuItems = new File("files/menu.txt");
		File menuPrices = new File("files/prices.txt");
		String menuItem;
		double price;
		
		try {
			Scanner scan = new Scanner(menuItems);
			PrintWriter output = new PrintWriter(menuPrices);
			Scanner item = new Scanner(System.in);
			while(scan.hasNextLine()) {
				menuItem = scan.nextLine();
				System.out.println("What is the price of this menu item: " + menuItem);
				price = item.nextDouble();
				item.nextLine();
				output.print("\t" + menuItem);
				output.print(":\t\t\t");
				output.println(price);
				
			}
			output.close();
			
		} catch (Exception e) {
		System.out.println("Error handling request: " + e.toString());
		}
		
	}

}
