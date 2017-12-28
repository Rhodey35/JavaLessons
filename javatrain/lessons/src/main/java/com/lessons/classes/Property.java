package com.lessons.classes;



public class Property {

	private double askPrice;
	private String propertyType;
	private double lotSize;
	private int numberBaths;
	private int	numberBeds;
	/*public Property(double askPrice, String propertyType, double lotSize ) {
		
	}*/
	public Property(double askPrice, String propertyType, double lotSize) {
		super();
		this.askPrice = askPrice;
		this.propertyType = propertyType;
		this.lotSize = lotSize;
		numberBaths = 0;
		numberBeds = 0;
		
	}
	public Property(double askPrice, String propertyType, double lotSize, int numberBaths, int numberBeds) {
		super();
		this.askPrice = askPrice;
		this.propertyType = propertyType;
		this.lotSize = lotSize;
		this.numberBaths = numberBaths;
		this.numberBeds = numberBeds;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/*
	@Override
	public String toString() {
		return "Property [askPrice=" + askPrice + ", propertyType=" + propertyType + ", lotSize=" + lotSize
				+ ", numberBaths=" + numberBaths + ", numberBeds=" + numberBeds + "]";
	}
	*/
	
	@Override
	public String toString() {
		
		return "Asking Price: $" + askPrice +
				"\nProperty Type: " + propertyType +
				"\nLot Size: " + lotSize +
				"\nNumber of Baths:" + numberBaths +
				"\nNumber of Beds:" + numberBeds;
	}
	
	
	public void newAskPrice(double newValue) {
		askPrice = newValue;
	}
	
}
