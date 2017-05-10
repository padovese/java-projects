package modelo;
import javax.management.RuntimeErrorException;

public class Conta implements Comparable<Conta>{
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;
	
	public Conta(){
	}
	
	public Conta(double valor){
		this.saldo = valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean saca(double valor) throws Exception{
		if(saldo >= valor){
		this.saldo -= valor;
		return true;
		}
		else{
			throw new Exception("Saldo Insuficiente.");
		}
	}
	
	public synchronized void deposita(double valor){
		//synchronized (this) {
			this.saldo += valor;
		//}
		
	}
	
	public String toString() {
		return "Conta com saldo: " + saldo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

	//Método que realiza comapração de saldo de uma conta para ordenação de collections.
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
	}
	
	
	
}
