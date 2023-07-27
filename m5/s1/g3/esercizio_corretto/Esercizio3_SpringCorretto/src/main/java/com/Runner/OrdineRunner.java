package com.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.extraClass.Tavolo;
import com.Pizze.PizzaMargherita;
import com.Pizze.PizzaSalami;
import com.Service.OrdineService;
import com.Drinks.Lemonade;
import com.Drinks.Water;
import com.Ordine.Ordine;

@Component
public class OrdineRunner implements CommandLineRunner {

	@Autowired
	OrdineService os;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Run.. OrdineRunner");

		Tavolo t1 = os.creaTavolo(1, 4);
		Tavolo t2 = os.creaTavolo(2, 6);
		Tavolo t3 = os.creaTavolo(3, 2);

		Ordine o1 = os.creaOrdine(1, 3, t1);

		PizzaMargherita pm = (PizzaMargherita) os.getMenu().getMenuPizza().get(0);
		PizzaSalami ps = (PizzaSalami) os.getMenu().getMenuPizza().get(2);
		Lemonade dlem = (Lemonade) os.getMenu().getMenuDrink().get(0);
		Water wa = (Water) os.getMenu().getMenuDrink().get(1);
		o1.addMenuitem(pm);
		o1.addMenuitem(pm);
		o1.addMenuitem(dlem);
		o1.addMenuitem(ps);
		o1.addMenuitem(wa);
		o1.addMenuitem(wa);

		System.out.println(o1);
		o1.getTotale();

	}

}
