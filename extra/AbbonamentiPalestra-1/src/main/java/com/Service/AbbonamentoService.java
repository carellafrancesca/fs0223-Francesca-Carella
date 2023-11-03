package com.Service;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Classi.Abbonamento;
import com.Classi.Abbonato;
import com.Classi.TipologieAbbonamento;
import com.Repository.AbbonamentoRepo;

@Service
public class AbbonamentoService {

	Logger log = LoggerFactory.getLogger(AbbonamentoService.class);
	
	@Autowired AbbonamentoRepo abbonamentorepo;
	@Autowired @Qualifier("Abbonamenti") private ObjectProvider<Abbonamento> abbonamentoProvider;
	
	public Abbonamento creazioneAbbonamento( LocalDate rilascioAbbonamento, LocalDate dataScadenza, TipologieAbbonamento tipo, Abbonato abbonato ) {
		Abbonamento abt = abbonamentoProvider.getObject();
		abt.setRilascioAbbonamento(rilascioAbbonamento);
		abt.setDataScadenza(dataScadenza);
		abt.setTipo(tipo);
		abt.setAbbonato(abbonato);
		
		System.out.println(abt);
		abbonamentorepo.save(abt);
		log.info("Abbonamento Rilasciato!");
		return abt;
	}
	
}
