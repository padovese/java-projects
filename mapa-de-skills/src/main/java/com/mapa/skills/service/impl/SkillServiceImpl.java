package com.mapa.skills.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapa.skills.dto.SkillDto;
import com.mapa.skills.service.SkillService;

@Repository
public class SkillServiceImpl implements SkillService{
	
	private static final String directory = "/home/padovese/Desktop/github/java-projects/mapa-de-skills/data/skills/";

	@Override
	public void gravar(SkillDto skillDto) {
		ObjectMapper mapper = new ObjectMapper();
		try {
		mapper.writeValue(new File(directory + skillDto.getNome() + ".json"), skillDto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public SkillDto getSkill(String nome) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			SkillDto skillDto = mapper.readValue(new File(directory	+ nome + ".json"), SkillDto.class);
			
			return skillDto;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public List<SkillDto> getSkills() {
		List<String> results = new ArrayList<>();
		File[] files = new File(directory).listFiles();
		
		for(File file : files) {
			if(file.isFile()) {
				results.add(file.getName());
			}			
		}
		
		List<SkillDto> skills = new ArrayList<SkillDto>();
		for(String result : results) {
			ObjectMapper mapper = new ObjectMapper();
			
			try {
				SkillDto skillDto = mapper.readValue(new File(directory	+ result), SkillDto.class);
				
				skills.add(skillDto);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return skills;
	}

	
	
	

}
