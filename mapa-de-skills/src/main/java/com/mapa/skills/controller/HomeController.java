package com.mapa.skills.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mapa.skills.dto.SkillDto;
import com.mapa.skills.service.SkillService;
import com.mapa.skills.utils.TipoSkill;

@Controller
public class HomeController {

	@Autowired
	SkillService skillService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		
		mv.addObject("totalLinguagem", getTotal(TipoSkill.LINGUAGEM));
		mv.addObject("totalFramework", getTotal(TipoSkill.FRAMEWORK));	
		mv.addObject("totalFerramenta", getTotal(TipoSkill.FERRAMENTA));

		usageOfHashMap();
		
		return mv;
	}

	private int getTotal(TipoSkill tipoSkill) {
		int i = 0;
		List<SkillDto> skillDto = skillService.getSkills();
		for(SkillDto skill : skillDto) {
			if(skill.getTipoSkill() == tipoSkill) {
				i++;
			}
		}
		return i;
	}
	
	private void usageOfHashMap() {
		HashMap<String, Boolean> hm = new HashMap<String, Boolean>();
		hm.put("someRule", true);
		hm.put("anotherRule", false);
		hm.put("lastRule", false);
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
	
}
