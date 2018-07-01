package com.mapa.skills.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
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
	public ModelAndView cadastro(@Valid SkillDto skillDto) {
		new SkillServiceImpl().gravar(skillDto);
		return new ModelAndView("skill/cadastro");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView consulta() {
		
		ModelAndView mv = new ModelAndView("skills");
		
		return mv;
	}
}
