package programa;

import modelo.Conta;

public class FazDeposito implements Runnable {
	
	private final Conta conta;
	public FazDeposito(Conta conta){
		this.conta = conta;
	}
	
	public void run(){
		conta.deposita(100.0);
	}
}
