package com.lessons.classes;

/*
 * This is an example of class use with real estate listings. 
 * 
 * 
 */


public class ClassesMain {
	
	

	public static void main(String[] args) {
		
		Property land = new Property(10000.42, "Land", 2.1);
		Property estate = new Property(245000.23, "Estate", 1.4, 3, 5);
		System.out.println(land.toString());
		System.out.println(estate.toString());
		estate.newAskPrice(230000.00);
		System.out.println(estate.toString());
		
		
	}

}
