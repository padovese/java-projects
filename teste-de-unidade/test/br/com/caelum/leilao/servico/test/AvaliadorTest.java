package br.com.caelum.leilao.servico.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

public class AvaliadorTest {
	
	private Avaliador avaliador;
	private Usuario maria;
	private Usuario joao;
	private Usuario pedro;
	private Leilao leilao;
	
	@Before
	public void criaAvaliador() {
		this.avaliador = new Avaliador();
		
		this.maria = new Usuario("Maria");
		this.joao = new Usuario("Joao");
		this.pedro = new Usuario("Pedro");
		this.leilao= new Leilao("Mazda");
	}

	@Test
	public void deveEntenderLanceEmOrdemCrescente() {
		
		leilao.propoe(new Lance(pedro, 15000.0));
		leilao.propoe(new Lance(maria, 17000.0));
		leilao.propoe(new Lance(joao, 24000.0));
		
		avaliador.avalia(leilao);
		
		double maiorEsperado = 24000.0;
		double menorEsperado = 15000.0;
		
		//Parte 3: validacao
		assertEquals(maiorEsperado, avaliador.getMaiorLance(), 0.00001); //ultimo parametro serve p desconsiderar arredondamentos
		assertEquals(menorEsperado, avaliador.getMenorLance(), 0.00001);
	}
	
	@Test
	public void testaValorInicialDosAtributos() {
		
		assertEquals(Double.NEGATIVE_INFINITY, avaliador.getMaiorLance(), 0.00001);
		assertEquals(Double.POSITIVE_INFINITY, avaliador.getMenorLance(), 0.00001);
		
	}
	
	@Test
	public void testaValorTotalDosLances() {
		
				leilao.propoe(new Lance(pedro, 15000.0));
				leilao.propoe(new Lance(maria, 17000.0));
				leilao.propoe(new Lance(joao, 24000.0));
				
				avaliador.avalia(leilao);
				
				avaliador.valorMedio(leilao);
				
				double totalEsperado = 18666.66;
				
				Assert.assertEquals(totalEsperado, avaliador.getValorTotal(), 0.01);
	}
	
	@Test
	public void testaLanceUnico() {
		
		leilao.propoe(new Lance(maria, 10.5));
		
		avaliador.avalia(leilao);

		assertEquals(10.5, avaliador.getMenorLance(), 0.00001);
		assertEquals(10.5, avaliador.getMaiorLance(), 0.00001);
		
	}
	
	@Test
	public void deveEncontrarOsTresMaioresLances() {
		
		leilao.propoe(new Lance(pedro, 15000.0));
		leilao.propoe(new Lance(maria, 17000.0));
		leilao.propoe(new Lance(joao, 24000.0));
		leilao.propoe(new Lance(maria, 16000.0));
		
		avaliador.avalia(leilao);
		
		List<Lance> maiores = avaliador.getMaiores();
		assertEquals(3, maiores.size());
		assertEquals(24000.0, maiores.get(0).getValor(), 0.0001);
		assertEquals(17000.0, maiores.get(1).getValor(), 0.0001);
		assertEquals(16000.0, maiores.get(2).getValor(), 0.0001);
	}
	
	@Test(expected=RuntimeException.class)
	public void deveTestarLeilaoSemLance() {
		leilao = null;
		avaliador.avalia(leilao);
	}
}
