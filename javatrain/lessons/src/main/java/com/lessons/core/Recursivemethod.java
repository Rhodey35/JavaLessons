package com.lessons.core;


public class Recursivemethod {

	public static void main(String[] args) {
	
		countup(0);
		System.out.println("\n");
		countdown(10);
		
	}
	
	
	public static void countup(int num2) {
		if (num2 == 10) {
			System.out.print("Start");
		} else {
			System.out.print(num2 + ",");
			countup(num2 + 1);
			
		}
	}
	
	
	public static void countdown(int num) {
		if (num == 0) {
			System.out.print("End");
		} else {
			System.out.print(num + " : ");
			countdown(num - 1);
			
		}
	}
	
	
	
	
}
