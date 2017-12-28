package com.lessons.core;

import java.util.Iterator;
import java.util.Scanner;

public class Heights {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numStudents;
		double [] heights;
		System.out.println("Number of students in class: ");
		numStudents = scan.nextInt();
		heights = new double[numStudents];
		for(int i = 0; i < numStudents; i++) {
			System.out.println("Enter student height(inches): ");
			heights[i] = scan.nextDouble();
			
		}
		
		//initializing the max array variable
		double max = heights[0];
		for (int i = 0; i < heights.length; i++) {
			if(max < heights[i])
				max = heights[i];
		}
		
		
		
		// initializing the total variable
		double total = 0;
		for (int i = 0; i < heights.length; i++) {
			total += heights[i];
			
		}
		
		System.out.println("\nThe tallest student is: " + max + " inches tall. ");
		System.out.println("\nThe average height of all students: " + (total/numStudents) + " inches tall. ");
	
	}

}
