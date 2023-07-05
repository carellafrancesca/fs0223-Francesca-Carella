package com.esercizio2;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main_Project2 {

	private static Logger log = LoggerFactory.getLogger(Main_Project2.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		int[] array = generaArray();
		int[] array2 = new int[3];
		
		Thread1 t1 = new Thread1(array, 0, 1000);
		Thread1 t2 = new Thread1(array, 1001, 2000);
		Thread1 t3 = new Thread1(array, 2001, 3000);
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
		array2[0] = t1.getSomma();
		array2[1] = t2.getSomma();
		array2[2] = t3.getSomma();
		
		sommaArray(array2);

	}
	
	public static int[] generaArray(){
		int[] array = new int[3000];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(101);
		}
		return array;
	}
	
	public static int sommaArray(int[]array) {
		int somma = 0;
		for (int i = 0; i < array.length; i++) {
			somma += array[i];
		}
		log.info("Somma:" + somma);
		return somma;
	}

}
