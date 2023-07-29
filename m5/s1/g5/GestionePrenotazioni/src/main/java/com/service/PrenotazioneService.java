package com.service;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Classi.Postazione;
import com.Classi.Prenotazione;
import com.Classi.Utente;
import com.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {

	Logger log = LoggerFactory.getLogger(PrenotazioneService.class);
	
    @Autowired PrenotazioneRepository prenotazioneRepository;
    @Autowired @Qualifier("prenotazione") private ObjectProvider<Prenotazione> prenotazioneProvider;
	
	public Prenotazione createPrenotazione(LocalDate data, Utente user, Postazione postazione){
        Prenotazione pr = prenotazioneProvider.getObject();
        pr.setData(data);
        pr.setUser(user);
        pr.setPostazione(postazione);
        
        System.out.println(pr);
        prenotazioneRepository.save(pr);
        log.info("Prenotazione" + pr.getId()+ " saved. ");
        return pr;
    }

    public List<Prenotazione> findAllPrenotazioni() {
        return (List<Prenotazione>) prenotazioneRepository.findAll();
    }
    
    public Prenotazione findPrenotazioneById(Long id) {
    	System.out.println("Prenotazione trovata!");
    	return prenotazioneRepository.findById(id).get();
    }
    
    public void deletePrenotazioneById(Long id) {
    	System.out.println("Prenotazione eliminata dal database!");
        prenotazioneRepository.deleteById(id);
    }

    public Prenotazione prenotaPostazione(LocalDate data, Utente user, Postazione postazione) {
        List<Prenotazione> prenotazioni = prenotazioneRepository.findByDataAndPostazioneAndUser(data, postazione, user);
        if (!prenotazioni.isEmpty()) {
            System.out.println("Errore: La postazione è già occupata per la data selezionata o l'utente ha già una prenotazione per questa data.");
            return null;
        }

        postazione.setOccupato(true);
        return createPrenotazione(data, user, postazione);
    } //Non funziona

}
