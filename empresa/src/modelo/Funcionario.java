package modelo;

import java.time.LocalDate;

public class Funcionario {
	private String nome;
	private int matricula;
	private LocalDate dataNascimento;

	public Funcionario(String nome, int matricula, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
	}

	public String toString() {
		return "Funcionario: " + nome;
	}
	
	

}
