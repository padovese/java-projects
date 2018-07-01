package com.mapa.skills.service.impl;

import java.io.File;
import java.io.IOException;
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
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public List<SkillDto> getSkills() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
