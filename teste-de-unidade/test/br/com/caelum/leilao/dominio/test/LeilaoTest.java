package br.com.caelum.leilao.dominio.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

/**
 * @author Bruno Padovese
 * @since 22/08/2018 
 */
public class LeilaoTest {

	@Test
	public void deveReceberUmLeilao() {
		Leilao leilao = new Leilao("Mazda");
		assertEquals(0, leilao.getLances().size());
		
		leilao.propoe(new Lance(new Usuario("Padova"), 50000.0));
		
		assertEquals(1, leilao.getLances().size());
		assertEquals(50000.0, leilao.getLances().get(0).getValor(), 0.00001);
		
	}
	
	@Test
	public void deveReceberVariosLances() {
		Leilao leilao = new Leilao("Mazda");
		assertEquals(0, leilao.getLances().size());
		
		leilao.propoe(new Lance(new Usuario("Padova"), 50000.0));
		leilao.propoe(new Lance(new Usuario("Fulano"), 40000.0));
		leilao.propoe(new Lance(new Usuario("Ciclano"), 60000.0));
		
		assertEquals(3, leilao.getLances().size());
		assertEquals(50000.0, leilao.getLances().get(0).getValor(), 0.00001);
		assertEquals(40000.0, leilao.getLances().get(1).getValor(), 0.00001);
		assertEquals(60000.0, leilao.getLances().get(2).getValor(), 0.00001);
		
	}
	
	@Test
	public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
		Leilao leilao = new Leilao("Porshe");
		Usuario padova = new Usuario("Padova");
		
		leilao.propoe(new Lance(padova, 80000.0));
		leilao.propoe(new Lance(padova, 90000.0));
		
		assertEquals(1, leilao.getLances().size());
		assertEquals(90000.0, leilao.getLances().get(0).getValor(), 0.00001);
		
	}
}