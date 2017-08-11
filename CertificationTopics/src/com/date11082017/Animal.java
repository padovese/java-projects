package com.date11082017;

public abstract class Animal {
	private String nome;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public abstract void emitirSom();
}
