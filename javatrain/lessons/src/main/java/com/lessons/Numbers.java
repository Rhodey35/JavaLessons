package com.lessons;

import java.text.NumberFormat;
import java.util.Locale;

public class Numbers {

	public static void main(String[] args) {


		Locale locale = new Locale("da", "OK");

		double doubleValue =1_234_123.12;
		NumberFormat num = NumberFormat.getNumberInstance();
		NumberFormat num1 = NumberFormat.getNumberInstance(locale);
		NumberFormat num2 = NumberFormat.getCurrencyInstance(locale);
		NumberFormat num3 = NumberFormat.getCurrencyInstance();
		NumberFormat num4 = NumberFormat.getIntegerInstance();
		System.out.println("The number is: " + num.format(doubleValue));
		System.out.println("The number is: " + num1.format(doubleValue));
		System.out.println("The number is: " + num2.format(doubleValue) + " in currency value.");
		System.out.println("The number is: " + num3.format(doubleValue) + " without locale");
		System.out.println("The number is: " + num4.format(doubleValue) + " in interger form.");

	}
}
