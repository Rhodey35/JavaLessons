package com.lessons.challenges;

import java.util.Scanner;

public class CalcChallenge {

	public static void main(String[] args) {
		 		
		 		/* My attempt before the challenge
		 		 ended up going with the example as he deals with the 
		 		 possibility of a double. 
		 		
		 		System.out.println("this is the calc program. \n please enter two values and you will be promped again \n to decide if you want to add subtract multiply or divide.");
		 		
		 		int number1 = 0;
		 		int number2 = 0;
		 		
		 		
		 		
		 		Scanner scan = new Scanner(System.in);
		 		System.out.println("please enter the first value: ");
		 		int first = scan.nextInt();
		 		System.out.println("please enter the second value: ");
		 		int second = scan.nextInt();
		 		
		 		System.out.println("please enter the type of process: you can choose \n +,-,* or /:");
		 		String third = scan.nextLine().toString();
		 		
		 		System.out.println(" you have chosen:"+ first + third + second + " to be evaluated");
		 		
		 		*/
		 		
		 		
		 		Scanner scanval = new Scanner(System.in);
		 		System.out.println("please enter the first value: ");
		 		String num1 = scanval.nextLine();
		 		double dbnum1 = Double.parseDouble(num1);
		 		
		 		System.out.println("please enter the second value: ");
		 		String num2 = scanval.nextLine();
		 		double dbnum2 = Double.parseDouble(num2);
		 		
		 		
		 		double result = dbnum1 + dbnum2;
		 		System.out.println("Your total added together is: " + result);
		 		
		 		
		 		System.out.println("please enter the type of calculation you would like: ");
		 		System.out.println(" Plus +, Minus -, Multiply *, or Divide / ");
		 		String string1 = scanval.nextLine();
		 		
		 		switch(string1) {
		 		case "+": System.out.println("Your value after addition: " + (dbnum1+dbnum2));
		 			break;
		 		case "-": System.out.println("Your value after subtraction: " + (dbnum1-dbnum2));
		 			break;
		 		case "*": System.out.println("Your value after multiplying: " + (dbnum1*dbnum2));
		 			break;
		 		case "/": System.out.println("Your value after dividing: " + (dbnum1/dbnum2));
		 			break;
		 		default: 		
		 			System.out.println("please enter the type of calculation you would like: ");
		 			System.out.println(" Plus +, Minus -, Multiply *, or Divide / ");
		 		scanval.close();
		 		
		 	System.out.println("Thank you for using the student calculator. \n\n");
		 		}
		 
		 		
		 	}
		 	
	
	
}
