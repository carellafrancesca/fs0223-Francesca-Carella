package com.progetto;

public class Rettangolo {
	public int altezza;
	public int base;
	
	public Rettangolo(int altezza, int base) {
		this.altezza = altezza;
		this.base = base;
	}
	
	public int perimetro() {
		return (altezza + base)*2;
	};
	
	public int area() {
		return altezza * base;
	};
}
