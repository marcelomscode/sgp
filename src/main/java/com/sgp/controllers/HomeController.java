package com.sgp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sgp.models.Quadros;
import com.sgp.models.QuadrosValores;
import com.sgp.repositories.QuadrosRepository;
import com.sgp.repositories.QuadrosValoresRepository;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired QuadrosValoresRepository quadrosV;
	@Autowired QuadrosRepository quadrosRepository;
	
	@GetMapping
	public List<QuadrosValores> hello() {
		
		List<QuadrosValores> v = quadrosV.findAll();
		
		return v;
	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody Quadros quadros) {
		quadrosRepository.save(quadros);
		
	}
	
	
	@PostMapping(value="/valores")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveValores(@RequestBody QuadrosValores quadrosValores) {
		quadrosV.save(quadrosValores);
	}
	
	
	
}
