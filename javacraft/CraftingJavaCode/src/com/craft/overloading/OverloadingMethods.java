package com.craft.overloading;

import java.util.Scanner;

public class OverloadingMethods {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
	System.out.println("Enter the store name: ");
	String storeName = scan.nextLine();
	double total = 0;
	total = getTotal();
	if(storeName.equalsIgnoreCase("None"))
		{
		print(total);
		
		}else {
			print(total,storeName);
		}
	
	}

	public static double getTotal() {
		double total = 0;
		Boolean moreItems = true;
		char response;
		while(moreItems) {
			total += getItemPrice(getItemName());
			System.out.println(" More items? (y/n): ");
			response = scan.next().charAt(0);
			if(response != 'y' && response != 'Y')
				moreItems = false;
			scan.nextLine();
		}
		return total;
	}
	
    public static String getItemName()
    {
        String name;
        System.out.println("Enter item name: ");
        name = scan.nextLine();
        return name;
    }
    public static double getItemPrice(String value) 
    {
        double price = 0;
        try{
        System.out.println("Enter price for " + value + ":");
        price = scan.nextDouble();
        }
        catch(Exception e)
        {
            System.out.println("Invalid data type entered.");
            e.printStackTrace();
        }
        int quantity = getItemQuantity();
        return quantity * price;
    }
	
	
	public static int getItemQuantity() {
		System.out.println(" enter the quantity for this item: ");
		int quantity = scan.nextInt();
		return quantity; 
		
	}
	public static void print(double total) {
		System.out.printf(" The total of your grocery items is: $%5.2f", total);
		
	}
	public static void print(double total, String storeName) {
		System.out.printf("Thank you for shopping at %s. Your total: $%5.2f", storeName, total);
		
	}
}
