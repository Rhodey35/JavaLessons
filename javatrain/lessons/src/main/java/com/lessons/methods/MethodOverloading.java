package com.lessons.methods;

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println("The method int average, will return the ints " + average(3,5,8));
		System.out.println("The method double average, will return the doubles: " + average(4.0, 6.0,7.0));

	}
	public static double average(int x,  int y, int z) {
		return (x + y+ z ) /3.0;
		
	}
	
	public static double average(double x, double y, double z) {
		return (x +y + z)/3;
	}

}
