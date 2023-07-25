package com.elementiPrincipali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Menu_Application {

	public static void main(String[] args) {
		SpringApplication.run(Menu_Application.class, args);
	
		Gestione_Menu menu = new Gestione_Menu();
		menu.stampaMenu();
	}

}
