package br.com.caelum.leilao.servico.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
		assertEquals(maiorEsperado, avaliador.getMaiorLance(), 0.00001); //ultimo parametro serve p desconsiderar arredondamentos
		assertEquals(menorEsperado, avaliador.getMenorLance(), 0.00001);
	}
	
	@Test
	public void testaValorInicialDosAtributos() {
		Avaliador leioleiro = new Avaliador();
		
		assertEquals(Double.NEGATIVE_INFINITY, leioleiro.getMaiorLance(), 0.00001);
		assertEquals(Double.POSITIVE_INFINITY, leioleiro.getMenorLance(), 0.00001);
		
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
	
	@Test
	public void testaLanceUnico() {
		Usuario fulano = new Usuario("Fulano");
		
		Leilao leilao = new Leilao("cioccolato");
		leilao.propoe(new Lance(fulano, 10.5));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);

		assertEquals(10.5, avaliador.getMenorLance(), 0.00001);
		assertEquals(10.5, avaliador.getMaiorLance(), 0.00001);
		
	}
	
	@Test
	public void deveEncontrarOsTresMaioresLances() {
		Usuario maria = new Usuario("Maria");
		Usuario joao = new Usuario("Joao");
		Usuario pedro = new Usuario("Pedro");
		
		Leilao leilao = new Leilao("Mazda");
		
		leilao.propoe(new Lance(pedro, 15000.0));
		leilao.propoe(new Lance(maria, 17000.0));
		leilao.propoe(new Lance(joao, 24000.0));
		leilao.propoe(new Lance(maria, 16000.0));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		List<Lance> maiores = avaliador.getMaiores();
		assertEquals(3, maiores.size());
		assertEquals(24000.0, maiores.get(0).getValor(), 0.0001);
		assertEquals(17000.0, maiores.get(1).getValor(), 0.0001);
		assertEquals(16000.0, maiores.get(2).getValor(), 0.0001);
	}
}
