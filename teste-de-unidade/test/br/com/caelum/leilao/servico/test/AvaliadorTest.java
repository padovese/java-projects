package br.com.caelum.leilao.servico.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

public class AvaliadorTest {

	@Test
	public void deveEntenderLanceEmOrdemCrescente() {
		
		//Parte 1: cenario
		Usuario maria = new Usuario("Maria");
		Usuario joao = new Usuario("Joao");
		Usuario pedro = new Usuario("Pedro");
		
		Leilao leilao = new Leilao("Mazda");
		
		leilao.propoe(new Lance(pedro, 15000.0));
		leilao.propoe(new Lance(maria, 17000.0));
		leilao.propoe(new Lance(joao, 24000.0));
		
		//Parte 2: acao
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		double maiorEsperado = 24000.0;
		double menorEsperado = 15000.0;
		
		//Parte 3: validacao
		Assert.assertEquals(maiorEsperado, avaliador.getMaiorLance(), 0.00001); //ultimo parametro serve p desconsiderar arredondamentos
		Assert.assertEquals(menorEsperado, avaliador.getMenorLance(), 0.00001);
	}
	
	@Test
	public void testaValorInicialDosAtributos() {
		Avaliador leioleiro = new Avaliador();
		
		Assert.assertEquals(Double.NEGATIVE_INFINITY, leioleiro.getMaiorLance(), 0.00001);
		Assert.assertEquals(Double.POSITIVE_INFINITY, leioleiro.getMenorLance(), 0.00001);
		
	}
	
	@Test
	public void testaValorTotalDosLances() {
		//Parte 1: cenario
				Usuario maria = new Usuario("Maria");
				Usuario joao = new Usuario("Joao");
				Usuario pedro = new Usuario("Pedro");
				
				Leilao leilao = new Leilao("Mazda");
				
				leilao.propoe(new Lance(pedro, 15000.0));
				leilao.propoe(new Lance(maria, 17000.0));
				leilao.propoe(new Lance(joao, 24000.0));
				
		//Parte 2: acao
				Avaliador avaliador = new Avaliador();
				avaliador.avalia(leilao);
				
				avaliador.valorMedio(leilao);
				
				double totalEsperado = 18666.66;
				
				Assert.assertEquals(totalEsperado, avaliador.getValorTotal(), 0.01);
	}
}