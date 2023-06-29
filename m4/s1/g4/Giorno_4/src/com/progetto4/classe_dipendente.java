package com.progetto4;

import com.progetto4.Livello;
import com.progetto4.Dipartimento;

public class classe_dipendente {

	private double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	
	public classe_dipendente(double stipendioBase, String matricola, double stipendio,
			double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
		this.stipendioBase = stipendioBase;
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}


	public classe_dipendente(String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}


	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}


	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}


	public Dipartimento getDipartimento() {
		return dipartimento;
	}


	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}


	public double getStipendioBase() {
		return stipendioBase;
	}


	public String getMatricola() {
		return matricola;
	}


	public double getStipendio() {
		return stipendio;
	}


	public Livello getLivello() {
		return livello;
	}

	public void stampaDatiDipendente() {
		System.out.println(
				this.matricola + " " +"Numero della matricola" + " " +
				this.stipendioBase + " " + " " +
				this.importoOrarioStraordinario + " " + " " +
				this.stipendio + " " + " " +
				this.dipartimento + " " + " " +
				this.livello);
	}
	
	public void Promuovi() {
		switch(this.livello) {
		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			this.stipendio = stipendioBase * 1.2;
			System.out.print("Sei stato promosso a:" + " " + this.livello + " €");
			break;
			
		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			this.stipendio = stipendioBase * 1.5;
			System.out.print("Sei stato promosso a:"  + " " +  this.livello + " €");
			break;
			
		case QUADRO:
			this.livello = Livello.DIRIGENTE;
			this.stipendio = stipendioBase * 2;
			System.out.print("Sei stato promosso a:"  + " " +  this.livello + " €");
			break;
			
		case DIRIGENTE:
			System.out.println("ERRORE");
			break;
		}
		
	}		
		
	public static double calcolaPaga (classe_dipendente d) {
		return d.stipendio;
	}
	
	public static double calcolaPaga (classe_dipendente d, int n) {
		return d.stipendio + n*d.importoOrarioStraordinario;
	}
}

