package com.Esercizio3Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.models.Pizze;
import com.service.MenuService;

public class MenuRunner implements CommandLineRunner{

	@Autowired private MenuService ms;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run...");
		 
		Pizze margherita = new Pizze();
	        margherita.setName("Margherita (tomato, cheese)");
	        margherita.setPrice(4.99);
	        margherita.setCalories(1104.0);

	        ms.addPizzaToMenu(margherita);
		
	}

	
	
}
