package com.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ElementList {

    private String name = "Lista Elementi";
    private List<Pizze> menuPizze = new ArrayList<>();
    private List<Toppers> menuTopper = new ArrayList<>();
    private List<Drinks> menuDrinks = new ArrayList<>();
    private List<Gadget> menuGadgets = new ArrayList<>();
    
    public List<Pizze> getMenuPizze() {
        return this.menuPizze;
    }
    
    public List<Toppers> getMenuToppers() {
        return this.menuTopper;
    }
    
    public List<Drinks> getMenuDrinks() {
        return this.menuDrinks;
    }
    
    public List<Gadget> getMenuGadgets() {
        return this.menuGadgets;
    }
}
