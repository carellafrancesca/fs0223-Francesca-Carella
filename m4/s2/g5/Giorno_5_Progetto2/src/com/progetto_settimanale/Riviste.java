package com.progetto_settimanale;

public class Riviste extends Elemento_Generale{

	protected Periodicità periodicità;

	public Riviste(String iSBN, String titolo, Integer annoPubblicazione, Integer numeroPagine,
			Periodicità periodicità) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicità = periodicità;
	}

	public Periodicità getPeriodicità() {
		return periodicità;
	}

	public void setPeriodicità(Periodicità periodicità) {
		this.periodicità = periodicità;
	}

	@Override
	public String toString() {
		return "Riviste [periodicità = " + periodicità 
				+ ", ISBN = " + ISBN 
				+ ", titolo = " + titolo 
				+ ", annoPubblicazione = " + annoPubblicazione 
				+ ", numeroPagine = " + numeroPagine + "]";
	}

	
}
