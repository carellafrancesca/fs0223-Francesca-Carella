package com.Gestione_Dispositivi.security.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gestione_Dispositivi.security.entity.Dispositivi;
import com.Gestione_Dispositivi.security.entity.User;
import com.Gestione_Dispositivi.security.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	Logger log = LoggerFactory.getLogger(DispositivoService.class);
	
	@Autowired UserRepository userRepo;
	
	// TROVARE UN UTENTE TRAMITE L'ID
	public User findUserbyId(long id) {
		User user = userRepo.findById(id).get();
		log.info(user.toString());
		return user;
	}
	
	// TROVARE LA LISTA CON TUTTI GLI UTENTI
	public List<User> findAllUsers(){
        List<User> listaUtenti= (List<User>)userRepo.findAll();
        listaUtenti.forEach(lu -> log.info(lu.toString()));
        return listaUtenti;
    }
	
	// ELIMINARE UN UTENTE TRAMITE L'ID
	public String deleteUtenteById(long id) {
		if (userRepo.existsById(id)) {
            User user = findUserbyId(id);
            userRepo.delete(user);
            return "Utente eliminato";
        } else {
            return "Non ci sono utenti con questo ID";
        }
    }
	
}
