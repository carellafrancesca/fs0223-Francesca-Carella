package com.extraClass;

import java.util.ArrayList;
import java.util.List;

import com.Drinks.Drink;
import com.Gadgets.Gadget;
import com.Pizze.PizzaBase;

import lombok.Getter;

@Getter
public class Menu {

	private List<PizzaBase> menuPizza = new ArrayList<PizzaBase>();
	private List<Drink> menuDrink = new ArrayList<Drink>();
	private List<Gadget> menuGadget = new ArrayList<Gadget>();
	
}
