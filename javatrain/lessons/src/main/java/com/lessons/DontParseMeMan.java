package com.lessons;

public class DontParseMeMan {



	public static void main(String[] args) {

		String string1 = "Welcome to Arizona";
		System.out.println("The length of string1 is: " + string1.length());

		int position = string1.indexOf("Arizona");
		System.out.println("The position of substring: " + position);


		String sub = string1.substring(11);
		System.out.println(sub);


		String string2 = "bienvenue		";
		int length1	= string2.length();
		System.out.println(length1);
		String string3 = string2.trim();
		System.out.println(string3.length());


	}
}

