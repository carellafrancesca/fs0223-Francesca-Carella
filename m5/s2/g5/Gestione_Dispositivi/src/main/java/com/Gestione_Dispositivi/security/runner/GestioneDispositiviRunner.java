package com.Gestione_Dispositivi.security.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.Gestione_Dispositivi.security.entity.Dispositivi;
import com.Gestione_Dispositivi.security.entity.Laptop;
import com.Gestione_Dispositivi.security.entity.Smartphone;
import com.Gestione_Dispositivi.security.entity.Stato;
import com.Gestione_Dispositivi.security.entity.Tablet;
import com.Gestione_Dispositivi.security.entity.User;
import com.Gestione_Dispositivi.security.service.DispositivoService;
import com.Gestione_Dispositivi.security.service.UserService;

@Component
public class GestioneDispositiviRunner implements ApplicationRunner{

	@Autowired DispositivoService disps;
	@Autowired UserService ussvc;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Runner...");
		
	  // CREAZIONE E SALVATAGGIO DEI DISPOSITIVI
      //disps.createDispositivo(new Smartphone());
      //disps.createDispositivo(new Tablet());
      //disps.createDispositivo(new Laptop());
      //disps.createDispositivo(new Smartphone());
      //disps.createDispositivo(new Tablet());
      //disps.createDispositivo(new Laptop());

	  // TROVARE UN UTENTE DALL'ID
      User u1 = ussvc.findUserbyId(1);
      System.out.println(u1);
      
      User u2 = ussvc.findUserbyId(2);
      System.out.println(u2);
      
      User u3 = ussvc.findUserbyId(3);
      System.out.println(u3);
      
      User u4 = ussvc.findUserbyId(4);
      System.out.println(u4);

      // TROVARE UN DISPOSITIVO DALL'ID
      //Dispositivi d1 = disps.findDispositivoById(4);
      //System.out.println(d1);
      
      // TROVARE I DISPOSITIVI DISPONIBILI
      //List<Dispositivi> dispositiviDisponibili = disps.findDispositiviByStato(Stato.DISPONIBILE);
      //dispositiviDisponibili.forEach(d -> System.out.println("Dispositivi disponibili " + d));

      // LISTA DI TUTTI GLI UTENTI
      //List<User> listaUtenti = ussvc.findAllUsers();
      //listaUtenti.forEach(u -> System.out.println(u));
      
      // LISTA DI TUTTI I DISPOSITIVI
      //List<Dispositivi> listaDispositivi = disps.findAllDispositivi();
      //listaDispositivi.forEach(d -> System.out.println(d));
      		
      // CAMBIARE LA CONDIZIONE DELLO STATO DI UN DISPOSITIVO
      disps.updateDispositivo(1, u1, Stato.ASSEGNATO);
      disps.updateDispositivo(2, u2, Stato.IN_MANUTENZIONE);
      disps.updateDispositivo(3, u3, Stato.ASSEGNATO);
      
      // MODIFICARE UN DISPOSITIVO RIMUOVENDOGLI L'UTENTE ASSEGNATO
  	  // E FACENDO TORNARE LO STATO A DISPONIBILE
      //disps.updateDispositivo(4, u4, Stato.ASSEGNATO);
      //disps.removeUpdateDispositivo(4);
      
      // CANCELLARE UN ELEMENTO ED UN UTENTE TRAMITE L'ID DAL DATABASE
      //String risultatoCancellato = disps.deleteDispositivoById(6); // ELEMENTO ELIMINATO
      //System.out.println(risultatoCancellato);

      //String risultatoCancellato = ussvc.deleteUtenteById(6); // UTENTE ELIMINATO
      //System.out.println(risultatoCancellato);
      
	}

}
