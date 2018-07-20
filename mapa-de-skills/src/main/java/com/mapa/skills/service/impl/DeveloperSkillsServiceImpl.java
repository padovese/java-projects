package com.mapa.skills.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapa.skills.dto.DeveloperDto;
import com.mapa.skills.dto.DeveloperSkillsDto;
import com.mapa.skills.service.DeveloperSkillsService;

@Service
public class DeveloperSkillsServiceImpl implements DeveloperSkillsService{
	
	private static final String directory = "/home/padovese/Desktop/github/java-projects/mapa-de-skills/data/developer-skills/";

	@Override
	public void saveSkill(String skill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveSkillNote(String skill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DeveloperSkillsDto> getAllDeveloperSkills() {
		List<String> results = new ArrayList<>();
		File[] files = new File(directory).listFiles();
		
		for(File file : files) {
			if(file.isFile()) {
				results.add(file.getName());
			}			
		}
		
		List<DeveloperSkillsDto> devSkills = new ArrayList<>();
		for(String result : results) {
			ObjectMapper mapper = new ObjectMapper();
			
			try {
				DeveloperSkillsDto developerSkillsDto = mapper.readValue(new File(directory	+ result), DeveloperSkillsDto.class);
				
				devSkills.add(developerSkillsDto);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Collections.sort(devSkills, (p1, p2) -> p1.getFuncional().toLowerCase().compareTo(p2.getFuncional().toLowerCase()));
		return devSkills;
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
