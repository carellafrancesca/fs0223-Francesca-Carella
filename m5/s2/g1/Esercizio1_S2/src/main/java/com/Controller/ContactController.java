package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Models.Contatto;
import com.Service.ContactService;

@Controller
public class ContactController {

	@Autowired ContactService constactService;
	
	@GetMapping("/")
	public String getHome() {
		return "index";
	}
	
	@GetMapping("/rubrica")
	public ModelAndView getRubrica() {
		List<Contatto> listaContatti = constactService.getAllContacts();
		ModelAndView model = new ModelAndView("rubrica");
		model.addObject("lista", listaContatti);
		return model;
	}
	
}
