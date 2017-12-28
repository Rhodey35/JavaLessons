package com.lessons.utilities;

import java.util.Scanner;

public class CalcInputHelper {

	public String getInput(String prompt) {
		System.out.println(prompt);
		Scanner scanuserinput = new Scanner(System.in);
		return scanuserinput.nextLine();
	}
	
	
}
