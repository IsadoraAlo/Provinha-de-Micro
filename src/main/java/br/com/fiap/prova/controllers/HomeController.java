package br.com.fiap.prova.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("nomeUsuario", "Isadora Alves - 84246");
		
		return "home";
	}

}
