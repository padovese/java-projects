package com.mapa.skills.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mapa.skills.dto.SkillDto;
import com.mapa.skills.model.Skill;
import com.mapa.skills.service.impl.SkillServiceImpl;

@Controller
@RequestMapping("/skills")
public class SkillController {

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView cadastro(@Valid SkillDto skillDto, BindingResult resul) {
		new SkillServiceImpl().gravar(skillDto);
		return new ModelAndView("skills");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView consulta() {
		ModelAndView mv = new ModelAndView("skills");

		List<SkillDto> skills = new SkillServiceImpl().getSkills();
		mv.addObject("skills", skills);
		
		return mv;
	}
}
