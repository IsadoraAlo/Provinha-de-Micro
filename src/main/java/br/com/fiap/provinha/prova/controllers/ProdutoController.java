package br.com.fiap.provinha.prova.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.fiap.provinha.prova.dto.ProdutoDto;
import br.com.fiap.provinha.prova.model.Produto;
import br.com.fiap.provinha.prova.repositories.ProdutoRepository;


@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository provaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/provas")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("provas/index");
		           //Long id, String nome, Integer quantidade, BigDecimal valor
		/*Produto prova1 = new Produto(new Long(1), "chocolate", 3, new BigDecimal(2));
		Produto prova2 = new Produto(new Long(2), "chocolate belga", 100, new BigDecimal(40));
		Produto prova3 = new Produto(new Long(4), "chocolate branco", 30, new BigDecimal(20));
		List<Produto> provas = Arrays.asList(prova1, prova2, prova3); */
		
		List<Produto> provaDaRepository = provaRepository.findAll();
		modelView.addObject("listarProdutos", provaDaRepository);
		
		return modelView;
	}
	
	@GetMapping("/provas/criar")
	public ModelAndView criar(ProdutoDto prova) {
		ModelAndView modelView = new ModelAndView("provas/criar");
		return modelView;
	}
	
	@PostMapping("provas")
	public ModelAndView salvar(@Valid ProdutoDto prova, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return new ModelAndView("provas/criar");
		}
		
		Produto provaEntity = modelMapper.map(prova, Produto.class);
		provaRepository.save(provaEntity);
		return new ModelAndView("redirect:/provas");
	}
	
	@GetMapping("provas/{id}")
	public ModelAndView mostrar(@PathVariable Long id) {
		Optional<Produto> prova = provaRepository.findById(id);
		
		if(prova.isPresent()) {
			Produto provaGet = prova.get();
			ModelAndView modelView = new ModelAndView("provas/detalhe");
			modelView.addObject("prova",provaGet);
			return modelView;
		}
		System.out.println("não encontrado!");
		return new ModelAndView("redirect:/provas");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
