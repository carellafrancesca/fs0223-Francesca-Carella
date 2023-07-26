package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.models.Drinks;
import com.models.Gadget;
import com.models.Pizze;
import com.models.Toppers;

@Configuration
public class MenuConfiguration {

    @Bean("pizzeBean")
    @Scope("prototype")
    public Pizze pizze() {
        return new Pizze();
    }

    @Bean("toppersBean")
    @Scope("prototype")
    public Toppers topper() {
        return new Toppers();
    }

    @Bean("drinksBean")
    @Scope("prototype")
    public Drinks drink() {
        return new Drinks();
    }

    @Bean("gadgetBean")
    @Scope("prototype")
    public Gadget gadget() {
        return new Gadget();
    }

}

