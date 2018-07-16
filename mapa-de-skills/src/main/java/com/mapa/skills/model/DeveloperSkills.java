package com.mapa.skills.model;

public class DeveloperSkills {

	private Skill skill;
	private int nota;
	
	public String getSkill() {
		return skill.getNome();
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
