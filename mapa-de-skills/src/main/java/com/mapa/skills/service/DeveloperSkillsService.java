package com.mapa.skills.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mapa.skills.dto.DeveloperDto;
import com.mapa.skills.dto.DeveloperSkillsDto;

@Service
public interface DeveloperSkillsService {

	public void saveSkill(String skill);  //should be called when a new Skill is saved, to sync
	public void saveSkillNote(String skill);
	public DeveloperSkillsDto getDeveloperSkillsByFuncional(String funcional);
	public List<DeveloperSkillsDto> getAllDeveloperSkills();
}
