package com.elementiPrincipali;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Gestione_Menu {

	AnnotationConfigApplicationContext appContext;
	Menu_Intero menu;

	public Gestione_Menu() {
		appContext = new AnnotationConfigApplicationContext(Menu_Configuration.class);
		menu = (Menu_Intero) appContext.getBean("menu");
	}
	
	public void stampaMenu() {
		System.out.println("***** Menu *****");
		System.out.println("Pizzas");
		
		menu.getMenuPizze().forEach(p -> System.out.println(p.getMenu()));
		
		System.out.println();
		
		System.out.println("Drink");
		
		menu.getMenuDrink().forEach(d -> System.out.println(d.getMenu()));
		
		System.out.println();
		
		System.out.println("Gadget");
		
		menu.getMenuGadget().forEach(g -> System.out.println(g.getMenu()));
		
		System.out.println();
		
	}
	
	
}
