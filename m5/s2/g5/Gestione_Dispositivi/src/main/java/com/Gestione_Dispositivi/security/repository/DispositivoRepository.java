package com.Gestione_Dispositivi.security.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.Gestione_Dispositivi.security.entity.Dispositivi;
import com.Gestione_Dispositivi.security.entity.Stato;

public interface DispositivoRepository extends CrudRepository<Dispositivi, Long>{

	List<Dispositivi> findByStato(Stato stato);
	
}
