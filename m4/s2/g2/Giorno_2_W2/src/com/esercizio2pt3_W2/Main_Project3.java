package com.esercizio2pt3_W2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main_Project3 {

	private static Map<String,String> rubrica = new HashMap<String,String>();
	
	public static void main(String[] args){
		try {
			
			aggiungiContatto("Mario Rossi", "123456789");
			aggiungiContatto("Luigi Verdi", "987654321");
			aggiungiContatto("Francesca Neri", "456321789");
			//aggiungiContatto("Mario Rossi", "123456789"); // Errore Chiave Duplicata
			
			stampaContatti();
			
			String nomeContatto = ricercaNumeroContatto("456321789");
			System.out.println("Nome contatto: " + nomeContatto);
			
			String numeroContatto = ricercaNomeContatto("Mario Rossi");
			System.out.println("Numero contatto: " + numeroContatto);
		
			rimuoviContatto("Luigi Verdi");
			// rimuoviContatto("Antonio Bianchi"); // Errore Chiave non presente in rubrica
		
			stampaContatti();
			
			System.out.println(rubrica.toString());
		
		} catch (ContainsKeyExceptions e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//1
	public static void aggiungiContatto(String nome,String telefono) throws Exception {
		if(rubrica.containsKey(nome)) {
			throw new ContainsKeyExceptions("Chiave già presente nella rubrica!");
		}else {
			rubrica.put(nome,telefono);
			System.out.println("Contatto aggiunto in rubrica!");
		}
	}	
	
	//2
	public static void rimuoviContatto(String nome) throws Exception {
		if(rubrica.containsKey(nome)){
			rubrica.remove(nome);
			System.out.println("Contatto rimosso dalla rubrica!");
		}else {
			throw new ContainsKeyExceptions("Chiave non presente nella rubrica");
		}
		
	}
	
	//3
	public static String ricercaNumeroContatto(String numero) {
		Set <String> key = rubrica.keySet();
		//significa che viene creato un insieme (Set) di tipo String chiamato key, che conterrà le chiavi della rubrica
		//il metodo keySet() viene chiamato sull'oggetto rubrica, che presumibilmente è di tipo Map, per ottenere l'insieme di tutte le chiavi presenti nella mappa
		for(String k : key) {
			if(numero.equals(rubrica.get(k))) {
				return k;
			}
		}	
		return null;
	}
	//la funzione cerca nella rubrica un contatto che abbia il numero di telefono specificato 
	//restituisce il nome del contatto corrispondente se viene trovato, altrimenti restituisce null
	
	
	//4
	public static String ricercaNomeContatto(String nome) {
		return rubrica.get(nome);
	}
	
	//la riga di codice return rubrica.get(nome); restituisce il valore associato alla chiave nome nella mappa rubrica
	//se nome è una chiave valida nella mappa rubrica, il metodo get() restituirà il valore associato a quella chiave, che in questo caso dovrebbe essere una stringa rappresentante il numero di telefono corrispondente al nome

	
	//5
	public static void stampaContatti() {
		System.out.println("***Contatti***");
		Set <String> key = rubrica.keySet();
	
		//significa che viene creato un insieme (Set) di tipo String chiamato key, che conterrà le chiavi della rubrica
		//il metodo keySet() viene chiamato sull'oggetto rubrica, che presumibilmente è di tipo Map, per ottenere l'insieme di tutte le chiavi presenti nella mappa
		
		for(String k : key) {
			System.out.println("Nome:" + "Numbero:" + rubrica.get(k));
		}
	}
}
