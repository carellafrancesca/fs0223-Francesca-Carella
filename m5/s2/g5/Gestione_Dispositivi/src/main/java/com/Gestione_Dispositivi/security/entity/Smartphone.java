package com.Gestione_Dispositivi.security.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Smartphone")
public class Smartphone extends Dispositivi{

	public Smartphone() {
		this.setStato(Stato.DISPONIBILE);
	}
	
}
