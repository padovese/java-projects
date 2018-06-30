package com.mapa.skills.model;

import com.mapa.skills.utils.TipoSkill;

public class Skill {

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
