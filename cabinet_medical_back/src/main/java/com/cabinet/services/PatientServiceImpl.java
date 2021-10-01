package com.cabinet.services;

import java.util.List;

import com.cabinet.models.Patient;
import com.cabinet.repositories.PatientRepository;

public class PatientServiceImpl implements PatientService {
	
	private PatientRepository patientRepository;
	
	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}
	
	@Override
	public List<Patient> findAll() {
		return this.patientRepository.findAll();
	}

	@Override
	public Patient findOne(Integer id) {
		return this.patientRepository.findById(id).get();
	}

	@Override
	public Patient save(Patient patient) {
		return this.patientRepository.save(patient);
	}

	@Override
	public void delete(Integer id) {
		this.patientRepository.deleteById(id);
	}

}
