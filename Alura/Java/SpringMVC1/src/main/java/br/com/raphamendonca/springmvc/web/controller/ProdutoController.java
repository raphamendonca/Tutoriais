package br.com.raphamendonca.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutoController {

	
	@RequestMapping("/")
	public void index() {
		System.out.println("Exibindo a home da CDC");
	}
	
	
	@RequestMapping("produto/form")
	public String form() {
		
		return "produto/form";
	}
	
}
