package com.mapa.skills.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mapa.skills.dto.DeveloperDto;
import com.mapa.skills.service.DeveloperService;

@Controller
@RequestMapping("/developers")
public class DevelopersController {

	@Autowired
	DeveloperService developerService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView form(@RequestParam(value = "sort", required = false) String sort) {
		
		ModelAndView mv = new ModelAndView("developers");
		mv.addObject("developers", developerService.getAllDevelopers(sort));
		
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView save(@Valid DeveloperDto developerDto, BindingResult bindingResult ) {
		developerService.saveDeveloper(developerDto);
		
		return new ModelAndView("redirect:developers");
	}
	
}
