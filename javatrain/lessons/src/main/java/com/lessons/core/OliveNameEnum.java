package com.lessons.core;

public enum OliveNameEnum {
	KALAMATA("Kalamata"),LIGURIAN("Ligurian");
	
	private String name;
	OliveNameEnum(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
