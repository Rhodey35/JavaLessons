package com.lessons.core.olive.model;

public enum OliveName {

	KALAMATA("Kalamata"), LIGURIAN("Ligurian");
	
	private String name;
	
	OliveName(String name) {
		this.name = name;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
	
	
}
