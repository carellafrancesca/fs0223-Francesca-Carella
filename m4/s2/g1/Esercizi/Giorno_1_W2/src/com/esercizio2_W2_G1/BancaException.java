package com.esercizio2_W2_G1;

public class BancaException extends Exception {

	public BancaException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return this.getMessage();
	}

}