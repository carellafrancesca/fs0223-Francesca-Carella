package com.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.models.Drinks;
import com.models.ElementList;
import com.models.Gadget;
import com.models.Pizze;
import com.models.Toppers;

@Service
public class MenuService {

	@Autowired @Qualifier("elementlistBean") private ObjectProvider<ElementList> ElementListProvider;
	@Autowired @Qualifier("pizzeBean") private ObjectProvider<Pizze> PizzeListProvider;
	@Autowired @Qualifier("toppersBean") private ObjectProvider<Toppers> ToppersListProvider;
	@Autowired @Qualifier("drinksBean") private ObjectProvider<Drinks> DrinksListProvider;
	@Autowired @Qualifier("gadgetBean") private ObjectProvider<Gadget> GadgetListProvider;
	
	public void addElementList(ElementList el) {
        ElementList elementList = ElementListProvider.getObject();
        List<Pizze> menuPizze = elementList.getMenuPizze();
        List<Toppers> menuTopper = elementList.getMenuToppers();
        List<Drinks> menuDrinks = elementList.getMenuDrinks();
        List<Gadget> menuGadgets = elementList.getMenuGadgets();
        menuPizze.add(new Pizze());
        menuTopper.add(new Toppers());
        menuDrinks.add(new Drinks());
        menuGadgets.add(new Gadget());
    }
	
	public void addPizzaToMenu(Pizze pizza) {
		ElementList elementList = ElementListProvider.getObject();
        List<Pizze> menuPizze = elementList.getMenuPizze();
        menuPizze.add(pizza);
    }
	
	public void addTopperToMenu(Toppers topper) {
        ElementList elementList = ElementListProvider.getObject();
        List<Toppers> menuTopper = elementList.getMenuToppers();
        menuTopper.add(topper);
    }
	
}
