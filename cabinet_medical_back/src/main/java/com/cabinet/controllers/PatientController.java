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

import com.cabinet.models.Patient;
import com.cabinet.services.PatientService;

@RestController
@CrossOrigin
@RequestMapping("patients")
public class PatientController {

	private static Logger LOGGER = LoggerFactory.getLogger(InfirmiereController.class);
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("")
	public List<Patient> findAll(){
		return this.patientService.findAll();
	}
	
	@GetMapping("{id}")
	public Patient findOne(@PathVariable Integer id) {
		return this.patientService.findOne(id);
	}
	
	@PostMapping("")
	public Patient create(@RequestBody Patient patient) {
		return this.patientService.save(patient);
	}
	
	@PutMapping("")
	public Patient update(@RequestBody Patient patient) {
		return this.patientService.save(patient);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		this.patientService.delete(id);
	}
}
