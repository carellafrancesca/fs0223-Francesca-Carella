package com.Pizze;

import com.extraClass.FoodItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class PizzaBase implements FoodItem{
	
	private String name;
	private Double price;
	private Double calories;

	public String getMenuLine() {
		return this.name + " - caloreis: " + this.calories + " - price: " + this.price;  
	}

	
}
