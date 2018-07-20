package com.mapa.skills.dto;

import java.util.List;

import com.mapa.skills.model.Notas;

public class DeveloperSkillsDto {

	private String funcional;
	public List<Notas> notas;
	
	public String getFuncional() {
		return funcional;
	}
	public void setFuncional(String funcional) {
		this.funcional = funcional;
	}
	public List<Notas> getNotas() {
		return notas;
	}
	public void setNotas(List<Notas> notas) {
		this.notas = notas;
	}

	
}
