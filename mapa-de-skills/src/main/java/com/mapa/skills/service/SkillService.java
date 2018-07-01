package com.mapa.skills.service;

import java.util.List;

import com.mapa.skills.dto.SkillDto;

public interface SkillService {
	
	public void gravar(SkillDto skillDto);
	public List<SkillDto> getSkills();
	
}
