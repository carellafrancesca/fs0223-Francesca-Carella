package com.classiPizze;

public abstract class Pizza_Base {

	private String name;
	private Double price;
	private Double calories;
	
	public Pizza_Base(String name, Double price, Double calories) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
	}
	
	public String getMenu() {
		return this.name + " - caloreis: " + this.calories + " - price: " + this.price;  
	}
	
}
