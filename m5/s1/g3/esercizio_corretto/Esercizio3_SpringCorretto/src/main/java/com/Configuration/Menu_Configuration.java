package com.Configuration;

import com.extraClass.Menu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.Pizze.PizzaHawaiiana;
import com.Pizze.PizzaMargherita;
import com.Pizze.PizzaSalami;
import com.Drinks.Lemonade;
import com.Drinks.Wine;
import com.Drinks.Water;
import com.Gadgets.Mug;
import com.Gadgets.Shirt;

@Configuration
public class Menu_Configuration {

    @Bean("menupizzeria")
    @Scope("singleton") 
    public Menu menu() {
        Menu m = new Menu();

        m.getMenuPizza().add(pizzaMargherita());
        m.getMenuPizza().add(pizzaHawaiiana());
        m.getMenuPizza().add(pizzaSalami());

        m.getMenuDrink().add(lem());
        m.getMenuDrink().add(water());
        m.getMenuDrink().add(wine());

        m.getMenuGadget().add(shirt());
        m.getMenuGadget().add(mug());

        return m;
    }   
    
    // bean Pizza
    
    @Bean
    @Scope("singleton")
    public PizzaMargherita pizzaMargherita() {
        return new PizzaMargherita();
    }
    
    @Bean
    @Scope("singleton")
    public PizzaHawaiiana pizzaHawaiiana() {
        return new PizzaHawaiiana();
    }
    
    @Bean
    @Scope("singleton")
    public PizzaSalami pizzaSalami() {
        return new PizzaSalami();
    }

    // bean Drinks    
    
    @Bean
    @Scope("singleton")
    public Lemonade lem() {
        return new Lemonade();
    }
    
    @Bean
    @Scope("singleton")
    public Water water() {
        return new Water();
    }
    
    @Bean
    @Scope("singleton")
    public Wine wine() {
        return new Wine();
    }   
    
    // bean Gadget
    
    @Bean
    @Scope("singleton")
    public Shirt shirt() {
        return new Shirt();
    }
    
    @Bean
    @Scope("singleton")
    public Mug mug() {
        return new Mug();
    }   
    
}

