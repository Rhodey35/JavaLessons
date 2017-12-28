package com.lessons.core;

public class LoopBalance {

	public static void main(String[] args) {

		double loan = 5000;
		int months = 0;
		
		while(loan > 0) {
			loan -= 500;
			months ++;
			System.out.print( " payment: " + months + " $500, ");
			
		}
		
		System.out.println("It will be " + months + " months for the loan to be paid for loan of: 5000 dollars");
		
		System.out.println("on a seperate note, the odd numbers between 1 and 100 are: ");
		
		
		for (int i = 1; i < 50; i++) {
			if (i % 2 == 0) {
				System.out.print( i + ", foo");
			}else {
				System.out.print(i + ", bar");
			}
		} System.out.print("50\n");
		
	}

}
