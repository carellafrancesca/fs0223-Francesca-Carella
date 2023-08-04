package com.Gestione_Dispositivi.security.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Gestione_Dispositivi.security.entity.Dispositivi;
import com.Gestione_Dispositivi.security.entity.Laptop;
import com.Gestione_Dispositivi.security.entity.Smartphone;
import com.Gestione_Dispositivi.security.entity.Stato;
import com.Gestione_Dispositivi.security.entity.Tablet;
import com.Gestione_Dispositivi.security.entity.User;
import com.Gestione_Dispositivi.security.repository.DispositivoRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DispositivoService {

	Logger log = LoggerFactory.getLogger(DispositivoService.class);
	
	@Autowired DispositivoRepository dispositivoRep;
	@Autowired @Qualifier("smartphoneBean") private ObjectProvider<Smartphone> smartphoneProvider;
	@Autowired @Qualifier("tabletBean") private ObjectProvider<Tablet> tabletProvider;
	@Autowired @Qualifier("laptopBean") private ObjectProvider<Laptop> laptopProvider;

	//CREARE E SALVARE UN DISPOSITIVO
	public Dispositivi createDispositivo(Dispositivi disp) {
	    if (disp instanceof Smartphone) {
	        Smartphone s = smartphoneProvider.getObject();
	        dispositivoRep.save(s);
	        return s;
	    } else if (disp instanceof Tablet) {
	        Tablet t = tabletProvider.getObject();
	        dispositivoRep.save(t);
	        return t;
	    } else if (disp instanceof Laptop) {
	    	Laptop lp = laptopProvider.getObject();
	        dispositivoRep.save(lp);
	        return lp;
	    } else {
	        log.error("Dispositivo non esistente.");
	        return null;
	    }
	}
	
	// MODIFICARE UN DISPOSITIVO ASSEGNANDOGLI UN UTENTE E MODIFICANDONE LO STATO
	public void updateDispositivo(long id, User utente, Stato stato) {
		Dispositivi d = findDispositivoById(id);
		d.setUtente(utente);
		d.setStato(stato);
		dispositivoRep.save(d);
	}
	
	// MODIFICARE UN DISPOSITIVO RIMUOVENDOGLI L'UTENTE ASSEGNATO
	// E FACENDO TORNARE LO STATO A DISPONIBILE
	public void removeUpdateDispositivo(long id) {
	    Dispositivi d = findDispositivoById(id);
	    d.setUtente(null);
	    d.setStato(Stato.DISPONIBILE);
	    dispositivoRep.save(d);
	}

	// TROVARE LA LISTA CON TUTTI I DISPOSITIVI
    public List<Dispositivi> findAllDispositivi() {
        return (List<Dispositivi>)dispositivoRep.findAll();
    }
    
    // TROVARE UN DISPOSITIVO TRAMITE L'ID
    public Dispositivi findDispositivoById(long id) {
    	if(!dispositivoRep.existsById(id)) {
			throw new EntityNotFoundException("Il dispositivo non esiste");
		}
		return dispositivoRep.findById(id).get();
    }
    
    // TROVARE UN DISPOSITIVO DALLO STATO
    public List<Dispositivi> findDispositiviByStato(Stato stato) {
        return dispositivoRep.findByStato(stato);
    }
    
    // ELIMINARE UN DISPOSITIVO DALL'ID
    public String deleteDispositivoById(long id) {
    	if (dispositivoRep.existsById(id)) {
            Dispositivi d = findDispositivoById(id);
            dispositivoRep.delete(d);
            return "Dispositivo eliminato";
        } else {
            return "Non ci sono dispositivi con questo ID";
        }
    }
    
}
