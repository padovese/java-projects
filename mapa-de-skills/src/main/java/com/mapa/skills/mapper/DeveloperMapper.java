package com.mapa.skills.mapper;

import com.mapa.skills.dto.DeveloperDto;
import com.mapa.skills.dto.DeveloperSkillsDto;
import com.mapa.skills.model.Developer;

public class DeveloperMapper {
	
	public static Developer developerDtoToEntity(DeveloperDto developerDto, Developer developer) {
		developer.setFuncional(developerDto.getFuncional());
		developer.setNome(developerDto.getNome());
		developer.setRT(developerDto.getRT());
		developer.setSquad(developer.getSquad());
		
		return developer;
	}
	
	public static Developer developerSkillsDtoToEntity(DeveloperSkillsDto developerSkillsDto, Developer developer) {
		developer.setNotas(developerSkillsDto.getNotas());
		
		return developer;
	}
	
	

}
