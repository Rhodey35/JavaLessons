package com.lynda.javatraining;

import java.lang.reflect.Constructor;

import com.lynda.javatraining.olives.Olive;
import com.lynda.javatraining.olives.OliveName;

public class Main {

	public static void main(String[] args) {
		Olive o = new Olive(OliveName.PICHOLINE, 
				0x00FF00);
		
		Class<?> c = o.getClass();
		
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		
		Constructor<?>[] constructors = c.getConstructors();
		System.out.println("Number of constructors: " + constructors.length);
		// the reference to the single constructor in this class. 
		Constructor<?> con = constructors[0];
		
		// once the constructor has been set the build of each instance needs to 
		// be handled for errors. This will ensure that there are no runtime exceptions.
		
		Object obj = null;
		
		try {
		
		obj = con.newInstance(OliveName.PICHOLINE, 0x00FF00);
		System.out.println(obj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
