package com.progetto3;

import java.util.Scanner;

public class esercizio_3 {

	public static void main(String[] args) {
		
		String nome = "Francesca";
		boolean lenght = stringaPariDispari(nome);
		System.out.println(lenght);
		
		int anno = 2023;
		if (AnnoBisestile(anno)) {
			System.out.println(anno + " " + "è un anno bisestile");
		}else {
			System.out.println(anno + " " + "non è un anno bisestile");
		}

        int numero = 12;
        String numeroInLettere = convertiInLettere(numero);
        System.out.println(numeroInLettere);
        

        while (true) {
	        Scanner sc = new Scanner (System.in);
	        System.out.print("Inserisci una stringa: ");
	        String testo = sc.nextLine();
	        
	        if(testo.equals(":q")) {
	        	break;
	        }
	        
	        String[] testoSplittato = testo.split("");
	        
	        for (int i = 0; i < testoSplittato.length; i++) {
	        	System.out.println(testoSplittato[i] + ",");
	        }
	        
        }
        
        
	}
	
	public static boolean stringaPariDispari(String nome) {
		int length = nome.length();
		
		if (length % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean AnnoBisestile(int anno) {
		if (anno % 4 != 0) {
            return false;
        } else if (anno % 100 != 0) {
            return true;
        } else if (anno % 400 != 0) {
            return false;
        } else {
            return true;
        }
	}
	
	public static String convertiInLettere(int numero) {
		switch (numero) {
        case 0:
            return "Zero";
        case 1:
            return "Uno";
        case 2:
            return "Due";
        case 3:
            return "Tre";
        default:
            return "Errore";
		}
	}

	
	
}
