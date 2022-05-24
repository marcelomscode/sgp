package com.sgp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sgp.models.Quadros;
import com.sgp.models.QuadrosValores;
import com.sgp.repositories.QuadrosRepository;
import com.sgp.repositories.QuadrosValoresRepository;

@SpringBootApplication
public class SgpApplication implements CommandLineRunner{

	@Autowired QuadrosRepository quadrosRepository;
	@Autowired QuadrosValoresRepository quadrosValoresRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SgpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Quadros quadros = new Quadros();
		quadros.id = 1;
		quadros.nome = "CC Itau Gold";
		
		quadrosRepository.save(quadros);
		
		QuadrosValores valores= new QuadrosValores();
		valores.quadros = quadros;
		valores.descricao = "Impressora 7/10";
		valores.valor = new BigDecimal("119.90");
		
		quadrosValoresRepository.save(valores);
		
	}

}
