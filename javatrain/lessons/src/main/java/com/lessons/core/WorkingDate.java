package com.lessons.core;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class WorkingDate {

	public static void main(String[] args) {


		Date day = new Date();
		System.out.println(day);
		// run a match on this date later: Tue Dec 05 14:53:39 MST 2017
		// this was the first time I ran date on eclipse after taking the raveture classes. 
		
		
		GregorianCalendar greg = new GregorianCalendar(2000,12,06);
		greg.add(GregorianCalendar.DATE, 1);
		Date day2 = greg.getTime();
		//Tue Dec 05 14:56:42 MST 2017  output
		System.out.println(day2);
		// Sun Jan 07 00:00:00 MST 2001		output 
		
		DateFormat dayformated = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dayformated.format(day2));
		
		
		
		
		LocalDateTime localdt = LocalDateTime.now();
		System.out.println(localdt);
		
		LocalDate locald = LocalDate.of(2001, 12, 29);
		System.out.println(locald);
		
		// tried a different way
		LocalDate locald2 = LocalDate.of(29, 12, 29);
		System.out.println(locald2);		
		
		
		
		
		
		
		
	}

}
