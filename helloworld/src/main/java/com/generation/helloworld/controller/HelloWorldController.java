package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping("/endpoint1")
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping("/endpoint2")
	public String endpoint2() {
		return "Mentalidades: " + "\nOrientação ao futuro;" + "\nResponsabilidade Pessoal;"
				+ "\nMentalidade de crescimento;" + "\nPersistência." + "\nHabilidades:" + "\nTrabalho em equipe;"
				+ "\nOrientação ao detalhe;" + "\nProatividade;" + "\nComunicação.";

	}

	@GetMapping("/endpoint3")
	public String endpoint3() {
		return "Objetivos dessa semana: " + "Estudar inglês por 2h de segunda a sexta;"
				+ "\nFazer exercícios de Java por pelo menos 2h todo dia após o Bootcamp da GenBr;"
				+ "\nReforçar conceitos de Cloud COmputing." + "";
	}
}
