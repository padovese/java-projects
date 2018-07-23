package com.mapa.skills.service.impl;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapa.skills.dto.DeveloperSkillsDto;
import com.mapa.skills.service.DeveloperSkillsService;

@Service
public class DeveloperSkillsServiceImpl implements DeveloperSkillsService{
	
	private static final String directory = "/home/padovese/Desktop/github/java-projects/mapa-de-skills/data/developer-skills/";

	@Override
	public void syncSkill(String skill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveDeveloperSkills(DeveloperSkillsDto developerSkillsDto) {
		ObjectMapper mapper = new ObjectMapper();
		try {
		mapper.writeValue(new File(directory + developerSkillsDto.getFuncional() + ".json"), developerSkillsDto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public DeveloperSkillsDto getDeveloperSkillsByFuncional(String funcional) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			DeveloperSkillsDto developerSkillsDto = mapper.readValue(new File(directory + funcional + ".json"), DeveloperSkillsDto.class);

			return developerSkillsDto;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
