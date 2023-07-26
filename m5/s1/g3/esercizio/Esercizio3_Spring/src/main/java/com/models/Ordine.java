package com.models;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ordine {

	private Integer numeroOrdine;
	private StatoOrdine statoOrdine;
	private Integer numeroCoperti;
	private LocalTime oraAcquisizioneOrdine;
	private Double costoCoperto;
	private Map<FoodItem, Integer> ordinato = new HashMap<FoodItem, Integer>();
	
	public void addMeunuItem(FoodItem item) {
		if(!ordinato.containsKey(item)) {
			ordinato.put(item, 1);
		} else {
			ordinato.put(item, ordinato.get(item)+1);
		}
		System.out.println("Prodotto aggiunto al tuo ordine!!");
	}
	
	public void removeMeunuItem(FoodItem item) {
		if(ordinato.containsKey(item)) {
			if(ordinato.get(item) == 1) {
				ordinato.remove(item);
			} else {
				ordinato.put(item, ordinato.get(item)-1);
			}
		} 
		System.out.println("Prodotto rimosso dal tuo ordine!!");
	}
	
	public void getTotale() {
		Double totale = 0.0;
		for (FoodItem item : ordinato.keySet()) {
			totale += item.getPrice() * ordinato.get(item);
		}
		
		totale += (costoCoperto * numeroCoperti) ;
		
		System.out.println("Il totale del tuo ordine è " + totale);
	}
	
}
