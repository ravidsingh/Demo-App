package com.ravi.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping("/")
	public String GetMessage() {
		return"<h1> Welcome to spring security home</h1>";
	}
	
	@GetMapping("/admin")
	public String GetAdmin() {
		return"<h1> Welcome to spring security Admin</h1>";
	}
	
	@GetMapping("/user")
	public String GetUser() {
		return"<h1> Welcome to spring security User</h1>";
	}
}
