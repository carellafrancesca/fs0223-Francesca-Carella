package com.Gestione_Dispositivi.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.Gestione_Dispositivi.security.entity.Laptop;
import com.Gestione_Dispositivi.security.entity.Smartphone;
import com.Gestione_Dispositivi.security.entity.Tablet;

@Configuration
@PropertySource("classpath:application.properties")
public class DispositiviConfig {
	
	@Bean("smartphoneBean")
    @Scope("prototype")
    public Smartphone smartphone() {
        return new Smartphone();
    }
	
	@Bean("tabletBean")
    @Scope("prototype")
    public Tablet tablet() {
        return new Tablet();
    }
	
	@Bean("laptopBean")
    @Scope("prototype")
    public Laptop laptop() {
        return new Laptop();
    }
	
}
