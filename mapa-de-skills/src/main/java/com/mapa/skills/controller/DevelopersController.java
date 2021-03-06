package com.mapa.skills.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mapa.skills.dto.DeveloperDto;
import com.mapa.skills.dto.DeveloperSkillsDto;
import com.mapa.skills.mapper.DeveloperMapper;
import com.mapa.skills.model.Developer;
import com.mapa.skills.service.DeveloperService;
import com.mapa.skills.service.DeveloperSkillsService;

@Controller
@RequestMapping("/developers")
public class DevelopersController {

	@Autowired
	DeveloperService developerService;
	
	@Autowired
	DeveloperSkillsService developerSkillsService;
	
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
	
	@RequestMapping(value="/{funcional}", method=RequestMethod.GET)
	public ModelAndView personalPage(@PathVariable("funcional") String funcional) {
		ModelAndView mv = new ModelAndView("developerPersonalPage");
		
		Developer developer = new Developer();
		DeveloperMapper.developerDtoToEntity(developerService.getDeveloperByFuncional(funcional), developer);
		DeveloperMapper.developerSkillsDtoToEntity(developerSkillsService.getDeveloperSkillsByFuncional(funcional), developer);
		
		mv.addObject("developer", developer);
		
		return mv;
	}
	
	@RequestMapping(value="/{funcional}", method=RequestMethod.POST)
	public ModelAndView savePersonalPage(@PathVariable("funcional") String funcional, 
			@Valid Developer developer, BindingResult result, RedirectAttributes redirectAttributes) {
		ModelAndView mv = new ModelAndView("redirect:" + funcional);
		
		DeveloperDto developerDto = new DeveloperDto();
		DeveloperSkillsDto developerSkillsDto = new DeveloperSkillsDto();
		
		DeveloperMapper.developerEntityToDto(developerDto, developer);
		DeveloperMapper.developerSkillsEntityToDto(developerSkillsDto, developer);
		
		developerService.saveDeveloper(developerDto);
		developerSkillsService.saveDeveloperSkills(developerSkillsDto);
		
		return mv;
	}
	
	@RequestMapping(value="/{funcional}/edit", method=RequestMethod.POST)
	public ModelAndView staticPersonalPage(@PathVariable("funcional") String funcional, 
			RedirectAttributes redirectAttributes) {
		ModelAndView mv = new ModelAndView("developerPersonalPageEdit");
		
		Developer developer = new Developer();
		DeveloperMapper.developerDtoToEntity(developerService.getDeveloperByFuncional(funcional), developer);
		DeveloperMapper.developerSkillsDtoToEntity(developerSkillsService.getDeveloperSkillsByFuncional(funcional), developer);
		
		mv.addObject("developer", developer);
		
		return mv;
	}
	
}
