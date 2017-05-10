class Conta{
	double saldo;
	double limite;
	Cliente titular;
	int agencia;
	int numero;
	
	void saca(double valor){
		this.saldo -= valor;
	}
	
	void deposita(double valor){
		this.saldo += valor;
	}
}

class Cliente{
	String nome;
	String endereco;
}

class TestaConta{
	public static void main(String[] args){
		Conta joao = new Conta();
		joao.numero = 123;
		
		Cliente dadosDoJoao = new Cliente();
		dadosDoJoao.nome = "Joao da Silva";
		joao.titular = dadosDoJoao;
		
		joao.deposita(200.0);
		
		System.out.println(joao.saldo);
	
	}
}