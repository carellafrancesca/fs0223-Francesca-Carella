package com.Service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.extraClass.Menu;

@Service
public class MenuService {

	@Autowired @Qualifier("menupizzeria") private ObjectProvider<Menu> menuProvider;

	public void stampaMenu() {
		System.out.println("***** Menu *****");
		System.out.println("Pizzas");
		
		menuProvider.getObject().getMenuPizza().forEach(p -> System.out.println(p.getMenuLine()));
		
		System.out.println();
		
		System.out.println("Drink");
		
		menuProvider.getObject().getMenuDrink().forEach(d -> System.out.println(d.getMenuLine()));
		
		System.out.println();
		
		System.out.println("Gadgets");

		menuProvider.getObject().getMenuPizza().forEach(g -> System.out.println(g.getMenuLine()));
		
		System.out.println();
		
		
	}
}
