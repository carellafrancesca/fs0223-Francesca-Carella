package com.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Service.AbbonamentoService;
import com.Service.AbbonatoService;

@Component
public class AbbPalestraRunner implements CommandLineRunner{

	@Autowired AbbonatoService abbs;
	@Autowired AbbonamentoService abts;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Palestra...");
		
	}

}
