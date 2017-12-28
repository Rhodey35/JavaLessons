package com.lessons.methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AMethodOfOverloading {

	 
	 
	 	private static DecimalFormat df2 = new DecimalFormat(".##");
	 	
	 	
	 	public static void main(String[] args) {
	 	
	 		String string1 = getInput("Enter number 1: ");
	 		String string2 = getInput("Enter number 2: ");
	 		String string3 = getInput("Enter number 3: ");
	 		
	 	
	 		double result = addValues(string1, string2);
	 		System.out.println("The answer without format: " + result);
	 	System.out.println("The answer is: " +  df2.format(result));
	 		
	 		double result2 = addValues(string1, string2, string3);
	 		System.out.println("The answer without format: " + result2);
	 		System.out.println("The answer is: " +  df2.format(result2));
	 	
	 	
	 	}
	 	
	 	static String getInput(String prompt) {
	 		System.out.println(prompt);
	 		Scanner scanme = new Scanner(System.in);
	 		
	 		return scanme.nextLine();
	 	}
	 	
	 	/** with trim : The answer is: 3492.41
	 		Enter number 1: 
	 		1999.99
	 		Enter number 2: 
	 		1492.42
	 		The answer is: 3492.41
	 		
	 		Enter number 1: 
	 		1999.99
	 		Enter number 2: 
	 		1497.33
	 		The answer is: 3497.3199999999997
	 				
	 	 	**/
	 	
	 	static double addValues(String string1, String string2) {
	 		double double1 = Double.parseDouble(string1);
	 		double double2 = Double.parseDouble(string2);
	 		double result = double1 + double2;
	 		return result;
	 		
	 	}
	 	static double addValues(String string1, String string2, String string3) {
	 		double double1 = Double.parseDouble(string1);
	 		double double2 = Double.parseDouble(string2);
	 		double double3 = Double.parseDouble(string3);
	 		double result = double1 + double2 + double3;
	 		return result;
	 		
	 		
	 	}
	 }
