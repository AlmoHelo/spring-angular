package com.cabinet.services;

import java.util.List;

import com.cabinet.models.Patient;

public interface PatientService {

	List<Patient> findAll();

	Patient findOne(Integer id);

	Patient save(Patient patient);

	void delete(Integer id);

}
