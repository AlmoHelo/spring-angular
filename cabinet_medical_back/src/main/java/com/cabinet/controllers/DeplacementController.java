package com.cabinet.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cabinet.models.Deplacement;
import com.cabinet.services.DeplacementService;

@RestController
@CrossOrigin
@RequestMapping("deplacements")
public class DeplacementController {

	private static Logger LOGGER = LoggerFactory.getLogger(InfirmiereController.class);
	
	@Autowired
	private DeplacementService deplacementService;
	
	@GetMapping("")
	public List<Deplacement> findAll(){
		return deplacementService.findAll();
	}
	
	@GetMapping("{id}")
	public Deplacement findOne(@PathVariable Integer id) {
		return this.deplacementService.findOne(id);
	}
	
	@PostMapping("")
	public Deplacement create(@RequestBody Deplacement deplacement) {
		return this.deplacementService.save(deplacement);
	}
	
	@PutMapping("")
	public Deplacement update(@RequestBody Deplacement deplacement) {
		return this.deplacementService.save(deplacement);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		this.deplacementService.delete(id);
	}

}
