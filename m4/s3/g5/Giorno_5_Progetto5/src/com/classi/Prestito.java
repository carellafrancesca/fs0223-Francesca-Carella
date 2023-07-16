package com.classi;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prestito {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne
	private Utente utente;
	
	@ManyToOne
	private Catalogo_Bibliotecario elementoPrestato;
	
	private LocalDate inizioPrestito;
	private LocalDate restituizionePrevista;
	private LocalDate restituzioneEffettiva;
	
	public Prestito() {
		super();
	}

	public Prestito(Utente utente, Catalogo_Bibliotecario elementoPrestato, LocalDate inizioPrestito,
			LocalDate restituizionePrevista, LocalDate restituzioneEffettiva) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.inizioPrestito = inizioPrestito;
		this.restituizionePrevista = restituizionePrevista;
		this.restituzioneEffettiva = restituzioneEffettiva;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Catalogo_Bibliotecario getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(Catalogo_Bibliotecario elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}

	public LocalDate getInizioPrestito() {
		return inizioPrestito;
	}

	public void setInizioPrestito(LocalDate inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
	}

	public LocalDate getRestituizionePrevista() {
		return restituizionePrevista;
	}

	public void setRestituizionePrevista(LocalDate restituizionePrevista) {
		this.restituizionePrevista = restituizionePrevista;
	}

	public LocalDate getRestituzioneEffettiva() {
		return restituzioneEffettiva;
	}

	public void setRestituzioneEffettiva(LocalDate restituzioneEffettiva) {
		this.restituzioneEffettiva = restituzioneEffettiva;
	}

	@Override
	public String toString() {
		return "Prestito [id=" + id 
				+ ", utente=" + utente 
				+ ", elementoPrestato=" + elementoPrestato
				+ ", inizioPrestito=" + inizioPrestito 
				+ ", restituizionePrevista=" + restituizionePrevista
				+ ", restituzioneEffettiva=" + restituzioneEffettiva + "]";
	}
	
}
