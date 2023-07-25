package com.classiOrdine;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ordine {

	@Id
	private Long id;
    private Stato_Ordine stato;
    private int coperti;
    private LocalDateTime oraAcquisizione;

	
}
