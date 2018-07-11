package com.mapa.skills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/developers")
public class DevelopersController {

	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		return "developers";
	}
	
}
