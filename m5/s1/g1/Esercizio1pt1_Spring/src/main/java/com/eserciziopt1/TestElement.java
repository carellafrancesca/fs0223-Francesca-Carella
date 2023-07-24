package com.eserciziopt1;

public class TestElement {

	private String elemento;

	public TestElement(String elemento) {
		super();
		this.elemento = elemento;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public String info() {
		return "INFO: " + elemento; 
	}
	
	
}
