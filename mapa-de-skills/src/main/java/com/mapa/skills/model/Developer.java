package com.mapa.skills.model;

import com.mapa.skills.utils.TipoRT;

public class Developer {

	private int funcional;
	private String nome;
	private TipoRT RT;
	private String squad;
	
	public int getFuncional() {
		return funcional;
	}
	public void setFuncional(int funcional) {
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
