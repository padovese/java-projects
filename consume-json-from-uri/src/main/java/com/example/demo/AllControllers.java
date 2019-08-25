package com.example.demo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllControllers {

	@GetMapping("/mocked")
	public MockedObject mocked() {
		return new MockedObject();
	}
	
	@GetMapping("/consume")
	public ResponseDTO consume() {
		Client client = ClientBuilder.newBuilder().build();
		WebTarget target = client.target("http://localhost:8080/mocked");
		Response response = target.request().get();
		ResponseDTO responseDTO = response.readEntity(ResponseDTO.class);
	
		return responseDTO;
	}

}
