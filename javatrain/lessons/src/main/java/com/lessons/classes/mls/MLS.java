package com.lessons.classes.mls;

import java.util.ArrayList;

import com.lessons.classes.Property;

public class MLS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			ArrayList<Property> mls = new ArrayList<>();
			
			Property listing = new Property(1000, "Land", 3.5, 0, 0);
			mls.add(listing);
			listing = new Property(230000, "Estate", 2.0, 2, 3);
			mls.add(listing);
			System.out.println(mls.toString());
			mls.remove(1);
			System.out.println("After removing index 1: " + mls.toString() + "\n");
			
			
			
	}

}
