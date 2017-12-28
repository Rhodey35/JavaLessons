package com.lessons;



public class Buggy {


	public static void main(String[] args) {


		String string = null;

		System.out.println(string);



		String welcome = "Welcome!";
		char[] chars = welcome.toCharArray();

		//char lastChar = chars[chars.length -1 ]; // adding the minus 1 will fix the out of range issue.
		//char lastChar = chars[0]; // this shows the W in the first index
		//System.out.println(lastChar); //this will give me an index out of array. 
		//I need to change the length to -1 

		for (int j = 0; j < chars.length; j++) {
			System.out.print(chars[j]);
			//[w,e,l,c,o,m,e,!]
		}
		System.out.println("\n\n");

		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);

		}


		try {
			char lastChar1 = chars[chars.length -1];
			System.out.println(lastChar1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}






	}



} 
