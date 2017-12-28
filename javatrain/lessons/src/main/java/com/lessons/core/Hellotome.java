package com.lessons.core;

import java.util.Scanner;

public class Hellotome {





	public static void main(String[] args) {

		String string1 = "Well Hello There";
		String string2 = "How are ya?";
		String string3 = "I say with a smile!";
		String string4 = string1 + ". " + string2 + " " +  string3;
		System.out.println(string4);

		try { StringBuilder sb = new StringBuilder("Hey there")
				.append(", how ")
				.append("are you?");
		System.out.println(sb);

		//String input = scan.nextLine();
		//System.out.println(input);
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three values: ");
		sb.delete(0, sb.length());
		for (int i = 0; i < 3; i++) {
			String input = scan.nextLine();
			System.out.println("and the next?");
			sb.append(input + "\n");

		}
		// System.out.println(sb.toString()); the toString is if I want to convert it to string for sure. 
		System.out.println(sb);
		scan.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

}
