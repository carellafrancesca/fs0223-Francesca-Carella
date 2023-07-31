package com.Configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.Models.Contatto;
import com.github.javafaker.Faker;

@Configuration
public class ContactConfiguration {

	@Bean("contactBean")
    @Scope("prototype")
    public Contatto contatto() {
        return new Contatto();
    }
	
	@Bean("fakeContactBean")
	@Scope("prototype")
	public Contatto fakeContact() {
		Faker faker = new Faker(new Locale("it-IT"));
		Contatto c = new Contatto();
		String name = faker.name().firstName();
		String lastname = faker.name().lastName();
		c.setName(name);
		c.setLastname(lastname);
		c.setCity(faker.address().cityName());
		c.setAge(faker.number().numberBetween(18, 80));
		c.setEmail(name.toLowerCase()+"."+lastname.toLowerCase()+"@example.com");
		c.setPassword(faker.internet().password());
		return c;
	}

	
}
