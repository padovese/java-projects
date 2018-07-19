package com.mapa.skills.service;

import org.springframework.stereotype.Service;

import com.mapa.skills.dto.DeveloperDto;

@Service
public interface DeveloperSkillsService {

	public void saveSkill(String skill);  //should be called when a new Skill is saved, to sync
	public void saveSkillNote(String skill);
	public DeveloperDto getDeveloperSkills();
}
