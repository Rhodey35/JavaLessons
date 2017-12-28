package com.lessons.core.olive;


import java.util.ArrayList;
import java.util.List;

import com.lessons.core.olive.model.Gaia;
import com.lessons.core.olive.model.Kalamata;
import com.lessons.core.olive.model.Ligurian;
import com.lessons.core.olive.model.Olive;
import com.lessons.core.olive.model.OliveColor;
import com.lessons.core.olive.model.OliveName;
import com.lessons.core.olive.model.SpicyOlive;


public class MainOlive {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Olive> olives = new ArrayList< >();
		
		/*// when refactoring, this mess is cleaned up to the below lines. 
		olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
		olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
		
		*/
		// this is coming from the super class Kalamata, the Olive class extends the Kalamata class
		olives.add(new Kalamata());
		olives.add(new Ligurian());
		olives.add(new Gaia());
		olives.add(new SpicyOlive());
		
		OlivePress press = new OlivePress();
		int totalOil = press.getOil(olives);
		System.out.println("The total output: " + totalOil + " ounces of oil. ");
		
		
		
	}

}
