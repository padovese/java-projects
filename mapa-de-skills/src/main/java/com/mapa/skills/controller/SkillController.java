package com.mapa.skills.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mapa.skills.dto.SkillDto;
import com.mapa.skills.service.SkillService;

@Controller
@RequestMapping("/skills")
public class SkillController {
	
	@Autowired
	SkillService skillService;

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView cadastro(@Valid SkillDto skillDto, BindingResult result, RedirectAttributes redirectAttributes) {
		skillService.gravar(skillDto);
		
		if(result.hasErrors()) {
			redirectAttributes.addFlashAttribute("erro", "Skill não cadastrada.");
		} else {		
			redirectAttributes.addFlashAttribute("sucesso", "Skill cadastrada com sucesso!");
		}
		
		return new ModelAndView("redirect:skills");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView consulta() {
		ModelAndView mv = new ModelAndView("skills");

		List<SkillDto> skills = skillService.getSkills();
		mv.addObject("skills", skills);
		
		return mv;
	}
}
