package com.mapa.skills.dto;

import com.mapa.skills.utils.TipoRT;

public class DeveloperDto {

	private String funcional;
	private String nome;
	private TipoRT RT;
	private String squad;
	
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
	
}
