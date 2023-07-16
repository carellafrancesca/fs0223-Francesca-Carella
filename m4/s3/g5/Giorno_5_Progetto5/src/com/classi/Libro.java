package com.classi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Libri")

public class Libro extends Catalogo_Bibliotecario{
	
	private String autore;
	private String genere;
	
	public Libro() {
		super();
	}

	public Libro(String titolo, Integer annoPubblicazione, Integer numeroPagine) {
		super(titolo, annoPubblicazione, numeroPagine);
	}

	public Libro(String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore,
			String genere) {
		super(titolo, annoPubblicazione, numeroPagine);
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
	    return "Libro [ISBN=" + getISBN()
	            + ", titolo=" + getTitolo()
	            + ", annoPubblicazione=" + getAnnoPubblicazione()
	            + ", numeroPagine=" + getNumeroPagine()
	            + ", autore=" + autore
	            + ", genere=" + genere + "]";
	}
	
}
