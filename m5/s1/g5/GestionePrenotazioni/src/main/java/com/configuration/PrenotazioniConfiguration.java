package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.Classi.Edificio;
import com.Classi.Postazione;
import com.Classi.Prenotazione;
import com.Classi.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class PrenotazioniConfiguration {

	@Bean("edificio")
    @Scope("prototype")
    public Edificio edificio() {
        return new Edificio();
    }
	
	@Bean("postazione")
    @Scope("prototype")
    public Postazione postazione() {
        return new Postazione();
    }

	@Bean("prenotazione")
    @Scope("prototype")
    public Prenotazione prenotazione() {
        return new Prenotazione();
    }

	@Bean("utente")
    @Scope("prototype")
    public Utente utente() {
        return new Utente();
    }

	
}
