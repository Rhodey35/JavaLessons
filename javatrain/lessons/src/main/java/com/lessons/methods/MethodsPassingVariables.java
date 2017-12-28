package com.lessons.methods;

import java.util.Scanner;

public class MethodsPassingVariables {

	public static void main(String[] args) {

		double x,y,z;
		double avg;
		Scanner scanValue = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		x = scanValue.nextDouble();
		y = scanValue.nextDouble();
		z = scanValue.nextDouble();
		avg = average(x,y,z);
		System.out.println("The average of the numbers entered is: " + avg);
		System.out.printf("Now formatted: $%5.2f", avg);
		
	}

	public static double average(double num1, double num2, double num3) {
		
		double avg = (num1 + num2 + num3) / 3;
		return avg;
		
	}
	
	
	
}
