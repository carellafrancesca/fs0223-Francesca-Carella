package com.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Classi.Edificio;
import com.Classi.Postazione;
import com.Classi.Prenotazione;
import com.Classi.TipoPostazione;
import com.Classi.Utente;
import com.service.EdificioService;
import com.service.PostazioneService;
import com.service.PrenotazioneService;
import com.service.UtenteService;

@Component
public class PrenotazioniRunner implements CommandLineRunner{

	@Autowired EdificioService edsc;
	@Autowired PostazioneService ps;
	@Autowired UtenteService us;
	@Autowired PrenotazioneService prs;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Gestione Prenotazione Runner... ");

		// Salvataggio nel db
		
		//Edifici
		Edificio e1 = edsc.createEdificio("Edificio 1", "Via Roma", "Milano");
		Edificio e2 = edsc.createEdificio("Edificio 2", "Via Milano", "Roma");
		
		//Postazioni
		Postazione p1 = ps.createPostazione("Postazione 1", TipoPostazione.PRIVATO, 1, e1);
		Postazione p2 = ps.createPostazione("Postazione 2", TipoPostazione.SALARIUNIONI, 10, e2);
		Postazione p3 = ps.createPostazione("Postazione 3", TipoPostazione.OPENSPACE, 20, e1);
		
		//Utenti
		Utente u1 = us.createUtente("giuseppe_v","Giuseppe Verdi","g.verdi@example.com");
		Utente u2 = us.createUtente("mario_r","Mario Rossi","mario.rossi@example.com");
		Utente u3 = us.createUtente("f_neri","Francesca Neri","francescaneri@example.com");
		Utente u4 = us.createUtente("sara-rosa","Sara Rosa","sara_rosa@example.com");
		
		//Prenotazioni
		Prenotazione pr1 = prs.createPrenotazione(LocalDate.of(2023, 7, 29), u1, p1);
		Prenotazione pr2 = prs.createPrenotazione(LocalDate.of(2023, 7, 30), u2, p2);
		Prenotazione pr3 = prs.createPrenotazione(LocalDate.of(2023, 7, 25), u3, p3);
		
		// Per leggere tutti gli elementi dalle varie liste
		//List<Edificio> listaEdifici = edsc.findAllEdifici();
		//listaEdifici.forEach(e -> System.out.println(e));
		
		//List<Postazione> listaPostazioni = ps.findAllPostazioni();
		//listaPostazioni.forEach(p -> System.out.println(p));
		
		List<Utente> listaUtenti = us.findAllUtenti();
		listaUtenti.forEach(u -> System.out.println(u));
		
		//List<Prenotazione> listaPrenotazioni = prs.findAllPrenotazioni();
		//listaPrenotazioni.forEach(pr -> System.out.println(pr));
		
		// Per eliminare un utente nel db
		//us.deleteUtenteById((long) 4);
		
		// Per trovare un elemento dall'id
		//edsc.findEdificioById((long) 1);

	}	
	
}
