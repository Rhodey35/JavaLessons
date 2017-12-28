package com.lessons.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectMyIterationsofCollections {

	
	
	public static void main(String[] args) {
		
		System.out.println("This is how we order our data. ");
		List<String> list = new ArrayList<>();
		
		
		list.add("Alaska");
		list.add("Massachusetts");
		list.add("Arizona");
		list.add("Oregon");
		
		System.out.println("toString() output");
		System.out.println(list);
		System.out.println("blah");
		
		System.out.println(" ArrayList iterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String myvalue = iterator.next();
			System.out.println(myvalue);
			
		}
		System.out.println("blah2");
		
		
		
		System.out.println("Using the ArrayList with ForEach");
		for (String myvalue : list) {
			System.out.println(myvalue);
			
		}
		System.out.println("blah3 ");
		
		
		// this way is way cool. 
		System.out.println("For Java 8 and beyond: the ForEach method is a built in. ");
		list.forEach(System.out::println);
		System.out.println("blah 4");
		
		
		
		System.out.println(" now for an example of unordered code. ");
		Map<String, String> map = new HashMap<String, String>();
		map.put("Alaska", "Anchorage");
		map.put("Massachusetts", "Boston");
		map.put("Arizona", "Phoenix");
		map.put("Oregon", "Salem");
		System.out.println(map);
		System.out.println("");
		// using the specific keys I can make sure that I get the unique set that 
		// I want to return. 
		System.out.println("This is a HashMap Iterator which is a bit more code but it still works. ");
		Set<String> keys = map.keySet();
		Iterator<String> myiterator = keys.iterator();
		while(myiterator.hasNext()) {
			String key = myiterator.next();
			System.out.println("The capitol of " + key + " is " + map.get(key));
			
			
		}
		System.out.println("blah 5");
		
		System.out.println("This is a HashMap using ForEach method");
		for (String key : keys) {
			System.out.println("The capitol of " + key + " is " + map.get(key));
		}
		System.out.println("blah 6");
		
	}

}
