package com.Gestione_Dispositivi.security.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Laptop")
public class Laptop extends Dispositivi{

	public Laptop() {
		this.setStato(Stato.DISPONIBILE);
	}
	
}
