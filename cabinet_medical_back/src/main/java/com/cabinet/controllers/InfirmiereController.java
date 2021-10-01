package com.cabinet.controllers;

import java.util.List;

import javax.transaction.Transactional;

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

import com.cabinet.models.Infirmiere;
import com.cabinet.services.InfirmiereService;

@RestController
@CrossOrigin
@RequestMapping("infirmieres")
public class InfirmiereController {

	private static Logger LOGGER = LoggerFactory.getLogger(InfirmiereController.class);
	
	@Autowired
	private InfirmiereService infirmiereService;
	
	@GetMapping("")
	public List<Infirmiere> findAll(){
		return infirmiereService.findAll();
	}
	
	@GetMapping("{id}")
	public Infirmiere findOne(@PathVariable Integer id) {
		return this.infirmiereService.findOne(id);
	}

	@PostMapping("")
	public Infirmiere create(@RequestBody Infirmiere infirmiere) {
		return this.infirmiereService.save(infirmiere);
	}
	
	@PutMapping("")
	public Infirmiere update(@RequestBody Infirmiere infirmiere) {
		return this.infirmiereService.save(infirmiere);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		this.infirmiereService.delete(id);
	}
	
}
