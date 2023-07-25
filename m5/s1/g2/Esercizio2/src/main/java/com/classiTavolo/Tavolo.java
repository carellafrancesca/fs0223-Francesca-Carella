package com.classiTavolo;

public class Tavolo {

	private int numero;
	private int copertiMassimi;
	private Stato stato;
	
	public Tavolo(int numero, int copertiMassimi, Stato stato) {
		super();
		this.numero = numero;
		this.copertiMassimi = copertiMassimi;
		this.stato = stato;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCopertiMassimi() {
		return copertiMassimi;
	}

	public void setCopertiMassimi(int copertiMassimi) {
		this.copertiMassimi = copertiMassimi;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public String info() {
		return "Tavolo [numero=" + numero + ", copertiMassimi=" + copertiMassimi + ", stato=" + stato + "]";
	}
	
}
