package com.gypsydanger.rest.webservices.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gypsydanger.rest.webservices.restfulwebservices.model.User;
import com.gypsydanger.rest.webservices.restfulwebservices.service.UserDaoService;

@RestController
public class UserController {

	@Autowired
	private UserDaoService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id){
		return userService.findOne(id);
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		userService.save(user);
	}
}
