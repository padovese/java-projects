package br.com.produtos.controller.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import br.com.produtos.dao.ProdutosDAO;
import br.com.produtos.model.Produto;

public class ProdutoControllerTest {
	
	@Test
	public void verificaSeListaVemPreenchida() {
		List<Produto> produtos = new ProdutosDAO().lista();
		
		assertEquals(4, produtos.size());
		assertEquals("Radio", produtos.get(0).getName());	
		assertEquals("Desk", produtos.get(1).getName());	
		assertEquals("iPhone", produtos.get(2).getName());	
		assertEquals("Chair", produtos.get(3).getName());	

		//Fazer outro método daqui p baixo
		ModelAndView mv = new ModelAndView();
		mv.addObject("todosProdutos", produtos);
		
		boolean myMv = mv.isEmpty();
		
		assertFalse(myMv);
	}

}
