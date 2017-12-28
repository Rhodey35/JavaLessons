package com.example.olive;

import java.util.ArrayList;
import java.util.List;

import com.example.olive.model.Ligurian;
import com.example.olive.model.Olive;
import com.example.olive.OlivePress;
import com.example.olive.model.Kalamata;

public class Main {

	public static void main(String[] args) {
		List<Olive> olives = new ArrayList<>();
		olives.add(new Kalamata());
		olives.add(new Ligurian());
		
		Press press = new OlivePress();
		press.setOil(5);
				
		int totalOil = press.getOil(olives);
		
		System.out.println("the total oil pressed: " + totalOil + " units");
		
		
		/* 
		 * Example of how eclipse will implement the all of the abstract methods of this class 
		 * when you make more instances.  
		 * 
		Press p2 = new Press() {

			@Override
			public int getOil(List<Olive> olives) {
				
				return 0;
			}

			@Override
			public void setOil(int oil) {
					
			}
			
		}
	*/
		
		
	}

}
