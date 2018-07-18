package com.mapa.skills.model;

public class DeveloperSkills {

	private String nota;
	private String skill;
	
	public DeveloperSkills() {
		
	}
	
	public DeveloperSkills(String nota, String skill) {
		super();
		this.nota = nota;
		this.skill = skill;
	}
	
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
