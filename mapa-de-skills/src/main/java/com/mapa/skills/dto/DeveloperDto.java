package com.mapa.skills.dto;

import java.util.List;

import com.mapa.skills.model.DeveloperSkills;
import com.mapa.skills.utils.TipoRT;

public class DeveloperDto {

	private String funcional;
	private String nome;
	private TipoRT RT;
	private String squad;
	List<DeveloperSkills> skills;
	
	public String getFuncional() {
		return funcional;
	}
	public void setFuncional(String funcional) {
		this.funcional = funcional;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoRT getRT() {
		return RT;
	}
	public void setRT(TipoRT rT) {
		RT = rT;
	}
	public String getSquad() {
		return squad;
	}
	public void setSquad(String squad) {
		this.squad = squad;
	}
	public List<DeveloperSkills> getSkills() {
		return skills;
	}
	public void setSkills(List<DeveloperSkills> skills) {
		this.skills = skills;
	}
	
}
