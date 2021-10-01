package com.cabinet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cabinet.repositories.PatientRepository;
import com.cabinet.services.PatientService;
import com.cabinet.services.PatientServiceImpl;

@Configuration
public class PatientConfig {
	
	@Bean
	public PatientService patientService (PatientRepository patientRepository) {
		return new PatientServiceImpl(patientRepository);
	}
}
