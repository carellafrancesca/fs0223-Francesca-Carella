package com.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thread1 extends Thread{

	private static Logger log = LoggerFactory.getLogger(Thread1.class);
	
	int[] array;
	int n;
	int x;
	int somma;
	
	public Thread1(int[] array, int n, int x) {
		this.array = array;
		this.n = n;
		this.x = x;
		this.somma = 0;
	}

	public int getSomma() {
		return somma;
	}
	
	@Override
	public void run() {
		for(int i = n; i < x; i++) {
			somma += array[i];
		}
		log.info("Somma = " + somma);
	}
	
	
}
