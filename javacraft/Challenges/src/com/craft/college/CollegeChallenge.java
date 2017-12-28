package com.craft.college;

import java.util.Scanner;


/**
 * 
 * @author akrhodey
 * My attempt at the college program challenge. blah this is hard. lol
 * 
 */

public class CollegeChallenge {

    static Scanner scan = new Scanner(System.in);
   
    public static void main(String[] args) {
    	System.out.println("Student name: ");
    	String studentName = scan.nextLine();
    	System.out.println("Year in school(Freshman...Senior: ");
    	String schoolYear = scan.nextLine();
    	System.out.println("please enter your school supplies: ");
        double total = getTotal();
        print(total);
        if (studentName.equalsIgnoreCase("None")) {
			print(total);
		} else {
			print(total,studentName);
		}
        
        if (schoolYear.equalsIgnoreCase("highschool")) {
        	print(total, studentName);
        	
        } else {
        	print(total, studentName, schoolYear);
        }
        
        
    }
    public static double getTotal()
    {
        double total = 0;
        Boolean moreItems = true;
        char response;
        while(moreItems)
        {
            total += getItemPrice(getItemName());            
            System.out.println("Next item? (y/n)");
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
            System.out.println("Invalid data entered. Please re-enter: ");
            e.printStackTrace();
        }
        int quantity = getItemQuantity();
        return quantity * price;
    }
    public static int getItemQuantity()
    {
        System.out.println("Enter the quantity for this item: ");
        int quantity = scan.nextInt();
        return quantity;   
    }
    public static void print(double total)
    {
        System.out.printf("Total for school supplies is: $%5.2f, "
                + "thanks for shopping with us!\n\n", total);
        
    }
    public static void print(double total, String studentName)
    {
        System.out.printf("Total for school supplies is: $%5.2f, "
                + "thanks for shopping at %s!\n\n", total, studentName);
        
    }
    public static void print(double total, String studentName, String schoolYear)
    {
        System.out.printf("Total for school supplies, including room and board is: $%5.2f, "
                + " for %s at %s\n\n", total, studentName, schoolYear);
        
    }

}

