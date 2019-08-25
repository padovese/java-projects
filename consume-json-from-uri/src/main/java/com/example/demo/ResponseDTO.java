package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDTO {
	
	@JsonProperty("id")
	public int id;
	
	@JsonProperty("attr0")
	public String field1;
	
	@JsonProperty("attr1")
	public String field2;

	
}
