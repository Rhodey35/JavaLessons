package com.lessons.core;

import java.util.HashMap;
import java.util.Map;

public class HashMapingMyMellowMan {

	public static void main(String[] args) {
	
		Map<String, String> map = new HashMap<>();
		
		
		map.put("Alaska", "Anchorage");
		map.put("Massachusetts", "Boston");
		map.put("Arizona", "Phoenix");
		map.put("Oregon", "Salem");
		System.out.println(map);
		
		map.put("Florida", "Tampa");
		System.out.println(map);
		
		String capturestring = map.get("Oregon");
		System.out.println("The capital of Oregon is: " + capturestring);
		
		System.out.println("Removing Oregon from the list" );
		map.remove("Oregon");
		System.out.println(map);
		
		
		
		

	}

}
