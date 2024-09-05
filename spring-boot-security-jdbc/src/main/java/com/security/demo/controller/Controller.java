package com.security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.demo.model.UserModel;


@RestController
public class Controller {

	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	UserDetailsManager users;
	
	@GetMapping("/")
	public String greet() {
		return "welcom home";
	}
	
	@GetMapping("/admin")
	public String greetAdmin() {
		return "Admin@Work";
	}
	
	@GetMapping("/user")
	public String greetUser() {
		return "User@Work";
	}
	
	@GetMapping("/encode/{password}")
	public String encode(@PathVariable String password) {
		return encoder.encode(password);
	}
	
	@PostMapping("/signup")
	public String signup(@RequestBody UserModel user) {
		UserDetails userDetails = User.builder()
				.username(user.getUsername())
				.password(encoder.encode(user.getPassword()))
				.roles(user.getRole())
				.build();
		users.createUser(userDetails);
		return "signup successful :) ";
	}
}


