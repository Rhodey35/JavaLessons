package com.lessons.core;

import java.util.Scanner;

public class DecisionOperations {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = scan.nextInt();
		// relational operators
		if(age < 2) {
			System.out.println("You are young my child. ");
		}else if(age < 25) {
			System.out.println("You are of an age. ");
		} else if(age < 45) {
			System.out.println("You are well versed in life. ");
		}else if(age < 65) {
			System.out.println("You are very wise, indeed. ");
		}else {
			System.out.println("You are not that we know of. ");
		}
		
		
		
		
	}

}
