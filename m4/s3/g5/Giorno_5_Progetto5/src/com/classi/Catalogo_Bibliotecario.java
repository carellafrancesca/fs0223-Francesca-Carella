package com.classi;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.DiscriminatorType;

@Entity
@Table(name = "Catalogo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Elementi", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name = "searchByYear", query = "SELECT e FROM Catalogo_Bibliotecario e WHERE e.annoPubblicazione = :anno")
@NamedQuery(name = "searchByAuthor", query = "SELECT e FROM Catalogo_Bibliotecario e WHERE e.autore LIKE :autore")
@NamedQuery(name = "searchByTitle", query = "SELECT e FROM Catalogo_Bibliotecario e WHERE e.titolo LIKE :titolo")

public class Catalogo_Bibliotecario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long ISBN;
	
	private String titolo;
	private Integer annoPubblicazione;
	private Integer numeroPagine;
	
	
	public Catalogo_Bibliotecario() {
		super();
	}
	
	public Catalogo_Bibliotecario(String titolo, Integer annoPubblicazione, Integer numeroPagine) {
		super();
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}
	
	public Long getISBN() {
		return ISBN;
	}

	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "Catalogo_Bibliotecario [ISBN=" + ISBN 
				+ ", titolo=" + titolo 
				+ ", annoPubblicazione=" + annoPubblicazione 
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	
}
