package br.com.jdbc.modelo;

public class Produto {
	private int id;
	private String name;

	public Produto(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
