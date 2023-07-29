package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Classi.Postazione;
import com.Classi.TipoPostazione;

@Repository
public interface PostazioneRepository extends CrudRepository<Postazione, Long>{
	 List<Postazione> findByTipo(TipoPostazione tipo); 
	 
	 @Query("SELECT p FROM Postazione p WHERE p.edificio.citta = :citta")
	 List<Postazione> findByCitta(String citta);
	 
}
