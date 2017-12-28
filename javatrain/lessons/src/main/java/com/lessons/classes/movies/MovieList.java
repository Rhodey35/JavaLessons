package com.lessons.classes.movies;

import java.util.Scanner;

public class MovieList {

	
	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String movie = null, rating = null;
		int year = 0, length = 0;
		
		// create movie object to show favorite. 
		Movie favorite;
		System.out.println("Enter movie title: ");
		movie = scan.nextLine();
		System.out.println("Enter movie rating: ");
		rating = scan.nextLine();
		System.out.println("Enter movie year: ");
		year = scan.nextInt();
		System.out.println("Enter movie duration: ");
		length = scan.nextInt();
		favorite = new Movie(movie, rating, year, length);
		System.out.println(favorite.toString());
		scan.close();
	}
		
		

}
