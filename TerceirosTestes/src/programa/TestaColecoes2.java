package programa;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import modelo.Conta;

public class TestaColecoes2 {
	public static void main(String[] args) {
		List<String> nomes = new LinkedList<String>();
		nomes.add("Joaozin");
		nomes.add("Mauricin");
		nomes.add("Mauricin");
		
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		
		//Este não permite elementos duplicados
		Set<String> nomes2 = new HashSet<String>();
		nomes2.add("Joaozin");
		nomes2.add("Mauricin");
		nomes2.add("Mauricin");
		
		System.out.println(nomes2.size());
		
		Set<Conta> contas = new HashSet<Conta>();
			Conta c1 = new Conta(200.0);
			Conta c2 = new Conta(500.0);
			
			contas.add(c1);
			contas.add(c1);
			contas.add(c2);
			
			System.out.println(contas.size());
		
	}
}
