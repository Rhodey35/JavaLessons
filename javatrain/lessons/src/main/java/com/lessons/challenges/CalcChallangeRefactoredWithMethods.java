package com.lessons.challenges;

import java.util.Scanner;

import com.lessons.utilities.CalcHarderMathHelper;
import com.lessons.utilities.CalcInputHelper;

public class CalcChallangeRefactoredWithMethods {

public static void main(String[] args) {
	CalcChallangeRefactoredWithMethods calc = new CalcChallangeRefactoredWithMethods();
		calc.calculate();	
	}

protected void calculate() {
	CalcInputHelper gethelperinput = new CalcInputHelper();
	
	String string1 = gethelperinput.getInput("Please enter the first number: " );
	String string2 = gethelperinput.getInput("Please enter the second number: ");
	String operator = gethelperinput.getInput("Please enter the operation +,-,*,/: ");
	
	double result = 0;
	try {
		switch(operator) {
		case "+":
			result = CalcHarderMathHelper.addValues(string1,string2);
			break;
		case "-":
			result = CalcHarderMathHelper.subtractValues(string1,string2);
			break;
		case "*":
			result = CalcHarderMathHelper.multiplyValues(string1,string2);
			break;
		case "/":
			result = CalcHarderMathHelper.divideValues(string1,string2);
			break;
		default:
			System.out.println("Operation not allowed. ");
			return;
		}
		System.out.println("The answer is: " + result);
	} catch (Exception e) {
		System.out.println("Number formatting exception " + e.getMessage());
	}
}
	
	
	
	

}
