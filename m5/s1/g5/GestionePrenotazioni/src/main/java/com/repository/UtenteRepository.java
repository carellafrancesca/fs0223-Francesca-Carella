package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Classi.Utente;

@Repository
public interface UtenteRepository extends CrudRepository<Utente, Long>{
	
}
