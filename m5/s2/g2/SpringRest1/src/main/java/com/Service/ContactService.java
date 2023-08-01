package com.Service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Models.Contact;
import com.Repository.ContactRepository;

@Service
public class ContactService {

	@Autowired ContactRepository contactRepo;
	@Autowired @Qualifier("fakeContactBean") private ObjectProvider<Contact> contactProvider;
	
	//Creare il contattoFake
	public void createFakeContact() {
		Contact c = contactProvider.getObject();
		contactRepo.save(c);
	}
	
	//Trovare tutti i contatti
	public List<Contact> getAllContacts() {
		return (List<Contact>) contactRepo.findAll();
	}
	
	//Trovare un contatto specifico secondo l'id
	public Contact getContactsByID(Long id) {
		return contactRepo.findById(id).get();
	}
	
	//Creare il contatto
	public Contact createContact(Contact contact) {
		return  contactRepo.save(contact);
	}
	
	//Modificare il contatto, partendo dall'id
	public Contact updateContact(Long id, Contact contact) throws Exception {
		Contact c = getContactsByID(id);
		if(c.getId() == contact.getId()) { //controlla se l'ID del contatto che si vuole modificare corrisponde all'ID del contatto trovato nel database
			return  contactRepo.save(contact);
		}
		throw new Exception("Id and contact do not match");
	}
	
	/*questo metodo verifica se l'ID del contatto da aggiornare corrisponde a un contatto esistente nel database
	 * e la corrispondenza viene trovata, il contatto viene aggiornato nel database
	 * in caso contrario, viene lanciata un'eccezione per indicare che l'aggiornamento non è possibile.*/
	
	//Rimuovere il contatto dall'id
	public String removeContactByID(Long id) {
		Contact c = getContactsByID(id);
		contactRepo.delete(c);
		return "Contact deleted!!!";
	}
	
}
