package com.sopra.challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.challenge.models.User;
import com.sopra.challenge.repositories.UserRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		
		System.out.println("Req");
		return (List<User>) userRepository.findAll();
	}
	
	@PostMapping("/users")
	public String addUser(@RequestBody final User user) {
		
		try {
			userRepository.save(user);
		}
		catch (Exception e) {
			System.out.println(e);
			return "FAILED";
		}
		
		System.out.println("Success");
		return "SUCCESS";
	}
}
