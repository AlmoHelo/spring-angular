package com.cabinet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cabinet.repositories.DeplacementRepository;
import com.cabinet.services.DeplacementService;
import com.cabinet.services.DeplacementServiceImpl;

@Configuration
public class DeplacementConfig {

	@Bean
	public DeplacementService deplacementService(DeplacementRepository deplacementRepository) {
		return new DeplacementServiceImpl(deplacementRepository);
	}
}
