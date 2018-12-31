package com.gypsydanger.rest.webservices.restfulwebservices.model;

import java.time.LocalDate;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	private Integer id;
	
	@Size(min=2, message="name shold have at least 2 characters.")
	private String name;
	
	@Past
	private LocalDate birthDate;
	
	protected User() {
		
	}
	
	public User(Integer id, String home, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = home;
		this.birthDate = birthDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String home) {
		this.name = home;
	}
	public LocalDate  getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate  birthDate) {
		this.birthDate = birthDate;
	}

}
