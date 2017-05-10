package programa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import modelo.Conta;

public class TestaColecoes {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Padovese");
		nomes.add("Bruno");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("%uno%"));
		
		/*Realiza o processo abaixo de um jeito mais rústico
		 * for(int i = 0; i < nomes.size(); i++){
			System.out.println(nomes.get(i));
		}*/
		
		Collections.sort(nomes);
		
		System.out.println("Ordenado");
		
		for(String nome : nomes){
			System.out.println(nome);
		}
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta(1500.0);
		Conta c2 = new Conta(700.0);
		
		contas.add(c1);
		contas.add(c2);
		
		Collections.sort(contas);
		
		for(Conta cx : contas){
			System.out.println(cx);
		}
		
	}
}
