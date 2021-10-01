package com.cabinet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cabinet.repositories.AdresseRepository;
import com.cabinet.services.AdresseService;
import com.cabinet.services.AdresseServiceImpl;

@Configuration
public class AdresseConfig {

	@Bean
	public AdresseService adresseService(AdresseRepository adresseRepository) {
		return new AdresseServiceImpl(adresseRepository);
	}
}
