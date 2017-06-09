package modelo;

public class Funcionarios {
	private String nome;
	private String nacionalidade;
	
	public Funcionarios(String nome, String nacionalidade){
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public String toString(){
		return String.format("Nome: %s\nNacionalidade: %s", nome, nacionalidade);
	}
}
