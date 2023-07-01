package com.progettoW1.classi;

import com.progettoW1.Elemento_Multimediale;
import com.progettoW1.interfaccia.Volume;

public class Audio extends Elemento_Multimediale implements Volume{

	public Audio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
	}
	
	public int AlzaVolume() {
		return volume ++;
	}
	
	public int AbbassaVolume() {
		return volume --;
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
}
