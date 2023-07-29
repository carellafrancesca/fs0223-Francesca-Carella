package com.service;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Classi.Edificio;
import com.Classi.Postazione;
import com.Classi.Prenotazione;
import com.Classi.TipoPostazione;
import com.repository.PostazioneRepository;
import com.repository.PrenotazioneRepository;

@Service
public class PostazioneService {

	Logger log = LoggerFactory.getLogger(PostazioneService.class);
	
    @Autowired PostazioneRepository postazioneRepository;
    @Autowired PrenotazioneRepository prenotazioneRepository;
    @Autowired @Qualifier("postazione") private ObjectProvider<Postazione> postazioneProvider;
    
    public Postazione createPostazione(String descrizione, TipoPostazione tipo, Integer maxOccupanti, Edificio edificio) {
    	Postazione post = postazioneProvider.getObject();
        post.setDescrizione(descrizione);
        post.setTipo(tipo);
        post.setMaxOccupanti(maxOccupanti);
        //post.setOccupato(true);
        post.setEdificio(edificio);
        postazioneRepository.save(post);
        log.info("Postazione" + post.getId() + " saved.");
        return post;
    }

    public List<Postazione> findAllPostazioni() {
        return (List<Postazione>) postazioneRepository.findAll();
    }
    
    public Postazione findPostazioneById(Long id) {
    	System.out.println("Postazione trovata!");
    	return postazioneRepository.findById(id).get();
    }

    public void deletePostazioneById(Long id) {
    	System.out.println("Postazione eliminata dal database!");
        postazioneRepository.deleteById(id);
    }

    public List<Postazione> findPostazioniByTipoDataDisponibili(TipoPostazione tipo, LocalDate data) {
        List<Postazione> postazioni = postazioneRepository.findByTipo(tipo);
        List<Prenotazione> prenotazioniForDate = prenotazioneRepository.findByData(data);

        for (Prenotazione prenotazione : prenotazioniForDate) {
            postazioni.remove(prenotazione.getPostazione());
        }

        return postazioni;
    } //Non funziona
}
