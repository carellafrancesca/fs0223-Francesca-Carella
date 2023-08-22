package com.SpringController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringModel.Utente;

@RestController
@RequestMapping("/api/be")
public class MicroservizioProducer {
	
	@GetMapping("/txt")
	public String testText() {
		return "BE String Content";
	}
	
	@GetMapping("/utenti")
	public ResponseEntity<List<Utente>> testUtenti(){
		List<Utente> utenti = new ArrayList <Utente> ();
		utenti.add(new Utente("Mario", "Rossi", "Roma"));
		utenti.add(new Utente("Giuseppe", "Verdi", "Milano"));
		utenti.add(new Utente("Francesca", "Neri", "Napoli"));
		return new ResponseEntity<List<Utente>>(utenti, HttpStatus.OK);
	}
	
}
