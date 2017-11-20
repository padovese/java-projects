package modelo;

import java.time.LocalDate;

public class Gasto {
	private double valor;
	private String tipo;
	private Funcionario funcionario;
	private LocalDate data;

	public Gasto(double valor, String tipo, Funcionario funcionario, LocalDate data) {
		super();
		this.valor = valor;
		this.tipo = tipo;
		this.funcionario = funcionario;
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return tipo + " do " + funcionario;
	}
	
	
}
