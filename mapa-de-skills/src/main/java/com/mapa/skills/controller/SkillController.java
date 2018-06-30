package com.mapa.skills.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mapa.skills.model.Skill;

@Controller
@RequestMapping("/skills")
public class SkillController {

	@RequestMapping("/cadastro")
	public ModelAndView cadastro(@Valid Skill skill) {
		return new ModelAndView("skill/cadastro");
	}
	
	@RequestMapping("/consulta")
	public ModelAndView consulta() {
		return new ModelAndView("skill/consulta");
	}
}
