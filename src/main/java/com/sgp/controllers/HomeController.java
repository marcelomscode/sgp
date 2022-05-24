package com.sgp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	
	@GetMapping
	public String hello() {
		return "Olá, pense no futuro agora, ok ?";
	}
	
	
}
