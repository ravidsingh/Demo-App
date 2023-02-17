package com.ravi.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping("/")
	public String GetMessage() {
		return"<h1> Welcome to spring security home</h1>";
	}
	// for admin
	@GetMapping("/admin")
	public String GetAdmin() {
		return"<h1> Welcome to spring security Admin</h1>";
	}
	//for user endpoint
	@GetMapping("/user")
	public String GetUser() {
		return"<h1> Welcome to spring security User</h1>";
	}
}
