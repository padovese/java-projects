package com.mapa.skills.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mapa.skills.dto.DeveloperDto;

@Service
public interface DeveloperService {

	public void saveDeveloper(DeveloperDto developerDto);
	public DeveloperDto getDeveloperByFuncional(String funcional);
	public List<DeveloperDto> getAllDevelopers(String sort);
}
