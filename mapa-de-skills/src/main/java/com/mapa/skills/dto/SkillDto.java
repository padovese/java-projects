package com.mapa.skills.dto;

import com.mapa.skills.utils.TipoSkill;

public class SkillDto {

	private String nome;
	private TipoSkill tipoSkill;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoSkill getTipoSkill() {
		return tipoSkill;
	}
	public void setTipoSkill(TipoSkill tipoSkill) {
		this.tipoSkill = tipoSkill;
	}
	
	
}
