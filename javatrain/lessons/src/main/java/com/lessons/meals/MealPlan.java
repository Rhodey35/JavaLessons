package com.lessons.meals;

import java.util.Arrays;
import java.util.Scanner;

public class MealPlan {
	
	public static void main(String[] args) {
		
		// call getTotalMealWeeks method, which returns the number of weeks
		int numWeeks = getTotalMealWeeks();
		
		double[] dailyMealCost = new double[7];
		// print array of contents before calling the method, should be all zeros
		System.out.println("\nBefore calling the method: \n" + Arrays.toString(dailyMealCost));
		
		// getting the input from each day of the week.
		System.out.println("You will need to enter estimated expenses for each day of the week.");
		// call getDailyMealCost method - uses call by reference
		getDailyMealCost(dailyMealCost);
		
		
		//print array contents after calling the method
		System.out.println("\nAfter calling the method: \n" + Arrays.toString(dailyMealCost));
		
		// use the number of weeks and daily meal costs array to find the total
		//note, the numweeks is a call by value, but the dailyMealCost is 
		// an array, so it is passing the address of the variable to the method
		double totalCost = computeMealPlanCost(numWeeks, dailyMealCost);
		//use a method to print the total cost. 
		printTotalMealPlanCost(totalCost);
		
	}

	
	public static int getTotalMealWeeks() {
		
		Scanner scanValue = new Scanner(System.in);
		System.out.println("How many weeks are in your semester? ");
		int totalWeeks = scanValue.nextInt();
		return totalWeeks;
		
	}
	
	public static void getDailyMealCost(double[] dailyCost) {
		
		Scanner scanValue = new Scanner(System.in);
		//using array length, this allows it to vary depending 
		// on the value passed in the parameter list.
		for (int i = 0; i < dailyCost.length; i++) {
			System.out.println("Enter daily estimated cost: \nFor day " + (i+1) + ": ");
			dailyCost[i] = scanValue.nextDouble();
			
		}
	}
	public static double computeMealPlanCost(int numWeeks, double[] dailyCost) {
		
		double totalCost = 0, weeklyCost = 0;
		for (int i = 0; i < dailyCost.length; i++) {
			weeklyCost += dailyCost[i];
		}
		totalCost = weeklyCost * numWeeks;
		return totalCost;
		
	}
		
	public static void printTotalMealPlanCost(double total) {
		System.out.printf("The estimated meal plan for the"
				+ " semester is $%5.2f \n\n", total);
		//System.out.println();
	}
	
	
}
