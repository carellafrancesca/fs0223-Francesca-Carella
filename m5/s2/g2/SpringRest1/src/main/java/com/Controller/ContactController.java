package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Models.Contact;
import com.Service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

	@Autowired ContactService contactService;
	
	@GetMapping
	public ResponseEntity<List<Contact>> getAll() {
		List<Contact> listaContatti = contactService.getAllContacts();
		ResponseEntity<List<Contact>> resp = new ResponseEntity<List<Contact>>(listaContatti, HttpStatus.OK);
		/* Viene creato un oggetto ResponseEntity che incapsula la lista di contatti ottenuta nella riga precedente 
		 * listaContatti è l'oggetto che contiene tutti i contatti 
		 * HttpStatus.OK indica che la richiesta HTTP è stata elaborata con successo.*/
		return resp;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getByID(@PathVariable Long id) {
		try {
			Contact c = contactService.getContactsByID(id);
			return new ResponseEntity<Contact>(c, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	/*questo metodo gestisce una richiesta per ottenere un contatto tramite il suo ID
	 *se il contatto viene trovato, viene restituito con il codice di stato HTTP 200
	 *se il contatto non viene trovato o si verifica un errore, viene restituito un messaggio di errore con il codice di stato HTTP 404
	 */
	
	@PostMapping
	public ResponseEntity<?> createContact(@RequestBody Contact contact) {
		try {
			Contact c = contactService.createContact(contact);
			return new ResponseEntity<Contact>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	 /*questo metodo gestisce una richiesta per creare un nuovo contatto
	 se il contatto viene creato con successo, viene restituito con il codice di stato HTTP 201
	 se si verifica un errore durante la creazione del contatto, viene restituito un messaggio di errore con il codice di stato HTTP 404.
	*/
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateContact(@PathVariable Long id, @RequestBody Contact contact) {
		try {
			Contact c = contactService.updateContact(id, contact);
			return new ResponseEntity<Contact>(c, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	//questo metodo gestisce una richiesta per aggiornare un contatto esistente tramite il suo ID. Se il contatto viene aggiornato con successo, viene restituito con il codice di stato HTTP 200 
	//se il contatto non esiste o si verifica un errore durante l'aggiornamento, viene restituito un messaggio di errore con il codice di stato HTTP 404.
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> removeContact(@PathVariable Long id) {
		try {
			String msg = contactService.removeContactByID(id);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
}
