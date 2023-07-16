package com.classi;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private Integer nTessera;
	
	public Utente() {
		super();
	}

	public Utente(Integer nTessera, String nome, String cognome, LocalDate dataNascita) {
		super();
		this.nTessera = nTessera;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
	}

	public Integer getnTessera() {
		return nTessera;
	}

	public void setnTessera(Integer nTessera) {
		this.nTessera = nTessera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id 
				+ ", nome=" + nome 
				+ ", cognome=" + cognome 
				+ ", dataNascita=" + dataNascita
				+ ", nTessera=" + nTessera + "]";
	}
	
	
}
