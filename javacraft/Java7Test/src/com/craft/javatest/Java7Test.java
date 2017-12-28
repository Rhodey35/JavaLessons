package com.craft.javatest;

public class Java7Test {

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		String key = "One";
		switch (key) {
		case "One":
			System.out.println("This value is one");
			System.out.println(" This was testing for the Java 7 string value testing. not available prior to Java 7.");
			break;
			
		default:
			System.out.println("THIS IS NOT A VALID ENTRY!");
			break;
		}
		
		
	}

}
