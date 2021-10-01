package com.cabinet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cabinet.repositories.InfirmiereRepository;
import com.cabinet.services.InfirmiereService;
import com.cabinet.services.InfirmiereServiceImpl;

@Configuration
public class InfirmiereConfig {

	@Bean
	public InfirmiereService infirmiereService(InfirmiereRepository infirmiereRepository) {
		return new InfirmiereServiceImpl(infirmiereRepository);
	}
}
