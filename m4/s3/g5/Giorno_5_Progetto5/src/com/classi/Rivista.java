package com.classi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("Riviste")

public class Rivista extends Catalogo_Bibliotecario{
		 
	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;

	public Rivista() {
		super();
	}
	
	public Rivista(String titolo, Integer annoPubblicazione, Integer numeroPagine,
			Periodicita periodicita) {
		super(titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
	    return "Rivista [ISBN=" + getISBN()
	            + ", titolo=" + getTitolo()
	            + ", annoPubblicazione=" + getAnnoPubblicazione()
	            + ", numeroPagine=" + getNumeroPagine()
	            + ", periodicita=" + periodicita + "]";
	}		

}
