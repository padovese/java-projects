package com.mapa.skills.service;

import org.springframework.stereotype.Service;

import com.mapa.skills.dto.DeveloperSkillsDto;

@Service
public interface DeveloperSkillsService {

	public void syncSkill(String skill);  //should be called when a new Skill is saved, to sync
	public void saveDeveloperSkills(DeveloperSkillsDto developerSkillsDto);
	public DeveloperSkillsDto getDeveloperSkillsByFuncional(String funcional);
}
