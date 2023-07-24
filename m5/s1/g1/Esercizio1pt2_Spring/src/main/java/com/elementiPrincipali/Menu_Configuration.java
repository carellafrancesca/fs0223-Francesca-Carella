package com.elementiPrincipali;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.classiPizze.Pizza_Hawaiiana;
import com.classiPizze.Pizza_Margherita;
import com.classiPizze.Pizza_Salami;
import com.classiDrink.Lemonade;
import com.classiDrink.Wine;
import com.classiDrink.Water;
import com.classiGadget.Mug;
import com.classiGadget.Shirt;

@Configuration
public class Menu_Configuration {

	@Bean
	@Scope("singleton") 
	public Menu_Intero menu() {
	    Menu_Intero m = new Menu_Intero();
	    
	    m.getMenuPizze().add(pizzaMargherita());
	    m.getMenuPizze().add(pizzaHawaiian());
	    m.getMenuPizze().add(pizzaSalami());
	    
	    m.getMenuDrink().add(Lemonade());
		m.getMenuDrink().add(Water());
		m.getMenuDrink().add(Wine());
		
		m.getMenuGadget().add(Shirt());
		m.getMenuGadget().add(Mug());
		
	    
	    return m;
	}	
	
	// bean Pizza
	
		@Bean
		@Scope("singleton")
		public Pizza_Margherita pizzaMargherita() {
			return new Pizza_Margherita();
		}
		
		@Bean
		@Scope("singleton")
		public Pizza_Hawaiiana pizzaHawaiian() {
			return new Pizza_Hawaiiana();
		}
		
		@Bean
		@Scope("singleton")
		public Pizza_Salami pizzaSalami() {
			return new Pizza_Salami();
		}

	//bean Drinks	
		
		@Bean
		@Scope("singleton")
		public Lemonade Lemonade() {
			return new Lemonade();
		}
		
		@Bean
		@Scope("singleton")
		public Water Water() {
			return new Water();
		}
		
		@Bean
		@Scope("singleton")
		public Wine Wine() {
			return new Wine();
		}	
	
	//bean Gadget
		
		@Bean
		@Scope("singleton")
		public Shirt Shirt() {
			return new Shirt();
		}
		
		@Bean
		@Scope("singleton")
		public Mug Mug() {
			return new Mug();
		}	
		
		
}
