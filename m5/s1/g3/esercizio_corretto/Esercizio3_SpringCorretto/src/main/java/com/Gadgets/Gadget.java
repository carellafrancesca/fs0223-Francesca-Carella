package com.Gadgets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Gadget {
	
	private String name;
	private Double price;
	
	public String getMenuLine() {
		return this.name + " - price: " + this.price;  
	}
	
}
