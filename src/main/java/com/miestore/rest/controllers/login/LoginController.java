package com.miestore.rest.controllers.login;

import javax.persistence.PostRemove;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class LoginController {

	@PostMapping("/login")
	public void doLogin() {
		//To-do
	}
	
	@PostMapping("/registration")
	public void doRegister() {
		//To-do
	}
}
