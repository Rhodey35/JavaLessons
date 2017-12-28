package com.lessons.core;

import java.util.Scanner;

public class LoopsMenu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int selection;
		do {
			System.out.println("choose your item from the list: " +
					"\n1. Hot Dog with onion rings" +
					"\n2. Hamburger with fries " +
					"\n3. Cheeseburger with fries" +
					"\n4. Veggie Burger with salad" +
					"\n5. Nachos with hambergur. ");
			selection = scan.nextInt();
		}while(selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5);
		switch (selection ) {
		
		case 1:
			System.out.println("The price for your selection is $2.50");
			break;
		case 2:
			System.out.println("The price for your selection is $4.50");
			break;
		case 3:
			System.out.println("The price for your selection is $4.75");
			break;
		case 4:
			System.out.println("The price for your selection is $5.50");
			break;
		case 5:
			System.out.println("The price for your selection is $6.50");
			break;
		}
		
			

		
	}
}
