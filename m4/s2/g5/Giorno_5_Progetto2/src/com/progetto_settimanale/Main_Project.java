package com.progetto_settimanale;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main_Project {
	
	private static Logger logger = LoggerFactory.getLogger(Main_Project.class);
	static List <Elemento_Generale> listaGenerale = new ArrayList<Elemento_Generale>();
	
	public static void main(String[] args) {


		
		Libri libro = new Libri("A1234B", "Harry Potter", 1997, 304, "J.K.Rowling", "Fantasy");
		Libri libro1 = new Libri("C1248T", "Normal People", 2018, 240, "Sally Rooney", "Drama");
		Libri libro2 = new Libri("D6572N", "Orgoglio e Pregiudizio", 1813, 400, "Jane Austen", "Drama");
		Riviste rivista1 = new Riviste("P4507B", "Focus", 1992, 60, Periodicità.SETTIMANALE);
		Riviste rivista2 = new Riviste("L6298G", "Vogue", 1892, 100, Periodicità.MENSILE);
		Riviste rivista3 = new Riviste("N6395P", "Cosmopolitan", 1886, 80, Periodicità.SEMESTRALE);
	
		//AGGIUNGI
		listaGenerale.add(libro);
		listaGenerale.add(libro1);
		listaGenerale.add(libro2);
		listaGenerale.add(rivista1);
		listaGenerale.add(rivista2);
		listaGenerale.add(rivista3);
		
		//stampaLista(listaGenerale);
			
		//RIMUOVI
		rimuoviElemento(listaGenerale, "D6572N");
		rimuoviElemento(listaGenerale, "L6298G");
		
		//RICERCA TRAMITE CODICE ISBN
		ricercaElementoISBN(listaGenerale, "C1248T");
		ricercaElementoISBN(listaGenerale, "N6395P");
		
		//RICERCA TRAMITE ANNO DI PUBBLICAZIONE
		ricercaElementoAnno(listaGenerale, 1997);
		ricercaElementoAnno(listaGenerale, 1992);
		
		//RICERCA TRAMITE AUTORE
		ricercaElementoAutore(listaGenerale, "J.K.Rowling");
		ricercaElementoAutore(listaGenerale, "Sally Rooney");
		
		stampaLista(listaGenerale);
			
	}
	
	//AGGIUNGERE ELEMENTO
	 public static void stampaLista(List<Elemento_Generale> allElementoGenerale) {
	        allElementoGenerale.forEach(e -> {
	        	System.out.println(e);
	        });
	 }

	 //RIMUOVERE TRAMITE ISBN
	 public static List<Elemento_Generale> rimuoviElemento(List<Elemento_Generale> allElementoGenerale, String ISBN) {
		    List<Elemento_Generale> filteredList = allElementoGenerale.stream()
		            .filter(e -> e.getISBN() == ISBN)
		            .collect(Collectors.toList());
		    
		    filteredList.forEach(e -> listaGenerale.remove(e));
		    return listaGenerale;
	 }

	 //RICERCARE ELEMENTO TRAMITE ISBN
	 public static void ricercaElementoISBN(List<Elemento_Generale> allElementoGenerale, String ISBN) {
		 List<Elemento_Generale> filteredList = allElementoGenerale.stream()
		            .filter(e -> e.getISBN() == ISBN)
		            .collect(Collectors.toList());
		    
		    filteredList.forEach(e -> {
		    	System.out.println("Codice ISBN:" + " " + e.getISBN());
		    });
		    return;
	 }

	 //RICERCARE ELEMENTO TRAMITE ANNO
	 public static void ricercaElementoAnno(List<Elemento_Generale> allElementoGenerale, Integer annoPubblicazione) {
		 List<Elemento_Generale> filteredList = allElementoGenerale.stream()
		            .filter(e -> e.getAnnoPubblicazione().equals(annoPubblicazione))
		            .collect(Collectors.toList());
		    
		    filteredList.forEach(e -> {
		    	System.out.println("Anno di Pubblicazione:" + " " + e.getAnnoPubblicazione());
		    });
		    return;
	 }
	
	//RICERCARE ELEMENTO TRAMITE AUTORE (DI LIBRO)
	public static void ricercaElementoAutore(List<Elemento_Generale> allElementoGenerale, String autore) {
		 List<Libri> filteredList = allElementoGenerale.stream()
		            .filter(e -> e instanceof Libri)
		            .map(e -> (Libri)e)
		            .filter(e -> e.getAutore() == autore)
		            .collect(Collectors.toList());
		    
		    filteredList.forEach(e -> {
		    	System.out.println("Autore Libro: " + " " + e.getAutore());
		    });
		    return;
	}
	 

}
