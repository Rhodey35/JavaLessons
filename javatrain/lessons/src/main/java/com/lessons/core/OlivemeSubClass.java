package com.lessons.core;

public class OlivemeSubClass {

	/*
	 * 
	 * Working with Constants!!
	 * When a constant value is needed. It has to be listed in upper case!
	 * It will be held by the "final" keyword. 
	 * It will usually be public as everyone can see and use it. 
	 * It will be stated as a static variable as it can not be changed and
	 * it belongs to the class. THIS IS NOT AN INSTANCE OF THE CLASS> 
	 */
	// Wont need these if we make these objects instead of strings. 
	/*
	public static final String KALAMATA = "Kalamata";
	public static final String LIGURIAN = "Ligurian";
	*/
	
	
	private OliveNameEnum name = OliveNameEnum.KALAMATA;
	private long color = 0x2E0854;
	private int oil = 3;
	
	
	
	public OlivemeSubClass() {}
	
	public OlivemeSubClass(OliveNameEnum name, long color, int oil) {
		this.name = name; 
		this.color = color; 
		this.oil = oil;
	}
	
	
	public OliveNameEnum getName() {System.out.print("This is a: " + name + " olive. Return object:"); return name; }
	public void setName(OliveNameEnum name) {this.name = name;}
	public long getColor() {return color;}
	public void setColor(long color) {this.color = color; }

	public int crush() {
		System.out.println("We press a de oil. Yum!");
		return oil;


	}

	public void setOil(int oil) { this.oil = oil; }

}
