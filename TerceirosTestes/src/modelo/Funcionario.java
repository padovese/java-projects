package modelo;
abstract class Funcionario { //abstract não permite instanciar esta classe, apenas classes filhas.
	private String nome;
	protected double salario;
	private int senha;
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public abstract double getBonus(); 
	//Isto obriga as classes filhas a instanciarem este método.
	//Único método 
	
	public String getNome(){
		return nome;
	}

	public boolean autentica(int senha) {
		return this.senha == senha;
	}
}