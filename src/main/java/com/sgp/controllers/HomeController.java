package com.sgp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgp.models.QuadrosValores;
import com.sgp.repositories.QuadrosValoresRepository;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired QuadrosValoresRepository quadros;
	
	@GetMapping
	public ResponseEntity<List<QuadrosValores>> hello() {
		
		List<QuadrosValores> v = quadros.findAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(v);
	}
	
}
