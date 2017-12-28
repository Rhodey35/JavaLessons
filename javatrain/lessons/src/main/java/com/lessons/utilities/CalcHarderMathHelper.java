package com.lessons.utilities;

public class CalcHarderMathHelper {

	public static double addValues(String string1,  String string2) {
		double double1 = Double.parseDouble(string1);
		double double2 = Double.parseDouble(string2);
		return double1 + double2;
	}

	public static double subtractValues(String string1,  String string2) {
		double double1 = Double.parseDouble(string1);
		double double2 = Double.parseDouble(string2);
		return double1 - double2;		
	}
	public static double multiplyValues(String string1,  String string2) {
		double double1 = Double.parseDouble(string1);
		double double2 = Double.parseDouble(string2);
		return double1 * double2;
	}
	public static double divideValues(String string1,  String string2) {
		double double1 = Double.parseDouble(string1);
		double double2 = Double.parseDouble(string2);
		return double1 / double2;
	}
	
	
}
