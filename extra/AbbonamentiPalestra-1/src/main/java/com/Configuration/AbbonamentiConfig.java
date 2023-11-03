package com.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.Classi.Abbonamento;
import com.Classi.Abbonato;

@Configuration
@PropertySource("classpath:application.properties")
public class AbbonamentiConfig {

	@Bean("Abbonati")
    @Scope("prototype")
    public Abbonato abbonati() {
        return new Abbonato();
    }
	
	@Bean("Abbonamenti")
    @Scope("prototype")
    public Abbonamento abbonamenti() {
        return new Abbonamento();
    }
}
