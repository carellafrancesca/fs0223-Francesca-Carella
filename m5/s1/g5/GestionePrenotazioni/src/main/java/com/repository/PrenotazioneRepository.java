package com.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Classi.Postazione;
import com.Classi.Prenotazione;
import com.Classi.TipoPostazione;
import com.Classi.Utente;

@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long>{
	
	@Query("SELECT pr FROM Prenotazione pr WHERE pr.user.nomeCompleto = :nomeCompleto")
    List<Prenotazione> findByUtente(String nomeCompleto);
	
	@Query("SELECT pr FROM Prenotazione pr WHERE pr.postazione.tipo = :tipo")
	List<Prenotazione> findByTipo(@Param("tipo") String tipo);
	
	List<Prenotazione> findByData(LocalDate data);
	
	List<Prenotazione> findByDataAndPostazioneAndUser(LocalDate data, Postazione postazione, Utente user);
}
