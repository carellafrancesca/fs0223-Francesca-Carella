package com.Classi;

public enum TipologieAbbonamento {
	MENSILE(50.00),
	SEMESTRALE(100.00),
	ANNUALE(170.00);
	
	private double prezzo;
	
	TipologieAbbonamento(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getPrezzo() {
		return prezzo;
	}

}
