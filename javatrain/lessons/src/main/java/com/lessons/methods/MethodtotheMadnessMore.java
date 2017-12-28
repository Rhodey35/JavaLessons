package com.lessons.methods;

public class MethodtotheMadnessMore {




	static String[] months = {"January","February","March",
			"April","May","June",
			"July","August","September",
			"October","November","December"};



	public static void main(String[] args) {

		//loopThis();
		// loopThis("The months of the year. ");
		loopThis("months:year");

	}


	// this is a plain method with no attributes passed. 
	/*	static void loopThis() {
 		for(int i = 0; i < months.length; i++) {
 			System.out.println(months[i]);
 			}
 	}
	 */
	// this uses the label to pass a string attribute.

	static void loopThis(String label) {
		System.out.println(label);
		for (int i = 0; i < label.length(); i++) {
			System.out.print("*");
		}
		System.out.println("\n now months: section 2");
		
		for(int i = 0; i < months.length; i++) {

			System.out.println(months[i]);
		}
		System.out.println("");
		
		
	   
	  }
	}









