package com.esercizio2_W2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main_Project {
	
	static Logger log = LoggerFactory.getLogger(Main_Project.class);

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 log.info("Inserisci il numero di parole da inserire: ");
		 int n = scanner.nextInt();
		 scanner.nextLine();
	     
		 Set<String> parole = new HashSet<String>();
		 Set<String> paroleDuplicate = new HashSet<String>();
	       
		 for (int i = 0; i < n; i++) {
			    log.info("Inserisci una parola: ");
			    String parola = scanner.nextLine();

			    if (parole.contains(parola)) { // contains = verifica se la parola è già presente nel set parole
			        paroleDuplicate.add(parola); // se la parola è presente, viene aggiunta al set paroleDuplicate
			    }
			    parole.add(parola);//dopo il controllo, la parola viene aggiunta al set parole con il metodo add(parola) 
			    
		 }  

		 log.info("Parole duplicate:");
	        for (String parola : paroleDuplicate) { //per ottenere ogni parola duplicata presente nel set
	            log.info(parola);
	        }
	        
	     log.info("Numero di parole distinte: " + parole.size());//parole.size() restituisce il numero di elementi presenti nel set di parole
	     
	     
	     log.info("Elenco parole distinte:");  
	       for (String parola : parole) { //per ottenere ogni singola parola nel set di parole
	           log.info(parola);
	       }
	        
	}

}
