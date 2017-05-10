class Conta{
	int numero;
	Pessoa titular;
	double saldo;
	int agencia;
	
	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado - 0.1;
	}
	
	void saca(double valorASerSacado){
		if(this.saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		}
	}
	
	void transfere(double valor, Conta destino){
		this.saldo -= valor;
		destino.saldo += valor;
	}
}

class Pessoa{
	String nome;
	int CPF;
	int idade;
}

class Programa4{
	
	public static void main (String[] args){
		
		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.saldo = 800.0;
		mauricio.agencia = 842;
		
		mauricio.titular = new Pessoa();
		mauricio.titular.nome = "Mauricio viadao";
		mauricio.titular.CPF = 1234564;
		mauricio.titular.idade = 20;
		
		mauricio.deposita(100.0);
		mauricio.saca(3000.0);
		
		Conta guilherme = new Conta();
		guilherme.numero = 456;
		guilherme.saldo = 1200.0;
		
		guilherme.deposita(90.0);
		guilherme.saca(50.0);
		
		mauricio.transfere(100.0, guilherme);
		
		System.out.println(mauricio.saldo);
		System.out.println(guilherme.saldo);
	}
}