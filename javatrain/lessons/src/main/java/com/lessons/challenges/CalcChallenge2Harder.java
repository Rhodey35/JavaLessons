package com.lessons.challenges;

import java.util.Scanner;

public class CalcChallenge2Harder {

	
	
	
	public static void main(String[] args) {
		
		String string1 = getInput("Please enter the first number: " );
		String string2 = getInput("Please enter the second number: ");
		String operator = getInput("Please enter the operation +,-,*,/: ");
		
		double result = 0;

		try {
			switch(operator) {
			case "+":
				result = addValues(string1,string2);
				break;
			case "-":
				result = subtractValues(string1,string2);
				break;
			case "*":
				result = multiplyValues(string1,string2);
				break;
			case "/":
				result = divideValues(string1,string2);
				break;
			default:
				System.out.println("Operation not allowed. ");
				return;
			}
			System.out.println("The answer is: " + result);
		} catch (Exception e) {
			System.out.println("Number formatting exception " + e.getMessage());
		}	
	}
	
	
	private static double addValues(String string1,  String string2) {
		double double1 = Double.parseDouble(string1);
		double double2 = Double.parseDouble(string2);
		return double1 + double2;
	}

	private static double subtractValues(String string1,  String string2) {
		double double1 = Double.parseDouble(string1);
		double double2 = Double.parseDouble(string2);
		return double1 - double2;		
	}
	private static double multiplyValues(String string1,  String string2) {
		double double1 = Double.parseDouble(string1);
		double double2 = Double.parseDouble(string2);
		return double1 * double2;
	}
	private static double divideValues(String string1,  String string2) {
		double double1 = Double.parseDouble(string1);
		double double2 = Double.parseDouble(string2);
		return double1 / double2;
	}
	
	
	private static String getInput(String prompt) {
		System.out.println(prompt);
		Scanner scanuserinput = new Scanner(System.in);
		return scanuserinput.nextLine();
	}
	
	

}
