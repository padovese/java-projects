package modelo;
class Diretor extends Funcionario implements Autenticavel{
	public double getBonus(){
		return this.salario * 0.35;
	}
	
	public void cobraRelatorios(){
		System.out.println("Preciso dos relat�rios.");
	}
	
	public boolean autentica(int senha){
		return false;
	}

}
