class Funcionario{
	private String nome;
	protected double salario;
	
	//private protege variavel e somente esta classe pode acessala via set/get
	//protected faz o mesmo porém as classes filhas tem acesso tmb.
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double getBonus(){
		return this.salario * 0.2;
	}
}

class Gerente extends Funcionario{
	public double getBonus(){
		return this.salario * 0.3;
	}
}

class Desenvolvedor extends Funcionario{
	public double getBonus(){
		return this.salario * 0.25;
	}
}

class TotalizadorDeBonus{
	private double total = 0;
	
	public void adiciona(Funcionario f){
	total += f.getBonus();	
	}
	
	public double getTotal(){
		return total;
	}
}

class TestaFuncionario{
	public static void main(String[] args){
		Funcionario padovese = new Funcionario();
		padovese.setSalario(1000.0);
		
		System.out.println(padovese.getBonus());
		
		Gerente mane = new Gerente();
		mane.setSalario(2000.0);
		
		System.out.println(mane.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(padovese);
		totalizador.adiciona(mane);
		
		System.out.println(totalizador.getTotal());
	}
}