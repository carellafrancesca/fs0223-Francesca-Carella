package com.progettoW1.classi;

import com.progettoW1.interfaccia.Luminosità;

public class Immagine implements Luminosità{
	public String titolo;
	public int luminosità;
	
	public Immagine(String titolo, int luminosità) {
		this.titolo = titolo;
		this.luminosità = luminosità;
	}

	public int AumentaLuminosità() {
		return luminosità ++;
	}
	
	public int DiminuisciLuminostià() {
		return luminosità --;
	}
	public void show() {
		for (int i = 0; i < this.luminosità; i++) {
			System.out.print(this.titolo);
			for (int x = 0; x < this.luminosità; x++) {
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}
