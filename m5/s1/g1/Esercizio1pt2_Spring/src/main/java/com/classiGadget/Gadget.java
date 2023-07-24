package com.classiGadget;

public class Gadget {
	
	private String name;
	private Double price;
	
	public Gadget(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getMenu() {
		return this.name + " - price: " + this.price;  
	}
	
	
}
