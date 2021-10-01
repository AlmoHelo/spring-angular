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

import com.cabinet.models.Adresse;
import com.cabinet.services.AdresseService;

@RestController
@CrossOrigin
@RequestMapping("adresses")
public class AdresseController {

	private static Logger LOGGER = LoggerFactory.getLogger(InfirmiereController.class);
	
	@Autowired
	private AdresseService adresseService;
	
	@GetMapping("")
	public List<Adresse> findAll(){
		return this.adresseService.findAll();
	}
	
	@GetMapping("{id}")
	public Adresse findOne(@PathVariable Integer id) {
		return this.adresseService.findOne(id);
	}
	
	@PostMapping("")
	public Adresse create(@RequestBody Adresse adresse) {
		return this.adresseService.save(adresse);
	}
	
	@PutMapping("")
	public Adresse update(@RequestBody Adresse adresse) {
		return this.adresseService.save(adresse);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		this.adresseService.delete(id);
	}

}
