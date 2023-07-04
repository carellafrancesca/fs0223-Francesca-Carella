package com.esercizio2pt3_W2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main_Project3 {

	private static Map<String,String> rubrica = new HashMap<String,String>();
	
	public static void main(String[] args){
		try {
			aggiungiContatto("Mario", "123456789");
			aggiungiContatto("Francesca", "123456789");
			aggiungiContatto("Luigi", "123456789");
			
			rimuoviContatto("Luigi");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//1
	public static void aggiungiContatto(String nome,String telefono) throws Exception {
		if(rubrica.containsKey(nome)) {
			throw new Exception("Chiave già presente nella rubrica!");
		}else {
			rubrica.put(nome,telefono);
		}
	}	
	
	//2
	public static void rimuoviContatto(String nome) throws Exception {
		if(rubrica.containsKey(nome)){
			rubrica.remove(nome);
		}else {
			throw new Exception("Chiave non presente nella rubrica");
		}
		
	}
	
	//3
	public static String ricercaNumeroContatto(String numero) {
		Set <String> key = rubrica.keySet();
		
		for(String k : key) {
			if(numero.equals(rubrica.get(k))) {
				return k;
			}
		}	
		return null;
	}
	
	
	//4
	public static String ricercaNomeContatto(String nome) {
		return rubrica.get(nome);
	}

	//5
	public static void stampaContatti() {
		System.out.println("**Contatti**");
		Set <String> key = rubrica.keySet();
		
		for(String k : key) {
			System.out.println("Nome:" + "Numbero:" + rubrica.get(k));
		}
	}
}
