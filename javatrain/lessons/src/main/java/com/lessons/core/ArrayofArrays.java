package com.lessons.core;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayofArrays {

	public static void main(String[] args) {
		System.out.println("Array of primitive types");
		int[] listofintegers = {2,5,6,7,8,2,5,6,7,8};
		Arrays.sort(listofintegers);
		for (int i = 0; i < listofintegers.length; i++) {
			// this is the basic way to iterate through an array of ints
			System.out.println(listofintegers[i]);
			
		}
		
		System.out.println("Array of strings: ");
		String[] strings = {"Red", "Green", "Blue"};
		Arrays.sort(strings);
		for (String color : strings) {
			System.out.println(color);
		}
		
		System.out.println("Setting initial size of array: ");
		int[] sized = new int[10];
		for (int i = 0; i < sized.length ; i++) {
			sized[i] = i * 10;
		}
		for(int value : sized) {
			System.out.println(value);
		}
		
		
		System.out.println("copying an array: ");
		int[] copied = new int[5];
		// copying from the sized array, starting at index 5. 
		// Putting values from index 5 to 10 into the new array at positions 0 to 5
		// into the "copied" array to be displayed.
		System.arraycopy(sized, 5, copied, 0, 5);
		for (int value : copied) {
			System.out.println(value);
		}
		
		
	}

}
