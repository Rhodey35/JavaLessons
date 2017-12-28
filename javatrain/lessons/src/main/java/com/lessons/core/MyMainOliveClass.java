package com.lessons.core;

import java.util.ArrayList;
import java.util.List;

public class MyMainOliveClass {

	public static void main(String[] args) {
	List<OlivemeSubClass> olives = new ArrayList<>();
	
	olives.add(new OlivemeSubClass(OliveNameEnum.KALAMATA, 0x2E0854, 3));
	olives.add(new OlivemeSubClass(OliveNameEnum.KALAMATA, 0x2E0854, 3));
	olives.add(new OlivemeSubClass(OliveNameEnum.KALAMATA, 0x2E0854, 3));	
	olives.add(new OlivemeSubClass(OliveNameEnum.KALAMATA, 0x2E0854, 3));
	olives.add(new OlivemeSubClass(OliveNameEnum.KALAMATA, 0x2E0854, 3));
	olives.add(new OlivemeSubClass(OliveNameEnum.KALAMATA, 0x2E0854, 3));	
	olives.add(new OlivemeSubClass(OliveNameEnum.LIGURIAN, 0x000000, 2));
	olives.add(new OlivemeSubClass(OliveNameEnum.LIGURIAN, 0x000000, 2));
	
	
	OlivepressSubClass press = new OlivepressSubClass();
	int totalOil = press.getOil(olives);
	System.out.println("The total oil is: " + totalOil + " ounces.");
	
	/**
	 * 
	 * before refactoring. to clean up this code we can put the call for each instance
	 * into the add methods. Look below. 
	OlivemeSubClass olive1 = new OlivemeSubClass("Kalamata", 0x2E0854, 3);
	olives.add(olive1);
	OlivemeSubClass olive2 = new OlivemeSubClass("Kalamata", 0x2E0854, 3);
	// no longer need these calls as we are making calls directly ot the oil class. olive2.setOil(1);
	olives.add(olive2);
	OlivemeSubClass olive3 = new OlivemeSubClass("Ligurian", 0x000000, 3);
	// olive3.setOil(4);
	olives.add(olive3);
	
	OlivepressSubClass press = new OlivepressSubClass();
	int totalOil = press.getOil(olives);
	System.out.println("The total oil is: " + totalOil + " ounces.");
	*/
	
	
	}

}
