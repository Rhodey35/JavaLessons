package com.lessons.classes.movies;

public class Movie {

	private String title;
	private String rating;
	private int year;
	private int length;
	
	
	
	
	public Movie(String title, String rating, int year, int length) {
		super();
		this.title = title;
		this.rating = rating;
		this.year = year;
		this.length = length;
	}




	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}




	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}




	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}




	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}




	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}




	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}




	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}




	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n  Movie: " + title +
			   "\n rating: " + rating + 
			   "\n   year: " + year + 
			   "\n length: " + length;
	}



}
