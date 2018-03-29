package br.com.spring.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring.loja.daos.ProdutoDao;
import br.com.spring.loja.models.Produto;
import br.com.spring.loja.models.TipoPreco;

@Controller
@RequestMapping("/produtos") //Padroniza todos os suffix das URIs desta classe
public class ProdutosController {
	
	@Autowired
	private ProdutoDao produtoDAO;

	@RequestMapping("form")
	public ModelAndView form() {
		
		ModelAndView mv = new ModelAndView("produtos/form");
		mv.addObject("tipos",  TipoPreco.values());
		return mv;
	}

	@RequestMapping(method=RequestMethod.POST)
	public String grava(Produto produto) {
		System.out.println(produto);
		produtoDAO.gravar(produto);
		return "produtos/ok";
	}
	
//	@RequestMapping(method=RequestMethod.GET)
//	public ModelAndView listar() {
//		List<Produto> produtos = produtoDAO.listar();
//		ModelAndView mv = new ModelAndView("produtos/lista");
//		mv.addObject("produtos", produtos);
//		
//		return mv;
//	}
	
	@RequestMapping(method=RequestMethod.GET)
    public String lista(Model model) {
        List<Produto> produtos = produtoDAO.listar();
        model.addAttribute("produtos", produtos);
        return "produtos/lista";
    }
}
