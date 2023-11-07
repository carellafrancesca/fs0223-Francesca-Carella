package com.AbbonamentiPalestra.Configurazione;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.AbbonamentiPalestra.Class.Abbonamenti;
import com.AbbonamentiPalestra.Class.Abbonati;

@Configuration
@PropertySource("classpath:application.properties")
public class AbbPalestraConfig {

	@Bean("abbonati")
    @Scope("prototype")
    public Abbonati abbonati() {
        return new Abbonati();
    }
	
	@Bean("abbonamenti")
    @Scope("prototype")
    public Abbonamenti abbonamenti() {
        return new Abbonamenti();
    }
	
}
