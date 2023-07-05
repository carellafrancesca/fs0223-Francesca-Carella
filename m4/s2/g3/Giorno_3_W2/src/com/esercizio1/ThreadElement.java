package com.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadElement extends Thread{

	private Logger log = LoggerFactory.getLogger(ThreadElement.class);
	
	private String simbolo;
	
	public ThreadElement(String simbolo) {
		this.simbolo = simbolo;
	}
	
	@Override
	public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(simbolo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            	log.error(e.getMessage());
            }
        }
    }

}
