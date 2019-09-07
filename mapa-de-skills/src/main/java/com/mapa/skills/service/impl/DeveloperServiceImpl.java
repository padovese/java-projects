package com.mapa.skills.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapa.skills.dto.DeveloperDto;
import com.mapa.skills.service.DeveloperService;

@Service
public class DeveloperServiceImpl implements DeveloperService{
	
	private static final String directory = "/home/padovese/Desktop/github/java-projects/mapa-de-skills/data/developers/";

	@Override
	public void saveDeveloper(DeveloperDto developerDto) {
		ObjectMapper mapper = new ObjectMapper();
		try {
		mapper.writeValue(new File(directory + developerDto.getFuncional() + ".json"), developerDto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public DeveloperDto getDeveloperByFuncional(String funcional) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			DeveloperDto developerDto = mapper.readValue(new File(directory	+ funcional + ".json"), DeveloperDto.class);
			
			return developerDto;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<DeveloperDto> getAllDevelopers(String sort) {
		List<String> results = new ArrayList<>();
		File[] files = new File(directory).listFiles();
		
		for(File file : files) {
			if(file.isFile()) {
				results.add(file.getName());
			}			
		}
		
		List<DeveloperDto> developers = new ArrayList<>();
		for(String result : results) {
			ObjectMapper mapper = new ObjectMapper();
			
			try {
				DeveloperDto developersDto = mapper.readValue(new File(directory + result), DeveloperDto.class);
				
				developers.add(developersDto);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
			switch(sort == null ? "" : sort) {
			case("funcional"):
				Collections.sort(developers, (p1, p2) -> p1.getFuncional().compareTo(p2.getFuncional()));
				break;
			case("RT"):
				Collections.sort(developers, (p1, p2) -> p1.getRT().compareTo(p2.getRT()));
				break;
			case("squad"):
				Collections.sort(developers, (p1, p2) -> p1.getSquad().toLowerCase().compareTo(p2.getSquad().toLowerCase()));
				break;
			default:
			Collections.sort(developers, (p1, p2) -> p1.getNome().toLowerCase().compareTo(p2.getNome().toLowerCase()));
		}
		
		return developers;
	}

}
