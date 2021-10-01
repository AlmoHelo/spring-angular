package com.cabinet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabinet.models.Patient;

public interface PatientRepository  extends JpaRepository<Patient, Integer>{

}
