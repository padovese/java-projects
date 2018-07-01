package com.mapa.skills.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapa.skills.dto.SkillDto;
import com.mapa.skills.service.SkillService;

public class SkillServiceImpl implements SkillService{

	@Override
	public void gravar(SkillDto skillDto) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("/home/padovese/Desktop/github/java-projects/mapa-de-skills/data"), skillDto);
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
	public List<SkillDto> getSkills() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
