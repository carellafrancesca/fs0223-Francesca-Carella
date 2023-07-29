package com.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Classi.Edificio;
import com.repository.EdificioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class EdificioService {
	
	Logger log = LoggerFactory.getLogger(EdificioService.class);
		
	@Autowired EdificioRepository edificioRepository;
	@Autowired @Qualifier("edificio") private ObjectProvider<Edificio> edificioProvider;
	
	public Edificio createEdificio(String nome, String indirizzo, String citta){
        Edificio ed = edificioProvider.getObject();
        ed.setNome(nome);
        ed.setIndirizzo(indirizzo);
        ed.setCitta(citta);
        
        System.out.println(ed);
        edificioRepository.save(ed);
        log.info("Edificio" + ed.getNome()+ " saved. ");
        return ed;
    }

    public List<Edificio> findAllEdifici() {
        return (List<Edificio>) edificioRepository.findAll();
    }
    
    public Edificio findEdificioById(Long id) {
		System.out.println("Edificio trovato!");
    	return edificioRepository.findById(id).get();
    }
    
    public void deleteEdificioById(Long id) {
    	System.out.println("Edificio eliminato dal database!");
    	edificioRepository.deleteById(id);
    }

}
