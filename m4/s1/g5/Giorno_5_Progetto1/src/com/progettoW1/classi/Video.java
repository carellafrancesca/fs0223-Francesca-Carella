package com.progettoW1.classi;

import com.progettoW1.Elemento_Multimediale;
import com.progettoW1.interfaccia.Luminosità;
import com.progettoW1.interfaccia.Volume;

public class Video extends Elemento_Multimediale implements Volume, Luminosità{
	
	public int luminosità;

	public Video(String titolo, int durata, int volume, int luminosità) {
		super(titolo, durata, volume);
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
		this.luminosità = luminosità;
	}

	public int AlzaVolume() {
		return volume ++;
	}
	
	public int AbbassaVolume() {
		return volume --;
	}
	
	public int AumentaLuminosità() {
		return luminosità ++;
	}
		
	public int DiminuisciLuminostià() {
		return luminosità --;
	}
	
	@Override
	public void play() {
		for (int i = 0; i < this.durata; i++) {
			System.out.print(this.titolo);
		for (int x = 0; x < this.volume; x++) {
				System.out.print("!");
			}
		System.out.println();	
		}
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
