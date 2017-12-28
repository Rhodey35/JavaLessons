package com.lessons.model;

public class OliveYum {
	// to ensure that only the classes with access to these methods
	// can access the values. We make them private. 
	private String name = "Kalamata";
	private long color = 0x2E0854;
	private int oil = 3;
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getColor() {
		return color;
	}
	public void setColor(long color) {
		this.color = color;
	}
	public int getOil() {
		System.out.println("We graba de olive\n we chrusha de olive\nwe getta de oil");
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	
	
}
