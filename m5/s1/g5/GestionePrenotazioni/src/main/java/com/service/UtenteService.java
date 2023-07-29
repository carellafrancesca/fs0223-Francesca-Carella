package com.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Classi.Utente;
import com.repository.UtenteRepository;

@Service
public class UtenteService {

	Logger log = LoggerFactory.getLogger(UtenteService.class);
	
	@Autowired UtenteRepository utenteRepository;
    @Autowired @Qualifier("utente") private ObjectProvider<Utente> utenteProvider;
	
    public Utente createUtente(String username, String nomeCompleto, String email) {
    	Utente user = utenteProvider.getObject();
        user.setUsername(username);
        user.setNomeCompleto(nomeCompleto);
        user.setEmail(email);

        utenteRepository.save(user);
        log.info("Utente" + user.getNomeCompleto() + " saved.");
        return user;
    }
    
	public List<Utente> findAllUtenti() {
        return (List<Utente>) utenteRepository.findAll();
    }
    
    public Utente findUtenteById(Long id) {
    	System.out.println("Utente trovato!");
    	return utenteRepository.findById(id).get();	
    }

    public void deleteUtenteById(Long id) {
    	System.out.println("Utente eliminato dal database!");
        utenteRepository.deleteById(id);
    }

}
