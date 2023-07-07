package com.progetto_settimanale;

public class Libri extends Elemento_Generale{

	protected String autore;
	protected String genere;
	
	public Libri(String iSBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore,
			String genere) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libri [autore = " + autore 
				+ ", genere = " + genere + ", "
				+ "ISBN = " + ISBN 
				+ ", titolo = " + titolo
				+ ", annoPubblicazione = " + annoPubblicazione 
				+ ", numeroPagine = " + numeroPagine + "]";
	}
	
	
}
