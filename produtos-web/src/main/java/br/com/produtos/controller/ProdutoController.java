package br.com.produtos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.produtos.dao.ProdutosDAO;
import br.com.produtos.model.Produto;

@Controller
public class ProdutoController {

	@RequestMapping("/listaProdutos")
	public ModelAndView lista() {
		List<Produto> produtos = new ProdutosDAO().lista();
		
		ModelAndView mv = new ModelAndView("lista");
		
		mv.addObject("todosProdutos", produtos);

		return mv;
	}
	
}
