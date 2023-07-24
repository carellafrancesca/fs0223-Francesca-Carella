package com.classiTopper;

public class Topper {

	private String name;
	private Double price;
	private Double calories;
	
	public Topper(String name, Double price, Double calories) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
	}
	
	public String getMenu() {
		return this.name + " - caloreis: " + this.calories + " - price: " + this.price;  
	}
	
}
