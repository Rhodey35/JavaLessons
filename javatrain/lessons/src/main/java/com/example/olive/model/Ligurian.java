package com.example.olive.model;



public class Ligurian extends Olive {

	public Ligurian() {
		super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return "Italy";
	}

}
