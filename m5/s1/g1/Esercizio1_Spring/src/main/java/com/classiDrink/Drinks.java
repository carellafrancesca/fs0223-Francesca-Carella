package com.classiDrink;

public class Drinks {

	private String name;
	private Double price;
	private Double calories;

	public Drinks(String name, Double price, Double calories) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public String getMenu() {
		return this.name + " - caloreis: " + this.calories + " - price: " + this.price;  
	}

	
}
