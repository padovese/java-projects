package br.com.spring.loja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.spring.loja.daos.ProdutoDao;
import br.com.spring.loja.infra.FileSaver;
import br.com.spring.loja.models.Produto;
import br.com.spring.loja.models.TipoPreco;
import br.com.spring.loja.validation.ProdutoValidation;

@Controller
@RequestMapping("/produtos") //Padroniza todos os suffix das URIs desta classe
public class ProdutosController {
	
	@Autowired
	private ProdutoDao produtoDAO;
	
	@Autowired
	private FileSaver fileSaver;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    binder.addValidators(new ProdutoValidation());
	}

	@RequestMapping("form")
	public ModelAndView form(Produto produto) {
		
		ModelAndView mv = new ModelAndView("produtos/form");
		mv.addObject("tipos",  TipoPreco.values());
		return mv;
	}

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(MultipartFile sumario, @Valid Produto produto, BindingResult result, 
			RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
			return form(produto);
		}
		
		String path = fileSaver.write("arquivos-sumario", sumario);
		produto.setSumarioPath(path);
		
		System.out.println(produto);
		produtoDAO.gravar(produto);
		
		redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso!");
		return new ModelAndView("redirect:produtos");
	}
	
//	@RequestMapping(method=RequestMethod.GET)
//	public ModelAndView listar() {
//		List<Produto> produtos = produtoDAO.listar();
//		ModelAndView mv = new ModelAndView("produtos/lista");
//		mv.addObject("produtos", produtos);
//		
//		return mv;
//	}
//	
	//Funcionam da mesma forma
	@RequestMapping(method=RequestMethod.GET)
    public String listar(Model model) {
        List<Produto> produtos = produtoDAO.listar();
        model.addAttribute("produtos", produtos);
        return "produtos/lista";
    }
	
	@RequestMapping("JSTL-utils")
    public String jstlUtils(Model model) {
        List<Produto> produtos = produtoDAO.listar();
        model.addAttribute("produtos", produtos);
        return "JSTL-utils/exemplos";
    }
	
	@RequestMapping("detalhe/{id}")
	public ModelAndView detalhe(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("produtos/detalhe");
		
		Produto produto = produtoDAO.find(id);
		
		mv.addObject("produto", produto);
		return mv;
	}
}
