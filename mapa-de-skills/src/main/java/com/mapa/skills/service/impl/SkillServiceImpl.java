package com.mapa.skills.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapa.skills.dto.SkillDto;
import com.mapa.skills.service.SkillService;

public class SkillServiceImpl implements SkillService{

	@Override
	public void gravar(SkillDto skillDto) {
		ObjectMapper mapper = new ObjectMapper();
		try {
		mapper.writeValue(new File("/home/padovese/Desktop/github/java-projects/mapa-de-skills/data/" 
		+ skillDto.getNome() + ".json"), skillDto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public SkillDto getSkill(String nome) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			SkillDto skillDto = mapper.readValue(new File("/home/padovese/Desktop/github/java-projects/mapa-de-skills/data/"
					+ nome + ".json"), SkillDto.class);
			
			return skillDto;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public List<SkillDto> getSkills() {
		List<String> results = new ArrayList<>();
		File[] files = new File("/home/padovese/Desktop/github/java-projects/mapa-de-skills/data/").listFiles();
		
		for(File file : files) {
			if(file.isFile()) {
				results.add(file.getName());
			}			
		}
		
		List<SkillDto> skills = new ArrayList<SkillDto>();
		for(String result : results) {
			ObjectMapper mapper = new ObjectMapper();
			
			try {
				SkillDto skillDto = mapper.readValue(new File("/home/padovese/Desktop/github/java-projects/mapa-de-skills/data/"
						+ result), SkillDto.class);
				
				skills.add(skillDto);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return skills;
	}

	
	
	

}
