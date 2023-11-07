package com.AbbonamentiPalestra.Service;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.AbbonamentiPalestra.Class.Abbonati;
import com.AbbonamentiPalestra.Repository.AbbonatiRepo;

@Service
public class AbbonatiService {

	Logger log = LoggerFactory.getLogger(AbbonatiService.class);
	
	@Autowired AbbonatiRepo abr;
	@Autowired @Qualifier("abbonati") private ObjectProvider<Abbonati> abbonatiProvider;

	
	public Abbonati iscrizione(String nome, String cognome, String email, String numeroTelefono, String cittaDiNascita, LocalDate dataDiNascita) {
		Abbonati ab = abbonatiProvider.getObject();
		ab.setNome(nome);
		ab.setCognome(cognome);
		ab.setEmail(email);
		ab.setNumeroTelefono(numeroTelefono);
		ab.setCittaDiNascita(cittaDiNascita);
		ab.setDataDiNascita(dataDiNascita);
		
		System.out.println(ab);
		abr.save(ab);
		log.info(ab.getNome() + ab.getCognome() + "è iscritto");
		return ab;
		
	}

	public List<Abbonati> findAllAbbonati(){
		System.out.println("Lista di tutti gli abbonati:");
		return (List<Abbonati>) abr.findAll();
	}
	
	public Abbonati findAbbonatiById(Long id) {
		System.out.println("Utente trovato!");
		return abr.findById(id).get();
	}
	
	public void deleteAbbonatoById(Long id) {
		System.out.println("Utente eliminato!");
		abr.deleteById(id);
	}
}
