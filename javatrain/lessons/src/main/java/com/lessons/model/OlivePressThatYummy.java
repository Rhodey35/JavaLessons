package com.lessons.model;

import java.util.List;

public class OlivePressThatYummy {

	public int getOil(List<OliveYum> olives){
		
		int totalOil = 0;
		
		
		for(OliveYum o : olives) {
			System.out.println(o.getName());
			totalOil += o.getOil();
			
		
		}
		
		return totalOil;
		
	}
	
}
