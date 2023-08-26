package com.Gestione_Incendi.ClassiObserver;

import java.util.Observable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("deprecation")
public class Sonda extends Observable{

	 private int idSonda;
	 private double latitudine;
	 private double longitudine;
	 private int livelloFumo;

	 public Sonda(int idSonda, double latitudine, double longitudine, int livelloFumo) {
	     this.idSonda = idSonda;
	     this.latitudine = latitudine;
	     this.longitudine = longitudine;
	     this.livelloFumo = 0;
	 }
	 
	 public void setLivelloFumo(int livelloFumo) {
	     this.livelloFumo = livelloFumo;
	     if(livelloFumo > 5) {
	    	 inviaAllarme();
	     }
	 }

	private void inviaAllarme() {
		setChanged();
		notifyObservers(this);
	}
	 
	 
	 

}
