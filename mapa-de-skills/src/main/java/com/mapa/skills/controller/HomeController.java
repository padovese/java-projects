package com.mapa.skills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mapa.skills.dto.SkillDto;
import com.mapa.skills.service.impl.SkillServiceImpl;
import com.mapa.skills.utils.TipoSkill;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
//		SkillDto skillDto = new SkillDto();
//		skillDto.setNome("java");
//		skillDto.setTipoSkill(TipoSkill.LINGUAGEM);
//		new SkillServiceImpl().gravar(skillDto);
		return "home";
	}
	
//	@RequestMapping("/h")
//	public String homeh() {
//		SkillDto skillDto = new SkillServiceImpl().getSkill("javascript");
//		System.out.println(skillDto);
//		return "home";
//	}
	
}
