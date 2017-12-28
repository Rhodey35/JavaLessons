package com.lessons.core;

import java.util.ArrayList;
import java.util.List;

public class ListofListsArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Alaska");
		list.add("Arizona");
		list.add("Massachusetts");
		System.out.println(list);
		System.out.println("Added Oregon to the list");
		list.add("Oregon");
		System.out.println(list);
		list.remove(2);
		System.out.println("removed the index for Massachusetts");
		System.out.println(list);
		
		String state = list.get(1);
		
		System.out.println(" the second state is: " + state);
		
		int position = list.indexOf("Alaska");
		System.out.println("Alaska is at thee index position " + position + " of the array. ");
		
		
	}

}
