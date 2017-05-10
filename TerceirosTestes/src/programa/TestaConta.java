package programa;
import modelo.Conta;

public class TestaConta {
	public static void main(String[] args){
		Conta joao = new Conta();
		joao.deposita(50.0);
		
		
		/**
		 * @author BRUNO.HSPADOVEZE
		 * Realiza um saque na conta dado o valor passado
		 * 
		 * @parameter
		 * valor a ser sacado
		 * 
		 * @exception
		 * caso saldo seja insuficiente
		 */
		try{
		joao.saca(100.0);
		} catch(Exception e){
			System.out.println("Saldo insuficiente.");
		}
		
		System.out.println(joao.getSaldo());
	}
}