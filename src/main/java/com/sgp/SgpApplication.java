package com.sgp;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sgp.models.Quadros;
import com.sgp.models.QuadrosValores;
import com.sgp.repositories.QuadrosRepository;
import com.sgp.repositories.QuadrosValoresRepository;
import com.sgp.util.UtilDates;

@SpringBootApplication
public class SgpApplication implements CommandLineRunner{

	@Autowired QuadrosRepository quadrosRepository;
	@Autowired QuadrosValoresRepository quadrosValoresRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SgpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String dataVencimento = "2022-05-05";		
		
		Quadros quadros1 = new Quadros();
		quadros1.nome = "CC Itau Gold";

		quadrosRepository.save(quadros1);
		
		Quadros quadros2 = new Quadros();
		quadros2.nome = "C6 Bank";
		
		quadrosRepository.save(quadros2);
		
		QuadrosValores valores= new QuadrosValores();
		valores.quadros = quadros1;
		valores.descricao = "Impressora 7/10";
		valores.valor = new BigDecimal("119.90");
		
		Date d = UtilDates.converteStringDate(dataVencimento);
		valores.setVencimento(d);
		valores.setData(Calendar.getInstance().getTime());
		valores.pago = false;
		quadrosValoresRepository.save(valores);

		QuadrosValores valores1= new QuadrosValores();
		valores1.quadros = quadros1;
		valores1.descricao = "Impressora 8/10";
		valores1.valor = new BigDecimal("119.90");
		valores1.setVencimento(d);
		valores1.setData(Calendar.getInstance().getTime());
		valores1.pago = true;
		quadrosValoresRepository.save(valores1);

		QuadrosValores valores2= new QuadrosValores();
		valores2.quadros = quadros2;
		valores2.descricao = "Impressora 6/10";
		valores2.valor = new BigDecimal("119.90");
		valores2.setVencimento(d);
		valores2.setData(Calendar.getInstance().getTime());
		valores2.pago = false;
		quadrosValoresRepository.save(valores2);
		
	}

}
