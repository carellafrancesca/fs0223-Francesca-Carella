package com.Service;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.Classi.Abbonamento;
import com.Classi.Abbonato;
import com.Repository.AbbonatoRepo;

@Service
public class AbbonatoService {

	Logger log = LoggerFactory.getLogger(AbbonatoService.class);
	
	@Autowired AbbonatoRepo abbonatorepo;
	@Autowired @Qualifier("Abbonati") private ObjectProvider<Abbonato> abbonatoProvider;
	
	public Abbonato iscrizione(String nomeIscritto, String cognomeIscritto, String cittaNascita, LocalDate dataNascita) {
		Abbonato ab = abbonatoProvider.getObject();
		ab.setNomeIscritto(nomeIscritto);
		ab.setCognomeIscritto(cognomeIscritto);
		ab.setCittaNascita(cittaNascita);
		ab.setDataNascita(dataNascita);
		
		System.out.println(ab);
		abbonatorepo.save(ab);
		log.info(ab.getNomeIscritto() + ab.getCognomeIscritto() + "si è iscritto con successo");
		return ab;
	}
	
	
}
