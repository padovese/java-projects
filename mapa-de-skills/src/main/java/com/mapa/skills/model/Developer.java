package com.mapa.skills.model;

import java.util.List;

import com.mapa.skills.utils.TipoRT;

public class Developer {

	private String funcional;
	private String nome;
	private TipoRT RT;
	private String squad;
	private List<Notas> notas;
	
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
	public List<Notas> getNotas() {
		return notas;
	}
	public void setNotas(List<Notas> notas) {
		this.notas = notas;
	}

}
