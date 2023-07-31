package com.Service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Models.Contatto;
import com.Repository.ContattoRepository;



@Service
public class ContactService {

	@Autowired ContattoRepository contactRepo;
	@Autowired @Qualifier("fakeContactBean") private ObjectProvider<Contatto> contactProvider;

	public void createFakeContact() {
		Contatto c = contactProvider.getObject();
		contactRepo.save(c);
	}
	
	public List<Contatto> getAllContacts() {
		return (List<Contatto>) contactRepo.findAll();
	}
}
