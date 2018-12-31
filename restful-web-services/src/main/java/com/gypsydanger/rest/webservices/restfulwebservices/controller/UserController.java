package com.gypsydanger.rest.webservices.restfulwebservices.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gypsydanger.rest.webservices.restfulwebservices.exception.UserNotFoundException;
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
		User user = userService.findOne(id);
		
		if(user == null) {
			throw new UserNotFoundException("id: " + id);
		}
		
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = userService.save(user);
		
		//Necessary to return status 201 (created) and the link to the new created resource. Best practices instead of return only 200.
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id){
		User user = userService.deleteById(id);
		
		if(user == null) {
			throw new UserNotFoundException("id: " + id);
		}
	}
}
