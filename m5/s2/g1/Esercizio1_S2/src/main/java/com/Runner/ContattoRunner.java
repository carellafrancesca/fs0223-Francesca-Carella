package com.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.Service.ContactService;

@Component
public class ContattoRunner implements ApplicationRunner{

	@Autowired ContactService contactService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ContactRunner...");
		
		for (int i = 0; i < 10; i++) {
			contactService.createFakeContact();
		}
		
	}
	
}
