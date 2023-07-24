package com.elementiPrincipali;

import java.util.ArrayList;
import java.util.List;

import com.classiDrink.Drinks;
import com.classiGadget.Gadget;
import com.classiPizze.Pizza_Base;

public class Menu_Intero {

	private List<Pizza_Base> menuPizze = new ArrayList<Pizza_Base>();
	private List<Drinks> menuDrinks = new ArrayList<Drinks>();
	private List<Gadget> menuGadget = new ArrayList<Gadget>();
	
	public List<Pizza_Base> getMenuPizze() {
		return menuPizze;
	}
	
	public List<Drinks> getMenuDrink() {
		return menuDrinks;
	}
	
	public List<Gadget> getMenuGadget() {
		return menuGadget;
	}
	
}
