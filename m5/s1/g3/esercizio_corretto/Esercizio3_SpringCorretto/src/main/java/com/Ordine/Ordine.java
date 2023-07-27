package com.Ordine;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import com.extraClass.FoodItem;
import com.extraClass.Tavolo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ordine {

	private Integer numeroOrdine;
	private StatoOrdine statoOrdine;
	private Integer numeroCoperti;
	private LocalTime oraAcquisizioneOrdine;
	private Double costoCoperto;
	private Tavolo tavolo;
	private Map<FoodItem, Integer> ordinato = new HashMap<FoodItem, Integer>();
	// la mappa viene utilizzata per tenere traccia degli oggetti FoodItem ordinati e delle rispettive quantità

	public void addMenuitem(FoodItem item) {
		if (!ordinato.containsKey(item)) {
			ordinato.put(item, 1);
		} else {
			ordinato.put(item, ordinato.get(item) + 1);
		}
		System.out.println("Prodotto aggiunto al tuo ordine!!");
	}
	// per aggiungere un elemento del menu (oggetto FoodItem) all'ordine

	public void removeMenuitem(FoodItem item) {
		if (ordinato.containsKey(item)) {
			if (ordinato.get(item) == 1) {
				ordinato.remove(item);
			} else {
				ordinato.put(item, ordinato.get(item) - 1);
			}
		}
		System.out.println("Prodotto rimosso dal tuo ordine!!");
	}
	// per rimuovere un elemento del menu (oggetto FoodItem) all'ordine

	public void getTotale() {
		Double totale = 0.0;
		for (FoodItem item : ordinato.keySet()) {
			totale += item.getPrice() * ordinato.get(item);
		}

		totale += (costoCoperto * numeroCoperti);

		System.out.println("Il totale del tuo ordine è " + totale);
	}
	// viene utilizzato per calcolare e stampare il totale dell'ordine

}
