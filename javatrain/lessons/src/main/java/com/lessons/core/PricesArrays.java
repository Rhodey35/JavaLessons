package com.lessons.core;

import java.util.Scanner;

public class PricesArrays {

	public static void main(String[] args) {
	
		double [][] prices = new double[5][2];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Enter the original price: ");
			prices[i][0] = scan.nextDouble();
			prices[i][1] = prices[i][0] * .70;
			
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("\n   Original price: $ " + prices[i][0]
							+  "\n Discounted Price: $ " + prices[i][1]);
		}
	}

	
	
}
