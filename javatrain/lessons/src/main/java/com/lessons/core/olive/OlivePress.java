package com.lessons.core.olive;

import java.util.List;

import com.lessons.core.olive.model.Olive;

public class OlivePress {



	public int getOil(List<Olive> olives) {

	int totalOil = 0;

	for (Olive o : olives) {
		totalOil += o.crush();
	}
	
	return totalOil;
		
	}


}
