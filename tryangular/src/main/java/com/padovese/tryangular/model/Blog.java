package com.padovese.tryangular.model;

import java.time.LocalDate;

public class Blog {

	private int id;
	private String name;
	private LocalDate releaseDate;
	private String description;
	
	public Blog(int id, String name, LocalDate releaseDate, String description) {
		super();
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
		this.description = description;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
}
