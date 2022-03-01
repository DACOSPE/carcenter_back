package com.carcenter.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.carcenter.back.models.entity.Mecanico;
import com.carcenter.back.models.services.IMecanicoService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api")
public class CarCenterRestController {
	
	@Autowired
	private IMecanicoService mecanicoService;
	
	//consulta lista de mecanicos
	@GetMapping("/mecanicos")
	public List<Mecanico> index(){		
		return mecanicoService.findAll();
	}
	
	//creacion de mecanicos
	@PostMapping("/mecanicos")
	@ResponseStatus(HttpStatus.CREATED)
	public Mecanico create(@RequestBody Mecanico mecanico) {
		return mecanicoService.save(mecanico);
	}
	
	

}
