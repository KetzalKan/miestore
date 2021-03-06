package com.miestore.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miestore.models.User;
import com.miestore.repositories.UserRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController()
public class UsersController {

	@Autowired
	private UserRepository userRepository;

	public UsersController() {
		super();
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return (List<User>) userRepository.findAll();
	}
	
	@PostMapping("/users")
	void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
}
