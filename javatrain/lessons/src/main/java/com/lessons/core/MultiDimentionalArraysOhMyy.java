package com.lessons.core;


public class MultiDimentionalArraysOhMyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Standard two dimentional arrays
		String[][] states = new String[3][2];
		// the first brackets state the outer array index
		// the second brackets state the inner array index
		states[0][0] = "Arizona";
		states[0][1] = "Phoenix";
		states[1][0] = "Alaska";
		states[1][1] = "Anchorage";
		states[2][0] = "Massachusetts";
		states[2][1] = "Boston";

		for (int i = 0; i < states.length; i++) {
			StringBuilder stringbuilt = new StringBuilder();
			stringbuilt.append("The capitol of: ")
				.append(states[i][0])
				.append(" is ")
				.append(states[i][1])
				.append(".");
			System.out.println(stringbuilt);
				
		}
	
	}

}
