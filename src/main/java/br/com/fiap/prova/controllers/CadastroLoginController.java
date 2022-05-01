package br.com.fiap.prova.controllers;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.prova.dto.CadastroLoginDto;
import br.com.fiap.prova.model.CadastroLogin;
import br.com.fiap.prova.repositories.CadastroLoginRepository;

@Controller
public class CadastroLoginController {

	@Autowired
	private CadastroLoginRepository cadastroLoginRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("cadastro-login")
	public ModelAndView criar(CadastroLoginDto model) {
		return new ModelAndView("cadastro-login");
	}
	
	@PostMapping("/cadastro-login")
	public ModelAndView salvar(@Valid CadastroLoginDto model, BindingResult bindingResult) 
	{
		if(bindingResult.hasErrors()) {
			ModelAndView modelView = new ModelAndView("cadastro-login");
			return modelView;
		}
		
		CadastroLogin CadastroLogin = modelMapper.map(model, CadastroLogin.class);
		cadastroLoginRepository.save(CadastroLogin);
		return new ModelAndView("redirect:/cadastro-login");
	}

}
