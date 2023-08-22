package com.SpringController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class MicroservizioConsumer {

	@GetMapping("/txt")
	public String test() {
		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8083/api/txt";
		ResponseEntity<String> response = rt.getForEntity(rtUrl, String.class);
		return "Public Content:" + response.getBody();
	}
	
	@GetMapping("/utenti")
	public Object users() {
		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8083/api/be/utenti";
		Object response = rt.getForObject(rtUrl, Object.class);
		System.out.println(response);
		return response;
	}
	
}
