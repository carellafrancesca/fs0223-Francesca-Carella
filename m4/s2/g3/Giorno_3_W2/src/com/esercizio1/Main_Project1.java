package com.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main_Project1 {
	
	private static Logger log = LoggerFactory.getLogger(Main_Project1.class);

	public static void main(String[] args) throws InterruptedException{
		
		ThreadElement t1 = new ThreadElement("Elemento 1: *");
		ThreadElement t2 = new ThreadElement("Elemento 2: #");

		t1.start();
		t2.start();
		
	}

}
