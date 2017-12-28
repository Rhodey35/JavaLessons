package com.lessons.model;

import java.util.ArrayList;
import java.util.List;

// this defines a data model 
// common in Java coding. 


public class ModelClassExampleWithMain {

	public static void main(String[] args) {
		List<OliveYum> olives = new ArrayList<>();
		OliveYum olive1  = new OliveYum();
		olives.add(olive1);
		OliveYum olive2  = new OliveYum();
		olive2.setOil(1);
		olives.add(olive2);
		OliveYum olive3  = new OliveYum();
		olive3.setOil(4);
		olives.add(olive3);
		
		OlivePressThatYummy press = new OlivePressThatYummy();
		press.getOil(olives);
		int totalOil = press.getOil(olives);
		System.out.println("We produced a total of: " + totalOil + " ounces.");
		
		
		
		
	}

}
