package com.mapa.skills.mapper;

import com.mapa.skills.dto.DeveloperDto;
import com.mapa.skills.dto.DeveloperSkillsDto;
import com.mapa.skills.model.Developer;

public class DeveloperMapper {
	
	public static Developer developerDtoToEntity(DeveloperDto developerDto, Developer developer) {
		developer.setFuncional(developerDto.getFuncional());
		developer.setNome(developerDto.getNome());
		developer.setRT(developerDto.getRT());
		developer.setSquad(developerDto.getSquad());
		
		return developer;
	}
	
	public static Developer developerSkillsDtoToEntity(DeveloperSkillsDto developerSkillsDto, Developer developer) {
		developer.setNotas(developerSkillsDto.getNotas());
		
		return developer;
	}

	public static DeveloperDto developerEntityToDto(DeveloperDto developerDto, Developer developer) {
		developerDto.setFuncional(developer.getFuncional());
		developerDto.setNome(developer.getNome());
		developerDto.setRT(developer.getRT());
		developerDto.setSquad(developer.getSquad());
		
		return developerDto;
	}

	public static DeveloperSkillsDto developerSkillsEntityToDto
	(DeveloperSkillsDto developerSkillsDto, Developer developer) {
		developerSkillsDto.setFuncional(developer.getFuncional());
		developerSkillsDto.setNotas(developer.getNotas());
		
		return developerSkillsDto;
		
	}
	
}
