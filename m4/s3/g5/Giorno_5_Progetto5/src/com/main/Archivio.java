package com.main;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.classi.Catalogo_Bibliotecario;
import com.classi.Libro;
import com.classi.Periodicita;
import com.classi.Rivista;

import javax.persistence.Query;

public class Archivio {
	
	static EntityManager em = Persistence.createEntityManagerFactory("Giorno_5_Progetto5").createEntityManager();

	public static void main(String[] args){
		
		Libro l1 = new Libro("Uno, Nessuno, Centomila", 1909, 224, "Luigi Pirandello", "Romanzo");
		Libro l2 = new Libro("Normal People", 2020, 266, "Sally Rooney", "Romanzo");
		Libro l3 = new Libro("Norvegian Wood", 1987, 339, "Haruki Murakami", "Narrativa");
		Rivista r1 = new Rivista ("Cosmopolitan", 1986, 60, Periodicita.MENSILE);
		Rivista r2 = new Rivista ("Vogue", 1982, 100, Periodicita.SETTIMANALE);
		
		// AGGIUNGI ELEMENTI
		//add(l1);
		//add(l2);
		//add(l3);
		//add(r1);
		//add(r2);
		
		// REMOVE DA ISBN
		//deleteByISBN(1);  
		
		// RICERCA PER ISBN
		//searchByISBN(3);
		
		//RICERCA PER ANNO
		//searchByYear(2020);
		
		//RICERCA PER AUTORE
		//searchByAuthor("Haruki Murakami");
		
		//RICERCA PER TITOLO O PARTE DI ESSO
		//searchByTitle("Wood");
		
	}

	//AGGIUNGERE UN ELEMENTO
	public static void add(Catalogo_Bibliotecario c){
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}
	
	//ELIMINARE UN ELEMENTO ATTRAVERSO IL CODICE ISBN
	public static void deleteByISBN(long id){
		em.getTransaction().begin();
		em.remove(em.find(Catalogo_Bibliotecario.class, id));
		em.getTransaction().commit();
	}
	
	//RICERCARE UN ELEMENTO ATTRAVERSO IL CODICE ISBN
	public static Catalogo_Bibliotecario searchByISBN(long id) {
	    em.getTransaction().begin();
	    Catalogo_Bibliotecario c = em.find(Catalogo_Bibliotecario.class, id);
	    em.getTransaction().commit();
	    System.out.println("ISBN");
	    return c;    
	}

	//RICERCARE UN ELEMENTO ATTRAVERSO L'ANNO DI PUBBLICAZIONE
	public static void searchByYear(int year) {
	    em.getTransaction().begin();
	    Query query = em.createNamedQuery("searchByYear");
	    query.setParameter("anno", year);
	    List<Catalogo_Bibliotecario> results = query.getResultList();
	    em.getTransaction().commit();

	    for (Catalogo_Bibliotecario elemento : results) {
	        System.out.println(elemento);
	    }
	}
	
	//RICERCARE UN ELEMENTO ATTRAVERSO L'AUTORE
	public static void searchByAuthor(String author) {
	    em.getTransaction().begin();
	    Query query = em.createNamedQuery("searchByAuthor");
	    query.setParameter("autore", author);
	    List<Catalogo_Bibliotecario> results = query.getResultList();
	    em.getTransaction().commit();

	    for (Catalogo_Bibliotecario elemento : results) {
	        System.out.println(elemento);
	    }
	}
	
	//RICERCARE UN ELEMENTO ATTRAVERSO IL TITOLO O PARTE DI ESSO
	public static void searchByTitle(String title) {
	    em.getTransaction().begin();
	    Query query = em.createNamedQuery("searchByTitle");
	    query.setParameter("titolo", "%" + title + "%");
	    List<Catalogo_Bibliotecario> results = query.getResultList();
	    em.getTransaction().commit();

	    for (Catalogo_Bibliotecario elemento : results) {
	        System.out.println(elemento);
	    }
	}
	
	
}
