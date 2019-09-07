package com.mapa.skills.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mapa.skills.dto.SkillDto;

@Service
public interface SkillService {
	
	public void gravar(SkillDto skillDto);
	public SkillDto getSkill(String nome);
	public List<SkillDto> getSkills();
	
}
