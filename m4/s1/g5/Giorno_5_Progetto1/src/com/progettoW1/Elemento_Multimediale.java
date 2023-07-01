package com.progettoW1;

public abstract class Elemento_Multimediale {
	protected String titolo;
	protected int durata;
	protected int volume;
	
	public Elemento_Multimediale(String titolo, int durata, int volume) {
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
	}
	
	public abstract void play();
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
