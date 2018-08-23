package br.com.caelum.leilao.ano.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.leilao.ano.AnoBissexto;

public class AnoBissextoTest {


	@Test
	public void verificaSeAnoNaoEBissexto() {
		Boolean result = new AnoBissexto().isBissexto(55);
		
		assertEquals(Boolean.FALSE, result);
	}
	
	@Test
	public void verificaSeAnoEBissexto() {
		Boolean result = new AnoBissexto().isBissexto(44);
		
		assertEquals(Boolean.TRUE, result);
	}
}
