package com.Gestione_Dispositivi.security.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Tablet")
public class Tablet extends Dispositivi{

	public Tablet() {
		this.setStato(Stato.DISPONIBILE);
	}
	
}
