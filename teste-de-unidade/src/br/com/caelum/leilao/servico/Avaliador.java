package br.com.caelum.leilao.servico;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

public class Avaliador {

	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private double valorTotal;

	public void avalia(Leilao leilao) {
		
		for(Lance lance : leilao.getLances()) {
			if(lance.getValor() > maiorDeTodos )
				maiorDeTodos = lance.getValor();
			if(lance.getValor() < menorDeTodos )
				menorDeTodos = lance.getValor();
		}
	}
	
	public void valorMedio(Leilao leilao) {
		for(Lance lance : leilao.getLances()) {
			valorTotal += lance.getValor();
		}
		
		valorTotal /= leilao.getLances().size();
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public double getMaiorLance() {
		return maiorDeTodos;
	}
	
	public double getMenorLance() {
		return menorDeTodos;
	}
}