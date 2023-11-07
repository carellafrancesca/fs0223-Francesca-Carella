package com.AbbonamentiPalestra.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.AbbonamentiPalestra.Service.AbbonamentiService;
import com.AbbonamentiPalestra.Service.AbbonatiService;

@Component
public class AbbPalestraRunner implements CommandLineRunner{

	@Autowired AbbonamentiService abts;
	@Autowired AbbonatiService abs;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Gestione Abbonamenti Runner...");
	}

}
