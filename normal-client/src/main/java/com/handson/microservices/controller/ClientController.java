package com.handson.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class ClientController {
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/test")
	public ResponseEntity<?> testClient(){
		String url = "http://localhost:8070/service1/hello";
//		url="https://bored-api.appbrewery.com/random";
		url = "http://localhost:8070/service2/hello";
		ResponseEntity<String> response = template.getForEntity(url, String.class);
//		return ResponseEntity.status(200).body(response);
		return ResponseEntity.status(200).body(response.getBody());
	}
	
	@GetMapping("/square/{no}")
	public ResponseEntity<?> getSquare(@PathVariable int no){
		String url = "http://localhost:8070/service1/square/"+no;
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		return ResponseEntity.status(200).body(response.getBody());
	}
	
	@GetMapping("/fact/{no}")
	public ResponseEntity<?> getFactorial(@PathVariable int no){
		String url = "http://localhost:8070/service2/factorial/"+no;
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		return ResponseEntity.status(200).body(response.getBody());
	}
	
	
}
