package com.sleuth.demo;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/sleuth")
public class Controller {
	
	@Autowired
	RestTemplate template;
	private static Logger logger = LoggerFactory.getLogger(Controller.class);
	
	@GetMapping("/test")
	public String test1() {
		return template.getForEntity("https://jsonplaceholder.typicode.com/todos/1", String.class).toString();
	}
}
